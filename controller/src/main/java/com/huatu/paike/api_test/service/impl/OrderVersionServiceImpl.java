package com.huatu.paike.api_test.service.impl;

import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.order.service.paike.OrderService;
import com.huatu.paike.api_test.dto.OrderInfoDto;
import com.huatu.paike.api_test.service.OrderVersionService;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfoCriteria;
import com.huatu.paike.dal.goodsOrder.entity.OrderVersion;
import com.huatu.paike.dal.goodsOrder.mapper.OrderInfoMapper;
import com.huatu.paike.dal.goodsOrder.mapper.OrderVersionMapper;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OrderVersionServiceImpl implements OrderVersionService {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderVersionMapper orderVersionMapper;

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Override
    public Map<Long, OrderInfoDto> getMoneyInfoParallel(List<Long> orderGoodsIds) {
        if (CollectionUtils.isEmpty(orderGoodsIds)) {
            return Maps.newHashMap();
        }
        StopWatch watch = new StopWatch();
        ExecutorService executors = Executors.newFixedThreadPool(20);
        List<Callable<Long>> tasks = Lists.newArrayList();
        Map<Long, OrderInfoDto> moneyTotalMap = new ConcurrentHashMap<>();
        int batchSize = 200;
        int idx1 = 0;
        watch.start();
        while (idx1 < orderGoodsIds.size()) {
            int lastIndex = Math.min(idx1 + batchSize, orderGoodsIds.size());
            List<Long> tmpOrderGoodsIds = orderGoodsIds.subList(idx1, lastIndex);
            if (CollectionUtils.isEmpty(tmpOrderGoodsIds)) {
                break;
            }
            tasks.add(new Callable<Long>() {

                @Override
                public Long call() throws Exception {
                    Map<Long, OrderInfoDto> moneyMap = getMoneyInfoByOrderGoodsIds(tmpOrderGoodsIds).stream()
                            .collect(Collectors.toMap(a -> a.getOrderGoodsId(), Function.identity()));
                    moneyTotalMap.putAll(moneyMap);
                    return null;
                }
            });
            log.info("idx={},batchSize={}", idx1, lastIndex - idx1);
            idx1 = lastIndex;
        }
        try {
            executors.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "执行异常");
        }
        watch.stop();
        log.info("商品订单金额查询耗时：{}ms", watch.getLastTaskTimeMillis());
        return moneyTotalMap;
    }

    public List<OrderInfoDto> getMoneyInfoByOrderGoodsIds(Collection<Long> orderGoodsIds) {
        if (CollectionUtils.isEmpty(orderGoodsIds)) {
            return Lists.newArrayList();
        }
        List<OrderInfoDto> result = Lists.newArrayList();
        List<com.huatu.order.dto.OrderInfoDto> orderList = orderService.getOrderInfos(orderGoodsIds);
        for (com.huatu.order.dto.OrderInfoDto moneyInfo : orderList) {
            result.add(getOrderPriceInfo(moneyInfo));
        }
        return result;
    }

    private OrderInfoDto getOrderPriceInfo(com.huatu.order.dto.OrderInfoDto moneyInfo) {
        OrderInfoDto orderInfo = new OrderInfoDto();
        orderInfo.setOrderGoodsId(moneyInfo.getOrderGoodsId());
        orderInfo.setProductTypeCode(moneyInfo.getProductTypeCode());
        orderInfo.setRealpay(moneyInfo.getRealpay());
        orderInfo.setTuition(moneyInfo.getTuition());
        orderInfo.setExtra(moneyInfo.getExtra());
        orderInfo.setRefundStatus(moneyInfo.getRefundStatus());
        orderInfo.setGoodsProperty(moneyInfo.getGoodsProperty());
        orderInfo.setStagePriceMap(moneyInfo.getStagePriceMap());
        orderInfo.setStageIdToSubjectDurationMap(moneyInfo.getStageIdToSubjectDurationMap());
        orderInfo.caculate();
        return orderInfo;
    }


    @Override
    public Map<Long, OrderInfoDto> getOrderInfoByOrderGoodsId(List<Long> orderGoodsIds) {
        List<OrderVersion> orderVersionList=orderVersionMapper.getNewestVersionByOrderGoodsIds(orderGoodsIds);
        return  orderVersionList.stream().collect(Collectors.toMap(a->a.getOrderGoodsId(),a->orderVersion2OrderInfoDto(a) ));
    }

    private OrderInfoDto orderVersion2OrderInfoDto(OrderVersion ov){
        OrderInfoDto dto = JSONObject.parseObject(ov.getJson(), OrderInfoDto.class);
        return dto;
    }

    @Override
    public List<OrderInfo> checkDiffOrderVersion() {

        List<Long> ids= orderInfoMapper.queryAllIds();

        log.info("订单总数:{}", ids.size());

        if(ids.size()==0){
            return Lists.newArrayList();
        }

        List<String> resultOrderNos=Lists.newArrayList();

        int batchSize=500;
        int i=0,total=ids.size();
        while(i<total){
            List<Long> subIds=ids.subList(i,Math.min(i+batchSize,total ));
            if(CollectionUtils.isEmpty(subIds)){
                continue;
            }
            List<String> temList=Lists.newArrayList();
            List<OrderVersion> dbOrderVersions=orderVersionMapper.queryNewOrderVersionByOrderId(subIds);

            if(CollectionUtils.isEmpty(dbOrderVersions)){
                log.warn("排课未查询到任何orderVersion:{}", subIds);
                //temList.addAll(subIds);
            }else{
                List<Long> orderGoodsIds=dbOrderVersions.stream().map(a->a.getOrderGoodsId()).collect(Collectors.toList());

                Map<Long, OrderInfoDto> map=getMoneyInfoParallel(orderGoodsIds);
                for (OrderVersion  ov:dbOrderVersions){
                    OrderInfoDto orderSideOv=map.get(ov.getOrderGoodsId());
                    if(orderSideOv==null){
                        log.warn("paike 这边有数据,order无数据,orderGoodsId={}",ov.getOrderGoodsId());
                    }else{
                        OrderInfoDto orderInfoDto=JSONObject.parseObject(ov.getJson(), OrderInfoDto.class);
                        if(!orderInfoDto.equals(orderSideOv)){
                            temList.add(ov.getOrderNo());
                        }
                    }
                }
            }

            resultOrderNos.addAll(temList);
            i+=batchSize;
        }

        OrderInfoCriteria criteria=new OrderInfoCriteria();
        criteria.createCriteria().andOrderNoIn(resultOrderNos);
        return orderInfoMapper.selectByExample(criteria);
    }
}

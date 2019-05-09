package com.huatu.paike.api_test.service.impl;

import com.huatu.common.utils.DateUtil;
import com.huatu.order.dto.OrderMoneyDto;
import com.huatu.order.service.paike.OrderService;
import com.huatu.paike.api_test.OrderInfoDto;
import com.huatu.paike.api_test.dto.CostOrderStageBuilder;
import com.huatu.paike.api_test.dto.CostSourceType;
import com.huatu.paike.api_test.dto.CostType;
import com.huatu.paike.api_test.service.CostOrderService;
import com.huatu.paike.dal.cost.entity.CostOrderStageTest;
import com.huatu.paike.dal.cost.entity.NewCostOrderStage;
import com.huatu.paike.dal.cost.mapper.CostOrderStageTestMapper;
import com.huatu.paike.dal.cost.mapper.NewCostOrderStageMapper;
import com.huatu.paike.dal.goodsOrder.dto.OcssDurationDto;
import com.huatu.paike.dal.goodsOrder.dto.OssId2CssDto;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubject;
import com.huatu.paike.dal.goodsOrder.mapper.OrderClassStageSubjectMapper;
import com.huatu.paike.dal.goodsOrder.mapper.OrderInfoMapper;
import com.huatu.paike.dal.goodsOrder.mapper.OrderStageSubjectMapper;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class CostOrderServiceImpl implements CostOrderService {

    @Autowired
    OrderStageSubjectMapper ossMapper;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Autowired
    NewCostOrderStageMapper newCostOrderStageMapper;

    @Autowired
    CostOrderStageTestMapper costOrderStageTestMapper;

    @Autowired
    OrderClassStageSubjectMapper ocssMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void buildCostOrder() {
        log.info("扫描所有在12月份后产生的订单，生成12,1,2月结转数据");

        Date buyStartTime=DateUtil.getStrToDate("yyyy-MM-dd", "2018-12-01");
        Date buyEndTime=DateUtil.getStrToDate("yyyy-MM-dd", "2019-03-01");
        Date startTime = DateUtil.getStrToDate("yyyy-MM-dd", "2018-12-01");
        Date endTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-01-01");
        List<Long> ossIds = ossMapper.queryEndOss(buyStartTime,buyEndTime,startTime, endTime);
        if (CollectionUtils.isEmpty(ossIds)) {
            log.info("oss is empty");
            return;
        }
        int batchSize = 200;
        int idx = 0;
        while (idx < ossIds.size()) {
            int lastIndex = Math.min(idx + batchSize, ossIds.size());
            List<Long> subList = ossIds.subList(idx, lastIndex);
            if(CollectionUtils.isEmpty(subList)){
                break;
            }

            List<OrderStageSubject> orderStageSubjects =ossMapper.queryByIds(subList);

            Set<String> orderNos = orderStageSubjects.stream().map(a -> a.getOrderNo()).collect(Collectors.toSet());

            Map<String, OrderInfo> orderInfos = orderInfoMapper.queryListByOrderNos(orderNos);

            List<OssId2CssDto> ossId2CssDtos=ossMapper.queryCss(subList);

            Map<Long,ClassStageSubject> ossId2CssMap=ossId2CssDtos.stream().collect(Collectors.toMap(a->a.getOssId(), a->a.getCss()));

            Map<Long, OrderInfoDto> moneyMap = orderInfos.values().stream().collect(Collectors.toMap(a -> a.getOrderGoodsId(), a -> getOrderPriceInfo(a.getOrderGoodsId())));
            for (OrderStageSubject oss : orderStageSubjects) {
                String orderNo = oss.getOrderNo();
                OrderInfo orderInfo = orderInfos.get(orderNo);
                ClassStageSubject css=ossId2CssMap.get(oss.getId());

                OrderInfoDto orderPriceInfo = moneyMap.get(orderInfo.getOrderGoodsId());

                if(css.getFinishDuration()<css.getTotalDuration()){
                    continue;
                }

                if(css==null||oss==null||orderInfo==null){
                    log.error("异常数据：{}", oss);
                    continue;
                }

                // VIP订单不结转,协议类型为K,L,M,N为无限学,不结转
                if (orderPriceInfo.getProductTypeCode().equals("VI") || orderInfo.getProtocolType().matches("K|L|M|N")) {
                    log.info("exit,orderNo={},orderGoodsId={},协议类型为{},无限学,不结转退出", orderNo, orderInfo.getOrderGoodsId(),
                            orderInfo.getProtocolType());
                    continue;
                }

                long subjectTuition = orderPriceInfo.getSubjectTuitionMap().getOrDefault(oss.getStageId(), Maps.newHashMap())
                        .getOrDefault(oss.getSubjectId(), 0L);
                long subjectExtra = orderPriceInfo.getSubjectExtraMap().getOrDefault(oss.getStageId(), Maps.newHashMap())
                        .getOrDefault(oss.getSubjectId(), 0L);

                /*if (subjectTuition == 0 && subjectExtra == 0) {
                    log.info("exit,orderNo={},orderGoodsId={},学费和杂费都为0,退出", orderNo, orderInfo.getOrderGoodsId());
                    continue;
                }*/

                List<NewCostOrderStage> costOrderStages = Lists.newArrayList();
                // 提报类型的不管是不是0都推送
                NewCostOrderStage tuition =
                        CostOrderStageBuilder.builder(css,oss.getTotalDuration().intValue(), orderInfo, CostType.tuition, subjectTuition, false, CostSourceType.unknown);
                if(orderInfo.getScoreHavePass()){
                    costOrderStages.add(tuition);
                }
                NewCostOrderStage extra =
                        CostOrderStageBuilder.builder(css,oss.getTotalDuration().intValue(),orderInfo, CostType.extra, subjectExtra, false, CostSourceType.unknown);
                costOrderStages.add(extra);
                for (NewCostOrderStage costOrderStage : costOrderStages) {
                    newCostOrderStageMapper.insertSelective(costOrderStage);
                }
            }
            log.info("idx={},batchSize={}",idx,lastIndex-idx);
            idx = lastIndex;
        }
        log.info("生成完毕");
    }

    @Override
    public OrderInfoDto queryOrderCostInfo(Long orderGoodsId){
        return getOrderPriceInfo(orderGoodsId);
    }

    private OrderInfoDto getOrderPriceInfo(Long orderGoodId) {
        OrderMoneyDto moneyInfo = orderService.getOrderMoneyInfo(orderGoodId);
        OrderInfoDto orderInfo = new OrderInfoDto();
        orderInfo.setProductTypeCode(moneyInfo.getProductTypeCode());
        orderInfo.setRealpay(moneyInfo.getRealpay());
        orderInfo.setTuition(moneyInfo.getTuition());
        orderInfo.setExtra(moneyInfo.getExtra());
        orderInfo.setStagePriceMap(moneyInfo.getStagePriceMap());
        orderInfo.setStageIdToSubjectDurationMap(moneyInfo.getStageIdToSubjectDurationMap());
        orderInfo.caculate();
        return orderInfo;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void buildCostOrder_test() {
        log.info("扫描所有在12月份后产生的订单，生成12,1,2月结转数据");
        Date buyStartTime=DateUtil.getStrToDate("yyyy-MM-dd", "2019-01-01");
        Date buyEndTime=DateUtil.getStrToDate("yyyy-MM-dd", "2019-03-01");
        Date startTime = DateUtil.getStrToDate("yyyy-MM-dd", "2018-12-01");
        Date endTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-01-01");

        List<String> orderNos=ocssMapper.queryEnd(startTime,endTime);
        if (CollectionUtils.isEmpty(orderNos)) {
            log.info("orderNos is empty");
            return;
        }
        int batchSize = 200;
        int idx = 0;

        Map<String, Boolean> orderTuitionPush=orderNos.stream().collect(Collectors.toConcurrentMap(a->a, a->false));
        while (idx < orderNos.size()) {
            long time=System.currentTimeMillis();
            int lastIndex = Math.min(idx + batchSize, orderNos.size());
            List<String> subList = orderNos.subList(idx, lastIndex);
            if(CollectionUtils.isEmpty(subList)){
                break;
            }
            List<OcssDurationDto> ocssDurationDtos=ocssMapper.queryDurationByOrderNos(subList);

            Set<String> distinceOrderNos = ocssDurationDtos.stream().map(a -> a.getOrderNo()).collect(Collectors.toSet());

            Map<String, OrderInfo> orderInfos = orderInfoMapper.queryListByOrderNos(distinceOrderNos);

            long time1=System.currentTimeMillis();
            log.info("查询本地数据库信息耗时{}",time1-time);

            Map<Long, OrderInfoDto> moneyMap = orderInfos.values().stream().collect(Collectors.toMap(a -> a.getOrderGoodsId(), a -> getOrderPriceInfo(a.getOrderGoodsId())));
            log.info("查询金额耗时：{}",System.currentTimeMillis()-time1);
            for (OcssDurationDto odd : ocssDurationDtos) {
                String orderNo = odd.getOrderNo();
                OrderInfo orderInfo = orderInfos.get(orderNo);
                OrderInfoDto orderPriceInfo = moneyMap.get(orderInfo.getOrderGoodsId());

                //判断是否已经结课
                if(odd.getFinishDuration().intValue()<odd.getTotalDuration().intValue()){
                    continue;
                }

                if(odd==null||orderInfo==null){
                    log.error("异常数据：odd={},orderInfo={}", odd,orderInfo);
                    continue;
                }
                // VIP订单不结转,协议类型为K,L,M,N为无限学,不结转
                if (orderPriceInfo.getProductTypeCode().equals("VI") || orderInfo.getProtocolType().matches("K|L|M|N")) {
                    log.info("exit,orderNo={},orderGoodsId={},协议类型为{},无限学,不结转退出", orderNo, orderInfo.getOrderGoodsId(),
                            orderInfo.getProtocolType());
                    continue;
                }

                List<CostOrderStageTest> costOrderStages = Lists.newArrayList();
                if(orderInfo.getScoreHavePass()&&orderTuitionPush.get(orderNo)==false){
                    orderTuitionPush.put(orderNo, true);
                    Iterator<Long> it=orderPriceInfo.getSubjectTuitionMap().keySet().iterator();
                    while(it.hasNext()){
                        Long stageId=it.next();
                        Map<Long,Long> subjectMap=orderPriceInfo.getSubjectTuitionMap().get(stageId);
                        Iterator<Long> it2=subjectMap.keySet().iterator();
                        while(it2.hasNext()){
                            Long subjectId=it2.next();
                            Long cost=subjectMap.get(subjectId);
                            CostOrderStageTest tuition =
                                    CostOrderStageBuilder.builder_test(odd, orderInfo, CostType.tuition, cost, false, CostSourceType.unknown);
                            costOrderStages.add(tuition);
                        }
                    }

                }


                long subjectExtra = orderPriceInfo.getSubjectExtraMap().getOrDefault(odd.getStageId(), Maps.newHashMap())
                        .getOrDefault(odd.getSubjectId(), 0L);

                /*if (subjectTuition == 0 && subjectExtra == 0) {
                    log.info("exit,orderNo={},orderGoodsId={},学费和杂费都为0,退出", orderNo, orderInfo.getOrderGoodsId());
                    continue;
                }*/

                CostOrderStageTest extra =
                        CostOrderStageBuilder.builder_test(odd,orderInfo, CostType.extra, subjectExtra, false, CostSourceType.unknown);
                costOrderStages.add(extra);
                for (CostOrderStageTest costOrderStage : costOrderStages) {
                    costOrderStageTestMapper.insertSelective(costOrderStage);
                }
            }
            log.info("idx={},batchSize={}",idx,lastIndex-idx);
            idx = lastIndex;
        }
        log.info("生成完毕");
    }
}
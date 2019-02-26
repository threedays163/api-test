package com.huatu.paike.api_test.service.impl;

import com.huatu.common.utils.DateUtil;
import com.huatu.order.dto.OrderMoneyDto;
import com.huatu.order.service.paike.OrderService;
import com.huatu.paike.api_test.OrderInfoDto;
import com.huatu.paike.api_test.dto.CostOrderStageBuilder;
import com.huatu.paike.api_test.dto.CostSourceType;
import com.huatu.paike.api_test.dto.CostType;
import com.huatu.paike.dal.cost.entity.CostOrderStage;
import com.huatu.paike.dal.cost.entity.CostOrderStageTest;
import com.huatu.paike.dal.cost.entity.NewCostOrderStage;
import com.huatu.paike.dal.cost.mapper.CostOrderStageMapper;
import com.huatu.paike.dal.cost.mapper.CostOrderStageTestMapper;
import com.huatu.paike.dal.cost.mapper.NewCostOrderStageMapper;
import com.huatu.paike.dal.goodsOrder.dto.OssId2CssDto;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubject;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubjectCriteria;
import com.huatu.paike.dal.goodsOrder.mapper.OrderInfoMapper;
import com.huatu.paike.dal.goodsOrder.mapper.OrderStageSubjectMapper;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.Subject;

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

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void buildCostOrder() {
        log.info("扫描所有在12月份后产生的订单，生成12,1,2月结转数据");

        Date buyStartTime=DateUtil.getStrToDate("yyyy-MM-dd", "2018-12-01");
        Date buyEndTime=DateUtil.getStrToDate("yyyy-MM-dd", "2019-03-01");
        Date startTime = DateUtil.getStrToDate("yyyy-MM-dd", "2018-12-01");
        Date endTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-03-01");
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
        Date startTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-02-01");
        Date endTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-03-01");
        List<Long> ossIds = ossMapper.queryEndOss(buyStartTime,buyEndTime,startTime, endTime);
        if (CollectionUtils.isEmpty(ossIds)) {
            log.info("oss is empty");
            return;
        }
        int batchSize = 200;
        int idx = 0;
        while (idx < ossIds.size()) {
            long time=System.currentTimeMillis();
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
            long time1=System.currentTimeMillis();
            log.info("查询本地数据库信息耗时{}",time1-time);

            Map<Long, OrderInfoDto> moneyMap = orderInfos.values().stream().collect(Collectors.toMap(a -> a.getOrderGoodsId(), a -> getOrderPriceInfo(a.getOrderGoodsId())));
            log.info("查询金额耗时：{}",System.currentTimeMillis()-time1);
            for (OrderStageSubject oss : orderStageSubjects) {
                String orderNo = oss.getOrderNo();
                OrderInfo orderInfo = orderInfos.get(orderNo);
                ClassStageSubject css=ossId2CssMap.get(oss.getId());
                OrderInfoDto orderPriceInfo = moneyMap.get(orderInfo.getOrderGoodsId());
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

                List<CostOrderStageTest> costOrderStages = Lists.newArrayList();
                // 提报类型的不管是不是0都推送
                CostOrderStageTest tuition =
                        CostOrderStageBuilder.builder_test(css,oss.getTotalDuration().intValue(), orderInfo, CostType.tuition, subjectTuition, false, CostSourceType.unknown);
                if(orderInfo.getScoreHavePass()){
                    costOrderStages.add(tuition);
                }

                CostOrderStageTest extra =
                        CostOrderStageBuilder.builder_test(css,oss.getTotalDuration().intValue(),orderInfo, CostType.extra, subjectExtra, false, CostSourceType.unknown);
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
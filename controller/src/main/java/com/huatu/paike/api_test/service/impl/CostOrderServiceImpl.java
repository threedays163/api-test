package com.huatu.paike.api_test.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.huatu.common.utils.DateUtil;
import com.huatu.order.dto.OrderMoneyDto;
import com.huatu.order.service.paike.OrderService;
import com.huatu.paike.api_test.OrderInfoDto;
import com.huatu.paike.api_test.dto.CostOrderStageBuilder;
import com.huatu.paike.dal.cost.entity.CostOrderStage;
import com.huatu.paike.dal.cost.mapper.CostOrderStageMapper;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubject;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubjectCriteria;
import com.huatu.paike.dal.goodsOrder.mapper.OrderInfoMapper;
import com.huatu.paike.dal.goodsOrder.mapper.OrderStageSubjectMapper;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CostOrderServiceImpl implements CostOrderService {

    @Autowired
    OrderStageSubjectMapper ossMapper;

    @Autowired
    private OrderService orderService;

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Autowired
    CostOrderStageMapper costOrderStageMapper;

    @Override
    public void buildCostOrder() {
        log.info("扫描所有订单在二月份结课的科目，或者在二月份成绩通过，或者在二月份提报（退款）的订单");
        Date startTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-02-01");
        Date endTime = DateUtil.getStrToDate("yyyy-MM-dd", "2019-02-23");
        List<Long> ossIds = ossMapper.queryEndOss(startTime, endTime);
        if (CollectionUtils.isEmpty(ossIds)) {
            log.info("oss is empty");
            return;
        }
        int batchSize = 200;
        int idx = 0;
        while (idx < ossIds.size()) {
            int lastIndex = Math.min(idx + batchSize, ossIds.size());
            List<Long> subList = ossIds.subList(idx, lastIndex);
            OrderStageSubjectCriteria criteria = new OrderStageSubjectCriteria();
            criteria.createCriteria().andIdIn(subList);
            List<OrderStageSubject> orderStageSubjects = ossMapper.selectByExample(criteria);

            Set<String> orderNos = orderStageSubjects.stream().map(a -> a.getOrderNo()).collect(Collectors.toSet());

            Map<String, OrderInfo> orderInfos = orderInfoMapper.queryListByOrderNos(orderNos);

            Map<Long, Long> ossId2ClassIdMap=ossMapper.queryClassId(subList);

            Map<Long, OrderInfoDto> moneyMap = orderInfos.values().stream().collect(Collectors.toMap(a -> a.getOrderGoodsId(), a -> getOrderPriceInfo(a.getOrderGoodsId())));
            for (OrderStageSubject oss : orderStageSubjects) {
                String orderNo = oss.getOrderNo();
                OrderInfo orderInfo = orderInfos.get(orderNo);

                OrderInfoDto orderPriceInfo = moneyMap.get(orderInfo.getOrderGoodsId());
                // VIP订单不结转,协议类型为K,L,M,N为无限学,不结转
                if (orderPriceInfo.getProductTypeCode().equals("VI") || orderInfo.getProtocolType().matches("K|L|M|N")) {
                    log.info("exit,orderNo={},orderGoodsId={},协议类型为{},无限学,不结转退出", orderNo, orderInfo.getOrderGoodsId(),
                            orderInfo.getProtocolType());
                    return;
                }

                long subjectTuition = orderPriceInfo.getSubjectTuitionMap().getOrDefault(oss.getStageId(), Maps.newHashMap())
                        .getOrDefault(oss.getSubjectId(), 0L);
                long subjectExtra = orderPriceInfo.getSubjectExtraMap().getOrDefault(oss.getStageId(), Maps.newHashMap())
                        .getOrDefault(oss.getSubjectId(), 0L);

                if (subjectTuition == 0 && subjectExtra == 0) {
                    log.info("exit,orderNo={},orderGoodsId={},学费和杂费都为0,退出", orderNo, orderInfo.getOrderGoodsId());
                    return;
                }

                List<CostOrderStage> costOrderStages = Lists.newArrayList();
                // 提报类型的不管是不是0都推送
                CostOrderStage tuition =
                        CostOrderStageBuilder.builder(css, orderInfo, 2, subjectTuition, false, 0);
                costOrderStages.add(tuition);
                CostOrderStage extra =
                        CostOrderStageBuilder.builder(css, orderInfo, 1, subjectExtra, false, 0);
                costOrderStages.add(extra);
                for (CostOrderStage costOrderStage : costOrderStages) {
                    costOrderStage.setSeqNum(0L);
                    costOrderStageMapper.insertSelective(costOrderStage);
                }
            }

            idx += lastIndex;
        }
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
}
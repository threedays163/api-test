
package com.huatu.paike.api_test.dto;

import com.huatu.paike.dal.cost.entity.CostOrderStage;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;

import java.util.Date;

public class CostOrderStageBuilder {

    public static CostOrderStage builder(ClassStageSubject css, OrderInfo orderInfo, CostType costType, Long tuition,
                                         boolean isReport, CostSourceType sourceType) {
        CostOrderStage costOrderStage = new CostOrderStage();
        costOrderStage.setBatchNum(css.getBatchNum());
        costOrderStage.setClassId(css.getClassId());
        costOrderStage.setCost(tuition);
        costOrderStage.setCostType((byte) costType.getValue());
        costOrderStage.setDuration(css.getTotalDuration());
        Date now = new Date();
        costOrderStage.setFinishedDate(now);
        // 下游需要字段,误删
        costOrderStage.setFinishDate(now);
        costOrderStage.setGoodsNo(orderInfo.getGoodsNo());
        costOrderStage.setHasCost((byte) 0);
        costOrderStage.setOrderGoodsId(orderInfo.getOrderGoodsId());
        costOrderStage.setOrderNo(orderInfo.getOldOrderNo());
        costOrderStage.setProtocolType(orderInfo.getProtocolType());
        costOrderStage.setSeqNum(0L);
        costOrderStage.setStageId(css.getStageId());
        costOrderStage.setSubjectId(css.getSubjectId());
        costOrderStage.setPushType(isReport);
        costOrderStage.setCreateTime(new Date());
        costOrderStage.setSource((byte) sourceType.getValue());
        return costOrderStage;
    }
}

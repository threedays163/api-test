
package com.huatu.paike.api_test.dto;

import com.huatu.paike.dal.cost.entity.CostOrderStageTest;
import com.huatu.paike.dal.cost.entity.NewCostOrderStage;
import com.huatu.paike.dal.goodsOrder.dto.OcssDurationDto;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;

import java.util.Date;

public class CostOrderStageBuilder {

    public static NewCostOrderStage builder(ClassStageSubject css,Integer totalDuration, OrderInfo orderInfo, CostType costType, Long cost,
                                         boolean isReport, CostSourceType sourceType) {
        NewCostOrderStage costOrderStage = new NewCostOrderStage();
        costOrderStage.setBatchNum(css.getBatchNum());
        costOrderStage.setClassId(css.getClassId());
        costOrderStage.setCost(cost);
        costOrderStage.setCostType((byte) costType.getValue());
        costOrderStage.setDuration(totalDuration);
        costOrderStage.setFinishedDate(css.getEndDate());
        // 下游需要字段,误删
        costOrderStage.setFinishDate(css.getEndDate());
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

    public static CostOrderStageTest builder_test(OcssDurationDto css, OrderInfo orderInfo, CostType costType, Long cost,
                                                  boolean isReport, CostSourceType sourceType) {
        CostOrderStageTest costOrderStage = new CostOrderStageTest();
        costOrderStage.setBatchNum(css.getBatchNum());
        if(costType.equals(CostType.tuition)) {
            costOrderStage.setClassId(1L);
            costOrderStage.setFinishedDate(orderInfo.getUpdateTime());
            costOrderStage.setFinishDate(orderInfo.getUpdateTime());
        }else{
            costOrderStage.setClassId(css.getClassId());
            costOrderStage.setFinishedDate(css.getEndDate());
            costOrderStage.setFinishDate(css.getEndDate());
        }
        costOrderStage.setCost(cost);
        costOrderStage.setCostType((byte) costType.getValue());
        costOrderStage.setDuration(css.getTotalDuration());

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

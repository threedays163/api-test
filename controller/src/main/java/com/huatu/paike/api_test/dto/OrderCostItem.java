package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;

//LICENCE_ID	ORDER_NO
// CLASS_NAME	GOODS_NO
// PROTOCOL_TYPE	STAGE_ID
// SUBJECT_ID	cos.DURATION/60
// START_DATE	END_DATE
// xue_cost	za_cost
@Data
public class OrderCostItem  implements Serializable{

    private static final long serialVersionUID = -2789904304174015840L;

    String orderNo;

    String licenceId;

    String className;

    String goodsNo;

    String protocolType;

    Long stageId;

    Long subjectId;

    Double duration;

    String startTime;

    String endTime;

    Double xueCost;

    Double zaCost;
}

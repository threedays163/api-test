package com.huatu.paike.api_test.dto;

import lombok.Data;

@Data
public class NewOrderCostItem {

    String orderNo;

    String licenceId;

    String className;

    String goodsNo;

    String companyName;     //ehr拿

    String departmentName;  //

    String buName;          //

    String penOrFace;       //

    String protocolType;

    String examType;        //

    String stageName;       //

    String subjectName;     //

    Long stageId;

    Long subjectId;

    Double duration;
    //科目开始时间
    String startTime;
    //科目结束时间
    String endTime;
    //学费
    Double xueCost;
    //杂费
    Double zaCost;
    //商品开始时间
    String goodsStartTime;  //
    //商品结束时间
    String goodsEndTime;    //
}

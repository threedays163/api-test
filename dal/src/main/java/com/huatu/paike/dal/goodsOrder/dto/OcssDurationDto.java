package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OcssDurationDto {

    String orderNo;

    Long classId;

    Long stageId;

    Long subjectId;

    Integer batchNum;

    Integer totalDuration;

    Integer finishDuration;

    Date endDate;
}

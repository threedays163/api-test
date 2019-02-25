package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderStageSubjectViewDto implements Serializable {
    private static final long serialVersionUID = 1162416358409984231L;

    private String orderNo;

    private String classNo;

    private Long studentId;

    private String studentName;

    private Long stageId;

    private Long subjectId;

    private Integer batchNum;
}

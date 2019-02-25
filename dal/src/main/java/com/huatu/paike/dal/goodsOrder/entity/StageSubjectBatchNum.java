package com.huatu.paike.dal.goodsOrder.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class StageSubjectBatchNum implements Serializable {
    private static final long serialVersionUID = -8056188645781647952L;

    private Long stageId;

    private Long subjectId;

    private Integer batchNum;
}

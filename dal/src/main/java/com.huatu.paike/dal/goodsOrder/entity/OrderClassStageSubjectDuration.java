package com.huatu.paike.dal.goodsOrder.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderClassStageSubjectDuration implements Serializable {
    private static final long serialVersionUID = -5428198267701675245L;

    private String orderNo;

    private Long classId;

    private String classNo;

    private Long stageId;

    private Long subjectId;

    private Integer batchNum;

    /**
     * 已排课时长
     */
    private Integer paikeDuration;

    /**
     * 已结课时长
     */
    private Integer finishDuration;

    /**
     * 总时长
     */
    private Integer totalDuration;

    /**
     * 状态
     */
    private Integer status;


}

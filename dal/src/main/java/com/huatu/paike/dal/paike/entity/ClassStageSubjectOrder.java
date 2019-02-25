package com.huatu.paike.dal.paike.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ClassStageSubjectOrder implements Serializable {
    private static final long serialVersionUID = -780447909031624443L;

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 阶段id
     */
    private Long stageId;

    /**
     * 科目id
     */
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    private Integer batchNum;

    private Float dayDuration;

    /**
     * 几晚
     */
    private Integer nightDuration;

    /**
     * 实际上课人数(反馈时填)
     */
    private Integer realNum;

    /**
     * 科目总时长
     */
    private Integer totalDuration;

    /**
     * 已排课总时长
     */
    private Integer paikeDuration;

    /**
     * 已结课总时长
     */
    private Integer finishDuration;

    /**
     * 状态：2，待排课；3，待上课；4，上课中；5，待反馈（已结课）;6，已反馈；7，反馈中
     */
    private Byte status;

    /**
     * 是否可排课：0，否；1，是
     */
    private Boolean enable;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 课次ID,LESSON_TABLE主键
     */
    private Long lessonTableId;

    /**
     * 是否已结转,0:未结转;1:已结转
     */
    private Boolean hasCost;

    private String orderNo;
}

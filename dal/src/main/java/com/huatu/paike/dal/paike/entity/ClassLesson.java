package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Table(name = "class_lesson")
public class ClassLesson {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级阶段科目老师表主键id(主讲)
     */
    @Column(name = "CSST_ID")
    private Long csstId;

    /**
     * 班级id
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 教室id
     */
    @Column(name = "ROOM_ID")
    private Long roomId;

    /**
     * 阶段id
     */
    @Column(name = "STAGE_ID")
    private Long stageId;

    /**
     * 科目id
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 组织架构id
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 上课日期(粒度:天)
     */
    @Column(name = "LESSON_DATE")
    private Date lessonDate;

    /**
     * 课节时长（单位：分钟）
     */
    @Column(name = "LESSON_DURATION")
    private Integer lessonDuration;

    /**
     * 最早的开始时间
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 最晚的结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 创建人id
     */
    @Column(name = "CREATOR_ID")
    private Long creatorId;

    /**
     * 是否额外排课（结课之后，反馈之前添加的课节，不计成本）：0，否；1，是(已废弃)
     */
    @Column(name = "IS_ADDITIONAL")
    private Boolean isAdditional;

    /**
     * 课节状态：3，待上课；4，上课中；5，待反馈；6，已反馈
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 是否已经结转：0，否；1，是
     */
    @Column(name = "HAS_COST")
    private Boolean hasCost;

    /**
     * 是否有老师课酬结算
     */
    @Column(name = "HAS_REWARD")
    private Boolean hasReward;

    /**
     * 课节主讲
     */
    @Column(name = "TEACHER_STAFF_NO")
    private String teacherStaffNo;

    /**
     * 是否是本地老师：0，否；1，是
     */
    @Column(name = "IS_LOCAL")
    private Boolean isLocal;

    /**
     * 是否废弃:0:正常, 1:废弃,默认值0:正常
     */
    @Column(name = "IS_DISCARD")
    private Boolean isDiscard;

    /**
     * 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    @Column(name = "TEACH_WAY")
    private Byte teachWay;

    /**
     * 课次明细id
     */
    @Column(name = "LESSON_TABLE_DETAIL_ID")
    private Long lessonTableDetailId;
}
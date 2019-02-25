package com.huatu.paike.dal.paike.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "accident_class_lesson")
public class AccidentClassLesson {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 教学事故ID
     */
    @Column(name = "ACCIDENT_ID")
    private Long accidentId;

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
     * 是否额外排课（结课之后，反馈之前添加的课节，不计成本）：0，否；1，是
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

    /**
     * 获取自增ID
     *
     * @return ID - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取教学事故ID
     *
     * @return ACCIDENT_ID - 教学事故ID
     */
    public Long getAccidentId() {
        return accidentId;
    }

    /**
     * 设置教学事故ID
     *
     * @param accidentId 教学事故ID
     */
    public void setAccidentId(Long accidentId) {
        this.accidentId = accidentId;
    }

    /**
     * 获取班级阶段科目老师表主键id(主讲)
     *
     * @return CSST_ID - 班级阶段科目老师表主键id(主讲)
     */
    public Long getCsstId() {
        return csstId;
    }

    /**
     * 设置班级阶段科目老师表主键id(主讲)
     *
     * @param csstId 班级阶段科目老师表主键id(主讲)
     */
    public void setCsstId(Long csstId) {
        this.csstId = csstId;
    }

    /**
     * 获取班级id
     *
     * @return CLASS_ID - 班级id
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级id
     *
     * @param classId 班级id
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取教室id
     *
     * @return ROOM_ID - 教室id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置教室id
     *
     * @param roomId 教室id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取阶段id
     *
     * @return STAGE_ID - 阶段id
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * 设置阶段id
     *
     * @param stageId 阶段id
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * 获取科目id
     *
     * @return SUBJECT_ID - 科目id
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 设置科目id
     *
     * @param subjectId 科目id
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取批次数(默认从0开始)
     *
     * @return BATCH_NUM - 批次数(默认从0开始)
     */
    public Integer getBatchNum() {
        return batchNum;
    }

    /**
     * 设置批次数(默认从0开始)
     *
     * @param batchNum 批次数(默认从0开始)
     */
    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    /**
     * 获取组织架构id
     *
     * @return NODE_ID - 组织架构id
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * 设置组织架构id
     *
     * @param nodeId 组织架构id
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 获取上课日期(粒度:天)
     *
     * @return LESSON_DATE - 上课日期(粒度:天)
     */
    public Date getLessonDate() {
        return lessonDate;
    }

    /**
     * 设置上课日期(粒度:天)
     *
     * @param lessonDate 上课日期(粒度:天)
     */
    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    /**
     * 获取课节时长（单位：分钟）
     *
     * @return LESSON_DURATION - 课节时长（单位：分钟）
     */
    public Integer getLessonDuration() {
        return lessonDuration;
    }

    /**
     * 设置课节时长（单位：分钟）
     *
     * @param lessonDuration 课节时长（单位：分钟）
     */
    public void setLessonDuration(Integer lessonDuration) {
        this.lessonDuration = lessonDuration;
    }

    /**
     * 获取最早的开始时间
     *
     * @return START_TIME - 最早的开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置最早的开始时间
     *
     * @param startTime 最早的开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取最晚的结束时间
     *
     * @return END_TIME - 最晚的结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置最晚的结束时间
     *
     * @param endTime 最晚的结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人id
     *
     * @return CREATOR_ID - 创建人id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人id
     *
     * @param creatorId 创建人id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取是否额外排课（结课之后，反馈之前添加的课节，不计成本）：0，否；1，是
     *
     * @return IS_ADDITIONAL - 是否额外排课（结课之后，反馈之前添加的课节，不计成本）：0，否；1，是
     */
    public Boolean getIsAdditional() {
        return isAdditional;
    }

    /**
     * 设置是否额外排课（结课之后，反馈之前添加的课节，不计成本）：0，否；1，是
     *
     * @param isAdditional 是否额外排课（结课之后，反馈之前添加的课节，不计成本）：0，否；1，是
     */
    public void setIsAdditional(Boolean isAdditional) {
        this.isAdditional = isAdditional;
    }

    /**
     * 获取课节状态：3，待上课；4，上课中；5，待反馈；6，已反馈
     *
     * @return STATUS - 课节状态：3，待上课；4，上课中；5，待反馈；6，已反馈
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置课节状态：3，待上课；4，上课中；5，待反馈；6，已反馈
     *
     * @param status 课节状态：3，待上课；4，上课中；5，待反馈；6，已反馈
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取是否已经结转：0，否；1，是
     *
     * @return HAS_COST - 是否已经结转：0，否；1，是
     */
    public Boolean getHasCost() {
        return hasCost;
    }

    /**
     * 设置是否已经结转：0，否；1，是
     *
     * @param hasCost 是否已经结转：0，否；1，是
     */
    public void setHasCost(Boolean hasCost) {
        this.hasCost = hasCost;
    }

    /**
     * 获取是否有老师课酬结算
     *
     * @return HAS_REWARD - 是否有老师课酬结算
     */
    public Boolean getHasReward() {
        return hasReward;
    }

    /**
     * 设置是否有老师课酬结算
     *
     * @param hasReward 是否有老师课酬结算
     */
    public void setHasReward(Boolean hasReward) {
        this.hasReward = hasReward;
    }

    /**
     * 获取课节主讲
     *
     * @return TEACHER_STAFF_NO - 课节主讲
     */
    public String getTeacherStaffNo() {
        return teacherStaffNo;
    }

    /**
     * 设置课节主讲
     *
     * @param teacherStaffNo 课节主讲
     */
    public void setTeacherStaffNo(String teacherStaffNo) {
        this.teacherStaffNo = teacherStaffNo;
    }

    /**
     * 获取是否是本地老师：0，否；1，是
     *
     * @return IS_LOCAL - 是否是本地老师：0，否；1，是
     */
    public Boolean getIsLocal() {
        return isLocal;
    }

    /**
     * 设置是否是本地老师：0，否；1，是
     *
     * @param isLocal 是否是本地老师：0，否；1，是
     */
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * 获取是否废弃:0:正常, 1:废弃,默认值0:正常
     *
     * @return IS_DISCARD - 是否废弃:0:正常, 1:废弃,默认值0:正常
     */
    public Boolean getIsDiscard() {
        return isDiscard;
    }

    /**
     * 设置是否废弃:0:正常, 1:废弃,默认值0:正常
     *
     * @param isDiscard 是否废弃:0:正常, 1:废弃,默认值0:正常
     */
    public void setIsDiscard(Boolean isDiscard) {
        this.isDiscard = isDiscard;
    }

    /**
     * 获取授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     *
     * @return TEACH_WAY - 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    public Byte getTeachWay() {
        return teachWay;
    }

    /**
     * 设置授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     *
     * @param teachWay 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    public void setTeachWay(Byte teachWay) {
        this.teachWay = teachWay;
    }

    /**
     * 获取课次明细id
     *
     * @return LESSON_TABLE_DETAIL_ID - 课次明细id
     */
    public Long getLessonTableDetailId() {
        return lessonTableDetailId;
    }

    /**
     * 设置课次明细id
     *
     * @param lessonTableDetailId 课次明细id
     */
    public void setLessonTableDetailId(Long lessonTableDetailId) {
        this.lessonTableDetailId = lessonTableDetailId;
    }
}
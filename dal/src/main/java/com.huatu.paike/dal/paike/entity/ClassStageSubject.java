package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "class_stage_subject")
public class ClassStageSubject {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级id
     */
    @Column(name = "CLASS_ID")
    private Long classId;

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

    @Column(name = "DAY_DURATION")
    private Float dayDuration;

    /**
     * 几晚
     */
    @Column(name = "NIGHT_DURATION")
    private Integer nightDuration;

    /**
     * 实际上课人数(反馈时填)
     */
    @Column(name = "REAL_NUM")
    private Integer realNum;

    /**
     * 科目总时长
     */
    @Column(name = "TOTAL_DURATION")
    private Integer totalDuration;

    /**
     * 已排课总时长
     */
    @Column(name = "PAIKE_DURATION")
    private Integer paikeDuration;

    /**
     * 已结课总时长
     */
    @Column(name = "FINISH_DURATION")
    private Integer finishDuration;

    /**
     * 状态：2，待排课；3，待上课；4，上课中；5，待反馈（已结课）;6，已反馈；7，反馈中
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 是否可排课：0，否；1，是
     */
    @Column(name = "ENABLE")
    private Boolean enable;

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
     * 开始时间
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 结束时间
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 课次ID,LESSON_TABLE主键
     */
    @Column(name = "LESSON_TABLE_ID")
    private Long lessonTableId;

    /**
     * 是否已结转,0:未结转;1:已结转
     */
    @Column(name = "HAS_COST")
    private Boolean hasCost;

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
     * @return DAY_DURATION
     */
    public Float getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration
     */
    public void setDayDuration(Float dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * 获取几晚
     *
     * @return NIGHT_DURATION - 几晚
     */
    public Integer getNightDuration() {
        return nightDuration;
    }

    /**
     * 设置几晚
     *
     * @param nightDuration 几晚
     */
    public void setNightDuration(Integer nightDuration) {
        this.nightDuration = nightDuration;
    }

    /**
     * 获取实际上课人数(反馈时填)
     *
     * @return REAL_NUM - 实际上课人数(反馈时填)
     */
    public Integer getRealNum() {
        return realNum;
    }

    /**
     * 设置实际上课人数(反馈时填)
     *
     * @param realNum 实际上课人数(反馈时填)
     */
    public void setRealNum(Integer realNum) {
        this.realNum = realNum;
    }

    /**
     * 获取科目总时长
     *
     * @return TOTAL_DURATION - 科目总时长
     */
    public Integer getTotalDuration() {
        return totalDuration;
    }

    /**
     * 设置科目总时长
     *
     * @param totalDuration 科目总时长
     */
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    /**
     * 获取已排课总时长
     *
     * @return PAIKE_DURATION - 已排课总时长
     */
    public Integer getPaikeDuration() {
        return paikeDuration;
    }

    /**
     * 设置已排课总时长
     *
     * @param paikeDuration 已排课总时长
     */
    public void setPaikeDuration(Integer paikeDuration) {
        this.paikeDuration = paikeDuration;
    }

    /**
     * 获取已结课总时长
     *
     * @return FINISH_DURATION - 已结课总时长
     */
    public Integer getFinishDuration() {
        return finishDuration;
    }

    /**
     * 设置已结课总时长
     *
     * @param finishDuration 已结课总时长
     */
    public void setFinishDuration(Integer finishDuration) {
        this.finishDuration = finishDuration;
    }

    /**
     * 获取状态：2，待排课；3，待上课；4，上课中；5，待反馈（已结课）;6，已反馈；7，反馈中
     *
     * @return STATUS - 状态：2，待排课；3，待上课；4，上课中；5，待反馈（已结课）;6，已反馈；7，反馈中
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态：2，待排课；3，待上课；4，上课中；5，待反馈（已结课）;6，已反馈；7，反馈中
     *
     * @param status 状态：2，待排课；3，待上课；4，上课中；5，待反馈（已结课）;6，已反馈；7，反馈中
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取是否可排课：0，否；1，是
     *
     * @return ENABLE - 是否可排课：0，否；1，是
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 设置是否可排课：0，否；1，是
     *
     * @param enable 是否可排课：0，否；1，是
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
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
     * 获取开始时间
     *
     * @return START_DATE - 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始时间
     *
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束时间
     *
     * @return END_DATE - 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束时间
     *
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取课次ID,LESSON_TABLE主键
     *
     * @return LESSON_TABLE_ID - 课次ID,LESSON_TABLE主键
     */
    public Long getLessonTableId() {
        return lessonTableId;
    }

    /**
     * 设置课次ID,LESSON_TABLE主键
     *
     * @param lessonTableId 课次ID,LESSON_TABLE主键
     */
    public void setLessonTableId(Long lessonTableId) {
        this.lessonTableId = lessonTableId;
    }

    /**
     * 获取是否已结转,0:未结转;1:已结转
     *
     * @return HAS_COST - 是否已结转,0:未结转;1:已结转
     */
    public Boolean getHasCost() {
        return hasCost;
    }

    /**
     * 设置是否已结转,0:未结转;1:已结转
     *
     * @param hasCost 是否已结转,0:未结转;1:已结转
     */
    public void setHasCost(Boolean hasCost) {
        this.hasCost = hasCost;
    }
}
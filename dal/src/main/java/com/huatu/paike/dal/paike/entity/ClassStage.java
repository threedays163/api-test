package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "class_stage")
public class ClassStage {
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
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 阶段总时长
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
     * 获取阶段总时长
     *
     * @return TOTAL_DURATION - 阶段总时长
     */
    public Integer getTotalDuration() {
        return totalDuration;
    }

    /**
     * 设置阶段总时长
     *
     * @param totalDuration 阶段总时长
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
}
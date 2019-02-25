package com.huatu.paike.dal.paike.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "lesson_mod_record")
public class LessonModRecord {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LESSON_ID")
    private Long lessonId;

    /**
     * 班级id
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 上课日期(粒度:天)
     */
    @Column(name = "LESSON_DATE")
    private Date lessonDate;

    @Column(name = "STAGE_ID")
    private Long stageId;

    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 课节时长（单位：分钟）
     */
    @Column(name = "LESSON_DURATION")
    private Integer lessonDuration;

    /**
     * 修改前记录
     */
    @Column(name = "MOD_RECORD_BEFORE")
    private String modRecordBefore;

    /**
     * 修改后记录
     */
    @Column(name = "MOD_RECORD_AFTER")
    private String modRecordAfter;

    /**
     * 是否为删除操作，1:是，0:否，2:教学事故排课删除
     */
    @Column(name = "IS_DELETE")
    private Integer isDelete;

    /**
     * 更新时间
     */
    @Column(name = "OPERATE_TIME")
    private Date operateTime;

    /**
     * 创建人id
     */
    @Column(name = "OPERATOR_ID")
    private Long operatorId;

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
     * @return LESSON_ID
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * @param lessonId
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
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
     * @return STAGE_ID
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * @param stageId
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * @return SUBJECT_ID
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId
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
     * 获取修改前记录
     *
     * @return MOD_RECORD_BEFORE - 修改前记录
     */
    public String getModRecordBefore() {
        return modRecordBefore;
    }

    /**
     * 设置修改前记录
     *
     * @param modRecordBefore 修改前记录
     */
    public void setModRecordBefore(String modRecordBefore) {
        this.modRecordBefore = modRecordBefore;
    }

    /**
     * 获取修改后记录
     *
     * @return MOD_RECORD_AFTER - 修改后记录
     */
    public String getModRecordAfter() {
        return modRecordAfter;
    }

    /**
     * 设置修改后记录
     *
     * @param modRecordAfter 修改后记录
     */
    public void setModRecordAfter(String modRecordAfter) {
        this.modRecordAfter = modRecordAfter;
    }

    /**
     * 获取是否为删除操作，1:是，0:否，2:教学事故排课删除
     *
     * @return IS_DELETE - 是否为删除操作，1:是，0:否，2:教学事故排课删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否为删除操作，1:是，0:否，2:教学事故排课删除
     *
     * @param isDelete 是否为删除操作，1:是，0:否，2:教学事故排课删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取更新时间
     *
     * @return OPERATE_TIME - 更新时间
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置更新时间
     *
     * @param operateTime 更新时间
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 获取创建人id
     *
     * @return OPERATOR_ID - 创建人id
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * 设置创建人id
     *
     * @param operatorId 创建人id
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }
}
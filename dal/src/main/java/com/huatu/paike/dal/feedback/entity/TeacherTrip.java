package com.huatu.paike.dal.feedback.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Table(name = "teacher_trip")
public class TeacherTrip {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级ID
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 阶段ID
     */
    @Column(name = "STAGE_ID")
    private Long stageId;

    /**
     * 科目ID
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 批次数,默认从0开始
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 老师NO
     */
    @Column(name = "TEACHER_STAFF_NO")
    private String teacherStaffNo;

    /**
     * 开始时间
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    /**
     * 入住天数
     */
    @Column(name = "DAYS")
    private Integer days;

    /**
     * 行程明细
     */
    private String desc;

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
     * 获取班级ID
     *
     * @return CLASS_ID - 班级ID
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级ID
     *
     * @param classId 班级ID
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取阶段ID
     *
     * @return STAGE_ID - 阶段ID
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * 设置阶段ID
     *
     * @param stageId 阶段ID
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * 获取批次数,默认从0开始
     *
     * @return BATCH_NUM - 批次数,默认从0开始
     */
    public Integer getBatchNum() {
        return batchNum;
    }

    /**
     * 设置批次数,默认从0开始
     *
     * @param batchNum 批次数,默认从0开始
     */
    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    /**
     * 获取老师NO
     *
     * @return TEACHER_STAFF_NO - 老师NO
     */
    public String getTeacherStaffNo() {
        return teacherStaffNo;
    }

    /**
     * 设置老师NO
     *
     * @param teacherStaffNo 老师NO
     */
    public void setTeacherStaffNo(String teacherStaffNo) {
        this.teacherStaffNo = teacherStaffNo;
    }

    /**
     * 获取开始时间
     *
     * @return START_TIME - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return END_TIME - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取入住天数
     *
     * @return DAYS - 入住天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 设置入住天数
     *
     * @param days 入住天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * 获取行程明细
     *
     * @return desc - 行程明细
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置行程明细
     *
     * @param desc 行程明细
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
}
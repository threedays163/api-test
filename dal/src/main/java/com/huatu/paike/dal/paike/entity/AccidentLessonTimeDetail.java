package com.huatu.paike.dal.paike.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "accident_lesson_time_detail")
public class AccidentLessonTimeDetail {
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
     * 班级ID
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 课节id
     */
    @Column(name = "LESSON_ID")
    private Long lessonId;

    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 上课日期
     */
    @Column(name = "LESSON_DATE")
    private Date lessonDate;

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
     * 时长（单位：分钟）
     */
    @Column(name = "DURATION")
    private Integer duration;

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
     * 获取课节id
     *
     * @return LESSON_ID - 课节id
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * 设置课节id
     *
     * @param lessonId 课节id
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * @return NODE_ID
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * @param nodeId
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 获取上课日期
     *
     * @return LESSON_DATE - 上课日期
     */
    public Date getLessonDate() {
        return lessonDate;
    }

    /**
     * 设置上课日期
     *
     * @param lessonDate 上课日期
     */
    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
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
     * 获取时长（单位：分钟）
     *
     * @return DURATION - 时长（单位：分钟）
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置时长（单位：分钟）
     *
     * @param duration 时长（单位：分钟）
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
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
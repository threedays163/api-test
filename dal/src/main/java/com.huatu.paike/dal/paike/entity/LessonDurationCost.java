package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "lesson_duration_cost")
public class LessonDurationCost {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 课节id
     */
    @Column(name = "LESSON_ID")
    private Long lessonId;

    /**
     * 课节时长
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
     * 结课时间
     */
    @Column(name = "FINISH_TIME")
    private Date finishTime;

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
     * 获取课节时长
     *
     * @return DURATION - 课节时长
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置课节时长
     *
     * @param duration 课节时长
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
     * 获取结课时间
     *
     * @return FINISH_TIME - 结课时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置结课时间
     *
     * @param finishTime 结课时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}
package com.huatu.paike.dal.sys.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "TIME_CONF_DETAIL")
public class TimeConfDetail {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 时间段配置id
     */
    @Column(name = "TIME_CONF_ID")
    private Long timeConfId;

    /**
     * 笔面试类型：B(笔试),M（面试）,Z（综合）
     */
    @Column(name = "EXAM_WAY")
    private String examWay;

    /**
     * 创建时间
     */
    @Column(name = "START_TIME_STR")
    private String startTimeStr;

    /**
     * 更新时间
     */
    @Column(name = "END_TIME_STR")
    private String endTimeStr;

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
     * 获取时间段配置id
     *
     * @return TIME_CONF_ID - 时间段配置id
     */
    public Long getTimeConfId() {
        return timeConfId;
    }

    /**
     * 设置时间段配置id
     *
     * @param timeConfId 时间段配置id
     */
    public void setTimeConfId(Long timeConfId) {
        this.timeConfId = timeConfId;
    }

    /**
     * 获取笔面试类型：B(笔试),M（面试）,Z（综合）
     *
     * @return EXAM_WAY - 笔面试类型：B(笔试),M（面试）,Z（综合）
     */
    public String getExamWay() {
        return examWay;
    }

    /**
     * 设置笔面试类型：B(笔试),M（面试）,Z（综合）
     *
     * @param examWay 笔面试类型：B(笔试),M（面试）,Z（综合）
     */
    public void setExamWay(String examWay) {
        this.examWay = examWay;
    }

    /**
     * 获取创建时间
     *
     * @return START_TIME_STR - 创建时间
     */
    public String getStartTimeStr() {
        return startTimeStr;
    }

    /**
     * 设置创建时间
     *
     * @param startTimeStr 创建时间
     */
    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    /**
     * 获取更新时间
     *
     * @return END_TIME_STR - 更新时间
     */
    public String getEndTimeStr() {
        return endTimeStr;
    }

    /**
     * 设置更新时间
     *
     * @param endTimeStr 更新时间
     */
    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
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
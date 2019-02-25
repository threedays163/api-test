package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "LESSON_TIME_DETAIL")
public class LessonTimeDetail {
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
     * 课节id
     */
    @Column(name = "LESSON_ID")
    private Long lessonId;

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
     * 组织架构id
     */
    @Column(name = "NODE_ID")
    private Long nodeId;
}
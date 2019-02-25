
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.teacher.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @title TeacherLessonTable
 * @desc TODO
 * @author shanyu
 * @date 2018年11月27日
 * @version 1.0
 */
@Data
public class TeacherLessonTable implements Serializable {

    private static final long serialVersionUID = -8007496612418405634L;

    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 主讲端课次id
     */
    private Long lessonTableId;

    /**
     * 老师工号
     */
    private String teacherNo;

    /**
     * 老师类型：1，主讲；2，助教
     */
    private Byte teacherType;

    /**
     * 阶段id
     */
    private Long stageId;

    /**
     * 科目id
     */
    private Long subjectId;

    /**
     * 组织架构id
     */
    private Long nodeId;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 持续时长
     */
    private Integer duration;

    /**
     * 天
     */
    private Integer days;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 授课方式
     */
    private Byte teachWay;

}

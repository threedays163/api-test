
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.teacher.entity;

import java.util.Date;

import lombok.Data;

/**
 * @title TeacherLesssonTableDetail
 * @desc 老师课表详情
 * @author shanyu
 * @date 2018年11月29日
 * @version 1.0
 */
@Data
public class TeacherLesssonTableDetail {

    private Long lessonId;

    private Long lessonTableDetailId;

    private Long classId;

    private Long lessonTableId;

    // 授课阶段
    private Long stageId;

    // 科目
    private Long subjectId;

    // 授课时长(分钟)
    private Integer duration;

    private Date lessonDate;

    private Integer status;

    private Integer score;

    private Integer teachWay;

    private Integer teacherType;

    private Long roomId;

    private Long nodeId;
}

/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.huatu.paike.dal.teacher.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 教师授课的具体时间
 * 
 * @title TeacherLessonTime
 * @author yanmaoyuan
 * @date 2018年7月30日
 * @version 1.0
 */
@NoArgsConstructor
@Data
public class TeacherLessonTime implements Serializable {

    private static final long serialVersionUID = 854002243236178482L;

    private Long classId;// 班级ID

    private Long lessonId;// 课节ID

    private Date lessonDate;// 上课日期

    private Long subjectId;// 科目ID

    private String teacherStaffNo;// 教师工号

    private Integer teacherType;// 教师类型

    private Date startTime;// 开始时间

    private Date endTime;// 结束时间

    private Integer duration;// 课时(分钟)

}
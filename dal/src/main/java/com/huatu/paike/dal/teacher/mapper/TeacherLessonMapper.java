/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.huatu.paike.dal.teacher.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.teacher.dto.AssistantAndStudentRoom;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.teacher.dto.TeacherLessonDetail;
import com.huatu.paike.dal.teacher.dto.TeacherLessonQueryParam;
import com.huatu.paike.dal.teacher.entity.TeacherLesson;
import com.huatu.paike.dal.teacher.entity.TeacherLessonTime;

/**
 * 教师排课数据查询接口
 * 
 * @title TeacherLessonMapper
 * @author yanmaoyuan
 * @date 2018年7月30日
 * @version 1.0
 */
public interface TeacherLessonMapper {

    /**
     * 根据工号和日期范围，批量查询教师排课记录
     * 
     * @param params
     * @return
     */
    List<TeacherLesson> queryTeacherLessonList(TeacherLessonQueryParam params);

    /**
     * 根据工号和日期，查询老师当前排课的详细时间表
     * 
     * @param staffNo
     * @param date
     * @return
     */
    List<TeacherLessonTime> queryTeacherTimeList(@Param("staffNo") String staffNo, @Param("date") Date date);

    /**
     * 根据工号和日期范围,查询教师上课记录
     * 
     * @param staffNos
     * @param startTime
     * @param endTime
     * @return
     */
    List<TeacherLessonDetail> queryTeacherLessonDetail(@Param("staffNos") List<String> staffNos,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * 根据班级，课次id查询学生端
     *
     * @param classIds
     * @param lessonTableId
     * @return
     */

    List<AssistantAndStudentRoom> queryStudentRoomByClassIds(@Param("classIds") Set<Long> classIds,
        @Param("lessonTableId") Long lessonTableId);

    /**
     * 根据班级，课次id查询管学师
     *
     * @param classIds
     * @param lessonTableId
     * @return
     */

    List<AssistantAndStudentRoom> queryAssistantByClassIds(@Param("classIds") Set<Long> classIds,
        @Param("lessonTableId") Long lessonTableId, @Param("teacherType")Integer teacherType);

}
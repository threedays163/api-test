
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.teacher.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.teacher.entity.TeacherLessonTable;
import com.huatu.paike.dal.teacher.entity.TeacherLesssonTableDetail;

/**
 * @title TeacherLessonTableMapper
 * @desc 老师课表
 * @author shanyu
 * @date 2018年11月27日
 * @version 1.0
 */

public interface TeacherLessonTableMapper {

    /**
     * 查询老师课表
     * 
     * @param teacherNos
     * @param startDate
     * @param endDate
     * @param pageDto
     * @return
     */
    public List<TeacherLessonTable> queryTeacherLessonTables(@Param("teacherNos") List<String> teacherNos,
        @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("pageDto") PageDto pageDto);

    /**
     * 
     * @param teacherNos
     * @param startDate
     * @param endDate
     * @param pageDto
     * @return
     */
    public int countTeacherLessonTables(@Param("teacherNos") List<String> teacherNos,
        @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("pageDto") PageDto pageDto);

    /**
     * 查看老师课表明细列表
     * 
     * @param teacherNo
     * @param startDate
     * @param endDate
     * @return
     */
    public List<TeacherLesssonTableDetail> queryTeacherLessonTableDetails(@Param("teacherNo") String teacherNo,
        @Param("startDate") Date startDate, @Param("endDate") Date endDate);

}

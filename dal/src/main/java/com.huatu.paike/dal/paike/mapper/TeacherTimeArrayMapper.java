package com.huatu.paike.dal.paike.mapper;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.paike.entity.TeacherTimeArray;
import com.huatu.paike.dal.paike.entity.TeacherTimeArrayCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface TeacherTimeArrayMapper extends Mapper<TeacherTimeArray> {
    int deleteByFilter(TeacherTimeArrayCriteria filter);

    /**
     * 获取教室时间安排
     * 
     * @param teacherNos
     * @param startTime
     * @param endTime
     * @return
     */
    List<TeacherTimeArray> queryTeacherTimeArray(@Param("teacherNos") Set<String> teacherNos,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * 批量插入
     * 
     * @param teacherTimeArrayList
     */
    void insertBatch(List<TeacherTimeArray> teacherTimeArrayList);

}
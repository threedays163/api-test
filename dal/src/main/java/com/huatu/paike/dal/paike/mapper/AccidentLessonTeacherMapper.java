package com.huatu.paike.dal.paike.mapper;

import java.util.List;
import java.util.Map;

import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.paike.entity.AccidentLessonTeacher;
import com.huatu.paike.dal.paike.entity.AccidentLessonTeacherCriteria;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.mapper.common.Mapper;

public interface AccidentLessonTeacherMapper extends Mapper<AccidentLessonTeacher> {
    int deleteByFilter(AccidentLessonTeacherCriteria filter);

    List<AccidentLessonTeacher> queryByLessonIds(List<Long> lessonIds);

    void insertBatch(List<AccidentLessonTeacher> accidentLessonTeachers);
    
    /**
     * 查询助教
     * 
     * @param csstIds
     * @return
     */
    @MapF2L
    Map<Long, List<Long>> queryCsstAssitant(@Param("csstIds") List<Long> csstIds);
}
package com.huatu.paike.dal.paike.mapper;

import com.huatu.paike.dal.paike.entity.AccidentLessonStudent;
import com.huatu.paike.dal.paike.entity.AccidentLessonStudentCriteria;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AccidentLessonStudentMapper extends Mapper<AccidentLessonStudent> {
    int deleteByFilter(AccidentLessonStudentCriteria filter);

    void insertBatch(List<AccidentLessonStudent> accidentLessonStudents);
}
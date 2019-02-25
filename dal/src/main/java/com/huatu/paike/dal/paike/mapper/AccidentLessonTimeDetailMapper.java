package com.huatu.paike.dal.paike.mapper;

import java.util.List;

import com.huatu.paike.dal.paike.entity.AccidentLessonTimeDetail;
import com.huatu.paike.dal.paike.entity.AccidentLessonTimeDetailCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface AccidentLessonTimeDetailMapper extends Mapper<AccidentLessonTimeDetail> {
    int deleteByFilter(AccidentLessonTimeDetailCriteria filter);

    List<AccidentLessonTimeDetail> queryByLessonIds(List<Long> lessonIds);

    void insertBatch(List<AccidentLessonTimeDetail> accidentLessonTimeDetails);
}
package com.huatu.paike.dal.paike.mapper;

import com.huatu.paike.dal.paike.entity.LessonDurationCost;
import com.huatu.paike.dal.paike.entity.LessonDurationCostCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface LessonDurationCostMapper extends Mapper<LessonDurationCost> {
    int deleteByFilter(LessonDurationCostCriteria filter);
}
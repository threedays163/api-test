package com.huatu.paike.dal.exception.mapper;

import com.huatu.paike.dal.exception.entity.ExceptionLogic;
import com.huatu.paike.dal.exception.entity.ExceptionLogicCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface ExceptionLogicMapper extends Mapper<ExceptionLogic> {
    int deleteByFilter(ExceptionLogicCriteria filter);
}
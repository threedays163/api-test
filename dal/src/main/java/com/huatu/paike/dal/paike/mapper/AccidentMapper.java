package com.huatu.paike.dal.paike.mapper;

import com.huatu.paike.dal.paike.entity.Accident;
import com.huatu.paike.dal.paike.entity.AccidentCriteria;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AccidentMapper extends Mapper<Accident> {
    int deleteByFilter(AccidentCriteria filter);

    int insertAccident(Accident accident);

    void insertBatch(List<Accident> accidents);
}
package com.huatu.paike.dal.cost.mapper;

import com.huatu.paike.dal.cost.entity.CostOrderStageTest;
import com.huatu.paike.dal.cost.entity.CostOrderStageTestCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface CostOrderStageTestMapper extends Mapper<CostOrderStageTest> {
    int deleteByFilter(CostOrderStageTestCriteria filter);
}
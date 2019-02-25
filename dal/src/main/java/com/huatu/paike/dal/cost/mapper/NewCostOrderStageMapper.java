package com.huatu.paike.dal.cost.mapper;

import com.huatu.paike.dal.cost.entity.NewCostOrderStage;
import com.huatu.paike.dal.cost.entity.NewCostOrderStageCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface NewCostOrderStageMapper extends Mapper<NewCostOrderStage> {
    int deleteByFilter(NewCostOrderStageCriteria filter);
}
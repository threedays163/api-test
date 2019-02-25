package com.huatu.paike.dal.reward.mapper;

import com.huatu.paike.dal.reward.entity.RewardNecessaryHour;
import com.huatu.paike.dal.reward.entity.RewardNecessaryHourCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface RewardNecessaryHourMapper extends Mapper<RewardNecessaryHour> {
    int deleteByFilter(RewardNecessaryHourCriteria filter);
}
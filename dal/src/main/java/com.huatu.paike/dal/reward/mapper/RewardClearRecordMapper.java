package com.huatu.paike.dal.reward.mapper;

import java.util.List;

import com.huatu.paike.dal.reward.entity.RewardClearRecord;
import com.huatu.paike.dal.reward.entity.RewardClearRecordCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface RewardClearRecordMapper extends Mapper<RewardClearRecord> {
    int deleteByFilter(RewardClearRecordCriteria filter);

    /**
     * 批量插入
     * 
     * @param recordList
     */
    void insertBatch(List<RewardClearRecord> recordList);
}
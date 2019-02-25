package com.huatu.paike.dal.cost.mapper;

import java.util.List;

import com.huatu.paike.dal.cost.entity.CostOrderRecord;
import com.huatu.paike.dal.cost.entity.CostOrderRecordCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface CostOrderRecordMapper extends Mapper<CostOrderRecord> {
    int deleteByFilter(CostOrderRecordCriteria filter);

    void insertBatch(List<CostOrderRecord> recordList);
}
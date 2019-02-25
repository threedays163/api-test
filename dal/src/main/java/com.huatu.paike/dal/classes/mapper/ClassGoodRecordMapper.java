package com.huatu.paike.dal.classes.mapper;

import java.util.Collection;

import com.huatu.paike.dal.classes.entity.ClassGoodRecord;
import com.huatu.paike.dal.classes.entity.ClassGoodRecordCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassGoodRecordMapper extends Mapper<ClassGoodRecord> {
    int deleteByFilter(ClassGoodRecordCriteria filter);

    void batchInsert(Collection<ClassGoodRecord> list);
}
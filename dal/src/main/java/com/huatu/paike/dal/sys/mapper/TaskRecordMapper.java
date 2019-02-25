package com.huatu.paike.dal.sys.mapper;

import com.huatu.paike.dal.sys.entity.TaskRecord;
import com.huatu.paike.dal.sys.entity.TaskRecordCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface TaskRecordMapper extends Mapper<TaskRecord> {
    int deleteByFilter(TaskRecordCriteria filter);
}
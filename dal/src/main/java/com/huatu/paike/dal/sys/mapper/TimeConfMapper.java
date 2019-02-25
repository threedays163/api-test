package com.huatu.paike.dal.sys.mapper;

import java.util.List;

import com.huatu.paike.dal.sys.dto.TimeConfQueryParams;
import com.huatu.paike.dal.sys.entity.TimeConf;
import com.huatu.paike.dal.sys.entity.TimeConfCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface TimeConfMapper extends Mapper<TimeConf> {

    int deleteByFilter(TimeConfCriteria filter);

    List<TimeConf> queryList(TimeConfQueryParams params);
}
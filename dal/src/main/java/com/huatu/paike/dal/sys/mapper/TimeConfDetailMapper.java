package com.huatu.paike.dal.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.sys.entity.TimeConfDetail;
import com.huatu.paike.dal.sys.entity.TimeConfDetailCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface TimeConfDetailMapper extends Mapper<TimeConfDetail> {
    int deleteByFilter(TimeConfDetailCriteria filter);

    void insertBatch(@Param("details") List<TimeConfDetail> details);
}
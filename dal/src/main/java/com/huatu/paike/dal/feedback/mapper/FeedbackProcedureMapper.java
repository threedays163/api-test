package com.huatu.paike.dal.feedback.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.feedback.entity.FeedbackProcedure;
import com.huatu.paike.dal.feedback.entity.FeedbackProcedureCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface FeedbackProcedureMapper extends Mapper<FeedbackProcedure> {
    int deleteByFilter(FeedbackProcedureCriteria filter);

    List<FeedbackProcedure> queryNeedSendMsgEntity(@Param("start") Integer start, @Param("limit") Integer limit);
}
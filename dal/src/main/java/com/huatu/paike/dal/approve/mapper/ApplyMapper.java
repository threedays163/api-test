package com.huatu.paike.dal.approve.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.approve.entity.Apply;
import com.huatu.paike.dal.approve.entity.ApplyCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ApplyMapper extends Mapper<Apply> {
    int deleteByFilter(ApplyCriteria filter);

    /**
     * 根据流程ID获取审批单
     * 
     * @param processId
     * @return
     */
    Apply getByProcId(@Param("processId") String processId);

    /**
     * 根据反馈编号查询最新的审批记录
     * 
     * @param feedbackNo
     * @return
     */
    Apply queryLatestApply(@Param("feedbackNo") String feedbackNo);

    /**
     * 根据反馈编号批量查询最新的审批记录
     * 
     * @param feedbackNos
     * @return
     */
    List<Apply> batchQueryLatestApply(@Param("feedbackNos") List<String> feedbackNos);

    List<Apply> queryNeedFixApply(@Param("start") int start, @Param("limit") int limit);

    int queryNeedFixCount();
}
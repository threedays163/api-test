package com.huatu.paike.dal.approve.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.approve.entity.ApplyDetail;
import com.huatu.paike.dal.approve.entity.ApplyDetailCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ApplyDetailMapper extends Mapper<ApplyDetail> {
    int deleteByFilter(ApplyDetailCriteria filter);

    /**
     * 查询最新的审批记录
     * 
     * @param applyId
     * @return
     */
    List<ApplyDetail> queryByApplyIdAndLatest(@Param("applyId") Long applyId);

    /**
     * 批量查询最新的审批记录
     * 
     * @param applyIds
     * @return
     */
    List<ApplyDetail> batchQueryByApplyIdAndLatest(@Param("applyIds") List<Long> applyIds);
}
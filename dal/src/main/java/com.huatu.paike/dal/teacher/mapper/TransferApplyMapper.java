package com.huatu.paike.dal.teacher.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.teacher.dto.TransferApplyQueryParam;
import com.huatu.paike.dal.teacher.entity.TransferApply;

import tk.mybatis.mapper.common.Mapper;

/**
 * 老师借调申请查询接口
 * 
 * @title TransferApplyMapper
 * @author yanmaoyuan
 * @date 2018年8月2日
 * @version 1.0
 */
public interface TransferApplyMapper extends Mapper<TransferApply> {

    /**
     * 根据条件查询老师借调申请列表
     * 
     * @param params
     * @return
     */
    List<TransferApply> queryList(TransferApplyQueryParam params);

    /**
     * 获得符合条件的记录数量
     * 
     * @param params
     * @return
     */
    int countByParams(TransferApplyQueryParam params);

    /**
     * 根据审批单号查找记录
     * 
     * @param applyId
     * @return
     */
    TransferApply getByApplyId(@Param("applyId") String applyId);

    /**
     * 根据id查询审批单
     *
     * @param id
     * @return
     */
    TransferApply getById(@Param("id") Long id);

    /**
     * 更新状态
     * 
     * @param applyId
     * @param status
     */
    int updateStatus(@Param("applyId") String applyId, @Param("status") Integer status);


    Long updateSingle(TransferApply transferApply);

    Long updateByApplyId(TransferApply transferApply);
}
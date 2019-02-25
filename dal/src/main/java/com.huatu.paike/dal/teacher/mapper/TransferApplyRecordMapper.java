package com.huatu.paike.dal.teacher.mapper;

import java.util.List;

import com.huatu.paike.dal.teacher.entity.TransferApplyRecordEntity;

import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 课节学生Dao
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  		2019年01月23日 	Created
 *
 * </pre>
 * @since 1.
 */
public interface TransferApplyRecordMapper extends Mapper<TransferApplyRecordEntity> {
    /**
     * 单个新增
     * 
     * @param entity
     * @return
     */
    long insertSingle(TransferApplyRecordEntity entity);

    
    /**
     * 单个更新
     * 
     * @param entity
     * @return
     */
    long updateSingle(TransferApplyRecordEntity entity);
    
    /**
     * 查询列表
     * 
     * @param entity
     * @return
     */
    List<TransferApplyRecordEntity> findList(TransferApplyRecordEntity entity);
    
    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    TransferApplyRecordEntity get(TransferApplyRecordEntity entity);

    /**
     * 根据id逻辑删除
     *
     * @param id
     * @return
     */
    Long removeByid(Long id);
}
package com.huatu.paike.dal.failure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import com.huatu.paike.dal.failure.entity.FailureMsgEntity;

/**
 * 
 * 双师课次时间段管理Dao
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  		2018年11月21日 	Created
 *
 * </pre>
 * @since 1.
 */
public interface FailureMsgMapper extends Mapper<FailureMsgEntity>{
    /**
     * 单个新增
     * 
     * @param entity
     * @return
     */
    long insertSingle(FailureMsgEntity entity);
    
    /**
     * 批量新增
     * 
     * @param list
     * @return
     */
    Long insertBatch(@Param("list")List<FailureMsgEntity> list);
    
    /**
     * 单个更新
     * 
     * @param entity
     * @return
     */
    long updateSingle(FailureMsgEntity entity);
    
    /**
     * 批量更新
     * 
     * @param list
     * @return
     */
    long updateBatch(@Param("list")List<FailureMsgEntity> list);

    /**
     * 逻辑单个删除
     *
     * @param entity
     * @return
     */
    long removeSingle(FailureMsgEntity entity);

    /**
     * 逻辑批量删除
     *
     * @param list
     * @return
     */
    long removeBatch(@Param("list")List<FailureMsgEntity> list);

    
    /**
     * 物理单个删除
     * 
     * @param entity
     * @return
     */
    long deleteSingle(FailureMsgEntity entity);
    
    /**
     * 物理批量删除
     * 
     * @param list
     * @return
     */
    long deleteBatch(@Param("list")List<FailureMsgEntity> list);
    
    /**
     * 分页查询
     * 
     * @return
     */
    int countQuery(FailureMsgEntity entity);
    
    /**
     * 查询列表
     * 
     * @param entity
     * @return
     */
    List<FailureMsgEntity> findList(FailureMsgEntity entity);
    
    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    FailureMsgEntity get(FailureMsgEntity entity);
}
package com.huatu.paike.dal.teachingaffairs.mapper;

import java.util.List;

import com.huatu.paike.dal.teachingaffairs.dto.QueryLessonTableTimeDetailParam;
import com.huatu.paike.dal.teachingaffairs.dto.RemoveByIds;
import com.huatu.paike.dal.teachingaffairs.entity.LessonTableTimeDetailEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 双师课次时间段管理Dao
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  		2018年11月14日 	Created
 *
 * </pre>
 * @since 1.
 */
public interface LessonTableTimeDetailMapper extends Mapper<LessonTableTimeDetailEntity>{
    /**
     * 单个新增
     * 
     * @param entity
     * @return
     */
    long insertSingle(LessonTableTimeDetailEntity entity);
    
    /**
     * 批量新增
     * 
     * @param list
     * @return
     */
    Long insertBatch(@Param("list")List<LessonTableTimeDetailEntity> list);
    
    /**
     * 单个更新
     * 
     * @param entity
     * @return
     */
    long updateSingle(LessonTableTimeDetailEntity entity);
    
    /**
     * 批量更新
     * 
     * @param list
     * @return
     */
    long updateBatch(@Param("list")List<LessonTableTimeDetailEntity> list);

    /**
     * 逻辑单个删除
     *
     * @param entity
     * @return
     */
    long removeSingle(LessonTableTimeDetailEntity entity);

    /**
     * 根据课次子表id删除
     *
     * @param entity
     * @return
     */
    long removeByLessonDetailId(LessonTableTimeDetailEntity entity);

    /**
     * 根据课次子表id删除
     *
     * @param param
     * @return
     */
    long removeByLessonDetailIds(RemoveByIds param);
    /**
     * 逻辑批量删除
     *
     * @param list
     * @return
     */
    long removeBatch(@Param("list")List<LessonTableTimeDetailEntity> list);

    
    /**
     * 物理单个删除
     * 
     * @param entity
     * @return
     */
    long deleteSingle(LessonTableTimeDetailEntity entity);

    /**
     * 物理单个删除
     *
     * @param entity
     * @return
     */
    long deleteByLessonDetailId(LessonTableTimeDetailEntity entity);
    
    /**
     * 物理批量删除
     * 
     * @param list
     * @return
     */
    long deleteBatch(@Param("list")List<LessonTableTimeDetailEntity> list);
    
    /**
     * 分页查询
     * 
     * @return
     */
    int countQuery(QueryLessonTableTimeDetailParam param);
    
    /**
     * 查询列表
     * 
     * @param param
     * @return
     */
    List<LessonTableTimeDetailEntity> findList(QueryLessonTableTimeDetailParam param);
    
    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    LessonTableTimeDetailEntity get(LessonTableTimeDetailEntity entity);

}
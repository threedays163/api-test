package com.huatu.paike.dal.teachingaffairs.mapper;

import java.util.List;

import com.huatu.paike.dal.teachingaffairs.dto.QueryLessonTableRelateTemplateParam;
import com.huatu.paike.dal.teachingaffairs.entity.LessonTableRelateTemplateEntity;
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
public interface LessonTableRelateTemplateMapper extends Mapper<LessonTableRelateTemplateEntity>{
    /**
     * 单个新增
     * 
     * @param entity
     * @return
     */
    long insertSingle(LessonTableRelateTemplateEntity entity);
    
    /**
     * 批量新增
     * 
     * @param list
     * @return
     */
    Long insertBatch(@Param("list")List<LessonTableRelateTemplateEntity> list);
    
    /**
     * 单个更新
     * 
     * @param entity
     * @return
     */
    long updateSingle(LessonTableRelateTemplateEntity entity);
    
    /**
     * 批量更新
     * 
     * @param list
     * @return
     */
    long updateBatch(@Param("list")List<LessonTableRelateTemplateEntity> list);

    /**
     * 逻辑单个删除
     *
     * @param entity
     * @return
     */
    long removeSingle(LessonTableRelateTemplateEntity entity);

    /**
     * 逻辑删除根据课次id
     *
     * @param entity
     * @return
     */
    long removeByLessonTableId(LessonTableRelateTemplateEntity entity);

    /**
     * 逻辑批量删除
     *
     * @param list
     * @return
     */
    long removeBatch(@Param("list")List<LessonTableRelateTemplateEntity> list);

    
    /**
     * 物理单个删除
     *
     * @param entity
     * @return
     */
    long deleteSingle(LessonTableRelateTemplateEntity entity);

    /**
     * 物理单个删除根据课次id
     *
     * @param entity
     * @return
     */
    long deleteByLessonTableId(LessonTableRelateTemplateEntity entity);
    
    /**
     * 物理批量删除
     * 
     * @param list
     * @return
     */
    long deleteBatch(@Param("list")List<LessonTableRelateTemplateEntity> list);
    
    /**
     * 分页查询
     * 
     * @return
     */
    int countQuery(QueryLessonTableRelateTemplateParam param);
    
    /**
     * 查询列表
     * 
     * @param param
     * @return
     */
    List<LessonTableRelateTemplateEntity> findList(QueryLessonTableRelateTemplateParam param);
    
    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    LessonTableRelateTemplateEntity get(LessonTableRelateTemplateEntity entity);
}
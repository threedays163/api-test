package com.huatu.paike.dal.teachingaffairs.mapper;

import java.util.List;

import com.huatu.paike.dal.teachingaffairs.dto.QueryLessonTableTemplateParam;
import com.huatu.paike.dal.teachingaffairs.entity.LessonTableTemplateEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 班级阶段科目Dao
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  		2018年11月09日 	Created
 *
 * </pre>
 * @since 1.
 */
public interface LessonTableTemplateMapper extends Mapper<LessonTableTemplateEntity>{

     /**
     * 单个新增
     * 
     * @param entity
     * @return
     */
    long insertSingle(LessonTableTemplateEntity entity);
    
    /**
     * 批量新增
     * 
     * @param list
     * @return
     */
    Long insertBatch(@Param("list")List<LessonTableTemplateEntity> list);
    
    /**
     * 单个更新
     * 
     * @param entity
     * @return
     */
    long updateSingle(LessonTableTemplateEntity entity);
    
    /**
     * 批量更新
     * 
     * @param list
     * @return
     */
    long updateBatch(@Param("list")List<LessonTableTemplateEntity> list);

    /**
     * 逻辑单个删除
     *
     * @param entity
     * @return
     */
    long removeSingle(LessonTableTemplateEntity entity);

    /**
     * 逻辑批量删除
     *
     * @param list
     * @return
     */
    long removeBatch(@Param("list")List<LessonTableTemplateEntity> list);

    
    /**
     * 物理单个删除
     * 
     * @param entity
     * @return
     */
    long deleteSingle(LessonTableTemplateEntity entity);
    
    /**
     * 物理批量删除
     * 
     * @param list
     * @return
     */
    long deleteBatch(@Param("list")List<LessonTableTemplateEntity> list);
    
    /**
     * 分页查询
     *
     * @param param
     * @return
     */
    int countQuery(QueryLessonTableTemplateParam param);
    
    /**
     * 查询列表
     * 
     * @param param
     * @return
     */
    List<LessonTableTemplateEntity> findList(QueryLessonTableTemplateParam param);
    
    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    LessonTableTemplateEntity get(LessonTableTemplateEntity entity);
}
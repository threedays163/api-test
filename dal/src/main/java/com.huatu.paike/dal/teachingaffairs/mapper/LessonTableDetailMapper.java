package com.huatu.paike.dal.teachingaffairs.mapper;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.teachingaffairs.dto.QueryLessonTableDetailParam;
import com.huatu.paike.dal.teachingaffairs.entity.LessonTableDetailEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * 双师课次管理Dao
 * 
 * @version
 *
 *          <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  		2018年11月14日 	Created
 *
 *          </pre>
 *
 * @since 1.
 */
public interface LessonTableDetailMapper extends Mapper<LessonTableDetailEntity> {
    /**
     * 单个新增
     * 
     * @param entity
     * @return
     */
    long insertSingle(LessonTableDetailEntity entity);

    /**
     * 批量新增
     * 
     * @param list
     * @return
     */
    Long insertBatch(@Param("list") List<LessonTableDetailEntity> list);

    /**
     * 单个更新
     * 
     * @param entity
     * @return
     */
    long updateSingle(LessonTableDetailEntity entity);

    /**
     * 批量更新
     * 
     * @param list
     * @return
     */
    long updateBatch(@Param("list") List<LessonTableDetailEntity> list);

    /**
     * 逻辑单个删除
     *
     * @param entity
     * @return
     */
    long removeSingle(LessonTableDetailEntity entity);

    /**
     * 根据课次id删除
     *
     * @param entity
     * @return
     */
    long removeByLessonTableId(LessonTableDetailEntity entity);

    /**
     * 逻辑批量删除
     *
     * @param list
     * @return
     */
    long removeBatch(@Param("list") List<LessonTableDetailEntity> list);

    /**
     * 物理单个删除
     * 
     * @param entity
     * @return
     */
    long deleteSingle(LessonTableDetailEntity entity);

    /**
     * 物理单个删除
     *
     * @param entity
     * @return
     */
    long deleteByLessonTableId(LessonTableDetailEntity entity);

    /**
     * 物理批量删除
     * 
     * @param list
     * @return
     */
    long deleteBatch(@Param("list") List<LessonTableDetailEntity> list);

    /**
     * 分页查询
     * 
     * @return
     */
    int countQuery(QueryLessonTableDetailParam param);

    /**
     * 查询列表
     * 
     * @param param
     * @return
     */
    List<LessonTableDetailEntity> findList(QueryLessonTableDetailParam param);

    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    LessonTableDetailEntity get(LessonTableDetailEntity entity);

    /**
     * 统计主讲端课次数
     *
     * @param teacherDeviceId
     * @param date
     * @return
     */
    int countLessonByTeacherPlaceId(@Param("teacherDeviceId") Long teacherDeviceId, @Param("date") Date date);

    /**
     * 统计学生端课次数
     *
     * @param studentDeviceId
     * @param date
     * @return
     */
    int countLessonByStuPlaceId(@Param("studentDeviceId") Long studentDeviceId, @Param("date") Date date);

    /**
     * 统计课次学生端个数
     *
     * @param lessonTableIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> countStudentRoomsByLessonTableIds(@Param("lessonTableIds") List<Long> lessonTableIds);

    /**
     * 统计课次人数
     *
     * @param lessonTableIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> countStudentNumberByLessonTableIds(@Param("lessonTableIds") List<Long> lessonTableIds);

    /**
     * 根据课次ID查询所有的主讲端老师
     * 
     * @param lessonTableIds
     * @return
     */
    @MapF2L
    Map<String, List<String>> queryTeacherNosByLessonTableNos(@Param("lessonTableNos") List<String> lessonTableNos);
}
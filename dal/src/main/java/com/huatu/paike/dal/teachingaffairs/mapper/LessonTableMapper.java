package com.huatu.paike.dal.teachingaffairs.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.teachingaffairs.dto.LessonTableId2StaffNoDto;
import com.huatu.paike.dal.teachingaffairs.dto.QueryLessonTableParam;
import com.huatu.paike.dal.teachingaffairs.entity.LessonTableEntity;

import tk.mybatis.mapper.common.Mapper;

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
public interface LessonTableMapper extends Mapper<LessonTableEntity> {
    /**
     * 单个新增
     *
     * @param entity
     * @return
     */
    long insertSingle(LessonTableEntity entity);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    Long insertBatch(@Param("list") List<LessonTableEntity> list);

    /**
     * 单个更新
     *
     * @param entity
     * @return
     */
    long updateSingle(LessonTableEntity entity);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    long updateBatch(@Param("list") List<LessonTableEntity> list);

    /**
     * 逻辑单个删除
     *
     * @param entity
     * @return
     */
    long removeSingle(LessonTableEntity entity);

    /**
     * 逻辑批量删除
     *
     * @param list
     * @return
     */
    long removeBatch(@Param("list") List<LessonTableEntity> list);

    /**
     * 物理单个删除
     *
     * @param entity
     * @return
     */
    long deleteSingle(LessonTableEntity entity);

    /**
     * 物理批量删除
     *
     * @param list
     * @return
     */
    long deleteBatch(@Param("list") List<LessonTableEntity> list);

    /**
     * 分页查询
     *
     * @return
     */
    int countQuery(QueryLessonTableParam param);

    /**
     * 查询列表
     *
     * @param param
     * @return
     */
    List<LessonTableEntity> findList(QueryLessonTableParam param);

    /**
     * 根据id查询
     *
     * @param entity
     * @return
     */
    LessonTableEntity get(LessonTableEntity entity);

    /**
     * 根据主讲端id查询课次
     *
     * @param teacherDeviceId
     * @param lessonTime
     * @return
     */
    List<LessonTableEntity> queryLessonTablesByDeviceId(@Param("teacherDeviceId") Long teacherDeviceId,
        @Param("lessonTime") Date lessonTime, @Param("pageDto") PageDto pageDto);

    /**
     * 根据学生端id查询课次
     *
     * @param id
     * @param date
     */
    List<LessonTableEntity> queryLessonTablesByStuDev(@Param("studentDeviceId") Long studentDeviceId,
        @Param("lessonTime") Date lessonTime, @Param("pageDto") PageDto pageDto);

    @MapF2F
    Map<String, Integer> queryDaysInLessonTableTeacher(Collection<LessonTableId2StaffNoDto> list);

    /**
     * 根据lessonTableId查lessonTableNo
     *
     * @param lessonTableIds
     */
    @MapF2F
    Map<Long, String> queryLessonTableNo(@Param("lessonTableIds") Set<Long> lessonTableIds);

    /**
     * 根据lessonTableId查lessonTableNo
     *
     * @param lessonTableIds
     */
    @MapF2F
    Map<Long, String> queryLessonTableNoByDetailIds(@Param("lessonTableDetailIds") Set<Long> lessonTableDetailIds);
}
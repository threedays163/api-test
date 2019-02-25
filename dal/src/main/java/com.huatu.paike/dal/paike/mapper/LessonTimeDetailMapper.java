package com.huatu.paike.dal.paike.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.huatu.paike.dal.paike.dto.CsstLessonDetailDto;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.paike.entity.LessonTimeDetail;
import com.huatu.paike.dal.paike.entity.LessonTimeDetailCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface LessonTimeDetailMapper extends Mapper<LessonTimeDetail> {
    int deleteByFilter(LessonTimeDetailCriteria filter);

    /**
     * 根据课节id查询课节时间安排详细信息
     * 
     * @param lessonIdLists ids 分片，每一片数量不超过200
     * @return
     */
    List<LessonTimeDetail> queryByLessonIds(@Param("lessonIdLists") List<List<Long>> lessonIdLists);

    /**
     * 批量插入
     * 
     * @param details
     */
    void insertBatch(List<LessonTimeDetail> details);

    /**
     * 查询课节最早的开课时间
     * 
     * @param lessonId
     * @return
     */
    Date earliestTime(@Param("lessonId") Long lessonId);

    /**
     * 根据课表id查询课节时间安排详细信息
     * 
     * @param csstId
     * @return
     */
    List<LessonTimeDetail> queryByCsstId(@Param("csstId") Long csstId);

    /**
     * 根据班级id查询课节时间安排详细信息
     * 
     * @param classId
     * @return
     */
    List<LessonTimeDetail> queryByClassId(@Param("classId") Long classId);

    /**
     * 查询班级各个科目的状态
     * 
     * @param classId
     * @return
     */
    @MapF2F
    Map<String, Integer> queryClassSubjectStatus(@Param("classId") Long classId, @Param("now") Date now);

    /**
     * 查询csstId与课节详情的对应关系
     *
     * @param csstIds
     * @return
     */
    List<CsstLessonDetailDto> queryByCsstIds(@Param("csstIds")Collection<Long> csstIds, @Param("staffNo")String StaffNo);

}
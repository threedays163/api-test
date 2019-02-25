package com.huatu.paike.dal.paike.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.paike.entity.AccidentClassLesson;
import com.huatu.paike.dal.paike.entity.AccidentClassLessonCriteria;
import com.huatu.paike.dal.paike.entity.ClassLesson;

import tk.mybatis.mapper.common.Mapper;

public interface AccidentClassLessonMapper extends Mapper<AccidentClassLesson> {
    int deleteByFilter(AccidentClassLessonCriteria filter);

    /**
     * 查询主讲老师对应的教室信息
     * 
     * @param csstIds
     * @return
     */
    @MapF2L
    public Map<Long, List<Long>> queryClassRoomIdsByCsstIds(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 查询班级阶段科目对应的时长map
     *
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryCsstDurationMap(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 查询班级阶段科目对应的天数map
     *
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryCsstDaysMap(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 查询学员课表每一个csst已上的课时数
     * 
     * @param csstIds
     * @param now
     * @param studentId
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryFinishedDurationByCSST(@Param("csstIds") List<Long> csstIds, @Param("now") Date now,
        @Param("studentId") Long studentId);

    /**
     * 班级维度 查询课节明细
     *
     * @param classId
     * @param csstId
     * @param startTime
     * @param endTime
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryListByClassId(@Param("classId") Long classId, @Param("csstId") Long csstId,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("pageDto") PageDto pageDto);

    /**
     * 班级维度 统计课节明细
     *
     * @param classId
     * @param csstId
     * @param startTime
     * @param endTime
     * @return
     */
    int countByClassId(@Param("classId") Long classId, @Param("csstId") Long csstId, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime);
}
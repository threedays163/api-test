package com.huatu.paike.dal.paike.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.goodsOrder.entity.DelOrderSubjectParam;
import com.huatu.paike.dal.paike.dto.MaxMinTimeDto;
import com.huatu.paike.dal.paike.dto.OrderNoDuration;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;
import com.huatu.paike.dal.paike.entity.LessonStudent;
import com.huatu.paike.dal.paike.entity.LessonStudentCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface LessonStudentMapper extends Mapper<LessonStudent> {
    int deleteByFilter(LessonStudentCriteria filter);

    /**
     * 批量插入
     *
     * @param lessonStudent
     */
    void insertBatch(List<LessonStudent> lessonStudent);

    /**
     * 根据orderNo和classNo以及当前时间点删除还没上的课表**
     *
     * @param classNo
     * @param orderNo
     * @param nowTime
     * @return
     */
    int deleteByOrderNoAndClassNoAndNotStart(@Param("classNo") String classNo, @Param("orderNo") String orderNo,
        @Param("nowTime") Date nowTime);

    /**
     * 删除阶段科目
     *
     * @param delOrderSubjectParam
     * @return
     */
    Long deleteStageSubject(DelOrderSubjectParam delOrderSubjectParam);

    /**
     * 查询给定班级在各个阶段,科目的学生人数
     *
     * @param classID
     * @return
     */
    @MapF2F
    Map<String, Integer> queryStuCountByClassStageSubject(@Param("classID") long classID,
        @Param("cssList") Collection<ClassStageSubject> cssList);

    /**
     * 查询给定班级在各个阶段,科目的学生人数
     *
     * @param classID
     * @return
     */
    @MapF2F
    Map<String, Integer> queryStuCountByClassIds(@Param("classIdsList") List<List<Long>> classIdsList);

    /**
     * 查询学员的每个订单在每个班级的已上课课时数
     *
     * @param orderNoDurationList
     * @return
     */
    List<OrderNoDuration> queryStudentDuration(@Param("list") List<OrderNoDuration> orderNoDurationList);

    /**
     * 查询一个班级阶段科目里学生来源的商品及人数
     * 
     * @param classID
     * @param stageID
     * @param subjectID
     * @param batchNum
     * @param startTime
     * @param endTime
     * @return
     */
    @MapF2F
    Map<String, Integer> queryGoodsSutCountInSubject(@Param("classId") long classId, @Param("stageId") long stageId,
        @Param("subjectId") long subjectId, @Param("batchNum") int batchNum, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime, @Param("pageDto") PageDto pageDto);

    /**
     * 查询一个班级阶段科目里学生来源的商品 总数
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param startTime
     * @param endTime
     * @return
     */
    int queryGoodsCountInSubject(@Param("classId") long classId, @Param("stageId") long stageId,
        @Param("subjectId") long subjectId, @Param("batchNum") int batchNum, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime);

    /**
     * 查询订单在班级内的已上课课时数
     *
     * @param orderNos
     * @param classNo
     * @return
     */
    @MapF2F
    Map<String, Integer> queryOrderUsedMinutesMap(@Param("orderNos") List<String> orderNos,
        @Param("classNo") String classNo, @Param("now") Date now);

    /**
     * 查询课节对应的订单编号
     * 
     * @param lessonId
     * @return
     */
    List<String> queryLessonOrderNos(@Param("lessonId") Long lessonId);

    /**
     * 查询课表课节对应的订单编号
     * 
     * @param csstId
     * @return
     */
    @MapF2L
    Map<Long, List<String>> queryLessonOrderNosByCsstId(@Param("csstId") Long csstId);

    /**
     * 查询lesson中的订单编号
     * 
     * @param lessonIds
     * @return
     */
    @MapF2L
    Map<Long, List<String>> queryLessonOrderNosByLessonIds(@Param("lessonIds") List<Long> lessonIds);

    /**
     * 查询订单课节信息
     * 
     * @param classId
     * @param orderNos
     * @return
     */
    @MapF2L
    Map<String, List<Long>> queryOrderLessonMap(@Param("classId") Long classId,
        @Param("orderNos") List<String> orderNos);

    /**
     * 查询课节里学生人数
     * 
     * @param lessonId
     * @return
     */
    int queryLessonStuCount(@Param("lessonId") Long lessonId);

    MaxMinTimeDto queryMaxMinTimeInSubject(@Param("stageId") Long stageId, @Param("subjectId") Long subjectId,
        @Param("orderNo") String orderNo);

    /**
     * <<<<<<< HEAD 根据班级统计学生
     *
     * @param lessonIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> countByClassIds(@Param("classIds") Collection<Long> classIds);

    /***
     * 查询订单的课表中还没有开始的科目的课表**
     * 
     * @param orderNos
     * @param now
     * @return
     */
    List<LessonStudent> queryNotStartSubjectLessonByOrder(@Param("orderNos") Collection<String> orderNos,
        @Param("now") Date now);
}
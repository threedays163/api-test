package com.huatu.paike.dal.paike.mapper;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.StageBatchDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.classes.dto.StageSubjectDto;
import com.huatu.paike.dal.goodsOrder.entity.DelOrderSubjectParam;
import com.huatu.paike.dal.paike.dto.MaxMinTimeDto;
import com.huatu.paike.dal.paike.dto.StageLesson2TeacherDto;
import com.huatu.paike.dal.paike.entity.ClassLesson;
import com.huatu.paike.dal.paike.entity.ClassLessonCriteria;

import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tk.mybatis.mapper.common.Mapper;

public interface ClassLessonMapper extends Mapper<ClassLesson> {
    int deleteByFilter(ClassLessonCriteria filter);

    /**
     * 班级维度 查询课节明细
     * <p>
     * select * from class_lesson a where class_id = ? and csst_id =? and start_time >=? and end_time <? order by
     * start_time desc limit ?,?
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
     * <p>
     * select count(id) from class_lesson a where class_id = ? and csst_id =? and start_time >=? and end_time <?
     *
     * @param classId
     * @param csstId
     * @param startTime
     * @param endTime
     * @return
     */
    int countByClassId(@Param("classId") Long classId, @Param("csstId") Long csstId, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime);

    /**
     * 老师维度 查询课节明细
     * <p>
     * select a.* from class_lesson a join lesson_teacher b on a.id = b.lesson_id where b.teacher_staff_no in(?) and
     * a.csst_id =? and a.start_time >=? and a.end_time <? order by a.start_time desc limit ?,?
     *
     * @param teacherNos
     * @param csstId
     * @param startTime
     * @param endTime
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryListByTeacherNos(@Param("teacherNos") List<String> teacherNos, @Param("csstId") Long csstId,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("pageDto") PageDto pageDto);

    /**
     * 老师维度 统计课节明细
     * <p>
     * select count(a.id) from class_lesson a join lesson_teacher b on a.id = b.lesson_id where b.teacher_staff_no in(?)
     * and a.csst_id =? and a.start_time >=? and a.end_time <?
     *
     * @param teacherNos
     * @param csstId
     * @param startTime
     * @param endTime
     * @return
     */
    int countByTeacherNos(@Param("teacherNos") List<String> teacherNos, @Param("csstId") Long csstId,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * 学员维度 查询课节明细
     * <p>
     * select a.* from class_lesson a join lesson_student b on a.id = b.lesson_id where b.student_id =? and a.csst_id =?
     * and a.start_time >=? and a.end_time <? order by a.start_time desc limit ?,?
     *
     * @param studentId
     * @param csstId
     * @param startTime
     * @param endTime
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryListByStudentId(@Param("studentId") Long studentId, @Param("csstId") Long csstId,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("pageDto") PageDto pageDto);

    /**
     * 学员维度 统计课节明细
     * <p>
     * select count(a.id) from class_lesson a join lesson_student b on a.id = b.lesson_id where b.student_id =? and
     * a.csst_id =? and a.start_time >=? and a.end_time <?
     *
     * @param studentId
     * @param csstId
     * @param startTime
     * @param endTime
     * @return
     */
    int countByStudentId(@Param("studentId") Long studentId, @Param("csstId") Long csstId,
        @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * 班级,阶段,科目维度课节明细
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryListBySubject(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("pageDto") PageDto pageDto);

    /**
     * 根据班级阶段科目查询课节
     *
     * @param param
     * @return
     */
    List<ClassLesson> queryListBySubjects(DelOrderSubjectParam param);
    /**
     * 班级,阶段,科目课节个数
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    Integer countBySubject(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 获取可能冲突的课节信息
     *
     * @param teacherNos
     * @param startTime
     * @param endTime
     * @param roomIds
     * @return
     */
    List<ClassLesson> queryConflictList(@Param("teacherNos") Set<String> teacherNos, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime, @Param("roomIds") Set<Long> roomIds);

    /**
     * 查询学员课表每一个csst已上的课时数
     * 
     * 
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
     * 查询班级阶段科目对应的天数map
     *
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryCsstDaysMap(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 查询班级阶段科目对应的时长map
     *
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryCsstDurationMap(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 获取时间区域内结束的课节
     * 
     * @param startTime
     * @param endTime
     * @return
     */
    List<ClassLesson> queryFinishedClassLessons(@Param("startTime") Date startTime, @Param("endTime") Date endTime,
        @Param("pageDto") PageDto pageDto);

    /**
     * 查询已经结课且需要转结的课节
     * 
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryWaitCostClassLessons(@Param("pageDto") PageDto pageDto);

    /**
     * 班级维度 查询课节明细
     * <p>
     * select * from class_lesson a where class_id in ? and start_time >=? and end_time <? order by start_time desc
     *
     * @param classIds
     * @param startTime
     * @param endTime
     * @param teacherStaffNos
     * @param subjectId
     * @return
     */
    List<ClassLesson> queryListByClassIds(@Param("classIds") List<Long> classIds, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime, @Param("teacherStaffNos") List<String> teacherStaffNos, @Param("subjectId") Long subjectId);

    /**
     * 根据反馈id 获取反馈对应的课节信息
     * 
     * @param feedBackId
     * @return
     */
    List<ClassLesson> queryClassLessons(@Param("feedBackId") Long feedBackId);

    /**
     * 根据条件查询未结课的课节信息
     * 
     * @param classLesson
     * @return
     */
    List<ClassLesson> queryNoEndClassLessons(@Param("entity") ClassLesson classLesson);

    /**
     * 根据场地和课节状态查询班级
     * 
     * @param placeId
     * @param statuses
     * @return
     */
    public int countByRoomAndStatus(@Param("placeId") Long placeId, @Param("statuses") List<Integer> statuses);

    /**
     * 根据课节状态获取场地
     * 
     * @param statuses
     * @return
     */
    public Set<Long> getRoomIdsByStatus(@Param("statuses") List<Integer> statuses);

    /**
     * 获取班级课节信息
     * 
     * @param csstId
     * @return
     */
    public List<ClassLesson> getClassLessonsByCsstId(@Param("csstId") Long csstId);

    /**
     * 查询和csst关联的课节
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    public List<ClassLesson> selectNeedUpdateClassLesson(@Param("classId") Long classId, @Param("stageId") Long stageId,
                                                         @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 更新课节csstId
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     */
    public void updateClassLessonCsstId(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 更新课节csstId
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     */
    public void updateClassLessonCsstId_accident(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 获取最早的开始时间和最晚的结束时间
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    public MaxMinTimeDto queryMinStartTimeAndMaxEndTime(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 批量获取最早的开始时间和最晚的结束时间
     *
     * @param classIds
     * @return
     */
    List<MaxMinTimeDto> queryMinStartTimeAndMaxEndTimeByClassIds(@Param("classIds") Collection<Long> classIds);

    /**
     * 批量获取最早的开始时间和最晚的结束时间
     *
     * @param classIds
     * @return
     */
    List<MaxMinTimeDto> queryMinStartTimeAndMaxEndTimeByCsstIds(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 批量获取老师no为空的csst最早最晚时间
     * @param csstIds
     * @return
     */
    List<MaxMinTimeDto> queryMinStartTimeAndMaxEndTimeByTeacherNoIsNULLCsstIds(@Param("csstIds") Collection<Long> csstIds);
    /**
     * 查询主讲老师对应的教室信息
     * 
     * @param csstIds
     * @return
     */
    @MapF2L
    public Map<Long, List<Long>> queryClassRoomIdsByCsstIds(@Param("csstIds") Collection<Long> csstIds);

    /**
     * 统计需要设置老师的课节数量
     * 
     * @param classId
     * @param stageIds
     * @return
     */
    public int countNeedTeacherLesson(@Param("classId") Long classId,
        @Param("stageBatchs") Collection<StageBatchDto> stageBatchDtos);

    /**
     * 获取给定阶段未设置老师的课节数
     * 
     * @param classId
     * @param stageSubjectDtos
     * @return
     */
    @MapF2F
    Map<String, Integer> queryStageNotSetTeacherCount(@Param("classId") Long classId,
        @Param("StageBatchDto") List<StageBatchDto> StageBatchDto);

    @MapF2F
    Map<String, Integer> queryCssDaysCount(@Param("classId") Long classId,
                                                      @Param("StageBatchDto") List<StageBatchDto> StageBatchDto);

    /**
     * 获取给定阶段科目未设置老师的课节数
     * 
     * @param classId
     * @param stageSubjectDtos
     * @return
     */
    List<StageLesson2TeacherDto> queryStageSubjectSetTeacherCount(@Param("classId") Long classId,
        @Param("StageBatchDto") Collection<StageBatchDto> StageBatchDto);

    /**
     * 查询班级已经开课的阶段科目
     * 
     * @param classId
     * @param now
     * @return
     */
    List<ClassLesson> queryStartedSubject(@Param("classId") Long classId, @Param("now") Date now);

    /**
     * 查询班级给定阶段科目已经开始的课
     * 
     * @param classId
     * @param stageSubjects
     * @return
     */
    List<ClassLesson> queryStartedClassLessonByStageSubject(@Param("classId") Long classId,
        @Param("stageSubjects") List<StageSubjectDto> stageSubjects);

    /**
     * 查询当前已经结束的课节
     * 
     * @param now
     * @return
     */
    List<Long> queryEndLesson(@Param("now") Date now);

    /**
     * 查询当前已经开始上课的课节
     * 
     * @param now
     * @return
     */
    List<Long> queryStartedLesson(@Param("now") Date now);

    /**
     * 查询课节是否发生过教学事故
     * 
     * @param lessonIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryHasAccidentStatus(@Param("lessonIds") List<Long> lessonIds);

    /**
     * 查询班级阶段科目对应的天数map
     *
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryStudentCsstDaysMap(@Param("csstIds") Collection<Long> csstIds,
        @Param("studentId") Long studentId);

    /**
     * 查询班级阶段科目对应的时长map
     *
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryStudentCsstDurationMap(@Param("csstIds") Collection<Long> csstIds,
        @Param("studentId") Long studentId);

    /**
     * <<<<<<< HEAD 批量插入
     *
     * @param list
     */
    void insertAll(@Param("list") List<ClassLesson> list);

    /**
     * 查询场地关联的班级
     *
     * @param roomId
     * @param pageDto
     * @return
     */
    List<Long> getClassIdsByRoomId(@Param("roomId") Long roomId, @Param("pageDto") PageDto pageDto);

    /**
     * 统计场地对应的课节
     *
     * @param id
     * @param pageDto
     * @return
     */
    int countClassIdsByRoomId(@Param("roomId") Long roomId);

    /**
     * 查询班级里给定科目教室的最小容量 ======= 查询已经结束但未结转的
     * 
     * @param startTime
     * @param endTime
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryHasFinishedNotCostLesson(@Param("pageDto") PageDto pageDto);

    /**
     * 查询学员课表中缺失的课节 >>>>>>> zj_cost
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum <<<<<<< HEAD
     * @return
     */
    Integer queryMinRoomContent(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 分页查询所有的课节信息
     * 
     * @param pageDto
     * @return
     */
    List<ClassLesson> queryByPageDto(@Param("pageDto") PageDto pageDto);

    /**
     * @param orderNo
     * @return
     */
    List<ClassLesson> queryLossLesson(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("orderNo") String orderNo);

    /**
     * 查询csstId对应的课节
     * 
     * @param csstId
     * @return
     */
    List<ClassLesson> queryLessonByCsstId(@Param("csstId") Long csstId);

    /**
     *
     * @param classNos
     * @return
     */
    List<Long> queryLessonIdByClassNoList(@Param("classNos") Collection<String> classNos);
}
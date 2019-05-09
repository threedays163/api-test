package com.huatu.paike.dal.paike.mapper;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.StageBatchDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;
import com.huatu.paike.dal.paike.entity.ClassStageSubjectTeacher;
import com.huatu.paike.dal.paike.entity.ClassStageSubjectTeacherCriteria;

import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import tk.mybatis.mapper.common.Mapper;

public interface ClassStageSubjectTeacherMapper extends Mapper<ClassStageSubjectTeacher> {
    int deleteByFilter(ClassStageSubjectTeacherCriteria filter);

    /**
     * 班级维度查询课表
     * <p>
     * select a.* from class_stage_subject_teacher a where a.class_id = ? and a.start_date >? and a.end_date <? order by
     * a.start_date desc limit ?,?
     *
     * @param classId 班级id
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @param pageDto 分页信息
     * @return
     */
    List<ClassStageSubjectTeacher> queryListByClassId(@Param("classId") Long classId,
                                                      @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("stageId") Long stageId,
                                                      @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("teacherNos") List<String> teacherNos,
                                                      @Param("status") Integer status, @Param("pageDto") PageDto pageDto);

    /**
     * 班级维度统计课表
     * <p>
     * select count(a.id) from class_stage_subject_teacher a where a.class_id = ? and a.start_date <? and a.end_date >?
     *
     * @param classId 班级id
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @param pageDto 分页信息
     * @return
     */
    int countByClassId(@Param("classId") Long classId, @Param("startDate") Date startDate,
        @Param("endDate") Date endDate);

    /**
     * 老师/助教维度查询课表
     *
     * @param teacherNo
     * @param startDate
     * @param endDate
     * @param pageDto
     * @return
     */
    List<ClassStageSubjectTeacher> queryListByTeacherNo(@Param("teacherNo") String teacherNo,
        @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("pageDto") PageDto pageDto);

    /**
     * 老师助教维度查询课表(兼容双师)
     * 
     * @param teacherNo
     * @param startDate
     * @param endDate
     * @param pageDto
     * @return
     */
    List<ClassStageSubjectTeacher> queryListByTeacherNo_new(@Param("teacherNo") String teacherNo,
        @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("pageDto") PageDto pageDto);

    /**
     * 老师/助教维度课表统计
     *
     * @param teacherNo
     * @param startDate
     * @param endDate
     * @return
     */
    int countByTeacherNo(@Param("teacherNo") String teacherNo, @Param("startDate") Date startDate,
        @Param("endDate") Date endDate);

    /**
     * 主讲/助教维度课表统计(兼容双师)
     * 
     * @param teacherNo
     * @param startDate
     * @param endDate
     * @return
     */
    int countByTeacherNo_new(@Param("teacherNo") String teacherNo, @Param("startDate") Date startDate,
        @Param("endDate") Date endDate);

    /**
     * 学员维度查询课表
     * <p>
     * select a.* from class_stage_subject_teacher a join class_lesson b on a.id = b.csst_id join lesson_student c on
     * b.id = c.lesson_id where c.student_id =? and b.lesson_date <? and lesson_date >? order by b.lesson_date desc
     * limit ?,?
     *
     * @param studentId
     * @param startDate
     * @param endDate
     * @param pageDto
     * @return
     */
    List<ClassStageSubjectTeacher> queryListByStudentId(@Param("studentId") Long studentId,
        @Param("teachWay") Integer teachWay, @Param("startDate") Date startDate, @Param("endDate") Date endDate,
        @Param("pageDto") PageDto pageDto);

    /**
     * 学员维度统计课表
     * <p>
     * select count(a.id) from class_stage_subject_teacher a join class_lesson b on a.id = b.csst_id join lesson_student
     * c on b.id = c.lesson_id where c.student_id =? and b.lesson_date <? and lesson_date >?
     *
     * @param studentId
     * @param startDate
     * @param endDate
     * @return
     */
    int countByStudentId(@Param("studentId") Long studentId, @Param("teachWay") Integer teachWay,
        @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    /**
     * 以班级,阶段,科目维度查询课表
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @param pageDto
     * @return
     */
    List<ClassStageSubjectTeacher> queryListBySubject(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("pageDto") PageDto pageDto);

    /**
     * 以班级,阶段,科目维度统计课表
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @param pageDto
     * @return
     */
    Integer countBySubject(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 统计班级阶段科目排课时长
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @return
     */
    int countDuration(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId);

    /**
     * 查询出当前时间>=开始时间,并且状态为待上课和上课中的课表
     *
     * @param date
     * @return
     */
    List<ClassStageSubjectTeacher> queryCsstList(@Param("date") Date date, @Param("pageNum") int pageNum,
        @Param("pageSize") int pageSize);

    /**
     * 更新课表的状态
     *
     * @return
     */
    Integer updateCsstStatus(@Param("status") Integer status, @Param("ids") List<Long> ids);

    /**
     * 更新老师的评分,事故,问卷数
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param subjectId
     * @param teacherNo
     * @param score
     * @param surveyNum
     * @param accident
     * @param scoreDetail
     * @return
     */
    int updateCsstScoreInfo(@Param("classId") long classId, @Param("stageId") long stageId,
        @Param("batchNum") int batchNum, @Param("subjectId") long subjectId, @Param("teacherNo") String teacherNo,
        @Param("teacherType") int teacherType, @Param("score") int score, @Param("surveyNum") int surveyNum,
        @Param("accident") int accident, @Param("scoreDetail") String scoreDetail);

    /**
     * 查询阶段科目的主讲老师
     * 
     * @param classID
     * @param cssList
     * @return
     */
    List<ClassStageSubjectTeacher> queryByClassStageSubject(@Param("classID") long classID,
        @Param("cssList") List<ClassStageSubject> cssList);

    /**
     * 查询班级阶段科目老师信息
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    List<ClassStageSubjectTeacher> queryClassStageSubjectTeachers(@Param("classId") Long classId,
        @Param("stageId") Long stageId, @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum,
        @Param("hasAccident") Boolean hasAccident);

    /**
     * 全部重排的csst统计
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    List<ClassStageSubjectTeacher> queryClassStageSubjectTeachers_AllRearrange(@Param("classId") Long classId,
        @Param("stageId") Long stageId, @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 全部重排后，教学事故的csst统计
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    List<ClassStageSubjectTeacher> queryAccidentCsst_AllRearrange(@Param("classId") Long classId,
                                                                  @Param("stageId") Long stageId, @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 部分重拍的csst统计
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    List<ClassStageSubjectTeacher> queryClassStageSubjectTeachers_PartRearrange(@Param("classId") Long classId,
        @Param("stageId") Long stageId, @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 查询班级无老师阶段科目信息
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    ClassStageSubjectTeacher queryNoTeacherCsst(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 查询班级无老师阶段科目信息
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    ClassStageSubjectTeacher queryNoTeacherCsst_accident(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 删除无用的阶段科目助教老师信息
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @return
     */
    void delUnusedCssa(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 删除无用的阶段科目主讲老师信息
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @return
     */
    void delUnusedCsst(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 根据阶段批次查询班级老师
     * 
     * @param classId
     * @param stageBatchDtos
     * @return
     */
    List<ClassStageSubjectTeacher> queryByStageBatch(@Param("classId") Long classId,
        @Param("stageBatchs") Collection<StageBatchDto> stageBatchDtos);

    /**
     * 查询csst对应的课节里的学生人数
     * 
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> countStuCountByCsstIds(@Param("csstIds") List<Long> csstIds);

    /**
     * 查询csst对应的课节里的学生人数
     * 
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> countAccidentStuCountByCsstIds(@Param("csstIds") List<Long> csstIds);

    /**
     * 查询班级,阶段,科目,批次,老师所对应的科目里的学员
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param subjectId
     * @param staffNo
     * @param pageDto
     * @return
     */
    List<OrderInfo> queryStuByClassStageSubjectTeacher(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("batchNum") Integer batchNum, @Param("subjectId") Long subjectId, @Param("staffNo") String staffNo,
        @Param("pageDto") PageDto pageDto);

    /**
     * 查询班级,阶段,科目,批次,老师所对应的科目里的学员人数
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param subjectId
     * @param staffNo
     * @return
     */
    int countStuByClassStageSubjectTeacher(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("batchNum") Integer batchNum, @Param("subjectId") Long subjectId, @Param("staffNo") String staffNo);

    /**
     * 查询班级,阶段,科目,批次,老师所对应的科目里的学员
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param subjectId
     * @param staffNo
     * @param pageDto
     * @return
     */
    List<OrderInfo> queryStuByAccidentClassStageSubjectTeacher(@Param("classId") Long classId,
        @Param("stageId") Long stageId, @Param("batchNum") Integer batchNum, @Param("subjectId") Long subjectId,
        @Param("staffNo") String staffNo, @Param("pageDto") PageDto pageDto);

    /**
     * 查询班级,阶段,科目,批次,老师所对应的科目里的学员人数
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param subjectId
     * @param staffNo
     * @return
     */
    int countStuByAccidentClassStageSubjectTeacher(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("batchNum") Integer batchNum, @Param("subjectId") Long subjectId, @Param("staffNo") String staffNo);

    /**
     * 查询班级中的教学事故
     * 
     * @param classId
     * @param pageDto
     * @return
     */
    List<ClassStageSubjectTeacher> queryAccidents(@Param("classId") Long classId, @Param("pageDto") PageDto pageDto);

    /**
     * 班级中的教学事故总数
     * 
     * @param classId
     * @return
     */
    int countAccidents(@Param("classId") Long classId);

    /**
     * 查询课节是否有教学事故
     * 
     * @param lessonIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryLessonIfAccident(@Param("lessonIds") List<Long> lessonIds);

    /**
     * 查询教学事故类型
     * 
     * @param csstIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryAccidntType(@Param("csstIds") List<Long> csstIds);

    Integer queryAccidentType(@Param("csstId") Long csstId);

    /**
     *
     * @param csstIds
     */
    List<ClassStageSubjectTeacher> queryListByIds(@Param("csstIds") Collection<Long> csstIds);

    @MapF2L
    Map<Long, List<Long>> queryTeacherDevIdByCsstIds(@Param("csstIds") Collection<Long> csstIds);

    List<ClassStageSubjectTeacher> queryCsstByLessonId(@Param("lessonId") Long lessonId);

    /**
     * 更新已经结束的教学事故课次为待反馈
     * @param now
     * @return
     */
    int updateAccidentEnd(@Param("now") Date now);

    /**
     *  更新csst
     * @param csst
     * @return
     */
    int updateCSST(@Param("csst") ClassStageSubjectTeacher csst,@Param("forceUpdateStartEndTime") boolean forceUpdateStartEndTime);
}
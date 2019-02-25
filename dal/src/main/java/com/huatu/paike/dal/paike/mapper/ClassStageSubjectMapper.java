package com.huatu.paike.dal.paike.mapper;

import java.util.*;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2M;
import com.huatu.paike.dal.goodsOrder.entity.DelOrderSubjectParam;
import com.huatu.paike.dal.paike.entity.ClassStageSubjectOrder;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.StageBatchDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.classes.dto.StageSubjectDto;
import com.huatu.paike.dal.paike.dto.QueryClassStageSubjectDto;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;
import com.huatu.paike.dal.paike.entity.ClassStageSubjectCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassStageSubjectMapper extends Mapper<ClassStageSubject> {
    int deleteByFilter(ClassStageSubjectCriteria filter);

    void insertBatch(List<ClassStageSubject> subjectList);

    /**
     * 更新科目的实际上课人数
     * 
     * @param classID
     * @param stageID
     * @param subjectID
     * @param batchNum
     * @param realNum
     * @return
     */
    int updateRealNum(@Param("classId") long classID, @Param("stageId") long stageID,
        @Param("subjectId") long subjectID, @Param("batchNum") int batchNum, @Param("realNum") int realNum);

    /**
     * 查询班级阶段所有可操作的科目
     * 
     * @param classID
     * @param stageIDs
     * @return
     */
    List<ClassStageSubject> queryFinishedByClassStage(@Param("classID") long classID,
        @Param("stageBatchs") Collection<StageBatchDto> stageBatchs);

    /**
     * 查询班级阶段科目
     *
     * @param classID
     * @param stageBatchs
     * @return
     */
    List<ClassStageSubject> queryCssByClassStage(@Param("classID") long classID,
                                                 @Param("stageBatchs") Collection<StageBatchDto> stageBatchs);
    /**
     * 查询班级中有科目结束的数据
     * 
     * @param classID
     * @return
     */
    List<ClassStageSubject> queryFinishedByClass(@Param("classID") long classID);

    /**
     * 查询阶段科目信息
     * 
     * @param classID
     * @param stageID
     * @param subjectID
     * @param batchNum
     * @return
     */
    ClassStageSubject queryByClassStageSubject(@Param("classID") long classID, @Param("stageID") long stageID,
        @Param("subjectID") long subjectID, @Param("batchNum") int batchNum);

    /**
     * 查询给定阶段科目信息
     * 
     * @param csses
     * @return
     */
    List<ClassStageSubject> queryByClassStageSubjects(@Param("csses") List<ClassStageSubject> csses);

    /**
     * 查询给定阶段批次科目信息
     * 
     * @param csses
     * @return
     */
    List<ClassStageSubject> queryByClassStageBatchSubjects(@Param("csses") List<ClassStageSubject> csses);

    /**
     * 根据阶段批次查询班级里的css
     * 
     * @param classId
     * @param stageBatchs
     * @return
     */
    List<ClassStageSubject> queryByStageBatchs(@Param("classId") Long classId,
        @Param("stageBatchs") Collection<StageBatchDto> stageBatchs);

    /**
     * 查询班级不可以滚动的阶段科目(及未结课的阶段科目)
     * 
     * @param classId
     * @return
     */
    List<ClassStageSubject> queryCanNotRollStageSubject(@Param("classId") Long classId);

    /**
     * 查询班级中阶段科目map
     * 
     * @param classID
     * @param stageIDs
     * @return
     */
    List<ClassStageSubject> queryByClassIDStageIds(@Param("classID") Long classID,
        @Param("stageIDs") List<Long> stageIDs);

    /**
     * 禁用已经完成的科目
     * 
     * @param classId
     * @return
     */
    int disableFinishedSubject(@Param("classId") Long classId, @Param("updateTime") Date updateTime);

    /**
     * 启用被禁用且未排课的科目
     * 
     * @param classId
     * @return
     */
    int enableNotArrangeSubject(@Param("classId") Long classId, @Param("updateTime") Date updateTime);

    /**
     * 获取已经开始的班级阶段科目
     * 
     * @param classId
     * @param now
     * @return
     */
    @MapF2L
    Map<Long, List<Long>> queryStartedSubject(@Param("classId") Long classId, @Param("now") Date now);

    /**
     * 获取已经开始的阶段科目的数量
     * 
     * @param classId
     * @param now
     * @return
     */
    Integer countStartedSubject(@Param("classId") Long classId, @Param("now") Date now);

    /**
     * 查询课节对应的科目信息
     * 
     * @param lessonIds
     * @return
     */
    @MapF2F
    Map<Long, Long> queryClassStageSubjectByLessonIds(@Param("lessonIds") Collection<Long> lessonIds);

    List<ClassStageSubject> queryCssByLessonIds(@Param("lessonIds") Collection<Long> lessonIds);

    /**
     * 查询班级里没有开始的阶段科目
     * 
     * @param classId
     * @param now
     * @return
     */
    List<ClassStageSubject> queryNotStartStageSubjectByClassId(@Param("classId") Long classId, @Param("now") Date now);

    /**
     * 查询班级里给定阶段科目待排课,待上课,上课中的批次
     * 
     * @param classId
     * @param dtos
     * @return
     */
    List<ClassStageSubject> queryWaitOrStartedSubjects(@Param("classId") Long classId,
        @Param("dtos") List<StageSubjectDto> dtos, @Param("now") Date now);

    /**
     * 根据条件查询List
     * 
     * @param dto
     * @return
     */
    List<ClassStageSubject> queryList(QueryClassStageSubjectDto dto);

    /**
     * 查询给定阶段科目里已经结束的订单
     * 
     * @param css
     * @return
     */
    List<String> queryFinishedOrdersInFinishedCss(@Param("css") ClassStageSubject css);

    /**
     * 查询班级所属的css
     * 
     * @param orderNo
     * @return
     */
    List<ClassStageSubject> queryOrdersCssFinished(@Param("orderNo") String orderNo);

    /**
     * 查询订单已经开始的css
     * 
     * @param orderNo
     * @return
     */
    List<ClassStageSubject> queryOrderCssStarted(@Param("orderNo") String orderNo);

    /**
     * 查询订单所有css
     * 
     * @param orderNo
     * @return
     */
    List<ClassStageSubject> queryOrdersCss(@Param("orderNo") String orderNo);

    /**
     * 查询已经结束,但未反馈的css
     * 
     * @param limit
     * @return
     */
    List<ClassStageSubject> queryFinishedButNotHaveCost(@Param("limit") int limit);

    /**
     * 查询已经结束但从未反馈过的阶段科目
     * @param classId
     * @param pageDto
     * @return
     */
    List<ClassStageSubject> queryFinishedAndNeverFeedback(@Param("classId") Long classId, @Param("pageDto")PageDto pageDto);

    /**
     * 查询已经结束但从未反馈过的阶段科目个数
     * @param classId
     * @return
     */
    int countFinishedAndNeverFeedback(@Param("classId") Long classId);
    /** 查询订单与班级的公共科目
     *
     * @param classId
     * @param orderNos
     * @return
     */
    List<ClassStageSubjectOrder> queryCommonSubjects(@Param("classId") Long classId,
        @Param("orderNos") Collection<String> orderNos);

    Integer sumFinishedDuration(DelOrderSubjectParam param);

    /**
     * 更新排课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updatePaikeDuration(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("duration") Integer duration);

    /**
     * 更新结课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updateFinishDuration(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("duration") Integer duration);

    Map<String,Integer> querySubjectBatchStatus(@Param("classId") Long classId,@Param("subjectBatchList") Collection<StageBatchDto> subjectBatchList);

    int updateStatus(@Param("classId") Long classId, @Param("stageBatchs") Set<StageBatchDto> stageBatchs,
                     @Param("status") int status);

    /**
     * 查询班级内可以反馈的科目的个数
     * @param classIdList
     * @return
     */
    @MapF2F
    Map<Long,Integer> queryClassCanFeedback(@Param("classIdList") Collection<Long> classIdList);

    /**
     * 查询班级内已经反馈或正在反馈的科目个数
     * @param list
     * @return
     */
    @MapF2F
    Map<Long,Integer> queryClassHaveFeedbackSubjects(@Param("list") Collection<Long> list);

    /**
     * 查询给定阶段科目中是否有反馈中或已反馈的
     * @param classId
     * @param stageBatchs
     * @return
     */
    List<ClassStageSubject> queryFeedbackOrInFeedbackCss(@Param("classId") Long classId, @Param("stageBatchs") Collection<StageBatchDto> stageBatchs);

    /**
     * 更新css
     * @param css
     * @return
     */
    int update(ClassStageSubject css);
}
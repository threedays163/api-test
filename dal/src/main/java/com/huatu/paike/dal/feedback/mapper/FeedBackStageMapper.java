package com.huatu.paike.dal.feedback.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.huatu.common.sqlbuilder.dto.PageDto;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.StageBatchDto;
import com.huatu.paike.dal.feedback.entity.FeedBack;
import com.huatu.paike.dal.feedback.entity.FeedBackStage;
import com.huatu.paike.dal.feedback.entity.FeedBackStageCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface FeedBackStageMapper extends Mapper<FeedBackStage> {
    int deleteByFilter(FeedBackStageCriteria filter);

    /**
     * 查询班级里已经反馈的阶段 逻辑上一个阶段只能被反馈一次
     * 
     * @param classID
     * @return
     */
    Set<Long> queryHaveFeedbackStageByClass(@Param("classID") long classID);

    /**
     * 查询班级未反馈的阶段
     * 
     * @param classID
     * @return
     */
    Set<StageBatchDto> queryNotFeedbackByClassID(@Param("classID") long classID);

    /**
     * 通过班级和阶段更新feed_back_id
     * 
     * @param classID
     * @param stageID
     * @return
     */
    int updateFeedbackID(@Param("classID") long classID, @Param("stageID") long stageID,
        @Param("batchNum") int batchNum, @Param("feedbackID") long feedbackID);

    /**
     * 查询给定的班级和阶段现在的反馈编号
     * 
     * @param classID
     * @param stageBatchs
     * @return
     */
    List<FeedBackStage> queryFeedbackNoByClassStages(@Param("classID") long classID,
        @Param("stageBatchs") Set<StageBatchDto> stageBatchs);

    /**
     * 对以前要反馈,现在不准备反馈的阶段,进行删除,取消和反馈的关联
     * 
     * @param classID
     * @param stageID
     * @return
     */
    int deleteNotFeedBackStage(@Param("classID") long classID, @Param("stageID") long stageID,
        @Param("batchNum") int batchNum);

    /**
     * 根据反馈编号批量查询反馈阶段
     * 
     * @param feedbackNos
     * @return
     */
    List<FeedBackStage> queryByFeedbackNos(@Param("feedbackNos") Collection<String> feedbackNos);

    List<FeedBackStage> selectIfExistsInFeedback(@Param("classId") Long classId,@Param("stageBatchs") Collection<StageBatchDto> list);

    /**
     * 查询班级给定阶段的反馈状态
     * 
     * @param classId
     * @param stageIds
     * @return
     */
    List<FeedBack> queryStageFeedbackStatus(@Param("classId") Long classId,
        @Param("stageBatchs") Set<StageBatchDto> stageBatchDtos);

    /**
     * 查询班级里给定状态的反馈列表
     * @param classId
     * @param status
     * @param pageDto
     * @return
     */
    List<FeedBackStage> queryByClassIdAndStatus(@Param("classId") Long classId, @Param("status") int status, @Param("pageDto")PageDto pageDto);

    /**
     * 查询班级给定状态的反馈列表个数
     * @param classId
     * @param status
     * @return
     */
    int countByClassIdAndStatus(@Param("classId") Long classId, @Param("status") int status);

}
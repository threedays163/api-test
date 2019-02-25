package com.huatu.paike.dal.feedback.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.feedback.dto.FeedBackCsstInfoDto;
import com.huatu.paike.dal.feedback.dto.FeedbackHistoryItemDto;
import com.huatu.paike.dal.feedback.dto.SnapshotData;
import com.huatu.paike.dal.feedback.dto.TeacherNotFeedbackInfoDto;
import com.huatu.paike.dal.feedback.entity.FeedBack;
import com.huatu.paike.dal.feedback.entity.FeedBackCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface FeedBackMapper extends Mapper<FeedBack> {
    int deleteByFilter(FeedBackCriteria filter);

    /**
     * 查询班级阶段的反馈状态
     * 
     * @param classID
     * @param stageID
     * @return 如果班级阶段反馈了一定有状态,否则认为是待反馈(即无反馈记录)
     */
    Integer queryClassStageStatus(@Param("classID") long classID, @Param("stageID") long stageID);

    /**
     * 通过反馈编号查询反馈
     * 
     * @param feedbackNo
     * @return
     */
    @Select("select * from feed_back where feedback_no = #{feedbackNo}")
    FeedBack getFeedbackByNo(@Param("feedbackNo") String feedbackNo);

    /**
     * 查询班级里已经反馈的阶段的状态
     * 
     * @param classID
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryEveryClassStageStatus(@Param("classID") long classID);

    /**
     * 查询给定班级当前未反馈的学员意见和评价
     * 
     * @param classID
     * @return
     */
    FeedBack queryFeedbackByclassAndNotFeedback(@Param("classID") long classID);

    /**
     * 更新学员意见和建议
     * 
     * @param feedBack
     * @return
     */
    int updateComment(@Param("feedback") FeedBack feedBack);

    /**
     * 用feedbackNo查询ID
     * 
     * @param feedbackNo
     * @return
     */
    Long queryFeedbackIdByFeedbackNo(@Param("feedbackNo") String feedbackNo);

    /**
     * 通过ID批量查询反馈结果
     * 
     * @param ids
     * @return
     */
    List<FeedBack> queryByBatchID(@Param("ids") List<Long> ids);

    /**
     * 修改CAN_FEEDBACK 为可反馈
     * 
     * @param feedbackNo
     * @return
     */
    int updateCanFeedback(@Param("feedbackNo") String feedbackNo);

    /**
     * 反馈历史查询
     * 
     * @param startTime
     * @param endTime
     * @param classQuery
     * @param teacherNos
     * @param businessUnitId
     * @param nodeIds
     * @return
     */
    List<FeedbackHistoryItemDto> queryByFeedbackTimeClassNameTeacherNo(@Param("startTime") Date startTime,
        @Param("endTime") Date endTime, @Param("classQuery") String classQuery,
        @Param("teacherNos") List<String> teacherNos, @Param("businessUnitId") Long businessUnitId,
        @Param("nodeIds") Collection<Long> nodeIds, @Param("pageDto") PageDto pageDto);

    /**
     * 查询反馈老师相关数据
     * 
     * @param startTime
     * @param endTime
     * @param classQuery
     * @param teacherNos
     * @param businessUnitId
     * @param nodeIds
     * @return
     */
    List<FeedBackCsstInfoDto> queryFeedBackCsstInfo(@Param("startTime") Date startTime, @Param("endTime") Date endTime,
        @Param("classQuery") String classQuery, @Param("teacherNos") List<String> teacherNos,
        @Param("businessUnitId") Long businessUnitId, @Param("nodeIds") Collection<Long> nodeIds);

    /**
     * 反馈历史统计
     * 
     * @param startTime
     * @param endTime
     * @param classQuery
     * @param teacherNos
     * @return
     */
    int countByFeedbackTimeClassNameTeacherNo(@Param("startTime") Date startTime, @Param("endTime") Date endTime,
        @Param("classQuery") String classQuery, @Param("teacherNos") List<String> teacherNos,
        @Param("businessUnitId") Long businessUnitId, @Param("nodeIds") Collection<Long> nodeIds);

    /**
     * 根据反馈ID与最新状态更新反馈状态
     * 
     * @param feedbackId
     * @param latestStatus
     */
    void updateFeedbackStatus(@Param("feedbackId") Long feedbackId, @Param("latestStatus") Byte latestStatus);

    Set<Long> queryFeedbackStage(@Param("feedbackNo") String feedbackNo);

    /**
     * 查询班级反馈中的反馈数量
     * 
     * @param classId
     * @return
     */
    Integer queryInFeedbackClassById(@Param("classId") long classId);

    @MapF2F
    Map<String, Long> queryHeadTeacherByFeedbackNo(@Param("feedbackNos") List<String> feedbackNos);

    /**
     * 给定班主任,给定老师,查询老师已结束但反馈的阶段科目
     * 
     * @param teacherNos
     * @param headTeacherId
     * @return
     */
    List<TeacherNotFeedbackInfoDto> queryTeacherNotFeedbackInfo(@Param("teacherNos") Collection<String> teacherNos,
        @Param("headTeacherId") Long headTeacherId);

    List<FeedBack> querybyFeedbackIds(@Param("ids") Collection<Long> ids);

    List<SnapshotData> queryErrorData();
}
package com.huatu.paike.dal.goodsOrder.mapper;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.goodsOrder.dto.QueryOrderStageSubjectDto;
import com.huatu.paike.dal.goodsOrder.entity.OrderClassStageSubject;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubject;
import com.huatu.paike.dal.goodsOrder.entity.OrderStageSubjectCriteria;
import com.huatu.paike.dal.goodsOrder.entity.UpdateOrderStageSubjectParam;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrderStageSubjectMapper extends Mapper<OrderStageSubject> {
    int deleteByFilter(OrderStageSubjectCriteria filter);

    /**
     * 批量插入数据
     * 
     * @param ossList
     * @return
     */
    int batchInsert(@Param("ossList") List<OrderStageSubject> ossList);

    /**
     * 查询总时长未结束的订单
     * 
     * @param orderNos
     * @return
     */
    List<String> queryNotEndOrder(Collection<String> orderNos);

    /**
     * 获取订单阶段科目信息
     * 
     * @param orderNos
     * @return
     */
    List<OrderStageSubject> queryByOrderNos(Collection<String> orderNos);

    /**
     * 查询指定班级里的订单还未关联班级的阶段科目
     * 
     * @param classId
     * @return
     */
    List<OrderStageSubject> queryOrderStageSubjectNotInClass(@Param("classId") Long classId,
        @Param("orderNo") String orderNo);

    /**
     * 更新状态
     *
     * @param orderNoList
     * @param stageId
     * @param subject
     * @param status
     * @return
     */
    int updateOrderStatus(@Param("orderNoList") List<String> orderNoList, @Param("stageId") Long stageId,
        @Param("subjectId") Long subject, @Param("status") int status);

    /**
     * 查询List根据条件
     *
     * @param dto
     * @return
     */
    List<OrderStageSubject> queryList(QueryOrderStageSubjectDto dto);

    /**
     * 根据orderNos查询不在班课时数
     *
     * @param orderNos
     * @return
     */
    @MapF2F
    Map<String, Integer> queryNotInClassDutationByOrders(@Param("orderNos") List<String> orderNos);

    /**
     * 查询订单不在班科目
     *
     * @param orderNos
     * @return
     */
    List<OrderStageSubject> queryNotInClassSubjectByOrders(@Param("orderNos") List<String> orderNos);

    /**
     * 查询班级学员中当前科目没有分配的学员
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @return
     */
    List<String> queryOrderNosSubjectNotInAnyClass(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId);

    /**
     * 查询订单可以入班的阶段科目
     * 
     * @param classId
     * @param orderNos
     * @return
     */
    List<OrderClassStageSubject> queryCanInClassOcssInOrderNos(@Param("classId") Long classId,
        @Param("orderNos") Collection<String> orderNos);

    /**
     * 查询没有上的科目
     * 
     * @param orderNo
     * @return
     */
    List<OrderStageSubject> queryNotUsedSubject(@Param("orderNos") List<String> orderNos);

    /**
     * 查询没有上完的科目
     * 
     * @param orderNo
     * @return
     */
    List<OrderStageSubject> queryNotFinishedStageSubject(@Param("orderNo") String orderNo);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    Long updateBatch(List<OrderStageSubject> list);

    /**
     * 查询公共科目
     *
     * @param classId
     * @param orderNos
     * @return
     */
    List<OrderStageSubject> queryCommonSubjects(@Param("classId") Long classId,
        @Param("orderNos") Collection<String> orderNos);

    /**
     * 更新订单状态为待排课
     * 
     * @param ocssList
     * @return
     */
    int updateStatusIntoWaitAssign(@Param("ocssList") Collection<OrderClassStageSubject> ocssList);

    int updateStatusFromWaitAssign2WaitStart(@Param("ocssList") Collection<OrderClassStageSubject> ocssList);

    /**
     * 如果排课时长为0,更新开始结束时间为null
     * 
     * @param ossList
     * @return
     */
    int updateStartEndTimeIfPaikeZero(@Param("ossList") Collection<OrderStageSubject> ossList);

    /**
     * 更新排课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updatePaikeDuration(@Param("orderNo") String orderNo, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("duration") Integer duration);

    /**
     * 更新结课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updateFinishDuration(@Param("orderNo") String orderNo, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("duration") Integer duration);

    /**
     * 更新排课结课时长
     * @param param
     */
    void updateSingleAddDuration(UpdateOrderStageSubjectParam param);

    int update(OrderStageSubject oss);

    int countEndOss(@Param("startTime")Date startTime,@Param("endTime") Date endTime);

    /**
     * 查询给定时间内开始的oss
     * @param startTime
     * @param endTime
     * @return
     */
    List<Long> queryEndOss(@Param("startTime")Date startTime,@Param("endTime") Date endTime);

    @MapF2F
    Map<Long,Long> queryClassId(@Param("ids")Collection<Long> ids);
}
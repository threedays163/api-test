package com.huatu.paike.dal.cost.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.cost.entity.CostOrderStage;
import com.huatu.paike.dal.cost.entity.CostOrderStageCriteria;
import com.huatu.paike.dal.paike.entity.ClassStageSubject;

import tk.mybatis.mapper.common.Mapper;

public interface CostOrderStageMapper extends Mapper<CostOrderStage> {
    int deleteByFilter(CostOrderStageCriteria filter);

    /**
     * 查询所有
     *
     * @param costOrderStage
     * @return
     */
    List<CostOrderStage> findList(CostOrderStage costOrderStage);

    /**
     * 查询订单阶段科目中最大的序号
     * 
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @param orderNo
     * @param protocolType
     * @return
     */
    Long queryMaxCostOrderStage(@Param("stageId") Long stageId, @Param("subjectId") Long subjectId,
        @Param("batchNum") Integer batchNum, @Param("orderNo") String orderNo, @Param("orderGoodsId") Long orderGoodsId,
        @Param("costType") int costType);

    /**
     * 查询给定条件的数据
     * 
     * @param orderNo
     * @param css
     * @return
     */
    List<CostOrderStage> queryByOrderAndCss(@Param("orderNo") String orderNo,
        @Param("css") List<ClassStageSubject> css);

    /**
     * 查询没有结转成功的
     * 
     * @param hasCost
     * @param Ids
     * @return
     */
    List<CostOrderStage> queryByNotHaveCost(@Param("hasCost") int hasCost, @Param("ids") Collection<Long> Ids);

    /**
     * 查询没有结转成功的个数
     * 
     * @param hasCost
     * @param batchSize
     * @return
     */
    int countByNotHaveCost(@Param("hasCost") int hasCost);

    /**
     * 查询没有结转的ID
     * @param hasCost
     * @return
     */
    List<Long> queryIDsByNotHaveCost(@Param("hasCost") int hasCost);

    /**
     * 根据时间段查询没有结转的ID
     * @param hasCose
     * @param startTime
     * @param endTime
     * @return
     */
    List<Long> queryIDsByNotHaveCostAndTime(@Param("hasCost") int hasCose, @Param("startTime")Date startTime,@Param("endTime") Date endTime);

    List<Long> queryIDsByShouldPushIn0212(@Param("startTime")Date startTime,@Param("endTime") Date endTime);

    /**
     * 查询是否已经推送成功过
     * 
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @param orderNo
     * @param orderGoodsId
     * @param cost
     * @param costType
     * @param protocolType
     * @return
     */
    Integer queryHavePush(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum, @Param("orderNo") String orderNo,
        @Param("orderGoodsId") Long orderGoodsId, @Param("cost") Long cost, @Param("costType") Integer costType,
        @Param("protocolType") String protocolType);
}
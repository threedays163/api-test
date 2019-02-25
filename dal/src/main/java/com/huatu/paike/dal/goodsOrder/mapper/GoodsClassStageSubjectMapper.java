package com.huatu.paike.dal.goodsOrder.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.goodsOrder.dto.GoodsClassStageSubjectOrderCountDto;
import com.huatu.paike.dal.goodsOrder.entity.GoodsClassStageSubject;
import com.huatu.paike.dal.goodsOrder.entity.GoodsClassStageSubjectCriteria;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;

import tk.mybatis.mapper.common.Mapper;

public interface GoodsClassStageSubjectMapper extends Mapper<GoodsClassStageSubject> {
    int deleteByFilter(GoodsClassStageSubjectCriteria filter);

    int insertBatch(Collection<GoodsClassStageSubject> gcssList);

    /**
     * 获取已经开始的阶段科目的数量
     * 
     * @param classId
     * @param goodsNos
     * @param now
     * @return
     */
    @MapF2F
    Map<String, Integer> countGoodsStartedSubject(@Param("classId") Long classId,
        @Param("goodsNos") Collection<String> goodsNos, @Param("now") Date now);

    /**
     * 获取各个(goodsNo,classId,stageId,subjectId)的学生人数
     * 
     * @param goodsNo
     * @param pageDto
     */
    List<GoodsClassStageSubjectOrderCountDto> queryOrderCount(@Param("goodsNo") String goodsNo,
        @Param("pageDto") PageDto pageDto);

    /**
     * 获取各个(goodsNo,classId,stageId,subjectId)的总数
     * 
     * @param goodsNo
     * @param pageDto
     * @return
     */
    Integer queryOrderCountAll(@Param("goodsNo") String goodsNo, @Param("pageDto") PageDto pageDto);

    /**
     * 根据goodsNo,classId,stageId,subjectId查询订单列表
     * 
     * @param goodsNo
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    List<OrderInfo> queryOrderList(@Param("goodsNo") String goodsNo, @Param("classId") Long classId,
        @Param("stageId") Long stageId, @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum,
        @Param("pageDto") PageDto pageDto);

    /**
     * 根据goodsNo,classId,stageId,subjectId查询订单个数
     * 
     * @param goodsNo
     * @param classId
     * @param stageId
     * @param subjectId
     * @return
     */
    Integer countOrderBySubject(@Param("goodsNo") String goodsNo, @Param("classId") Long classId,
        @Param("stageId") Long stageId, @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 根据班级id查询商品阶段科目
     *
     * @param classId
     * @return
     */
    List<GoodsClassStageSubject> queryGoodsStageSubjectByClassId(@Param("classId") Long classId);
}
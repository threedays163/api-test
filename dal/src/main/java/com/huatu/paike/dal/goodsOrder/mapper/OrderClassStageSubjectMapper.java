package com.huatu.paike.dal.goodsOrder.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.huatu.paike.dal.goodsOrder.dto.OrderStageSubjectViewDto;
import com.huatu.paike.dal.goodsOrder.dto.QueryOrderViewParam;
import com.huatu.paike.dal.goodsOrder.entity.*;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2ML;
import com.huatu.paike.dal.goodsOrder.dto.ClassGoodDto;
import com.huatu.paike.dal.goodsOrder.dto.StageBatchNumDto;

import tk.mybatis.mapper.common.Mapper;

public interface OrderClassStageSubjectMapper extends Mapper<OrderClassStageSubject> {
//    int deleteByFilter(OrderClassStageSubjectCriteria filter);

    /**
     * 查询班级阶段科目可排课的订单
     * 
     * @param classId 班级id
     * @param stageId 阶段id
     * @param subjectId 科目id
     * @param batchNum 批次号
     * @return
     */
    List<String> queryOrderNos(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 查询班级订单阶段科目
     * 
     * @param classId
     * @param orderNos
     * @return
     */
    @MapF2ML
    Map<String, Map<Long, List<Long>>> queryOcssListByClassId(@Param("classId") Long classId,
        @Param("orderNos") List<String> orderNos);

    /**
     * 查询订单已入班阶段科目
     * 
     * @param classId
     * @param orderNos
     * @return
     */
    @MapF2ML
    Map<String, Map<Long, List<Long>>> queryOcssListByOrderNos(@Param("orderNos") Collection<String> orderNos);

    /**
     * 批量插入数据
     * 
     * @param ocssList
     * @return
     */
    int batchInsert(Collection<OrderClassStageSubject> ocssList);

    /**
     * 根据班级和商品删除数据
     * 
     * @param classGoodsDto
     * @return
     */
    int deleteByGoodsNosAndClass(@Param("classGoodsDto") ClassGoodDto classGoodsDto);

    /**
     * 获取已经开始的阶段科目的数量
     * 
     * @param classId
     * @param goodsNos
     * @param now
     * @return
     */
    @MapF2F
    Map<String, Integer> countOrderStartedSubject(@Param("classId") Long classId,
        @Param("orderNos") Collection<String> orderNos, @Param("now") Date now);

    /**
     * 获取订单未开始的阶段科目
     * 
     * @param classId
     * @param goodsNos
     * @param now
     * @return
     */
    @MapF2ML
    Map<String, Map<Long, List<Long>>> getOrderNotStartedSubject(@Param("classId") Long classId,
        @Param("orderNos") Collection<String> orderNos, @Param("now") Date now);

    /**
     * 删除订单未开始的阶段科目
     * 
     * @param orderNos
     * @param now
     */
    void delOrderNotStartedSubject(@Param("orderNos") Collection<String> orderNos, @Param("now") Date now);

    /**
     * 删除订单班级阶段科目
     *
     * @param param
     * @return
     */
    Long delByOrderSubject(DelOrderSubjectParam param);

    /**
     * 查询所有
     *
     * @param orderClassStageSubject
     * @return
     */
    List<OrderClassStageSubject> findList(OrderClassStageSubject orderClassStageSubject);

    /**
     * 查询商品编号
     *
     * @param classNo
     * @param stageBatchNumDtoList
     * @return
     */
    List<String> queryGoodsNos(@Param("classNo") String classNo,
        @Param("stageBatchNumDtoList") List<StageBatchNumDto> stageBatchNumDtoList);

    /**
     * 查询oss关联的ocss
     * 
     * @param oss
     * @return
     */
    List<OrderClassStageSubject> queryByOss(List<OrderStageSubject> oss);

    @MapF2F
    Map<Long, Integer> queryHaveCostStatus(Collection<OrderClassStageSubject> list);

    List<OrderClassStageSubject> queryNotStartedSubject(@Param("orderNos") List<String> orderNos,
        @Param("now") Date now);

    /**
     * 查询班级订单阶段科目信息
     *
     * @param queryOrderViewParam
     * @return
     */
    List<OrderStageSubjectViewDto> queryOrderView(QueryOrderViewParam queryOrderViewParam);

    /**
     * 查询班级订单编码
     *
     * @param queryOrderViewParam
     * @return
     */
    List<String> queryOrderNoList(QueryOrderViewParam queryOrderViewParam);

    /**
     * 查询班级订单总数
     *
     * @param queryOrderViewParam
     * @return
     */
    Integer queryCountOrderNo(QueryOrderViewParam queryOrderViewParam);

    /**
     * 查询班级在班阶段科目
     *
     * @param orderNos
     * @return
     */
    List<OrderClassStageSubjectDuration> queryOrderInClassSubject(@Param("orderNos") Collection<String> orderNos);
}
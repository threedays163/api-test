package com.huatu.paike.dal.goodsOrder.mapper;

import com.huatu.paike.dal.goodsOrder.entity.OrderVersion;
import com.huatu.paike.dal.goodsOrder.entity.OrderVersionCriteria;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Collection;
import java.util.List;

public interface OrderVersionMapper extends Mapper<OrderVersion> {
    int deleteByFilter(OrderVersionCriteria filter);

    void batchInsert(@Param("list") List<OrderVersion> list);

    /**
     * 根据订单编号获取最新的版本号信息
     * 
     * @param orderNo
     * @return
     */
    OrderVersion getNewestVersion(@Param("orderNo") String orderNo);

    void addVersion(@Param("item") OrderVersion orderVersion);

    /**
     * 根据orderGoodsId获取orderVersion
     * @param orderGoodsIds
     * @return
     */
    List<OrderVersion> getNewestVersionByOrderGoodsIds(@Param("orderGoodsIds") Collection<Long> orderGoodsIds);

    /**
     * 根据orderNo获取orderVersion
     * @param orderNos
     * @return
     */
    List<OrderVersion> getNewestVersionByOrderNos(@Param("orderNos") Collection<String> orderNos);

    /**
     * 根据订单ID查询订单最新的订单版本
     * @param ids
     * @return
     */
    List<OrderVersion> queryNewOrderVersionByOrderId(Collection<Long> ids);

}
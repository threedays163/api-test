package com.huatu.paike.dal.goodsOrder.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.goodsOrder.entity.OrderMsg;
import com.huatu.paike.dal.goodsOrder.entity.OrderMsgCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface OrderMsgMapper extends Mapper<OrderMsg> {
    int deleteByFilter(OrderMsgCriteria filter);

    int countOrderMsg();

    List<OrderMsg> queryOrderMsg(@Param("size") int size);
}
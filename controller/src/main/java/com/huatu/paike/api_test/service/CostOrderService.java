package com.huatu.paike.api_test.service;

import com.huatu.paike.api_test.OrderInfoDto;

public interface CostOrderService {

    public void buildCostOrder();

    public void buildCostOrder_test();

    public OrderInfoDto queryOrderCostInfo(Long orderGoodsId);
}

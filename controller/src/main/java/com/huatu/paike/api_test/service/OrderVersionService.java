package com.huatu.paike.api_test.service;

import com.huatu.paike.api_test.dto.OrderInfoDto;

import java.util.List;
import java.util.Map;

public interface OrderVersionService {

    /**
     * 并发获取订单金额信息
     *
     * @param orderGoodsIds
     * @return
     */
    public Map<Long, OrderInfoDto> getMoneyInfoParallel(List<Long> orderGoodsIds);

    /**
     * 根据OrderGoodsId查询本地数据
     * @param orderGoodsIds
     * @return
     */
    Map<Long,OrderInfoDto> getOrderInfoByOrderGoodsId(List<Long> orderGoodsIds);


}

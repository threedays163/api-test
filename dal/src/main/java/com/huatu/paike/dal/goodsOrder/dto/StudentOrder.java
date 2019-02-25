package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class StudentOrder implements Serializable {

    private static final long serialVersionUID = 5594227066772085982L;

    private String goodsNo;//商品编号

    private String goodsName;//商品名称

    private String orderNo;//订单编号

    private Long orderGoodsId;//订单商品id

    private String oldOrderNo;//商品订单系统的订单编号

    private Integer buyDuration;//购买课时数

    private Integer endedDuration;//已结课的课时数

    private Boolean isMeal;//是否包餐

    private Boolean isBed;//是否包住

    private Byte orderState;//订单状态

    private Date startDate;//开始上课日期
}

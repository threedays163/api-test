package com.huatu.paike.dal.goodsOrder.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateOrderStatusAndDurationParam implements Serializable {
    private static final long serialVersionUID = 1634376002122091079L;

    private Integer duration;

    private Integer finishedDuration;

    private Integer status;

    private String orderNo;
}

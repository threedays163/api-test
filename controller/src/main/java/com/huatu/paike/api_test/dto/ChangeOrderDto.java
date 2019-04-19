package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ChangeOrderDto {
    private OrderInfoDto paike;
    private String source;

    private Date createTime;

    private OrderInfoDto sku;
}

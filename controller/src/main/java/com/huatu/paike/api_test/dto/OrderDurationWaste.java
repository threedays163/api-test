package com.huatu.paike.api_test.dto;

import lombok.Data;

@Data
public class OrderDurationWaste {

    String orderNo;

    String licenseId;

    String goodsNo;

    String buyTime;

    String haveFinish;

    Double allDuration;

    Double finishDuration;

    Double finishIn_12_Duration;

    Double finishIn_01_Duration;
}

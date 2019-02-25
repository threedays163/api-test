
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.dto;

import com.huatu.common.enums.EnumService;

/**
 * @title NecessaryType
 * @desc TODO
 * @author shanyu
 * @date 2018年8月1日
 * @version 1.0
 */

public enum CostType implements EnumService {

    extra(1, "杂费"),

    tuition(2, "学费");

    private CostType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private int value;

    private String desc;

    @Override
    public int getValue() {

        return value;
    }

    @Override
    public String getDesc() {
        return desc;
    }

}

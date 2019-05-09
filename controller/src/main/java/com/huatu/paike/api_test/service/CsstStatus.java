
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.service;

import com.huatu.common.enums.EnumService;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @title CsstStatus
 * @desc 阶段科目老师状态
 * @author shanyu
 * @date 2018年7月26日
 * @version 1.0
 */

public enum CsstStatus implements EnumService {

    WAIT_CLASS_START(3, "待上课"), IN_CLASS(4, "上课中"), WAIT_FEEDBACK(5, "待反馈"), IN_FEEDBACK(6, "反馈中"), HAVE_FEEDBACK(7, "已反馈");

    private CsstStatus(int value, String desc) {
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

    private static Map<Integer, CsstStatus> map = Maps.newHashMap();

    static {
        for (CsstStatus e : values()) {
            map.put(e.value, e);
        }
    }

    public static CsstStatus getType(Integer id) {
        return map.get(id);
    }

}

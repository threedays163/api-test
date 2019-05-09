
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.service;

import com.huatu.common.enums.EnumService;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @title PaikeTeacherType
 * @desc 排课老师类型
 * @author shanyu
 * @date 2018年7月26日
 * @version 1.0
 */

public enum PaikeTeacherType implements EnumService {
    master(1, "主讲"),

    assitant(2, "助教"),

    ;
    private static Map<Integer,PaikeTeacherType> cache = Maps.newHashMap();

    static {
        for(PaikeTeacherType type : PaikeTeacherType.values()) {
            cache.put(type.getValue(), type);
        }
    }
    
    private PaikeTeacherType(int value, String desc) {
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
    
    public static PaikeTeacherType getByValue(int value) {
        return cache.get(value);
    }

}

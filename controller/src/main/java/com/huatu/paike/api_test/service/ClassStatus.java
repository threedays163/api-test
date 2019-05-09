
package com.huatu.paike.api_test.service;

import com.huatu.common.enums.EnumService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author threedays
 * @version 1.0
 * @title ClassStatus
 * @desc 班级状态枚举
 * @date 2018年7月22日
 */
public enum ClassStatus implements EnumService {
    WAIT_START(1, "待开班"), WAIT_ASSIGN(2, "待排课"), WAIT_CLASS_START(3, "待上课"), IN_CLASS(4, "上课中"), WAIT_FEEDBACK(5,
        "待反馈"), IN_FEEDBACK(6, "反馈中"), HAVE_FEEDBACK(7, "已反馈"), DELETED(8, "已删除");
    private int id;
    private String name;

    ClassStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getValue() {
        return id;
    }

    @Override
    public String getDesc() {
        return name;
    }

    private static final Map<Integer, ClassStatus> cache;

    static {
        cache = new HashMap<>();
        for (ClassStatus item : ClassStatus.values()) {
            cache.put(item.getValue(), item);
        }
    }

    public static ClassStatus get(int status) {
        return cache.get(status);
    }
}

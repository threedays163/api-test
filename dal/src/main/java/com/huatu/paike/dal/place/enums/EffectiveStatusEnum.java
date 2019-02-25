
package com.huatu.paike.dal.place.enums;

import java.util.Map;

import com.google.common.collect.Maps;
import com.huatu.common.enums.EnumService;

public enum EffectiveStatusEnum implements EnumService {
    // 针对有签订时间与过期时间的场地，加一个待生效状态区分，待生效指的是还没到签订时间的场地，也可以作为教室
    IS_NOT_EFFECTIVE(0, "无效"), WAITING_EFFECTIVE(1, "待生效"), IS_EFFECTIVE(2, "有效");

    private static Map<Integer, EffectiveStatusEnum> cache = Maps.newHashMap();
    private Integer value;
    private String desc;

    static {
        for (EffectiveStatusEnum type : EffectiveStatusEnum.values()) {
            cache.put(type.getValue(), type);
        }
    }

    private EffectiveStatusEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String getDesc() {

        return desc;

    }

    @Override
    public int getValue() {

        return value;

    }

    public static EffectiveStatusEnum getByValue(int value) {
        return cache.get(value);
    }
}

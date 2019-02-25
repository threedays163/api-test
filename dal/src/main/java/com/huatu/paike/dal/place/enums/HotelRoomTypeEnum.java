
package com.huatu.paike.dal.place.enums;

import java.util.Map;

import com.google.common.collect.Maps;
import com.huatu.common.enums.EnumService;

public enum HotelRoomTypeEnum implements EnumService {
    STANDARD_ROOM(0, "标准房"), KING_ZIZE_ROOM(1, "大床房");

    private int value;
    private String desc;

    private static Map<Integer, HotelRoomTypeEnum> cache = Maps.newHashMap();
    static {
        for (HotelRoomTypeEnum type : HotelRoomTypeEnum.values()) {
            cache.put(type.getValue(), type);
        }
    }

    private HotelRoomTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public int getValue() {

        return value;

    }

    @Override
    public String getDesc() {

        return desc;

    }

    public static HotelRoomTypeEnum getByValue(int value) {
        return cache.get(value);
    }

}

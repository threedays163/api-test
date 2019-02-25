
package com.huatu.paike.dal.place.enums;

import com.google.common.collect.Maps;
import com.huatu.common.enums.EnumService;

import java.util.Map;

public enum PlaceTypeEnum implements EnumService {

    CAMPUS_ROOM(0, "教室"), HOTEL_MEETING_ROOM(1, "酒店会议室"), HOTEL_ROOM(2, "酒店房间"), OTHER(3, "其它"), SHUANGSHI_AUDIENCE(4, "学生端"), SHUANGSHI_SPEAKER(5, "主讲端");

    private Integer value;
    private String desc;

    private static Map<Integer, PlaceTypeEnum> cache = Maps.newHashMap();

    static {
        PlaceTypeEnum[] enums = PlaceTypeEnum.values();
        for (PlaceTypeEnum placeType : enums) {
            cache.put(placeType.getValue(), placeType);
        }
    }

    private PlaceTypeEnum(Integer value, String desc) {
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

    public static PlaceTypeEnum getByValue(Integer value) {
        return cache.get(value);
    }
}

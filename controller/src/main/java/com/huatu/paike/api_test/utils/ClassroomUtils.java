package com.huatu.paike.api_test.utils;

import com.huatu.paike.api_test.dto.PlaceInfo;
import com.huatu.paike.dal.place.enums.PlaceTypeEnum;

import java.util.Optional;

public class ClassroomUtils {

    public static String getLocation(PlaceInfo placeInfo) {
        // 按照场地地址+场地名称+场所名称给默认值
        // 理论上下面用到的值都不会为空，还是加空指针兼容稳妥一些
        String defaultLocation = Optional.ofNullable(placeInfo.getAddress_info()).orElse("")
            + Optional.ofNullable(placeInfo.getAddress_name()).orElse("")
            + Optional.ofNullable(placeInfo.getPlace_name()).orElse("");

        if (placeInfo.getPlace_type() != null) {
            if (placeInfo.getPlace_type() == PlaceTypeEnum.CAMPUS_ROOM.getValue()) {
                return Optional.ofNullable(placeInfo.getAddress_info()).orElse("")
                    + Optional.ofNullable(placeInfo.getFloors()).map(a -> a + "楼").orElse("")
                    + Optional.ofNullable(placeInfo.getPlace_name()).orElse("");
            } else if (placeInfo.getPlace_type() >= PlaceTypeEnum.SHUANGSHI_AUDIENCE.getValue()) {
                return Optional.ofNullable(placeInfo.getAddress_info()).orElse("")
                    + Optional.ofNullable(placeInfo.getPlace_name()).orElse("");
            } else {
                return defaultLocation;
            }
        }
        return defaultLocation;
    }
}

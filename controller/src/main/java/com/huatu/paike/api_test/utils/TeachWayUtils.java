package com.huatu.paike.api_test.utils;

import com.huatu.common.enums.EnumDto;
import com.huatu.common.enums.TeachingMethod;

public class TeachWayUtils {

    public static EnumDto getTeachWay(Integer teachWayId) {
        if (teachWayId == null) {
            return null;
        }
        EnumDto teachWay = new EnumDto();
        teachWay.setId(teachWayId);
        teachWay.setName(TeachingMethod.get(teachWayId).getDesc());
        return teachWay;
    }
}
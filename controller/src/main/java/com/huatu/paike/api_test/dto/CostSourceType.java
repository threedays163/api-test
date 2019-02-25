
package com.huatu.paike.api_test.dto;

import com.huatu.common.enums.EnumService;

import java.util.HashMap;
import java.util.Map;

public enum CostSourceType implements EnumService {
    unknown(0, "未知来源"), css_Finish(1, "css结束定时结转"), score_Pass(2, "分数通过"), modify_Price(3, "修改优惠金额"), delete_Refund(4,
        "删除退款单"), recomplate(5, "补录"), manual_refresh(6, "手工刷"), msg_ReCost(7, "结转消息补发"), refund(8, "退款时推送");

    private int value;

    private String desc;

    CostSourceType(int value, String desc) {
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

    private static final Map<Integer, CostSourceType> cache;

    static {
        cache = new HashMap<>();
        for (CostSourceType item : CostSourceType.values()) {
            cache.put(item.getValue(), item);
        }
    }

    public static CostSourceType get(int value) {
        return cache.get(value);
    }
}

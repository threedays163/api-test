
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.dto;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.huatu.paike.api_test.RatioUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @title OrderInfoDto
 * @desc TODO
 * @author shanyu
 * @date 2018年8月1日
 * @version 1.0
 */
@Data
public class OrderInfoDto implements Serializable {

    private static final long serialVersionUID = -3452214234227452919L;

    private Long orderGoodsId;

    private String productTypeCode; // 产品类型编码

    private long realpay;// 实付金额

    private long shouldpay;// 应付金额

    private long tuition;// 学费

    private long extra;// 杂费

    private long realTuition;// 实际的学费

    private long realExtra;// 实际杂费

    private Integer refundStatus;

    private Integer goodsProperty;;

    private Map<Long, Long> stagePriceMap;// 阶段价格
    private Map<Long, Integer> stageDurationMap;// 阶段时长
    private Map<Long, Map<Long, Integer>> stageIdToSubjectDurationMap;// 阶段科目时长

    private Map<Long, Long> realStageTuitionMap;// 实际阶段学费
    private Map<Long, Long> realStageExtraMap;// 实际阶段杂费

    private Map<Long, Map<Long, Long>> subjectTuitionMap;// 实际科目学费
    private Map<Long, Map<Long, Long>> subjectExtraMap;// 实际科目杂费

    /**
     * 计算
     */
    public void caculate() {
        shouldpay = tuition + extra;
        realExtra = realpay > extra ? extra : realpay;
        realTuition = realpay - realExtra;
        realStageTuitionMap = RatioUtils.alloc(stagePriceMap, realTuition, 10000);
        realStageExtraMap = RatioUtils.alloc(stagePriceMap, realExtra, 10000);
        subjectTuitionMap = Maps.newHashMap();
        subjectExtraMap = Maps.newHashMap();
        stageDurationMap = Maps.newHashMap();
        for (Long stageId : stagePriceMap.keySet()) {
            List<Long> subjectIds =
                Lists.newArrayList(stageIdToSubjectDurationMap.getOrDefault(stageId, Maps.newHashMap()).keySet());
            subjectTuitionMap.put(stageId,
                RatioUtils.alloc(stageIdToSubjectDurationMap.getOrDefault(stageId, Maps.newHashMap()), subjectIds,
                    realStageTuitionMap.get(stageId), 10000));
            subjectExtraMap.put(stageId,
                RatioUtils.alloc(stageIdToSubjectDurationMap.getOrDefault(stageId, Maps.newHashMap()), subjectIds,
                    realStageExtraMap.get(stageId), 10000));
            int duration = 0;
            for (Long subjectId : subjectIds) {
                duration +=
                    stageIdToSubjectDurationMap.getOrDefault(stageId, Maps.newHashMap()).getOrDefault(subjectId, 0);
            }
            stageDurationMap.put(stageId, duration);
        }
    }

    public static void main(String[] args) {
        String json1 =
            "{\"extra\": 0, \"realpay\": 268000000, \"tuition\": 268000000, \"realExtra\": 0, \"shouldpay\": 268000000, \"realTuition\": 268000000, \"refundStatus\": 0, \"goodsProperty\": 1, \"stagePriceMap\": {\"1\": 278000000, \"2\": 0, \"5\": 0}, \"productTypeCode\": \"ZH\", \"subjectExtraMap\": {\"1\": {\"1\": 0, \"4\": 0, \"5\": 0, \"18\": 0}, \"2\": {\"1\": 0, \"4\": 0, \"5\": 0, \"6\": 0, \"18\": 0}, \"5\": {\"1\": 0}}, \"stageDurationMap\": {\"1\": 11940, \"2\": 4260, \"5\": 420}, \"realStageExtraMap\": {\"1\": 0, \"2\": 0, \"5\": 0}, \"subjectTuitionMap\": {\"1\": {\"1\": 70050000, \"4\": 57900000, \"5\": 57900000, \"18\": 82150000}, \"2\": {\"1\": 0, \"4\": 0, \"5\": 0, \"6\": 0, \"18\": 0}, \"5\": {\"1\": 0}}, \"realStageTuitionMap\": {\"1\": 268000000, \"2\": 0, \"5\": 0}, \"stageIdToSubjectDurationMap\": {\"1\": {\"1\": 3120, \"4\": 2580, \"5\": 2580, \"18\": 3660}, \"2\": {\"1\": 960, \"4\": 420, \"5\": 420, \"6\": 960, \"18\": 1500}, \"5\": {\"1\": 420}}}";
        String json2 =
            "{\"extra\": 0, \"realpay\": 268000000, \"tuition\": 268000000, \"realExtra\": 0, \"shouldpay\": 268000000, \"realTuition\": 268000000, \"refundStatus\": 0, \"goodsProperty\": 1, \"stagePriceMap\": {\"1\": 278000000, \"2\": 0, \"5\": 0}, \"productTypeCode\": \"ZH\", \"subjectExtraMap\": {\"1\": {\"1\": 0, \"4\": 0, \"5\": 0, \"18\": 0}, \"2\": {\"1\": 0, \"4\": 0, \"5\": 0, \"6\": 0, \"18\": 0}, \"5\": {\"1\": 0}}, \"stageDurationMap\": {\"1\": 11940, \"2\": 4260, \"5\": 420}, \"realStageExtraMap\": {\"1\": 0, \"2\": 0, \"5\": 0}, \"subjectTuitionMap\": {\"1\": {\"1\": 70050000, \"4\": 57900000, \"5\": 57900000, \"18\": 82150000}, \"2\": {\"1\": 0, \"4\": 0, \"5\": 0, \"6\": 0, \"18\": 0}, \"5\": {\"1\": 0}}, \"realStageTuitionMap\": {\"1\": 268000000, \"2\": 0, \"5\": 0}, \"stageIdToSubjectDurationMap\": {\"1\": {\"1\": 3120, \"4\": 2580, \"5\": 2580, \"18\": 3660}, \"2\": {\"1\": 960, \"4\": 420, \"5\": 420, \"6\": 960, \"18\": 1500}, \"5\": {\"1\": 420}}}";
        OrderInfoDto dto1 = JSONObject.parseObject(json1, OrderInfoDto.class);
        OrderInfoDto dto2 = JSONObject.parseObject(json2, OrderInfoDto.class);
        System.out.println(dto1.equals(dto2));
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof OrderInfoDto) {
            OrderInfoDto otherDto = (OrderInfoDto) other;
            if (this.orderGoodsId != null && otherDto.orderGoodsId != null
                && !this.orderGoodsId.equals(otherDto.orderGoodsId)) {
                return false;
            }
            if (this.realExtra != otherDto.realExtra) {
                return false;
            }
            if (this.realTuition != otherDto.realTuition) {
                return false;
            }
            if (!equals(this.stagePriceMap, otherDto.stagePriceMap)) {
                return false;
            }
            if (!equals(this.stageIdToSubjectDurationMap, otherDto.stageIdToSubjectDurationMap)) {
                return false;
            }
        }
        return true;
    }

    private static boolean equals(Map<?, ?> map1, Map<?, ?> map2) {
        if (!map1.keySet().containsAll(map2.keySet()) || !map2.keySet().containsAll(map1.keySet())) {
            return false;
        }
        for (Object key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }
            Object value1 = map1.get(key);
            Object value2 = map2.get(key);
            if (value1 instanceof Map) {
                if (value2 instanceof Map) {
                    if (!equals((Map<?, ?>) value1, (Map<?, ?>) value2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (!value1.equals(value2)) {
                    return false;
                }
            }
        }
        return true;
    }

}

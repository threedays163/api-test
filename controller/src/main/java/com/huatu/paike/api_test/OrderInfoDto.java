
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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

    private String productTypeCode; // 产品类型编码

    private long realpay;// 实付金额

    private long shouldpay;// 应付金额

    private long tuition;// 学费

    private long extra;// 杂费

    private long realTuition;// 实际的学费

    private long realExtra;// 实际杂费

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
        OrderInfoDto dto = new OrderInfoDto();
        dto.setRealpay(80000000l);
        dto.setTuition(80000000l);
        dto.setExtra(20000000l);

        dto.setStagePriceMap(Maps.newHashMap());
        dto.getStagePriceMap().put(1l, 30000000l);
        dto.getStagePriceMap().put(2l, 70000000l);

        dto.caculate();
        System.out.println(dto.getRealStageTuitionMap());
        System.out.println(dto.getRealStageExtraMap());

        System.out.println(dto.getSubjectTuitionMap());
    }

}

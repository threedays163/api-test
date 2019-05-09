
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * @title RatioUtils
 * @desc TODO
 * @author shanyu
 * @date 2018年8月2日
 * @version 1.0
 */

public class RatioUtils {

    /**
     * 按比例分配
     * 
     * @param ratioMap 比例信息
     * @param sum 资源总数
     * @return
     */
    public static Map<Long, Long> alloc(Map<Long, ? extends Number> ratioMap, Long sum, int percent) {
        Long totalRatio = 0l;
        for (Number n : ratioMap.values()) {
            totalRatio += n.longValue();
        }
        List<Long> keyIds = Lists.newArrayList(ratioMap.keySet());
        keyIds.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return Long.compare(o1, o2);
            }
        });
        long sumElse = sum;
        Map<Long, Long> result = Maps.newHashMap();
        for (Long id : keyIds) {
            if (totalRatio == 0l || sum == 0l) {
                result.put(id, 0l);
            } else {
                long ratio = ratioMap.get(id).longValue();
                long value = ratio * sum / totalRatio / percent * percent;
                sumElse -= value;
                result.put(id, value);
            }
        }
        result.put(keyIds.get(0), result.get(keyIds.get(0)) + sumElse);
        return result;
    }

    /**
     * 根据比例获取对应的钱
     * 
     * @param radio
     * @param radioSum
     * @param sum
     * @param percent
     * @param isFirst
     * @return
     */
    public static long alloc(Long radio, Long radioSum, long sum, int percent, boolean isFirst) {
        if (sum == 0) {
            return 0;
        }
        if (radioSum == 0) {
            if (isFirst) {
                return sum;
            } else {
                return 0;
            }
        }
        long avarge = sum / radioSum / percent * percent;
        long sumElse = sum - avarge * radioSum;
        if (isFirst) {
            return avarge * radio + sumElse;
        } else {

        }
        return avarge * radio;
    }

    /**
     * 根据比例获取对应的钱
     * 
     * @param radio
     * @param radioSum
     * @param sum
     * @param percent
     * @param isFirst
     * @return
     */
    public static long alloc(int radio, int radioSum, long sum, int percent, boolean isFirst) {
        if (sum == 0) {
            return 0;
        }
        if (radioSum == 0) {
            if (isFirst) {
                return sum;
            } else {
                return 0;
            }
        }
        long avarge = sum / radioSum / percent * percent;
        long sumElse = sum - avarge * radioSum;
        if (isFirst) {
            return avarge * radio + sumElse;
        } else {

        }
        return avarge * radio;
    }

    /**
     * 按比例分配
     * 
     * @param ratioMap 比例信息
     * @param sum 资源总数
     * @return
     */
    public static Map<Long, Long> alloc(Map<Long, ? extends Number> ratioMap, List<Long> ids, Long sum, int percent) {
        Long totalRatio = 0l;
        for (Long id : ids) {
            totalRatio += ratioMap.get(id).longValue();
        }

        ids.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return Long.compare(o1, o2);
            }
        });
        long sumElse = sum;
        Map<Long, Long> result = Maps.newHashMap();
        for (Long id : ids) {
            if (totalRatio == 0l || sum == 0l) {
                result.put(id, 0l);
            } else {
                long ratio = ratioMap.get(id).longValue();
                long value = ratio * sum / totalRatio / percent * percent;
                sumElse -= value;
                result.put(id, value);
            }
        }
        result.put(ids.get(0), result.get(ids.get(0)) + sumElse);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(alloc(1, 13, 100, 1, true));
        System.out.println(alloc(10, 13, 100, 1, false));
        System.out.println(alloc(2, 13, 100, 1, false));
    }

}

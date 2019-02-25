
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.util;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @title ListSplitUtil
 * @desc TODO
 * @author shanyu
 * @date 2018年7月28日
 * @version 1.0
 */

public class ListSplitUtil {

    /**
     * 分片大小
     */
    private final static int sliceSize = 200;

    public static <T> List<List<T>> split(List<T> list) {
        List<List<T>> objectlist = Lists.newArrayList();
        int iSize = list.size() / sliceSize;
        int iCount = list.size() % sliceSize;
        for (int i = 0; i <= iSize; i++) {
            List<T> newObjList = Lists.newArrayList();
            if (i == iSize) {
                for (int j = i * sliceSize; j < i * sliceSize + iCount; j++) {
                    newObjList.add(list.get(j));
                }
            } else {
                for (int j = i * sliceSize; j < (i + 1) * sliceSize; j++) {
                    newObjList.add(list.get(j));
                }
            }
            if (newObjList.size() > 0) {
                objectlist.add(newObjList);
            }
        }
        return objectlist;
    }

    public static void main(String[] args) {
        List<Integer> ids = Lists.newArrayList();
        for (int i = 0; i < 30; i++) {
            ids.add(i);
        }
        System.out.println(split(ids));
    }

}

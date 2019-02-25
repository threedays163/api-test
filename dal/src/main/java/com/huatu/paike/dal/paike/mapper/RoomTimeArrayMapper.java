package com.huatu.paike.dal.paike.mapper;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.paike.entity.RoomTimeArray;
import com.huatu.paike.dal.paike.entity.RoomTimeArrayCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface RoomTimeArrayMapper extends Mapper<RoomTimeArray> {
    int deleteByFilter(RoomTimeArrayCriteria filter);

    /**
     * 获取教室时间安排
     * 
     * @param roomIds
     * @param startTime
     * @param endTime
     * @return
     */
    List<RoomTimeArray> queryRoomTimeArray(@Param("roomIds") Set<Long> roomIds, @Param("startTime") Date startTime,
        @Param("endTime") Date endTime);

    /**
     * 批量插入
     * 
     * @param roomTimeArrayList
     */
    void insertBatch(List<RoomTimeArray> roomTimeArrayList);

}
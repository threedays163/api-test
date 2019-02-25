package com.huatu.paike.dal.place.mapper;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.place.dto.RoomDeviceQueryParam;
import com.huatu.paike.dal.place.entity.CloudRoomDevice;
import com.huatu.paike.dal.place.entity.CloudRoomDeviceCriteria;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CloudRoomDeviceMapper extends Mapper<CloudRoomDevice> {
    int deleteByFilter(CloudRoomDeviceCriteria filter);

    /**
     * 批量添加房间双师端
     * 
     * @param devices
     */
    void batchInsert(@Param("devices") List<CloudRoomDevice> devices);

    /**
     * 根据场地ID和房间ID删除关联
     * 
     * @param roomId
     * @param placeIds
     */
    void delByParams(@Param("placeIds") Collection<Long> placeIds, @Param("roomId") String roomId);

    /**
     * 根据条件查询集合
     * 
     * @param params
     * @return
     */
    List<CloudRoomDevice> queryListByParams(RoomDeviceQueryParam params);

    /**
     *
     * @param cloudRoomIds
     * @param placeType
     * @return
     */
    @MapF2F
    Map<String, Integer> countByRoomId(@Param("cloudRoomIds") Collection<String> cloudRoomIds,
        @Param("placeType") int placeType);

    /**
     * 根据ID批量删除
     * 
     * @param relatedRoomDeviceIds
     */
    void delByIds(@Param("ids") Collection<Long> ids);

    @MapF2F
    Map<String, Integer> countStuDevByTeacherDev(@Param("cloudRoomIds") Collection<String> cloudRoomIds);

    /**
     * 根据直播教室和设备查询记录
     * 
     * @param cloudRoomId
     * @return
     */
    CloudRoomDevice getTeacherRoomDevice(@Param("cloudRoomId") String cloudRoomId);
}
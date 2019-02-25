package com.huatu.paike.dal.place.mapper;

import java.util.List;

import com.huatu.paike.dal.place.dto.ClassRoomQueryParam;
import com.huatu.paike.dal.place.dto.UpdateParams;
import com.huatu.paike.dal.place.entity.ClassRoom;
import com.huatu.paike.dal.place.entity.ClassRoomCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassRoomMapper extends Mapper<ClassRoom> {
    int deleteByFilter(ClassRoomCriteria filter);

    /**
     * 保存排课教室
     * 
     * @param classRooms
     */
    void saveAll(List<ClassRoom> classRooms);

    /**
     * 更新教室
     * 
     * @param classRoom
     */
    void update(ClassRoom classRoom);

    /**
     * 删除教室
     * 
     * @param id
     */
    void delById(Long id);

    /**
     * 根据场地id查询教室
     * 
     * @param id
     * @return
     */
    ClassRoom getByPlaceId(Long id);

    /**
     * 根据条件批量更新教室状态
     * 
     * @param updateParams
     */
    void changeEffStatus(UpdateParams updateParams);

    /**
     * 根据条件查询教室列表
     * 
     * @param queryParam
     * @return
     */
    List<ClassRoom> queryList(ClassRoomQueryParam queryParam);

    /**
     * 分页信息
     * 
     * @param queryParam
     * @return
     */
    int countQuery(ClassRoomQueryParam queryParam);
}
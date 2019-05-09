
package com.huatu.paike.api_test.service;

import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.paike.dal.place.entity.ClassRoom;
import com.huatu.paike.dal.place.entity.Place;

import java.util.Collection;
import java.util.List;

public interface ClassroomCommonService {

    /**
     * 根据场地Id获取教室，将结果转化为ClassRoom类
     * 
     * @param PlaceId
     * @return
     */
    ClassRoom getById(Long PlaceId);

    /**
     * 批量查询教室信息
     *
     * @return
     */
    List<IdAndNameDto> getByIds(Collection<Long> placeIds);

    /**
     * 根据ID查询教室信息，将结果转化为ClassRoom类
     * 
     * @param placeIds
     * @return
     */
    List<ClassRoom> queryList(Collection<Long> placeIds);

    /**
     * 根据ID集合查询教室信息，将结果转化为Place类
     * 
     * @param placeIds
     * @return
     */
    List<Place> getPlacesByIds(Collection<Long> placeIds);

    /**
     * 根据ID查询教室信息，将结果转化为Place类
     *
     * @param placeIds
     * @return
     */
    Place getPlaceById(Long placeId);

}

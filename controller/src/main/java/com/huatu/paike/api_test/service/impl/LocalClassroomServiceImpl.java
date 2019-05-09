package com.huatu.paike.api_test.service.impl;

import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.paike.api_test.service.ClassroomCommonService;
import com.huatu.paike.dal.place.dto.ClassRoomQueryParam;
import com.huatu.paike.dal.place.entity.ClassRoom;
import com.huatu.paike.dal.place.entity.Place;
import com.huatu.paike.dal.place.mapper.ClassRoomMapper;
import com.huatu.paike.dal.place.mapper.PlaceMapper;

import com.google.common.collect.Lists;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service("localClassroomCommonService")
public class LocalClassroomServiceImpl implements ClassroomCommonService {

    @Autowired
    private ClassRoomMapper classRoomMapper;

    @Autowired
    private PlaceMapper placeMapper;

    @Override
    public ClassRoom getById(Long PlaceId) {
        return classRoomMapper.getByPlaceId(PlaceId);
    }

    @Override
    public List<IdAndNameDto> getByIds(Collection<Long> placeIds) {
        ClassRoomQueryParam queryParam = new ClassRoomQueryParam();
        queryParam.setPlaceIds(placeIds);
        List<ClassRoom> classrooms = classRoomMapper.queryList(queryParam);
        List<IdAndNameDto> result = Lists.newArrayList();
        if (CollectionUtils.isEmpty(classrooms))
            return result;
        classrooms.forEach(c -> result.add(new IdAndNameDto(c.getPlaceId(), c.getLocation())));
        return result;
    }

    @Override
    public List<ClassRoom> queryList(Collection<Long> placeIds) {
        ClassRoomQueryParam queryParam = new ClassRoomQueryParam();
        queryParam.setPlaceIds(placeIds);
        List<ClassRoom> classrooms = classRoomMapper.queryList(queryParam);
        if (CollectionUtils.isEmpty(classrooms))
            return Lists.newArrayList();
        return classrooms;
    }

    @Override
    public List<Place> getPlacesByIds(Collection<Long> placeIds) {
        List<Place> places = this.placeMapper.getByIds(placeIds);
        if (CollectionUtils.isEmpty(places))
            return Lists.newArrayList();
        return places;
    }

    @Override
    public Place getPlaceById(Long placeId) {
        return placeMapper.getById(placeId);
    }
}

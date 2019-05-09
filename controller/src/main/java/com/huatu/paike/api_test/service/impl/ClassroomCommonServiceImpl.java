
package com.huatu.paike.api_test.service.impl;

import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.ehr.service.AreaService;
import com.huatu.ehr.service.dto.resp.AreaRespDto;
import com.huatu.paike.api_test.utils.ClassroomUtils;
import com.huatu.paike.api_test.dto.DeviceInfo;
import com.huatu.paike.api_test.dto.PlaceInfo;
import com.huatu.paike.api_test.dto.PlaceListReqDto;
import com.huatu.paike.api_test.dto.PlaceListRespDto;
import com.huatu.paike.api_test.service.ClassroomCommonService;
import com.huatu.paike.dal.place.entity.ClassRoom;
import com.huatu.paike.dal.place.entity.Place;
import com.huatu.paike.dal.place.enums.EffectiveStatusEnum;
import com.huatu.paike.dal.place.enums.PlaceTypeEnum;

import com.google.common.collect.Lists;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Service("classroomCommonService")
@Slf4j
public class ClassroomCommonServiceImpl implements ClassroomCommonService {

    @Autowired
    private PlaceApiService placeApiService;

    @Autowired
    private AreaService areaService;

    @Value("${placeDataFromLocal}")
    private boolean placeDataFromLocal;

    @Autowired
    @Qualifier("localClassroomCommonService")
    private ClassroomCommonService localClassroomCommonService;

    @Override
    public ClassRoom getById(Long id) {
        if (placeDataFromLocal)
            return localClassroomCommonService.getById(id);

        PlaceInfo placeInfo = this.placeApiService.getById(id);
        if (null == placeInfo)
            return null;
        AreaRespDto areaDetail = this.areaService.getAreaDetailByCode(placeInfo.getArea_id());
        return convertToClassroom(placeInfo, Optional.ofNullable(areaDetail).map(AreaRespDto::getId).orElse(0L));
    }

    private ClassRoom convertToClassroom(PlaceInfo placeInfo, Long areaId) {
        ClassRoom classroom = new ClassRoom();
        classroom.setPlaceId(placeInfo.getPlace_id());
        String nodeIdStr = placeInfo.getNode_id();
        if (StringUtils.isNotBlank(nodeIdStr)) {
            List<Long> nodeIds =
                Arrays.stream(nodeIdStr.split(",")).map(String::trim).map(Long::parseLong).collect(Collectors.toList());
            classroom.setNodeId(nodeIds.get(0));
        }
        classroom.setType(Optional.ofNullable(placeInfo.getPlace_type()).map(Integer::byteValue).orElse(null));
        classroom.setLocation(ClassroomUtils.getLocation(placeInfo));
        classroom.setContent(placeInfo.getSeats() == null ? 0 : placeInfo.getSeats());
        classroom.setAreaId(areaId);
        classroom.setSignDate(parseDate(placeInfo.getRent_start_time()));
        classroom.setExpireDate(parseDate(placeInfo.getRent_end_time()));
        if (placeInfo.getPlace_type() < PlaceTypeEnum.SHUANGSHI_AUDIENCE.getValue()) {
            if (placeInfo.getIs_effective() != null)
                classroom.setIsEffective(placeInfo.getIs_effective().byteValue());
            else
                classroom.setIsEffective((byte) EffectiveStatusEnum.IS_EFFECTIVE.getValue());
        } else {
            List<DeviceInfo> deviceInfos =
                placeInfo.getDeviceList().stream().filter(a -> a.getType() == 1).collect(Collectors.toList());
            if (CollectionUtils.isNotEmpty(deviceInfos)) {
                DeviceInfo deviceInfo = deviceInfos.get(0);
                if (deviceInfo.getDevice_status() != null) {
                    Integer effectiveStatus =
                        deviceInfo.getDevice_status() == 1 ? EffectiveStatusEnum.IS_EFFECTIVE.getValue()
                            : EffectiveStatusEnum.WAITING_EFFECTIVE.getValue();
                    classroom.setIsEffective(effectiveStatus.byteValue());
                } else
                    classroom.setIsEffective((byte) EffectiveStatusEnum.IS_EFFECTIVE.getValue());
            }
        }
        return classroom;
    }

    @Override
    public List<IdAndNameDto> getByIds(Collection<Long> ids) {
        if (placeDataFromLocal)
            return localClassroomCommonService.getByIds(ids);
        List<IdAndNameDto> result = Lists.newArrayList();
        PlaceListReqDto reqDto = new PlaceListReqDto();
        reqDto.setIds(ids);
        PlaceListRespDto placeListRespDto = this.placeApiService.queryList(reqDto);
        if(placeListRespDto == null){
            return result;
        }
        List<PlaceInfo> placeInfoList = placeListRespDto.getList();
        if (CollectionUtils.isEmpty(placeInfoList))
            return result;
        placeInfoList.forEach(placeInfo -> {
            IdAndNameDto dto = new IdAndNameDto(placeInfo.getPlace_id(), ClassroomUtils.getLocation(placeInfo));
            result.add(dto);
        });
        return result;
    }

    @Override
    public List<ClassRoom> queryList(Collection<Long> placeIds) {
        if (placeDataFromLocal)
            return localClassroomCommonService.queryList(placeIds);
        List<ClassRoom> result = Lists.newArrayList();
        PlaceListReqDto reqDto = new PlaceListReqDto();
        reqDto.setIds(placeIds);
        PlaceListRespDto placeListRespDto = this.placeApiService.queryList(reqDto);
        if(placeListRespDto == null){
            return result;
        }
        List<PlaceInfo> placeInfoList = placeListRespDto.getList();
        if (CollectionUtils.isEmpty(placeInfoList))
            return result;
        List<String> areaCodes = placeInfoList.stream().map(PlaceInfo::getArea_id).collect(Collectors.toList());
        Map<String, AreaRespDto> areaDetailsMap = this.areaService.getAreaDetailsByCodes(areaCodes);
        placeInfoList.forEach(placeInfo -> result.add(convertToClassroom(placeInfo,
            Optional.ofNullable(areaDetailsMap.get(placeInfo.getArea_id())).map(AreaRespDto::getId).orElse(0L))));
        return result;
    }

    @Override
    public List<Place> getPlacesByIds(Collection<Long> placeIds) {
        if (placeDataFromLocal)
            return localClassroomCommonService.getPlacesByIds(placeIds);
        List<Place> result = Lists.newArrayList();
        PlaceListReqDto reqDto = new PlaceListReqDto();
        reqDto.setIds(placeIds);
        PlaceListRespDto placeListRespDto = this.placeApiService.queryList(reqDto);
        if(placeListRespDto == null){
            return result;
        }
        List<PlaceInfo> placeInfoList = placeListRespDto.getList();
        if (CollectionUtils.isEmpty(placeInfoList))
            return result;
        List<String> areaCodes = placeInfoList.stream().map(PlaceInfo::getArea_id).collect(Collectors.toList());
        Map<String, AreaRespDto> areaDetailsMap = this.areaService.getAreaDetailsByCodes(areaCodes);
        placeInfoList.forEach(placeInfo -> result.add(convertToPlace(placeInfo,
            Optional.ofNullable(areaDetailsMap.get(placeInfo.getArea_id())).map(AreaRespDto::getId).orElse(0L))));
        return result;
    }

    @Override
    public Place getPlaceById(Long placeId) {
        if (placeDataFromLocal)
            return localClassroomCommonService.getPlaceById(placeId);

        PlaceInfo placeInfo = this.placeApiService.getById(placeId);
        if (null == placeInfo)
            return null;
        AreaRespDto areaDetail = this.areaService.getAreaDetailByCode(placeInfo.getArea_id());
        Long areaId = null;
        if(areaDetail != null){
            areaId = areaDetail.getId();
        }
        return convertToPlace(placeInfo, areaId);
    }

    private Place convertToPlace(PlaceInfo placeInfo, Long areaId) {
        Place place = new Place();
        place.setId(placeInfo.getPlace_id());
        String nodeIdStr = placeInfo.getNode_id();
        if (StringUtils.isNotBlank(nodeIdStr)) {
            List<Long> nodeIds =
                Arrays.stream(nodeIdStr.split(",")).map(String::trim).map(Long::parseLong).collect(Collectors.toList());
            place.setNodeId(nodeIds.get(0));
        }
        place.setType(Optional.ofNullable(placeInfo.getPlace_type()).map(Integer::byteValue).orElse(null));
        place.setAddress(placeInfo.getAddress_info());
        place.setContent(placeInfo.getSeats() == null ? 0 : placeInfo.getSeats());
        place.setClassRoomName(placeInfo.getPlace_name());
        place.setFloor(placeInfo.getFloors());
        place.setAreaId(areaId);
        place.setSignDate(parseDate(placeInfo.getRent_start_time()));
        place.setExpireDate(parseDate(placeInfo.getRent_end_time()));

        if (placeInfo.getPlace_type() == PlaceTypeEnum.HOTEL_MEETING_ROOM.getValue())
            place.setHotelName(placeInfo.getAddress_name());
        else if (placeInfo.getPlace_type() == PlaceTypeEnum.OTHER.getValue())
            place.setUnitName(placeInfo.getAddress_name());
        if (placeInfo.getPlace_type() < PlaceTypeEnum.SHUANGSHI_AUDIENCE.getValue())
            place.setIsEffective(placeInfo.getIs_effective().byteValue());
        else {
            List<DeviceInfo> deviceInfos =
                placeInfo.getDeviceList().stream().filter(a -> a.getType() == 1).collect(Collectors.toList());
            if (CollectionUtils.isNotEmpty(deviceInfos)) {
                DeviceInfo deviceInfo = deviceInfos.get(0);
                if (deviceInfo.getDevice_status() != null) {
                    Integer effectiveStatus =
                        deviceInfo.getDevice_status() == 1 ? EffectiveStatusEnum.IS_EFFECTIVE.getValue()
                            : EffectiveStatusEnum.WAITING_EFFECTIVE.getValue();
                    place.setIsEffective(effectiveStatus.byteValue());
                }
                place.setDeviceId(deviceInfo.getDevice_id());
                place.setDeviceUnique(deviceInfo.getDevice_unique());
            }
        }
        return place;
    }

    private Date parseDate(String pattern) {
        if (StringUtils.isNotBlank(pattern)) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                return dateFormat.parse(pattern);
            } catch (ParseException e) {
                log.error("parse place date error, requested patten: yyyy-MM-dd, actual pattern:{}", pattern);
            }
        }
        return null;
    }

}

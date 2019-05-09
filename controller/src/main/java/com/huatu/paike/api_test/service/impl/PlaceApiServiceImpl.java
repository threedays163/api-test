/**
 * Huatu.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.service.impl;

import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.api_test.dto.*;
import com.huatu.paike.api_test.utils.PlaceApi;
import com.huatu.paike.dal.place.entity.Place;
import com.huatu.paike.dal.place.enums.HotelRoomTypeEnum;
import com.huatu.paike.dal.place.enums.PlaceTypeEnum;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

/**
 * @title PlaceApiServiceImpl
 * @desc 场地管理API服务实现类
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Service
@Slf4j
public class PlaceApiServiceImpl implements PlaceApiService {

    @Autowired
    private PlaceApi placeApi;

    public PlaceApiServiceImpl() {
    }

    // test only
    public PlaceApiServiceImpl(PlaceApi placeApi) {
        this.placeApi = placeApi;
    }

    @Value("${place.list.defaultSize:20}")
    private Integer placeListDefaultSize = 20;

    @Value("${place.fuzzyQuery.defaultSize:10}")
    private Integer placeFuzzyQueryDefaultSize = 10;

    /**
     * 获取场所信息接口（分页）
     * 
     * @return 场所列表
     */
    @Override
    public PlaceListRespDto queryList(PlaceListReqDto params) {
        log.info("query list with params:{}", params);
        Preconditions.checkArgument(params != null, "params is null");

        // 设置查询参数
        Map<String, Object> map = Maps.newHashMap();

        if (CollectionUtils.isNotEmpty(params.getIds()))
            map.put("ids", Sets.newHashSet(params.getIds()));
        if (CollectionUtils.isNotEmpty(params.getAreaIds()))
            map.put("area_ids", Sets.newHashSet(params.getAreaIds()));
        // 可能传多个参数，场地管理系统用同一个参数接收，排课的场景二选一
        if (params.getPlaceType() != null)
            map.put("place_type", params.getPlaceType());
        else if (CollectionUtils.isNotEmpty(params.getPlaceTypes()))
            map.put("place_type", params.getPlaceTypes());
        // 可能传多个参数，场地管理系统用同一个参数接收，排课的场景二选一
        if (params.getAddressStatus() != null)
            map.put("address_status", params.getAddressStatus());
        else if (CollectionUtils.isNotEmpty(params.getAddressStatuss()))
            map.put("address_status", params.getAddressStatuss());
        map.put("place_name", params.getPlaceName());
        map.put("min_seating", params.getMinSeating());
        map.put("max_seating", params.getMaxSeating());
        map.put("hotel_name", params.getHotelName());
        if (params.getPlaceType() != null && params.getPlaceType() == PlaceTypeEnum.HOTEL_ROOM.getValue()) {
            if (params.getHotelRoomType() == null)
                map.put("hotel_room_type", Lists.newArrayList(HotelRoomTypeEnum.STANDARD_ROOM.getValue(),
                    HotelRoomTypeEnum.KING_ZIZE_ROOM.getValue()));
            else
                map.put("hotel_room_type", params.getHotelRoomType());
        }
        map.put("query", params.getQuery());

        // 是否双师查询，决定是否加入根据双师设备查询参数
        boolean shuangshiQuery = false;
        if (params.getPlaceType() != null && params.getPlaceType() >= PlaceTypeEnum.SHUANGSHI_AUDIENCE.getValue()) {
            shuangshiQuery = true;
        }
        if (params.getPlaceTypes() != null
            && (params.getPlaceTypes().contains(PlaceTypeEnum.SHUANGSHI_AUDIENCE.getValue())
                || params.getPlaceTypes().contains(PlaceTypeEnum.SHUANGSHI_SPEAKER.getValue()))) {
            shuangshiQuery = true;
        }
        if (shuangshiQuery) {
            Boolean isFilterDoubleTeacherDevice = params.getIsFilterDoubleTeacherDevice();
            if (params.getDeviceStatus() != null){
                map.put("device_status", params.getDeviceStatus());
            } else if(isFilterDoubleTeacherDevice == null || isFilterDoubleTeacherDevice) {
                map.put("device_status", Lists.newArrayList(1, -1));
            }else{
                map.put("device_status", null);
            }

            // 需求变更：根据设备查询教室，而不是根据教室类型
            // device_role 设备端口类型，0 学生端 1 老师端
            if(isFilterDoubleTeacherDevice == null || isFilterDoubleTeacherDevice == true){
                map.put("place_type", null);// type 清零
                if (params.getPlaceType() != null){
                    map.put("device_role", params.getPlaceType() - 4);
                }else if (CollectionUtils.isNotEmpty(params.getPlaceTypes())){
                    List<Integer> placeTypes = params.getPlaceTypes();
                    List<Integer> ssTypes = Lists.newArrayList(PlaceTypeEnum.SHUANGSHI_AUDIENCE.getValue(), PlaceTypeEnum.SHUANGSHI_SPEAKER.getValue());
                    if(placeTypes.containsAll(ssTypes) && ssTypes.containsAll(placeTypes)){
                        map.put("device_role", params.getPlaceTypes().stream().map(a -> a - 4).collect(Collectors.toList()));
                    }
                }
            }
        }

        // 分页查询参数
        PageDto pageDto = params.getPageDto();
        if (pageDto != null) {
            map.put("page", pageDto.getPageNum());
            map.put("page_size", pageDto.getPageSize());
        } else {
            map.put("page", 1);
            Integer defaultSize = placeListDefaultSize;
            if (defaultSize != null && defaultSize > 0) {
                map.put("page_size", defaultSize);
            }
        }

        /**
         * PlaceApi要求把查询条件都放在一个list对象中。
         */
        Map<String, Object> param = Maps.newHashMap();
        param.put("list", map);

        // 提交查询请求
        String json = placeApi.placeList(param);

        return placeApi.getData(json, new TypeReference<PlaceApiResult<PlaceListRespDto>>() {
        });
    }

    /**
     * 根据ID批量查询场所信息
     * 
     * @param ids
     * @return
     */
    @Override
    public PlaceListRespDto getByIds(Collection<Long> ids) {
        log.info("get place info by ids:{}", ids);

        // 构造查询参数
        Map<String, Object> map = Maps.newHashMap();
        Set<Long> idSet = Sets.newHashSet(ids);
        map.put("ids", idSet);

        /**
         * PlaceApi要求把查询条件都放在一个list对象中。
         */
        Map<String, Object> param = Maps.newHashMap();
        param.put("list", map);

        // 发送查询请求
        String json = placeApi.placeInfo(param);

        return placeApi.getData(json, new TypeReference<PlaceApiResult<PlaceListRespDto>>() {
        });
    }

    /**
     * 排课场所详情
     * 
     * @param id
     * @return
     */
    @Override
    public PlaceInfo getById(Long id) {
        log.info("get place info by id:{}", id);
        // 构造查询参数
        Map<String, Object> map = Maps.newHashMap();
        map.put("id", id);

        /**
         * PlaceApi要求把查询条件都放在一个list对象中。
         */
        Map<String, Object> param = Maps.newHashMap();
        param.put("list", map);

        // 发送查询请求
        String json = placeApi.placeDetail(param);

        return placeApi.getData(json, new TypeReference<PlaceApiResult<PlaceInfo>>() {
        });
    }

    /**
     * 模糊查询场所
     * 
     * @param query
     * @return
     */
    @Override
    public FuzzyQueryRespDto fuzzyQuery(FuzzyQueryReqDto params) {
        log.info("fuzzy query with params:{}", params);
        Preconditions.checkArgument(params != null, "params is null!");

        // 构造查询参数
        Map<String, Object> map = Maps.newHashMap();
        map.put("wd", params.getQuery());
        map.put("place_type", params.getPlaceType());

        // 分页条件
        PageDto pageDto = params.getPageDto();
        if (pageDto != null) {
            map.put("page", pageDto.getPageNum());
            map.put("page_size", pageDto.getPageSize());
        } else {
            map.put("page", 1);
            // 默认数量
            Integer defaultSize = placeFuzzyQueryDefaultSize;
            if (defaultSize != null && defaultSize > 0) {
                map.put("page_size", defaultSize);
            }
        }

        /**
         * PlaceApi要求把查询条件都放在一个list对象中。
         */
        Map<String, Object> param = Maps.newHashMap();
        param.put("list", map);

        // 发送查询请求
        String json = placeApi.fuzzyQuery(param);

        // 反序列化查询结果
        return placeApi.getData(json, new TypeReference<PlaceApiResult<FuzzyQueryRespDto>>() {
        });
    }

    /**
     * 添加酒店
     */
    public void addHotel(Collection<Place> places) {

        Map<String, Object> httpReqParams = buildAddReqParam(places);
        String json = placeApi.addHotel(httpReqParams);

        PlaceApiResult<Object> result = placeApi.getApiResult(json, new TypeReference<PlaceApiResult<Object>>() {
        });
        if (result.getCode() != PlaceApiResult.CODE_SUCCESS)
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, result.getMsg());

    }

    private Map<String, Object> buildAddReqParam(Collection<Place> places) {
        List<Map<String, Object>> placesParams = Lists.newArrayList();
        places.forEach(p -> placesParams.add(buildSingleMap(p)));

        Map<String, Object> httpReqParams = Maps.newHashMap();
        httpReqParams.put("list", placesParams);
        return httpReqParams;
    }

    private Map<String, Object> buildSingleMap(Place p) {
        Map<String, Object> map = Maps.newHashMap();
        // 必填字段
        map.put("id", p.getId());
        map.put("area_id", p.getId());// 城市ID
        map.put("node_id", p.getNodeId());// 组织架构ID
        map.put("hotel_name", p.getHotelName());// 酒店名称
        map.put("hotel_room_type", p.getHotelRoomType());// 房间类型 1-普通标间 2-普通标间(无窗) 3-酒店会议室 4-酒店套房
        map.put("hotel_type", p.getType());// 场地类别 1酒店会议室 2酒店房间
        map.put("address", p.getAddress());// 场地地址
        map.put("sign_date", String.valueOf(p.getSignDate().getTime() / 1000));// 签订时间
        map.put("expire_date", String.valueOf(p.getExpireDate()));// 过期时间

        // 下面两个参数只能传其一
        map.put("hotel_room_raw_amount",
            p.getHotelRoomRawAmount() != null ? String.format("%.2f", p.getHotelRoomRawAmount() / 10000.0) : null); // optional
        // 酒店房间 不含早餐 一天的价格 单位元 两位精度
        map.put("hotel_room_brekker_amount", p.getHotelRoomBrekkerAmount() != null
            ? String.format("%.2f", p.getHotelRoomBrekkerAmount() / 10000.0) : null); // optional 酒店房间 含早餐 一天的价格
        // 两位精度

        // 可选字段
        map.put("meeting_room_amount",
            p.getMeetingRoomAmount() != null ? String.format("%.2f", p.getMeetingRoomAmount() / 10000.0) : null);// optional
                                                                                                                 // 酒店会议室
        // 一天价格 单位元 两位精度
        map.put("content", p.getContent());// optional 容量/座位数（仅酒店会议室）
        map.put("remark", p.getRemark());// optional 备注
        map.put("mobile", p.getMobile());// optional 电话
        map.put("longitude", p.getLongitude());// optional 经度
        map.put("latitude", p.getLatitude());// optional 纬度
        return map;
    }

    /**
     * 编辑酒店
     */
    public void modHotel(Place places) {

        Map<String, Object> httpReqParams = buildSingleMap(places);

        String json = placeApi.modHotel(httpReqParams);
        PlaceApiResult<Object> result = placeApi.getApiResult(json, new TypeReference<PlaceApiResult<Object>>() {
        });
        if (result.getCode() != PlaceApiResult.CODE_SUCCESS)
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, result.getMsg());
    }

    /**
     * 删除酒店
     */
    public void delHotel(Long id) {

        Map<String, Object> map = Maps.newHashMap();
        // 必填字段
        map.put("id", id);

        String json = placeApi.delHotel(map);
        PlaceApiResult<Object> result = placeApi.getApiResult(json, new TypeReference<PlaceApiResult<Object>>() {
        });
        if (result.getCode() != PlaceApiResult.CODE_SUCCESS)
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, result.getMsg());
    }
}

/**
 * Huatu.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import lombok.Data;

/**
 * @title PlaceListReqDto
 * @desc 场地列表查询条件
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
public class PlaceListReqDto implements Serializable {

    private static final long serialVersionUID = -8274642127865552943L;

    private Collection<Long> ids;// 【非必填参数】场地ID集合

    private Set<String> areaIds;// 【非必填参数】城市码集合，eg:[640402]

    private Integer placeType;// 【非必填参数】查询的场所类型 华图e家48、面授课堂49、教室76 不填默认查询全部0类型
    private List<Integer> placeTypes;// 场所类型集合

    private Integer addressStatus;// 【必填参数】0无效，1待生效， 2有效
    private List<Integer> addressStatuss;// 状态集合

    private String placeName;// 【非必填参数】场所名称

    private Integer minSeating;// 最小座位数
    private Integer maxSeating;// 最大座位数

    private String hotelName; // 酒店名称
    private Integer hotelRoomType;// 酒店房间类型（外租）酒店会议室77 酒店房间78 普通标间79 普通大床82

    private String query; // 地址或者名称模糊条件

    private Integer deviceStatus;// 双师设备状态

    private PageDto pageDto;

    /*是否过滤双师设备状态*/
    private Boolean isFilterDoubleTeacherDevice;
}
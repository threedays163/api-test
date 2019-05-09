package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PlaceInfo implements Serializable {

    private static final long serialVersionUID = -8509108672796283005L;
    private Long place_id;// 场地id
    private String node_id;// 组织架构id
    private String organization;// 组织架构
    private String place_name;// 场所名字
    private Integer place_type;// 场所类型id
    private String place_type_name;// 场地类型名称
    private String class_no;// 房间号
    private String address_name;// 场地名字
    private String address_phone;// 场地地址
    private String rent_start_time;// 起租日期
    private String rent_end_time;// 到期日期
    private String area_id;//场地管理系统的区域ID，对应我们的area code字段
    private String province;// 省
    private String city;// 市
    private String district;//区
    private String address_info;// 场地地址
    private String longitude;// 经度
    private String latitude;// 纬度
    private Integer status;// 可用状态（1:可用 -1:不可用）
    private String floors;// 楼层号
    private Integer seats;// 座位数
    private List<DeviceInfo> deviceList;// 设备列表
    private Integer is_effective;// 场地状态 0无效 1待生效 2有效
    private Integer hotel_room_type;// 房间类型
    private String hotel_name;// 酒店名称
    private Integer is_cover_dinner;// 是否含晚
    private String meeting_room_amount;// 会议室价格
    private String hotel_room_brekker_amount;// 房间价格含早
    private String hotel_room_raw_amount;// 房间价格不含早
    private String remark;//备注
}

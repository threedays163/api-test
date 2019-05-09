/**
 * Huatu.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @title DeviceInfo
 * @desc 设备信息
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
public class DeviceInfo implements Serializable {

    private static final long serialVersionUID = 4793768350469820808L;

    private Long id;// 设备ID

    private String equip_name;// 设备名

    private Long place_id;// 场地ID

    private Integer type;// 1 双师设备，其它的可能是摄像头之类的

    private Long device_id;// 双师设备ID，对应百家云库里的

    private String device_unique;// 设备码

    private Integer device_status;//设备状态，1是正常(默认),0 是维修
}
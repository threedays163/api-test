/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @title PlaceInfoSimple
 * @desc 模糊查询返回的基本信息
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
public class PlaceInfoSimple implements Serializable {

    private static final long serialVersionUID = 5768437255594394915L;

    private Long place_id;// 场地id
    
    private String name;// 场地名称

    private Integer seats;// 座位数

    private String created_at;// 创建时间 yyyy-MM-dd HH:mm:ss 格式的字符串
}

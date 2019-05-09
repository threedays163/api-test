/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @title PlaceListRespDto
 * @desc 场地列表
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
public class PlaceListRespDto implements Serializable {

    private static final long serialVersionUID = -2989477198124648022L;

    private List<PlaceInfo> list;// 场地列表

    private Integer count;// 记录总数
}
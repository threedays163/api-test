/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @title FuzzyQueryRespDto
 * @desc 模糊查询结果
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
public class FuzzyQueryRespDto implements Serializable {

    private static final long serialVersionUID = 2945823575266211961L;

    private List<PlaceInfoSimple> data;// 场地列表

    private Integer total;// 总数量
}

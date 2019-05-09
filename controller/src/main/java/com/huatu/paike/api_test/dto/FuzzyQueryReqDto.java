/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;

/**
 * @title FuzzyQueryReqDto
 * @desc 模糊查询条件
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
public class FuzzyQueryReqDto implements Serializable {

    private static final long serialVersionUID = -5897939263428058830L;

    private String query;// 模糊查询关键字
 
    private Integer placeType;// 场地类型

    private PageDto pageDto;// 分页查询参数
}

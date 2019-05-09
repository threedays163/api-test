/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @title PlaceApiResult
 * @desc PlaceApi返回的数据结构
 * @author yanmaoyuan
 * @date 2019年2月28日
 * @version 1.0
 */
@Data
public class PlaceApiResult<T> implements Serializable {

    private static final long serialVersionUID = -8772953999432313032L;

    public static final int CODE_SUCCESS = 0;
    public static final int CODE_FAIL = 1;

    private int code;
    private T data;
    private String msg;
    private String extra;

}
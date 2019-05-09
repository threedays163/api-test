/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.dto;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @title ApiResponse
 * @desc API响应结果
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
@Data
@Slf4j
public class ApiResponse {

    private Map<String, List<String>> header;
    private byte[] body;
    private String charset;
    private int status;

    public ApiResponse() {
        status = 0;
        charset = "UTF-8";
    }

    public String getBodyStr() {
        if (body == null) {
            return "";
        }
        try {
            return new String(body, charset);
        } catch (UnsupportedEncodingException e) {
            log.error("getBodyStr", e);
            return new String(body);
        }
    }

    public void setHeader(Map<String, List<String>> header) {
        this.header = new TreeMap<String, List<String>>(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, List<String>> entry: header.entrySet()) {
            if (entry.getKey() != null) {
                this.header.put(entry.getKey(), entry.getValue());
            }
        }
    }
}

/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.permission.dto;

import java.util.List;

import com.huatu.common.sqlbuilder.dto.PageDto;

import lombok.Data;

/**
 * @title UserQueryParams
 * @desc TODO
 * @author shanyu
 * @date 2018年7月20日
 * @version 1.0
 */

@Data
public class UserQueryParams {

    private Long staffId;

    private Long roleId;

    private Long nodeId;

    private List<Long> nodeIds;

    private PageDto pageDto;

}

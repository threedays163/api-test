
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.paike.dto;

import java.util.Date;

import com.huatu.common.sqlbuilder.dto.PageDto;

import lombok.Data;

/**
 * @title CsstQueryParams
 * @desc 阶段科目老师查询信息
 * @author shanyu
 * @date 2018年7月27日
 * @version 1.0
 */
@Data
public class CsstQueryParams {

    private Long classId;

    private String teacherNo;

    private Long studentId;

    private Date startDate;

    private Date endDate;

    private PageDto pageDto;
}

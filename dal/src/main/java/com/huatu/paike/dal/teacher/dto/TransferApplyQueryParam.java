/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.huatu.paike.dal.teacher.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import lombok.Data;

/**
 * 老师借调申请查询参数
 * 
 * @title TransferApplyQueryParam
 * @author yanmaoyuan
 * @date 2018年8月2日
 * @version 1.0
 */
@Data
public class TransferApplyQueryParam implements Serializable {

    private static final long serialVersionUID = 6781482644012880078L;
    // 查询组织架构
    private Collection<Long> nodeIds;
    // 开始日期
    private Date startDate;
    // 结束日期
    private Date endDate;
    // 状态
    private Integer status;
    // 授课方式
    private Integer teachWay;
    // 是否主讲
    private Integer isMain;
    // 分页参数
    private PageDto pageDto;
    //申请借调的分校/师资单元
    private Long teacherUnitId;
    //被借调老师的工号
    private Collection<String> staffNos;
    //上课提起
    private Date lessonDate;

    private Date lessonStartDateBegin;

    private Date lessonStartDateEnd;
    /*课节开始时间，校验借调老师课节时间段*/
    private Date lessonDateStart;
    /*课节结束时间，校验借调老师课节时间段*/
    private Date lessonDateEnd;
}
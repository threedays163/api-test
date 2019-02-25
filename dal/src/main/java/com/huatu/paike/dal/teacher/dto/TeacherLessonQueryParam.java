/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.huatu.paike.dal.teacher.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import lombok.Data;

/**
 * 教师排课数据查询参数
 * 
 * @title TeacherLessonQueryParam
 * @author yanmaoyuan
 * @date 2018年7月30日
 * @version 1.0
 */
@Data
public class TeacherLessonQueryParam implements Serializable {

    private static final long serialVersionUID = 65762214792657146L;

    private Collection<String> staffNos;// 教师工号集合

    private Date beginDate;// 开始日期
    
    private Date endDate;  // 结束日期
}
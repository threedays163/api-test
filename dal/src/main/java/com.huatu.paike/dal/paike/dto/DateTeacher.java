package com.huatu.paike.dal.paike.dto;

import lombok.Data;

import java.util.Date;

/**
 * 该类用于统计每一天对应的老师
 */
@Data
public class DateTeacher {

    private Date lessonDate;//上课日期

    private String teacherNo;//老师编号

}

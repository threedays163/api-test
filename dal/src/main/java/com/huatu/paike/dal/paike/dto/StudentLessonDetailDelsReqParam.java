package com.huatu.paike.dal.paike.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StudentLessonDetailDelsReqParam {

    private Long studentId;//学员id

    private Long csstId;//阶段科目老师id

    private Date lessonDate;//上课日期

}

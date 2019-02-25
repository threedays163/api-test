package com.huatu.paike.dal.paike.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentLessonDelsReqParam {

    private List<Long> csstIds;//班级阶段科目老师id

    private Long studentId;//学员id
}

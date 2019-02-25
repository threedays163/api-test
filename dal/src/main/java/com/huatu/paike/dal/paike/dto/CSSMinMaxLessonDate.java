package com.huatu.paike.dal.paike.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CSSMinMaxLessonDate implements Serializable {

    private static final long serialVersionUID = -2063898157982232473L;

    private Long classId;//班级id

    private Long stageId;//阶段id

    private Long subjectId;//科目id

    private Date minLessonDate;//每个班级阶段科目对应的最早的上课日期

    private Date maxLessonDate;//每个班级阶段科目对应的最晚的上课日期

    private Integer duration;//总课时数

    private Integer arrangedDuration;//已排课课时数

    private Integer status;//状态

}

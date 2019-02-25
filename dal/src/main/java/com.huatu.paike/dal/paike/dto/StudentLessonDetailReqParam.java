package com.huatu.paike.dal.paike.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

@Data
public class StudentLessonDetailReqParam {

    private Long csstId;//班级阶段科目老师id

    private Long studentId;//学员id

    private PageDto pageDto;//分页
}


package com.huatu.paike.dal.feedback.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TeacherNotFeedbackInfoDto {
    String teacherNo;

    String classNo;

    Long classId;

    String className;

    Long stageId;

    Long subjectId;

    Integer batchNum;

    Long departmentId;

    Long csstId;

    Date time;
}

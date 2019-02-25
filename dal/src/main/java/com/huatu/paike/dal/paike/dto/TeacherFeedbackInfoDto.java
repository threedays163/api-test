
package com.huatu.paike.dal.paike.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TeacherFeedbackInfoDto {
    // lesson_teacher主键
    Long id;

    Long lessonId;

    Long stageId;

    Integer batchNum;

    Long subjectId;

    Long csstId;

    String teacherStaffNo;

    int teacherType;
    // 上课时间,具体的某天
    Date lessonDate;
    // 当天某节课上课的开始时间
    Date startTime;
    // 当天某节课上课的结束时间
    Date endTime;

    int duration;

}


package com.huatu.paike.dal.teacher.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TeacherLessonDetail {
    // 面授课节ID/双师课节ID
    Long lessonId;
    // 面授课节明细ID/双师课节明细ID
    Long timeDetailId;

    Long classId;
    // 授课类型
    Integer teachWay;

    Long stageId;

    Long subjectId;

    String staffNo;

    Date lessonDate;

    Date startTime;

    Date endTime;
    // 教室ID; 或老师端教室ID
    Long roomId;

    // 老师类型
    Byte teacherType;
}

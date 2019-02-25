
package com.huatu.paike.dal.paike.dto;

import java.util.Date;

import lombok.Data;

@Data
public class SubjectStartTimeAndEndTimeDto {
    // key=concat(stageID,subjectID)
    String key;
    Date startTime;
    Date endTime;
}


package com.huatu.paike.dal.feedback.dto;

import java.util.Date;

import lombok.Data;

@Data
public class FeedbackHistoryItemDto {
    String feedbackNo;

    long feedbackID;

    String className;

    Date feedbackTime;

    int status;

    Long creatorId;
}

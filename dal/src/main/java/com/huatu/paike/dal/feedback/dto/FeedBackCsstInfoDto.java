
/**
 * Huatu.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */

package com.huatu.paike.dal.feedback.dto;

import java.util.Date;

import lombok.Data;

/**
 * @title FeedBackCsstInfoDto
 * @desc TODO
 * @author shanyu
 * @date 2019年1月25日
 * @version 1.0
 */
@Data
public class FeedBackCsstInfoDto {

    private String feedBackNo;

    private String classNo;

    private String className;

    private Long classId;

    private Long csstId;

    private Long stageId;

    private Long subjectId;

    private String teacherStaffNo;

    private Integer teacherType;

    private Integer score;

    private Integer accidentStatus;

    private Date startDate;

    private Date endDate;

    private Integer duration;

    private Integer surveyNum;

    private Integer realNum;

    private Integer batchNum;

}

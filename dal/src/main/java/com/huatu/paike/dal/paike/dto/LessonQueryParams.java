
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.paike.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @title LessonQueryParams
 * @desc 课节查询参数
 * @author shanyu
 * @date 2018年7月24日
 * @version 1.0
 */
@Data
public class LessonQueryParams implements Serializable {

    private static final long serialVersionUID = -871063096986173064L;

    private Date startTime;

    private Date endTime;

    private List<Long> roomIds;

    private List<String> teacherNos;

}

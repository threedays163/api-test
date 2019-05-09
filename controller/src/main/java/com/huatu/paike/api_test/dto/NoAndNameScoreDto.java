
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.dto;

import com.huatu.common.dto.resp.IdAndNameDto;
import lombok.Data;

import java.io.Serializable;

/**
 * @title NoAndNameScoreDto
 * @desc TODO
 * @author shanyu
 * @date 2018年7月27日
 * @version 1.0
 */

@Data
public class NoAndNameScoreDto implements Serializable {

    private static final long serialVersionUID = -5110718794453299374L;

    private String staffNo;// 工号

    private String name;// 姓名

    private int score;// 评分

    private int teacherType;

    private String scoreDetail;// 评分详情
    // 手机号
    String mobile;
    // 师资单元
    IdAndNameDto teacherUnit;

    Integer isLocal;
}

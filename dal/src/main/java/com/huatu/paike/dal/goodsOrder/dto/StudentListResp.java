package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentListResp implements Serializable {

    private static final long serialVersionUID = -4518612560574425075L;

    private Long studentId;//学员id

    private String studentName;//学员姓名

    private String mobile;//学员手机号
}

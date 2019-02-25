package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class QueryOrderStageSubjectDto {

    /*自增ID*/
    private Long id;
    /*订单编号*/
    private String orderNo;
    /*商品编号*/
    private String goodsNo;
    /*订单系统订单编号*/
    private String oldOrderNo;
    /*阶段id*/
    private Long stageId;
    /*科目id*/
    private Long subjectId;
    /*是否可排课*/
    private Integer enable;
    /*总时长*/
    private Long totalDuration;
    /*已排课时长*/
    private Long paikeDuration;
    /*已结课时长*/
    private Long finishDuration;
    /*状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课*/
    private Integer status;
    /*创建人id*/
    private Long creatorId;
    /*开始时间*/
    private Date startDate;
    /*结束时间*/
    private Date endDate;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;
    /*课次id*/
    private Long lessonTableId;
    /*订单编码*/
    private List<String> orderNos;
}

package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单当前所在班级的课节信息
 */
@Data
public class OrderLessonTime implements Serializable {

    private static final long serialVersionUID = 1561630744637389262L;

    private String orderNo;//订单编号

    private Date earliestStartTime;//最早的上课时间

    private Date latestEndTime;//最晚的结束时间

    private Integer classDuration;//在这段时间内的课时数
}


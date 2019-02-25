package com.huatu.paike.dal.paike.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderNoDuration implements Serializable {

    private static final long serialVersionUID = -7542651398563542054L;

    private String orderNo;//订单编号

    private Long classId;//班级id

    private Date startTime;//课节开始时间

    private Date endTime;//课节结束时间

    private Byte status;// 课节状态

    private Integer lessonDuration;//课节时长
}

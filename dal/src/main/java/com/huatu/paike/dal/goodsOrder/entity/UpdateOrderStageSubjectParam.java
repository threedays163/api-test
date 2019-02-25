package com.huatu.paike.dal.goodsOrder.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UpdateOrderStageSubjectParam implements Serializable {
    private static final long serialVersionUID = -1303892745214603240L;

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 商品编号
     */
    private String goodsNo;

    /**
     * 订单系统订单编号
     */
    private String oldOrderNo;

    /**
     * 阶段id
     */
    private Long stageId;

    /**
     * 科目id
     */
    private Long subjectId;

    /**
     * 是否可排课
     */
    private Boolean enable;

    /**
     * 总时长
     */
    private Long totalDuration;

    /**
     * 已排课时长
     */
    private Long paikeDuration;

    /**
     * 已结课时长
     */
    private Long finishDuration;

    /**
     * 课次ID
     */
    private Long lessonTableId;

    /**
     * 状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课
     */
    private Byte status;

    /**
     * 创建人id
     */
    private Long creatorId;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**createTime
     * 更新时间
     */
    private Date updateTime;

    /**
     * 增加排课时长
     */
    private Integer addPaikeDuration;

    /**
     * 增加结课时长
     */
    private Integer addFinishDuration;
}

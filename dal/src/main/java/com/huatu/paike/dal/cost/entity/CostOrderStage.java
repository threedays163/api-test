package com.huatu.paike.dal.cost.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Table(name = "cost_order_stage")
public class CostOrderStage {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_NO")
    private String goodsNo;

    /**
     * 班级id
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 阶段id
     */
    @Column(name = "STAGE_ID")
    private Long stageId;

    /**
     * 科目id
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 订单系统订单商品关联表ID
     */
    @Column(name = "ORDER_GOODS_ID")
    private Long orderGoodsId;

    /**
     * 时长
     */
    @Column(name = "DURATION")
    private Integer duration = 0;

    /**
     * 结转费用(元为单位扩大一万倍)
     */
    @Column(name = "COST")
    private Long cost = 0L;

    /**
     * 结转类型,1:杂费;2:学费
     */
    @Column(name = "COST_TYPE")
    private Byte costType;

    /**
     * 协议类型:A:非协议;B:协议
     */
    @Column(name = "PROTOCOL_TYPE")
    private String protocolType;

    /**
     * 结课时间
     */
    @Column(name = "FINISHED_DATE")
    private Date finishedDate;

    /**
     * 结课时间,值等于 finishedDate
     */
    @Transient
    private Date finishDate;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 结转序号,从0开始,再次结转加一
     */
    @Column(name = "SEQ_NUM")
    private Long seqNum;

    /**
     * 是否已结转,0:未结转;1:已结转
     */
    @Column(name = "HAS_COST")
    private Byte hasCost;

    /**
     * 0:正常结转;1:提报.默认:0:正常结转
     */
    @Column(name = "PUSH_TYPE")
    private Boolean pushType;

    /**
     * -1:unknown,1:css结转;2:分数pass;3:修改金额;4:删除退单;5:补录;6:手工刷
     */
    @Column(name = "SOURCE")
    private Byte source;
}
package com.huatu.paike.dal.cost.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "new_cost_order_stage")
public class NewCostOrderStage {
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
     * 结课时间,值等于 finishedDate
     */
    @Transient
    private Date finishDate;
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
     * 订单系统订单商品关联表ID
     */
    @Column(name = "ORDER_GOODS_ID")
    private Long orderGoodsId;

    /**
     * 时长
     */
    @Column(name = "DURATION")
    private Integer duration;

    /**
     * 结转费用
     */
    @Column(name = "COST")
    private Long cost;

    /**
     * 结转类型
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
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

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

    /**
     * 获取自增ID
     *
     * @return ID - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return ORDER_NO - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取商品编号
     *
     * @return GOODS_NO - 商品编号
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * 设置商品编号
     *
     * @param goodsNo 商品编号
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * 获取班级id
     *
     * @return CLASS_ID - 班级id
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级id
     *
     * @param classId 班级id
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取阶段id
     *
     * @return STAGE_ID - 阶段id
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * 设置阶段id
     *
     * @param stageId 阶段id
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * 获取科目id
     *
     * @return SUBJECT_ID - 科目id
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 设置科目id
     *
     * @param subjectId 科目id
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取订单系统订单商品关联表ID
     *
     * @return ORDER_GOODS_ID - 订单系统订单商品关联表ID
     */
    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    /**
     * 设置订单系统订单商品关联表ID
     *
     * @param orderGoodsId 订单系统订单商品关联表ID
     */
    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    /**
     * 获取时长
     *
     * @return DURATION - 时长
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置时长
     *
     * @param duration 时长
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 获取结转费用
     *
     * @return COST - 结转费用
     */
    public Long getCost() {
        return cost;
    }

    /**
     * 设置结转费用
     *
     * @param cost 结转费用
     */
    public void setCost(Long cost) {
        this.cost = cost;
    }

    /**
     * 获取结转类型
     *
     * @return COST_TYPE - 结转类型
     */
    public Byte getCostType() {
        return costType;
    }

    /**
     * 设置结转类型
     *
     * @param costType 结转类型
     */
    public void setCostType(Byte costType) {
        this.costType = costType;
    }

    /**
     * 获取协议类型:A:非协议;B:协议
     *
     * @return PROTOCOL_TYPE - 协议类型:A:非协议;B:协议
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置协议类型:A:非协议;B:协议
     *
     * @param protocolType 协议类型:A:非协议;B:协议
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * 获取结课时间
     *
     * @return FINISHED_DATE - 结课时间
     */
    public Date getFinishedDate() {
        return finishedDate;
    }

    /**
     * 设置结课时间
     *
     * @param finishedDate 结课时间
     */
    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取批次数(默认从0开始)
     *
     * @return BATCH_NUM - 批次数(默认从0开始)
     */
    public Integer getBatchNum() {
        return batchNum;
    }

    /**
     * 设置批次数(默认从0开始)
     *
     * @param batchNum 批次数(默认从0开始)
     */
    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    /**
     * 获取结转序号,从0开始,再次结转加一
     *
     * @return SEQ_NUM - 结转序号,从0开始,再次结转加一
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * 设置结转序号,从0开始,再次结转加一
     *
     * @param seqNum 结转序号,从0开始,再次结转加一
     */
    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
    }

    /**
     * 获取是否已结转,0:未结转;1:已结转
     *
     * @return HAS_COST - 是否已结转,0:未结转;1:已结转
     */
    public Byte getHasCost() {
        return hasCost;
    }

    /**
     * 设置是否已结转,0:未结转;1:已结转
     *
     * @param hasCost 是否已结转,0:未结转;1:已结转
     */
    public void setHasCost(Byte hasCost) {
        this.hasCost = hasCost;
    }

    /**
     * 获取0:正常结转;1:提报.默认:0:正常结转
     *
     * @return PUSH_TYPE - 0:正常结转;1:提报.默认:0:正常结转
     */
    public Boolean getPushType() {
        return pushType;
    }

    /**
     * 设置0:正常结转;1:提报.默认:0:正常结转
     *
     * @param pushType 0:正常结转;1:提报.默认:0:正常结转
     */
    public void setPushType(Boolean pushType) {
        this.pushType = pushType;
    }

    /**
     * 获取-1:unknown,1:css结转;2:分数pass;3:修改金额;4:删除退单;5:补录;6:手工刷
     *
     * @return SOURCE - -1:unknown,1:css结转;2:分数pass;3:修改金额;4:删除退单;5:补录;6:手工刷
     */
    public Byte getSource() {
        return source;
    }

    /**
     * 设置-1:unknown,1:css结转;2:分数pass;3:修改金额;4:删除退单;5:补录;6:手工刷
     *
     * @param source -1:unknown,1:css结转;2:分数pass;3:修改金额;4:删除退单;5:补录;6:手工刷
     */
    public void setSource(Byte source) {
        this.source = source;
    }
}
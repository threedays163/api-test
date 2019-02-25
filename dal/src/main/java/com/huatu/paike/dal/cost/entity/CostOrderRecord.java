package com.huatu.paike.dal.cost.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "cost_order_record")
public class CostOrderRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 班级id
     */
    @Column(name = "class_id")
    private Long classId;

    /**
     * 阶段id
     */
    @Column(name = "stage_id")
    private Long stageId;

    /**
     * 科目id
     */
    @Column(name = "subject_id")
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    @Column(name = "batch_num")
    private Integer batchNum;

    /**
     * 课节id
     */
    @Column(name = "lesson_id")
    private Long lessonId;

    @Column(name = "LESSON_DATE")
    private Date lessonDate;

    /**
     * 课时数
     */
    private Integer duration;

    /**
     * 结课费用
     */
    private Long cost;

    /**
     * 结课类型：1，杂费；2，学费
     */
    @Column(name = "cost_type")
    private Byte costType;

    /**
     * '协议类型 X协议商品 P非协议商品'
     */
    @Column(name = "PROTOCOL_TYPE")
    private String protocolType;

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
     * 组织架构ID
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 是否结转：0，否；1，是
     */
    @Column(name = "STATUS")
    private Boolean status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_no - 订单编号
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
     * 获取班级id
     *
     * @return class_id - 班级id
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
     * @return stage_id - 阶段id
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
     * @return subject_id - 科目id
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
     * 获取批次数(默认从0开始)
     *
     * @return batch_num - 批次数(默认从0开始)
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
     * 获取课节id
     *
     * @return lesson_id - 课节id
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * 设置课节id
     *
     * @param lessonId 课节id
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * @return LESSON_DATE
     */
    public Date getLessonDate() {
        return lessonDate;
    }

    /**
     * @param lessonDate
     */
    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    /**
     * 获取课时数
     *
     * @return duration - 课时数
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置课时数
     *
     * @param duration 课时数
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 获取结课费用
     *
     * @return cost - 结课费用
     */
    public Long getCost() {
        return cost;
    }

    /**
     * 设置结课费用
     *
     * @param cost 结课费用
     */
    public void setCost(Long cost) {
        this.cost = cost;
    }

    /**
     * 获取结课类型：1，杂费；2，学费
     *
     * @return cost_type - 结课类型：1，杂费；2，学费
     */
    public Byte getCostType() {
        return costType;
    }

    /**
     * 设置结课类型：1，杂费；2，学费
     *
     * @param costType 结课类型：1，杂费；2，学费
     */
    public void setCostType(Byte costType) {
        this.costType = costType;
    }

    /**
     * 获取'协议类型 X协议商品 P非协议商品'
     *
     * @return PROTOCOL_TYPE - '协议类型 X协议商品 P非协议商品'
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置'协议类型 X协议商品 P非协议商品'
     *
     * @param protocolType '协议类型 X协议商品 P非协议商品'
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
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
     * 获取组织架构ID
     *
     * @return NODE_ID - 组织架构ID
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * 设置组织架构ID
     *
     * @param nodeId 组织架构ID
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 获取是否结转：0，否；1，是
     *
     * @return STATUS - 是否结转：0，否；1，是
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置是否结转：0，否；1，是
     *
     * @param status 是否结转：0，否；1，是
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
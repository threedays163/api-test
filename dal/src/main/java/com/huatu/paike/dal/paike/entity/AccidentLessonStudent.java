package com.huatu.paike.dal.paike.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "accident_lesson_student")
public class AccidentLessonStudent {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 教学事故ID
     */
    @Column(name = "ACCIDENT_ID")
    private Long accidentId;

    /**
     * 班级ID
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 阶段ID
     */
    @Column(name = "STAGE_ID")
    private Long stageId;

    /**
     * 阶段ID
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 组织架构id
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 课节id
     */
    @Column(name = "LESSON_ID")
    private Long lessonId;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 学员id
     */
    @Column(name = "STUDENT_ID")
    private Long studentId;

    /**
     * 价格，按元为单位扩大一万倍
     */
    @Column(name = "PRICE")
    private Long price;

    /**
     * 成本，按元为单位扩大一万倍
     */
    @Column(name = "COST")
    private Long cost;

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
     * 创建人id
     */
    @Column(name = "CREATOR_ID")
    private Long creatorId;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_NO")
    private String goodsNo;

    /**
     * 是否补录0-非补录，1-是（默认为0）
     */
    @Column(name = "IS_RECOMPLETE")
    private Boolean isRecomplete;

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
     * 获取教学事故ID
     *
     * @return ACCIDENT_ID - 教学事故ID
     */
    public Long getAccidentId() {
        return accidentId;
    }

    /**
     * 设置教学事故ID
     *
     * @param accidentId 教学事故ID
     */
    public void setAccidentId(Long accidentId) {
        this.accidentId = accidentId;
    }

    /**
     * 获取班级ID
     *
     * @return CLASS_ID - 班级ID
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级ID
     *
     * @param classId 班级ID
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取阶段ID
     *
     * @return STAGE_ID - 阶段ID
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * 设置阶段ID
     *
     * @param stageId 阶段ID
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * 获取阶段ID
     *
     * @return SUBJECT_ID - 阶段ID
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 设置阶段ID
     *
     * @param subjectId 阶段ID
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
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
     * 获取组织架构id
     *
     * @return NODE_ID - 组织架构id
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * 设置组织架构id
     *
     * @param nodeId 组织架构id
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 获取课节id
     *
     * @return LESSON_ID - 课节id
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
     * 获取学员id
     *
     * @return STUDENT_ID - 学员id
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * 设置学员id
     *
     * @param studentId 学员id
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取价格，按元为单位扩大一万倍
     *
     * @return PRICE - 价格，按元为单位扩大一万倍
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置价格，按元为单位扩大一万倍
     *
     * @param price 价格，按元为单位扩大一万倍
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取成本，按元为单位扩大一万倍
     *
     * @return COST - 成本，按元为单位扩大一万倍
     */
    public Long getCost() {
        return cost;
    }

    /**
     * 设置成本，按元为单位扩大一万倍
     *
     * @param cost 成本，按元为单位扩大一万倍
     */
    public void setCost(Long cost) {
        this.cost = cost;
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
     * 获取创建人id
     *
     * @return CREATOR_ID - 创建人id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人id
     *
     * @param creatorId 创建人id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
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
     * 获取是否补录0-非补录，1-是（默认为0）
     *
     * @return IS_RECOMPLETE - 是否补录0-非补录，1-是（默认为0）
     */
    public Boolean getIsRecomplete() {
        return isRecomplete;
    }

    /**
     * 设置是否补录0-非补录，1-是（默认为0）
     *
     * @param isRecomplete 是否补录0-非补录，1-是（默认为0）
     */
    public void setIsRecomplete(Boolean isRecomplete) {
        this.isRecomplete = isRecomplete;
    }
}
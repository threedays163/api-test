package com.huatu.paike.dal.goodsOrder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "order_stage_subject")
public class OrderStageSubject {
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
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 商品编号
     */
    @Column(name = "goods_no")
    private String goodsNo;

    /**
     * 订单系统订单编号
     */
    @Column(name = "old_order_no")
    private String oldOrderNo;

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
     * 是否可排课
     */
    private Boolean enable;

    /**
     * 总时长
     */
    @Column(name = "total_duration")
    private Long totalDuration;

    /**
     * 已排课时长
     */
    @Column(name = "paike_duration")
    private Long paikeDuration;

    /**
     * 已结课时长
     */
    @Column(name = "finish_duration")
    private Long finishDuration;

    /**
     * 课次ID
     */
    @Column(name = "LESSON_TABLE_ID")
    private Long lessonTableId;

    /**
     * 状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课
     */
    private Byte status;

    /**
     * 创建人id
     */
    @Column(name = "CREATOR_ID")
    private Long creatorId;

    /**
     * 开始时间
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 结束时间
     */
    @Column(name = "END_DATE")
    private Date endDate;

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
     * 获取商品编号
     *
     * @return goods_no - 商品编号
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
     * 获取订单系统订单编号
     *
     * @return old_order_no - 订单系统订单编号
     */
    public String getOldOrderNo() {
        return oldOrderNo;
    }

    /**
     * 设置订单系统订单编号
     *
     * @param oldOrderNo 订单系统订单编号
     */
    public void setOldOrderNo(String oldOrderNo) {
        this.oldOrderNo = oldOrderNo;
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
     * 获取是否可排课
     *
     * @return enable - 是否可排课
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 设置是否可排课
     *
     * @param enable 是否可排课
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 获取总时长
     *
     * @return total_duration - 总时长
     */
    public Long getTotalDuration() {
        return totalDuration;
    }

    /**
     * 设置总时长
     *
     * @param totalDuration 总时长
     */
    public void setTotalDuration(Long totalDuration) {
        this.totalDuration = totalDuration;
    }

    /**
     * 获取已排课时长
     *
     * @return paike_duration - 已排课时长
     */
    public Long getPaikeDuration() {
        return paikeDuration;
    }

    /**
     * 设置已排课时长
     *
     * @param paikeDuration 已排课时长
     */
    public void setPaikeDuration(Long paikeDuration) {
        this.paikeDuration = paikeDuration;
    }

    /**
     * 获取已结课时长
     *
     * @return finish_duration - 已结课时长
     */
    public Long getFinishDuration() {
        return finishDuration;
    }

    /**
     * 设置已结课时长
     *
     * @param finishDuration 已结课时长
     */
    public void setFinishDuration(Long finishDuration) {
        this.finishDuration = finishDuration;
    }

    /**
     * 获取状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课
     *
     * @return status - 状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课
     *
     * @param status 状态：1，待入班;2,待排课;3，待上课;4，上课中;5，已结课
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 获取开始时间
     *
     * @return START_DATE - 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始时间
     *
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束时间
     *
     * @return END_DATE - 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束时间
     *
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public Long getLessonTableId() {
        return lessonTableId;
    }

    public void setLessonTableId(Long lessonTableId) {
        this.lessonTableId = lessonTableId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OrderStageSubject) {
            OrderStageSubject o1 = (OrderStageSubject) obj;
            if (this.id == null && o1.getId() != null) {
                return false;
            }
            if (this.id != null && !this.id.equals(o1.getId())) {
                return false;
            }
            if (this.orderNo == null && o1.getOrderNo() != null) {
                return false;
            }
            if (this.orderNo != null && !this.orderNo.equals(o1.getOrderNo())) {
                return false;
            }
            if (this.stageId == null && o1.getStageId() != null) {
                return false;
            }
            if (this.stageId != null && !this.stageId.equals(o1.getStageId())) {
                return false;
            }
            if (this.subjectId == null && o1.getSubjectId() != null) {
                return false;
            }
            if (this.subjectId != null && !this.subjectId.equals(o1.getSubjectId())) {
                return false;
            }
        }
        return true;
    }

}
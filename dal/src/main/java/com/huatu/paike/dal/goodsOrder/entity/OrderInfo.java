package com.huatu.paike.dal.goodsOrder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Table(name = "order_info")
public class OrderInfo {
    /**
     * ID,自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号=OLD_ORDER_NO+'_'+ORDER_GOODS_ID
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 订单系统订单编号
     */
    @Column(name = "OLD_ORDER_NO")
    private String oldOrderNo;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_NO")
    private String goodsNo;

    /**
     * 订单系统订单商品关联表ID
     */
    @Column(name = "ORDER_GOODS_ID")
    private Long orderGoodsId;

    /**
     * 上课证ID
     */
    @Column(name = "LICENCE_ID")
    private String licenceId;

    /**
     * 报名分部ID
     */
    @Column(name = "ENTRY_NODE_ID")
    private Long entryNodeId;

    /**
     * 上课分部ID(商品关联)
     */
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    /**
     * 学员ID
     */
    @Column(name = "STUDENT_ID")
    private Long studentId;

    /**
     * 学员姓名
     */
    @Column(name = "STUDENT_NAME")
    private String studentName;

    /**
     * 学员手机号
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 是否包餐
     */
    @Column(name = "IS_MEAL")
    private Boolean isMeal;

    /**
     * 是否住宿
     */
    @Column(name = "IS_BED")
    private Boolean isBed;

    /**
     * 时长：排课系统单位为分钟，商品订单系统单位是天，需要做转换
     */
    @Column(name = "DURATION_TIME")
    private Integer durationTime;

    /**
     * 订单状态:排课业务状态
     */
    @Column(name = "ORDER_STATE")
    private Byte orderState;

    /**
     * 职位保护的职位ID,非职位保护为-1
     */
    @Column(name = "POSITION_ID")
    private Long positionId;

    /**
     * 下单时间
     */
    @Column(name = "BUY_TIME")
    private Date buyTime;

    /**
     * 开课日期
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 结课日期
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
     * 已排课课时数,单位：分钟
     */
    @Column(name = "ARRANGED_DURATION")
    private Integer arrangedDuration;

    /**
     * 已结课课时数,单位：分钟
     */
    @Column(name = "ENDED_DURATION")
    private Integer endedDuration;

    /**
     * 成本，按元为单位扩大一万倍
     */
    @Column(name = "COST")
    private Long cost;

    /**
     * 是否可用,1:可用;0:不可用
     */
    @Column(name = "AVAILABLE")
    private Integer available;

    /**
     * 协议类型：A非协议；B协议
     */
    @Column(name = "PROTOCOL_TYPE")
    private String protocolType;

    /**
     * 分数是否通过,当协议类型为协议时,用于表示订单是否通过,0:未通过;1:通过
     */
    @Column(name = "SCORE_HAVE_PASS")
    private Boolean scoreHavePass;

    /**
     * 获取ID,自增
     *
     * @return ID - ID,自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID,自增
     *
     * @param id ID,自增
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单编号=OLD_ORDER_NO+'_'+ORDER_GOODS_ID
     *
     * @return ORDER_NO - 订单编号=OLD_ORDER_NO+'_'+ORDER_GOODS_ID
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号=OLD_ORDER_NO+'_'+ORDER_GOODS_ID
     *
     * @param orderNo 订单编号=OLD_ORDER_NO+'_'+ORDER_GOODS_ID
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取订单系统订单编号
     *
     * @return OLD_ORDER_NO - 订单系统订单编号
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
     * 获取上课证ID
     *
     * @return LICENCE_ID - 上课证ID
     */
    public String getLicenceId() {
        return licenceId;
    }

    /**
     * 设置上课证ID
     *
     * @param licenceId 上课证ID
     */
    public void setLicenceId(String licenceId) {
        this.licenceId = licenceId;
    }

    /**
     * 获取报名分部ID
     *
     * @return ENTRY_NODE_ID - 报名分部ID
     */
    public Long getEntryNodeId() {
        return entryNodeId;
    }

    /**
     * 设置报名分部ID
     *
     * @param entryNodeId 报名分部ID
     */
    public void setEntryNodeId(Long entryNodeId) {
        this.entryNodeId = entryNodeId;
    }

    /**
     * 获取上课分部ID(商品关联)
     *
     * @return DEPARTMENT_ID - 上课分部ID(商品关联)
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置上课分部ID(商品关联)
     *
     * @param departmentId 上课分部ID(商品关联)
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取学员ID
     *
     * @return STUDENT_ID - 学员ID
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * 设置学员ID
     *
     * @param studentId 学员ID
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取学员姓名
     *
     * @return STUDENT_NAME - 学员姓名
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置学员姓名
     *
     * @param studentName 学员姓名
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取学员手机号
     *
     * @return MOBILE - 学员手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置学员手机号
     *
     * @param mobile 学员手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取是否包餐
     *
     * @return IS_MEAL - 是否包餐
     */
    public Boolean getIsMeal() {
        return isMeal;
    }

    /**
     * 设置是否包餐
     *
     * @param isMeal 是否包餐
     */
    public void setIsMeal(Boolean isMeal) {
        this.isMeal = isMeal;
    }

    /**
     * 获取是否住宿
     *
     * @return IS_BED - 是否住宿
     */
    public Boolean getIsBed() {
        return isBed;
    }

    /**
     * 设置是否住宿
     *
     * @param isBed 是否住宿
     */
    public void setIsBed(Boolean isBed) {
        this.isBed = isBed;
    }

    /**
     * 获取时长：排课系统单位为分钟，商品订单系统单位是天，需要做转换
     *
     * @return DURATION_TIME - 时长：排课系统单位为分钟，商品订单系统单位是天，需要做转换
     */
    public Integer getDurationTime() {
        return durationTime;
    }

    /**
     * 设置时长：排课系统单位为分钟，商品订单系统单位是天，需要做转换
     *
     * @param durationTime 时长：排课系统单位为分钟，商品订单系统单位是天，需要做转换
     */
    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    /**
     * 获取订单状态:排课业务状态
     *
     * @return ORDER_STATE - 订单状态:排课业务状态
     */
    public Byte getOrderState() {
        return orderState;
    }

    /**
     * 设置订单状态:排课业务状态
     *
     * @param orderState 订单状态:排课业务状态
     */
    public void setOrderState(Byte orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取职位保护的职位ID,非职位保护为-1
     *
     * @return POSITION_ID - 职位保护的职位ID,非职位保护为-1
     */
    public Long getPositionId() {
        return positionId;
    }

    /**
     * 设置职位保护的职位ID,非职位保护为-1
     *
     * @param positionId 职位保护的职位ID,非职位保护为-1
     */
    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    /**
     * 获取下单时间
     *
     * @return BUY_TIME - 下单时间
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * 设置下单时间
     *
     * @param buyTime 下单时间
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
     * 获取开课日期
     *
     * @return START_DATE - 开课日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开课日期
     *
     * @param startDate 开课日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结课日期
     *
     * @return END_DATE - 结课日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结课日期
     *
     * @param endDate 结课日期
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

    /**
     * 获取已排课课时数,单位：分钟
     *
     * @return ARRANGED_DURATION - 已排课课时数,单位：分钟
     */
    public Integer getArrangedDuration() {
        return arrangedDuration;
    }

    /**
     * 设置已排课课时数,单位：分钟
     *
     * @param arrangedDuration 已排课课时数,单位：分钟
     */
    public void setArrangedDuration(Integer arrangedDuration) {
        this.arrangedDuration = arrangedDuration;
    }

    /**
     * 获取已结课课时数,单位：分钟
     *
     * @return ENDED_DURATION - 已结课课时数,单位：分钟
     */
    public Integer getEndedDuration() {
        return endedDuration;
    }

    /**
     * 设置已结课课时数,单位：分钟
     *
     * @param endedDuration 已结课课时数,单位：分钟
     */
    public void setEndedDuration(Integer endedDuration) {
        this.endedDuration = endedDuration;
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
     * 获取是否可用,1:可用;0:不可用
     *
     * @return AVAILABLE - 是否可用,1:可用;0:不可用
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 设置是否可用,1:可用;0:不可用
     *
     * @param available 是否可用,1:可用;0:不可用
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     * 获取协议类型：A非协议；B协议
     *
     * @return PROTOCOL_TYPE - 协议类型：A非协议；B协议
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置协议类型：A非协议；B协议
     *
     * @param protocolType 协议类型：A非协议；B协议
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * 获取分数是否通过,当协议类型为协议时,用于表示订单是否通过,0:未通过;1:通过
     *
     * @return SCORE_HAVE_PASS - 分数是否通过,当协议类型为协议时,用于表示订单是否通过,0:未通过;1:通过
     */
    public Boolean getScoreHavePass() {
        return scoreHavePass;
    }

    /**
     * 设置分数是否通过,当协议类型为协议时,用于表示订单是否通过,0:未通过;1:通过
     *
     * @param scoreHavePass 分数是否通过,当协议类型为协议时,用于表示订单是否通过,0:未通过;1:通过
     */
    public void setScoreHavePass(Boolean scoreHavePass) {
        this.scoreHavePass = scoreHavePass;
    }
}
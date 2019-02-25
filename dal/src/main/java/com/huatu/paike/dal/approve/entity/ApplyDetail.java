package com.huatu.paike.dal.approve.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "apply_detail")
public class ApplyDetail {
    /**
     * 主键自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 审批单ID
     */
    @Column(name = "APPLY_ID")
    private Long applyId;

    /**
     * 审批人ID
     */
    @Column(name = "OPERATOR_ID")
    private Long operatorId;

    /**
     * 审批人姓名
     */
    @Column(name = "OPERATOR_NAME")
    private String operatorName;

    /**
     * 审批时间
     */
    @Column(name = "OPERATOR_TIME")
    private Date operatorTime;

    /**
     * 审批结果,1:通过;2:拒绝
     */
    @Column(name = "OPERATOR_RESULT")
    private Byte operatorResult;

    /**
     * 审批人级别, 级别从1开始,依次递增,1是第一个审批的人,2是第二个审批人,以此类推
     */
    @Column(name = "OPERATOR_LEVEL")
    private Integer operatorLevel;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取主键自增
     *
     * @return ID - 主键自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键自增
     *
     * @param id 主键自增
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取审批单ID
     *
     * @return APPLY_ID - 审批单ID
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * 设置审批单ID
     *
     * @param applyId 审批单ID
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取审批人ID
     *
     * @return OPERATOR_ID - 审批人ID
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * 设置审批人ID
     *
     * @param operatorId 审批人ID
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取审批人姓名
     *
     * @return OPERATOR_NAME - 审批人姓名
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置审批人姓名
     *
     * @param operatorName 审批人姓名
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 获取审批时间
     *
     * @return OPERATOR_TIME - 审批时间
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * 设置审批时间
     *
     * @param operatorTime 审批时间
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    /**
     * 获取审批结果,1:通过;2:拒绝
     *
     * @return OPERATOR_RESULT - 审批结果,1:通过;2:拒绝
     */
    public Byte getOperatorResult() {
        return operatorResult;
    }

    /**
     * 设置审批结果,1:通过;2:拒绝
     *
     * @param operatorResult 审批结果,1:通过;2:拒绝
     */
    public void setOperatorResult(Byte operatorResult) {
        this.operatorResult = operatorResult;
    }

    /**
     * 获取审批人级别, 级别从1开始,依次递增,1是第一个审批的人,2是第二个审批人,以此类推
     *
     * @return OPERATOR_LEVEL - 审批人级别, 级别从1开始,依次递增,1是第一个审批的人,2是第二个审批人,以此类推
     */
    public Integer getOperatorLevel() {
        return operatorLevel;
    }

    /**
     * 设置审批人级别, 级别从1开始,依次递增,1是第一个审批的人,2是第二个审批人,以此类推
     *
     * @param operatorLevel 审批人级别, 级别从1开始,依次递增,1是第一个审批的人,2是第二个审批人,以此类推
     */
    public void setOperatorLevel(Integer operatorLevel) {
        this.operatorLevel = operatorLevel;
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
}
package com.huatu.paike.dal.approve.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "apply")
public class Apply {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 流程id
     */
    @Column(name = "PROCESS_ID")
    private String processId;

    /**
     * 发起人id
     */
    @Column(name = "ORIGINATOR_ID")
    private Long originatorId;

    /**
     * 审批类型id
     */
    @Column(name = "APPROVE_TYPE_ID")
    private Byte approveTypeId;

    /**
     * 审批信息编号，如反馈编号
     */
    @Column(name = "OBJECT_NO")
    private String objectNo;

    /**
     * 审批信息
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 审批标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 审批状态:2，审批中；3，通过；4，不通过，5，撤回
     */
    @Column(name = "STATUS")
    private Byte status;

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
     * 创建人
     */
    @Column(name = "CREATOR_ID")
    private Long creatorId;

    /**
     * 删除标记,0未删除,1删除
     */
    @Column(name = "IS_DEL")
    private Byte isDel;

    /**
     * @return ID
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
     * 获取流程id
     *
     * @return PROCESS_ID - 流程id
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * 设置流程id
     *
     * @param processId 流程id
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /**
     * 获取发起人id
     *
     * @return ORIGINATOR_ID - 发起人id
     */
    public Long getOriginatorId() {
        return originatorId;
    }

    /**
     * 设置发起人id
     *
     * @param originatorId 发起人id
     */
    public void setOriginatorId(Long originatorId) {
        this.originatorId = originatorId;
    }

    /**
     * 获取审批类型id
     *
     * @return APPROVE_TYPE_ID - 审批类型id
     */
    public Byte getApproveTypeId() {
        return approveTypeId;
    }

    /**
     * 设置审批类型id
     *
     * @param approveTypeId 审批类型id
     */
    public void setApproveTypeId(Byte approveTypeId) {
        this.approveTypeId = approveTypeId;
    }

    /**
     * 获取审批信息编号，如反馈编号
     *
     * @return OBJECT_NO - 审批信息编号，如反馈编号
     */
    public String getObjectNo() {
        return objectNo;
    }

    /**
     * 设置审批信息编号，如反馈编号
     *
     * @param objectNo 审批信息编号，如反馈编号
     */
    public void setObjectNo(String objectNo) {
        this.objectNo = objectNo;
    }

    /**
     * 获取审批信息
     *
     * @return CONTENT - 审批信息
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置审批信息
     *
     * @param content 审批信息
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取审批标题
     *
     * @return TITLE - 审批标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置审批标题
     *
     * @param title 审批标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取审批状态:2，审批中；3，通过；4，不通过，5，撤回
     *
     * @return STATUS - 审批状态:2，审批中；3，通过；4，不通过，5，撤回
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置审批状态:2，审批中；3，通过；4，不通过，5，撤回
     *
     * @param status 审批状态:2，审批中；3，通过；4，不通过，5，撤回
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 获取创建人
     *
     * @return CREATOR_ID - 创建人
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人
     *
     * @param creatorId 创建人
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取删除标记,0未删除,1删除
     *
     * @return IS_DEL - 删除标记,0未删除,1删除
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置删除标记,0未删除,1删除
     *
     * @param isDel 删除标记,0未删除,1删除
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}
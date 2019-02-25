package com.huatu.paike.dal.sms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_template")
public class SmsTemplate {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 模版名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 模版内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 模版备注
     */
    @Column(name = "REMARK")
    private String remark;

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
     * 获取模版名
     *
     * @return NAME - 模版名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模版名
     *
     * @param name 模版名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取模版内容
     *
     * @return CONTENT - 模版内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置模版内容
     *
     * @param content 模版内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取模版备注
     *
     * @return REMARK - 模版备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置模版备注
     *
     * @param remark 模版备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}
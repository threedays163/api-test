package com.huatu.paike.dal.sms.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sms_record")
public class SmsRecord {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 模版id
     */
    @Column(name = "TEMPLATE_ID")
    private Long templateId;

    /**
     * 对应业务实体id
     */
    @Column(name = "OBJECT_ID")
    private Long objectId;

    /**
     * 对应业务实体编号
     */
    @Column(name = "OBJECT_NO")
    private String objectNo;

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
     * 对应参数
     */
    @Column(name = "PARAM_CONTENT")
    private String paramContent;

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
     * 获取模版id
     *
     * @return TEMPLATE_ID - 模版id
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * 设置模版id
     *
     * @param templateId 模版id
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取对应业务实体id
     *
     * @return OBJECT_ID - 对应业务实体id
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * 设置对应业务实体id
     *
     * @param objectId 对应业务实体id
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    /**
     * 获取对应业务实体编号
     *
     * @return OBJECT_NO - 对应业务实体编号
     */
    public String getObjectNo() {
        return objectNo;
    }

    /**
     * 设置对应业务实体编号
     *
     * @param objectNo 对应业务实体编号
     */
    public void setObjectNo(String objectNo) {
        this.objectNo = objectNo;
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

    /**
     * 获取对应参数
     *
     * @return PARAM_CONTENT - 对应参数
     */
    public String getParamContent() {
        return paramContent;
    }

    /**
     * 设置对应参数
     *
     * @param paramContent 对应参数
     */
    public void setParamContent(String paramContent) {
        this.paramContent = paramContent;
    }
}
package com.huatu.paike.dal.sys.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "TIME_CONF")
public class TimeConf {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 组织架构id
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 是否应用到子节点
     */
    @Column(name = "EFFECT_CHILD")
    private Boolean effectChild;

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
     * 获取是否应用到子节点
     *
     * @return EFFECT_CHILD - 是否应用到子节点
     */
    public Boolean getEffectChild() {
        return effectChild;
    }

    /**
     * 设置是否应用到子节点
     *
     * @param effectChild 是否应用到子节点
     */
    public void setEffectChild(Boolean effectChild) {
        this.effectChild = effectChild;
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
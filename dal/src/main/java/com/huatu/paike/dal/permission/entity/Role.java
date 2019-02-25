package com.huatu.paike.dal.permission.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "role")
public class Role {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 描述
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 是否是系统内置角色
     */
    @Column(name = "IS_SYSTEM")
    private Integer isSystem;

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
     * 获取角色
     *
     * @return NAME - 角色
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色
     *
     * @param name 角色
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return REMARK - 描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述
     *
     * @param remark 描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取是否是系统内置角色
     *
     * @return IS_SYSTEM - 是否是系统内置角色
     */
    public Integer getIsSystem() {
        return isSystem;
    }

    /**
     * 设置是否是系统内置角色
     *
     * @param isSystem 是否是系统内置角色
     */
    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
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
}
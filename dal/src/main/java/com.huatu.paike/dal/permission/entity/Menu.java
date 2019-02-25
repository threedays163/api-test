package com.huatu.paike.dal.permission.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "menu")
public class Menu {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 菜单级别
     */
    @Column(name = "LEVEL")
    private Integer level;

    /**
     * 菜单父Id
     */
    @Column(name = "PID")
    private Long pid;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 权限
     */
    @Column(name = "PERMISSIONS")
    private String permissions;

    /**
     * 操作人
     */
    @Column(name = "OPERATOR_ID")
    private Long operatorId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
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
     * 获取菜单名
     *
     * @return NAME - 菜单名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名
     *
     * @param name 菜单名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜单级别
     *
     * @return LEVEL - 菜单级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置菜单级别
     *
     * @param level 菜单级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取菜单父Id
     *
     * @return PID - 菜单父Id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置菜单父Id
     *
     * @param pid 菜单父Id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取权限
     *
     * @return PERMISSIONS - 权限
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * 设置权限
     *
     * @param permissions 权限
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * 获取操作人
     *
     * @return OPERATOR_ID - 操作人
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作人
     *
     * @param operatorId 操作人
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
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
     * @return update_time - 更新时间
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
package com.huatu.paike.dal.permission.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_role")
public class UserRole {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

    /**
     * 员工id
     */
    @Column(name = "STAFF_ID")
    private Long staffId;

    /**
     * 组织架构id
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

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
     * 获取角色id
     *
     * @return ROLE_ID - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取员工id
     *
     * @return STAFF_ID - 员工id
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * 设置员工id
     *
     * @param staffId 员工id
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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
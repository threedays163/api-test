package com.huatu.paike.dal.permission.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "organization")
public class Organization {
    /**
     * ID,自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * (ehr系统)组织架构id
     */
    @Column(name = "ehr_node_id")
    private Long ehrNodeId;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 财务编码（只有分部有）
     */
    @Column(name = "ebs_code")
    private String ebsCode;

    /**
     * 区域id
     */
    @Column(name = "area_id")
    private Long areaId;

    /**
     * 父节点id（关联自增id）
     */
    private Long pid;

    /**
     * 分公司id（只有分部有分公司）
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 节点类型：1，分校；2，分部
     */
    @Column(name = "node_type")
    private Long nodeType;

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
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * 是否删除：0，未删除;1,已删除
     */
    @Column(name = "is_del")
    private Byte isDel;

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
     * 获取(ehr系统)组织架构id
     *
     * @return ehr_node_id - (ehr系统)组织架构id
     */
    public Long getEhrNodeId() {
        return ehrNodeId;
    }

    /**
     * 设置(ehr系统)组织架构id
     *
     * @param ehrNodeId (ehr系统)组织架构id
     */
    public void setEhrNodeId(Long ehrNodeId) {
        this.ehrNodeId = ehrNodeId;
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取财务编码（只有分部有）
     *
     * @return ebs_code - 财务编码（只有分部有）
     */
    public String getEbsCode() {
        return ebsCode;
    }

    /**
     * 设置财务编码（只有分部有）
     *
     * @param ebsCode 财务编码（只有分部有）
     */
    public void setEbsCode(String ebsCode) {
        this.ebsCode = ebsCode;
    }

    /**
     * 获取区域id
     *
     * @return area_id - 区域id
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置区域id
     *
     * @param areaId 区域id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取父节点id（关联自增id）
     *
     * @return pid - 父节点id（关联自增id）
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父节点id（关联自增id）
     *
     * @param pid 父节点id（关联自增id）
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取分公司id（只有分部有分公司）
     *
     * @return company_id - 分公司id（只有分部有分公司）
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置分公司id（只有分部有分公司）
     *
     * @param companyId 分公司id（只有分部有分公司）
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取节点类型：1，分校；2，分部
     *
     * @return node_type - 节点类型：1，分校；2，分部
     */
    public Long getNodeType() {
        return nodeType;
    }

    /**
     * 设置节点类型：1，分校；2，分部
     *
     * @param nodeType 节点类型：1，分校；2，分部
     */
    public void setNodeType(Long nodeType) {
        this.nodeType = nodeType;
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
     * @return creator_id - 创建人id
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
     * 获取是否删除：0，未删除;1,已删除
     *
     * @return is_del - 是否删除：0，未删除;1,已删除
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除：0，未删除;1,已删除
     *
     * @param isDel 是否删除：0，未删除;1,已删除
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}
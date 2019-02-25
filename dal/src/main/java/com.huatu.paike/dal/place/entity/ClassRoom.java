package com.huatu.paike.dal.place.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "CLASS_ROOM")
public class ClassRoom {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 教室类型
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 场地ID
     */
    @Column(name = "PLACE_ID")
    private Long placeId;

    /**
     * 分部ID
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 城市ID
     */
    @Column(name = "AREA_ID")
    private Long areaId;

    /**
     * 教室地点
     */
    @Column(name = "LOCATION")
    private String location;

    /**
     * 容量
     */
    @Column(name = "CONTENT")
    private Integer content;

    /**
     * 签订时间（酒店会议室有，其它教室类型为空）
     */
    @Column(name = "SIGN_DATE")
    private Date signDate;

    /**
     * 过期时间（酒店会议室有，其它教室类型为空）
     */
    @Column(name = "EXPIRE_DATE")
    private Date expireDate;

    /**
     * 是否有效，0无效，1有效
     */
    @Column(name = "IS_EFFECTIVE")
    private Byte isEffective;

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
     * 获取主键ID
     *
     * @return ID - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取教室类型
     *
     * @return TYPE - 教室类型
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置教室类型
     *
     * @param type 教室类型
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取场地ID
     *
     * @return PLACE_ID - 场地ID
     */
    public Long getPlaceId() {
        return placeId;
    }

    /**
     * 设置场地ID
     *
     * @param placeId 场地ID
     */
    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    /**
     * 获取分部ID
     *
     * @return NODE_ID - 分部ID
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * 设置分部ID
     *
     * @param nodeId 分部ID
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 获取城市ID
     *
     * @return AREA_ID - 城市ID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置城市ID
     *
     * @param areaId 城市ID
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取教室地点
     *
     * @return LOCATION - 教室地点
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置教室地点
     *
     * @param location 教室地点
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取容量
     *
     * @return CONTENT - 容量
     */
    public Integer getContent() {
        return content;
    }

    /**
     * 设置容量
     *
     * @param content 容量
     */
    public void setContent(Integer content) {
        this.content = content;
    }

    /**
     * 获取签订时间（酒店会议室有，其它教室类型为空）
     *
     * @return SIGN_DATE - 签订时间（酒店会议室有，其它教室类型为空）
     */
    public Date getSignDate() {
        return signDate;
    }

    /**
     * 设置签订时间（酒店会议室有，其它教室类型为空）
     *
     * @param signDate 签订时间（酒店会议室有，其它教室类型为空）
     */
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取过期时间（酒店会议室有，其它教室类型为空）
     *
     * @return EXPIRE_DATE - 过期时间（酒店会议室有，其它教室类型为空）
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * 设置过期时间（酒店会议室有，其它教室类型为空）
     *
     * @param expireDate 过期时间（酒店会议室有，其它教室类型为空）
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取是否有效，0无效，1有效，2待生效
     *
     * @return IS_EFFECTIVE - 是否有效，0无效，1有效，2待生效
     */
    public Byte getIsEffective() {
        return isEffective;
    }

    /**
     * 设置是否有效，0无效，1有效
     *
     * @param isEffective 是否有效，0无效，1有效
     */
    public void setIsEffective(Byte isEffective) {
        this.isEffective = isEffective;
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
}
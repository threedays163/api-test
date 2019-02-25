package com.huatu.paike.dal.place.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "cloud_room_device")
public class CloudRoomDevice {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 直播房间ID
     */
    @Column(name = "CLOUD_ROOM_ID")
    private String cloudRoomId;

    /**
     * 场地ID
     */
    @Column(name = "PLACE_ID")
    private Long placeId;

    /**
     * 场地类型，4 学生端，5 主讲端
     */
    @Column(name = "PLACE_TYPE")
    private Byte placeType;

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
     * 获取直播房间ID
     *
     * @return CLOUD_ROOM_ID - 直播房间ID
     */
    public String getCloudRoomId() {
        return cloudRoomId;
    }

    /**
     * 设置直播房间ID
     *
     * @param cloudRoomId 直播房间ID
     */
    public void setCloudRoomId(String cloudRoomId) {
        this.cloudRoomId = cloudRoomId;
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
     * 获取场地类型，4 学生端，5 主讲端
     *
     * @return PLACE_TYPE - 场地类型，4 学生端，5 主讲端
     */
    public Byte getPlaceType() {
        return placeType;
    }

    /**
     * 设置场地类型，4 学生端，5 主讲端
     *
     * @param placeType 场地类型，4 学生端，5 主讲端
     */
    public void setPlaceType(Byte placeType) {
        this.placeType = placeType;
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
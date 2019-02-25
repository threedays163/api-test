package com.huatu.paike.dal.place.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Place {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 组织架构ID
     */
    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 城市ID
     */
    @Column(name = "AREA_ID")
    private Long areaId;

    /**
     * 场地类别:0,教室；1，酒店会议室；2，酒店房间；3，其它
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 酒店名称
     */
    @Column(name = "HOTEL_NAME")
    private String hotelName;

    /**
     * 楼层
     */
    @Column(name = "FLOOR")
    private String floor;

    /**
     * 教室
     */
    @Column(name = "CLASS_ROOM_NAME")
    private String classRoomName;

    /**
     * 房间类型(大床房，标间等等)
     */
    @Column(name = "HOTEL_ROOM_TYPE")
    private Byte hotelRoomType;

    /**
     * 最大容量
     */
    @Column(name = "CONTENT")
    private Integer content;

    /**
     * 电话号码
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 签订时间
     */
    @Column(name = "SIGN_DATE")
    private Date signDate;

    /**
     * 过期时间
     */
    @Column(name = "EXPIRE_DATE")
    private Date expireDate;

    /**
     * 酒店会议室价格/天 单位：元扩大一万倍
     */
    @Column(name = "MEETING_ROOM_AMOUNT")
    private Long meetingRoomAmount;

    /**
     * 酒店房间价格不含早 单位：元扩大一万倍
     */
    @Column(name = "HOTEL_ROOM_RAW_AMOUNT")
    private Long hotelRoomRawAmount;

    /**
     * 酒店房间价格含早 单位：元扩大一万倍
     */
    @Column(name = "HOTEL_ROOM_BREKKER_AMOUNT")
    private Long hotelRoomBrekkerAmount;

    /**
     * 是否含晚饭：0，不包含；1，包含，酒店会议室用
     */
    @Column(name = "IS_COVER_DINNER")
    private Byte isCoverDinner;

    /**
     * 是否有效：0无效，1有效，2待生效
     */
    @Column(name = "IS_EFFECTIVE")
    private Byte isEffective;

    /**
     * 经度
     */
    @Column(name = "LONGITUDE")
    private BigDecimal longitude;

    /**
     * 纬度
     */
    @Column(name = "LATITUDE")
    private BigDecimal latitude;

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
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 酒店房间
     */
    @Column(name = "HOTEL_ROOM_NAME")
    private String hotelRoomName;

    /**
     * 地址，各种类型共用一个
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 其它类型场地名称
     */
    @Column(name = "UNIT_NAME")
    private String unitName;

    /**
     * 设备编号
     */
    @Column(name = "DEVICE_ID")
    private Long deviceId = 0l;

    /**
     * 设备码
     */
    @Column(name = "DEVICE_UNIQUE")
    private String deviceUnique = "";

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
     * 获取组织架构ID
     *
     * @return NODE_ID - 组织架构ID
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * 设置组织架构ID
     *
     * @param nodeId 组织架构ID
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
     * 获取场地类别:0,教室；1，酒店会议室；2，酒店房间；3，其它
     *
     * @return TYPE - 场地类别:0,教室；1，酒店会议室；2，酒店房间；3，其它
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置场地类别:0,教室；1，酒店会议室；2，酒店房间；3，其它
     *
     * @param type 场地类别:0,教室；1，酒店会议室；2，酒店房间；3，其它
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取酒店名称
     *
     * @return HOTEL_NAME - 酒店名称
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置酒店名称
     *
     * @param hotelName 酒店名称
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * 获取楼层
     *
     * @return FLOOR - 楼层
     */
    public String getFloor() {
        return floor;
    }

    /**
     * 设置楼层
     *
     * @param floor 楼层
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * 获取教室
     *
     * @return CLASS_ROOM_NAME - 教室
     */
    public String getClassRoomName() {
        return classRoomName;
    }

    /**
     * 设置教室
     *
     * @param classRoomName 教室
     */
    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    /**
     * 获取房间类型(大床房，标间等等)
     *
     * @return HOTEL_ROOM_TYPE - 房间类型(大床房，标间等等)
     */
    public Byte getHotelRoomType() {
        return hotelRoomType;
    }

    /**
     * 设置房间类型(大床房，标间等等)
     *
     * @param hotelRoomType 房间类型(大床房，标间等等)
     */
    public void setHotelRoomType(Byte hotelRoomType) {
        this.hotelRoomType = hotelRoomType;
    }

    /**
     * 获取最大容量
     *
     * @return CONTENT - 最大容量
     */
    public Integer getContent() {
        return content;
    }

    /**
     * 设置最大容量
     *
     * @param content 最大容量
     */
    public void setContent(Integer content) {
        this.content = content;
    }

    /**
     * 获取电话号码
     *
     * @return MOBILE - 电话号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话号码
     *
     * @param mobile 电话号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取签订时间
     *
     * @return SIGN_DATE - 签订时间
     */
    public Date getSignDate() {
        return signDate;
    }

    /**
     * 设置签订时间
     *
     * @param signDate 签订时间
     */
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取过期时间
     *
     * @return EXPIRE_DATE - 过期时间
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * 设置过期时间
     *
     * @param expireDate 过期时间
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取酒店会议室价格/天 单位：元扩大一万倍
     *
     * @return MEETING_ROOM_AMOUNT - 酒店会议室价格/天 单位：元扩大一万倍
     */
    public Long getMeetingRoomAmount() {
        return meetingRoomAmount;
    }

    /**
     * 设置酒店会议室价格/天 单位：元扩大一万倍
     *
     * @param meetingRoomAmount 酒店会议室价格/天 单位：元扩大一万倍
     */
    public void setMeetingRoomAmount(Long meetingRoomAmount) {
        this.meetingRoomAmount = meetingRoomAmount;
    }

    /**
     * 获取酒店房间价格不含早 单位：元扩大一万倍
     *
     * @return HOTEL_ROOM_RAW_AMOUNT - 酒店房间价格不含早 单位：元扩大一万倍
     */
    public Long getHotelRoomRawAmount() {
        return hotelRoomRawAmount;
    }

    /**
     * 设置酒店房间价格不含早 单位：元扩大一万倍
     *
     * @param hotelRoomRawAmount 酒店房间价格不含早 单位：元扩大一万倍
     */
    public void setHotelRoomRawAmount(Long hotelRoomRawAmount) {
        this.hotelRoomRawAmount = hotelRoomRawAmount;
    }

    /**
     * 获取酒店房间价格含早 单位：元扩大一万倍
     *
     * @return HOTEL_ROOM_BREKKER_AMOUNT - 酒店房间价格含早 单位：元扩大一万倍
     */
    public Long getHotelRoomBrekkerAmount() {
        return hotelRoomBrekkerAmount;
    }

    /**
     * 设置酒店房间价格含早 单位：元扩大一万倍
     *
     * @param hotelRoomBrekkerAmount 酒店房间价格含早 单位：元扩大一万倍
     */
    public void setHotelRoomBrekkerAmount(Long hotelRoomBrekkerAmount) {
        this.hotelRoomBrekkerAmount = hotelRoomBrekkerAmount;
    }

    /**
     * 获取是否含晚饭：0，不包含；1，包含，酒店会议室用
     *
     * @return IS_COVER_DINNER - 是否含晚饭：0，不包含；1，包含，酒店会议室用
     */
    public Byte getIsCoverDinner() {
        return isCoverDinner;
    }

    /**
     * 设置是否含晚饭：0，不包含；1，包含，酒店会议室用
     *
     * @param isCoverDinner 是否含晚饭：0，不包含；1，包含，酒店会议室用
     */
    public void setIsCoverDinner(Byte isCoverDinner) {
        this.isCoverDinner = isCoverDinner;
    }

    /**
     * 获取是否有效：0无效，1有效，2待生效
     *
     * @return IS_EFFECTIVE - 是否有效：0无效，1有效，2待生效
     */
    public Byte getIsEffective() {
        return isEffective;
    }

    /**
     * 设置是否有效：0无效，1有效，2待生效
     *
     * @param isEffective 是否有效：0无效，1有效，2待生效
     */
    public void setIsEffective(Byte isEffective) {
        this.isEffective = isEffective;
    }

    /**
     * 获取经度
     *
     * @return LONGITUDE - 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return LATITUDE - 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
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
     * 获取酒店房间
     *
     * @return HOTEL_ROOM_NAME - 酒店房间
     */
    public String getHotelRoomName() {
        return hotelRoomName;
    }

    /**
     * 设置酒店房间
     *
     * @param hotelRoomName 酒店房间
     */
    public void setHotelRoomName(String hotelRoomName) {
        this.hotelRoomName = hotelRoomName;
    }

    /**
     * 获取地址，各种类型共用一个
     *
     * @return ADDRESS - 地址，各种类型共用一个
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址，各种类型共用一个
     *
     * @param address 地址，各种类型共用一个
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取其它类型场地名称
     *
     * @return UNIT_NAME - 其它类型场地名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置其它类型场地名称
     *
     * @param unitName 其它类型场地名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * 获取设备编号
     *
     * @return DEVICE_ID - 设备编号
     */
    public Long getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备编号
     *
     * @param deviceId 设备编号
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备码
     *
     * @return DEVICE_UNIQUE - 设备码
     */
    public String getDeviceUnique() {
        return deviceUnique;
    }

    /**
     * 设置设备码
     *
     * @param deviceUnique 设备码
     */
    public void setDeviceUnique(String deviceUnique) {
        this.deviceUnique = deviceUnique;
    }
}
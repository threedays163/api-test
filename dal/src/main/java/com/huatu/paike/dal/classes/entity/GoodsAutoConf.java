package com.huatu.paike.dal.classes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "GOODS_AUTO_CONF")
public class GoodsAutoConf {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_NO")
    private String goodsNo;

    /**
     * 是否开启循环建班，0:关闭；1:开启
     */
    @Column(name = "IS_CONTINUE_CREATE")
    private Byte isContinueCreate;

    /**
     * 是否自动建班，0:手动；1:自动
     */
    @Column(name = "IS_AUTO_BUILD")
    private Byte isAutoBuild;

    /**
     * 是否激活，0：不激活；1：激活
     */
    @Column(name = "ACTIVE")
    private Byte active;

    /**
     * 班级最大人数
     */
    @Column(name = "MAX_NUM")
    private Integer maxNum;

    /**
     * 最低开班人数
     */
    @Column(name = "MIN_NUM")
    private Integer minNum;

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
     * 获取商品编号
     *
     * @return GOODS_NO - 商品编号
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * 设置商品编号
     *
     * @param goodsNo 商品编号
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * 获取是否开启循环建班，0:关闭；1:开启
     *
     * @return IS_CONTINUE_CREATE - 是否开启循环建班，0:关闭；1:开启
     */
    public Byte getIsContinueCreate() {
        return isContinueCreate;
    }

    /**
     * 设置是否开启循环建班，0:关闭；1:开启
     *
     * @param isContinueCreate 是否开启循环建班，0:关闭；1:开启
     */
    public void setIsContinueCreate(Byte isContinueCreate) {
        this.isContinueCreate = isContinueCreate;
    }

    /**
     * 获取是否自动建班，0:手动；1:自动
     *
     * @return IS_AUTO_BUILD - 是否自动建班，0:手动；1:自动
     */
    public Byte getIsAutoBuild() {
        return isAutoBuild;
    }

    /**
     * 设置是否自动建班，0:手动；1:自动
     *
     * @param isAutoBuild 是否自动建班，0:手动；1:自动
     */
    public void setIsAutoBuild(Byte isAutoBuild) {
        this.isAutoBuild = isAutoBuild;
    }

    /**
     * 获取是否激活，0：不激活；1：激活
     *
     * @return ACTIVE - 是否激活，0：不激活；1：激活
     */
    public Byte getActive() {
        return active;
    }

    /**
     * 设置是否激活，0：不激活；1：激活
     *
     * @param active 是否激活，0：不激活；1：激活
     */
    public void setActive(Byte active) {
        this.active = active;
    }

    /**
     * 获取班级最大人数
     *
     * @return MAX_NUM - 班级最大人数
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    /**
     * 设置班级最大人数
     *
     * @param maxNum 班级最大人数
     */
    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 获取最低开班人数
     *
     * @return MIN_NUM - 最低开班人数
     */
    public Integer getMinNum() {
        return minNum;
    }

    /**
     * 设置最低开班人数
     *
     * @param minNum 最低开班人数
     */
    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
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
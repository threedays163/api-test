package com.huatu.paike.dal.classes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "GOODS_AUTO_CLASS")
public class GoodsAutoClass {
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
     * 班级ID
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 自动建班顺序
     */
    @Column(name = "NUM")
    private Integer num;

    /**
     * 班级人数是否已满：0，未满，可以继续进班；1，已满，不可以继续进班
     */
    @Column(name = "IS_FULL")
    private Boolean isFull;

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
     * 获取班级ID
     *
     * @return CLASS_ID - 班级ID
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级ID
     *
     * @param classId 班级ID
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取自动建班顺序
     *
     * @return NUM - 自动建班顺序
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置自动建班顺序
     *
     * @param num 自动建班顺序
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取班级人数是否已满：0，未满，可以继续进班；1，已满，不可以继续进班
     *
     * @return IS_FULL - 班级人数是否已满：0，未满，可以继续进班；1，已满，不可以继续进班
     */
    public Boolean getIsFull() {
        return isFull;
    }

    /**
     * 设置班级人数是否已满：0，未满，可以继续进班；1，已满，不可以继续进班
     *
     * @param isFull 班级人数是否已满：0，未满，可以继续进班；1，已满，不可以继续进班
     */
    public void setIsFull(Boolean isFull) {
        this.isFull = isFull;
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
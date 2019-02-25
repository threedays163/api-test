package com.huatu.paike.dal.classes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "CLASS_GOOD_RECORD")
public class ClassGoodRecord {
    /**
     * 主键,自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级ID
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 班级编号
     */
    @Column(name = "CLASS_NO")
    private String classNo;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_NO")
    private String goodsNo;

    /**
     * 操作类型 1:关联; 2:取消关联
     */
    @Column(name = "OPERATE_TYPE")
    private Byte operateType;

    /**
     * 操作人ID
     */
    @Column(name = "OPERATOR_ID")
    private Long operatorId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取主键,自增
     *
     * @return ID - 主键,自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键,自增
     *
     * @param id 主键,自增
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取班级编号
     *
     * @return CLASS_NO - 班级编号
     */
    public String getClassNo() {
        return classNo;
    }

    /**
     * 设置班级编号
     *
     * @param classNo 班级编号
     */
    public void setClassNo(String classNo) {
        this.classNo = classNo;
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
     * 获取操作类型 1:关联; 2:取消关联
     *
     * @return OPERATE_TYPE - 操作类型 1:关联; 2:取消关联
     */
    public Byte getOperateType() {
        return operateType;
    }

    /**
     * 设置操作类型 1:关联; 2:取消关联
     *
     * @param operateType 操作类型 1:关联; 2:取消关联
     */
    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }

    /**
     * 获取操作人ID
     *
     * @return OPERATOR_ID - 操作人ID
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作人ID
     *
     * @param operatorId 操作人ID
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
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
}
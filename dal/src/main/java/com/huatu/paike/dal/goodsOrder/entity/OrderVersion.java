package com.huatu.paike.dal.goodsOrder.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "order_version")
public class OrderVersion {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 订单系统订单商品关联表ID
     */
    @Column(name = "ORDER_GOODS_ID")
    private Long orderGoodsId;

    /**
     * 内容信息
     */
    @Column(name = "JSON")
    private String json;

    /**
     * 版本号
     */
    @Column(name = "SEQ_NUM")
    private Integer seqNum;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 来源
     */
    @Column(name = "SOURCE")
    private String source;

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
     * 获取订单编号
     *
     * @return ORDER_NO - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取订单系统订单商品关联表ID
     *
     * @return ORDER_GOODS_ID - 订单系统订单商品关联表ID
     */
    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    /**
     * 设置订单系统订单商品关联表ID
     *
     * @param orderGoodsId 订单系统订单商品关联表ID
     */
    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    /**
     * 获取内容信息
     *
     * @return JSON - 内容信息
     */
    public String getJson() {
        return json;
    }

    /**
     * 设置内容信息
     *
     * @param json 内容信息
     */
    public void setJson(String json) {
        this.json = json;
    }

    /**
     * 获取版本号
     *
     * @return SEQ_NUM - 版本号
     */
    public Integer getSeqNum() {
        return seqNum;
    }

    /**
     * 设置版本号
     *
     * @param seqNum 版本号
     */
    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
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
     * 获取来源
     *
     * @return SOURCE - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }
}
package com.huatu.paike.dal.goodsOrder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "order_msg")
public class OrderMsg {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * topic
     */
    @Column(name = "TOPIC")
    private String topic;

    /**
     * 内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * key
     */
    @Column(name = "MSG_KEY")
    private String msgKey;

    /**
     * 是否处理,1:已处理;0:未处理,默认0
     */
    @Column(name = "HAS_DEAL")
    private Boolean hasDeal;

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
}
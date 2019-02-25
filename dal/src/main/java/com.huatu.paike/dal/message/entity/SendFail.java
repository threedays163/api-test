package com.huatu.paike.dal.message.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "send_fail")
public class SendFail {
    /**
     * 主键,自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 1:发送消息;2:接收接收
     */
    @Column(name = "TYPE")
    private Byte type;

    /**
     * 发送或接收类名(全路径)
     */
    @Column(name = "MODUAL_CLASS")
    private String modualClass;

    /**
     * TOPIC
     */
    @Column(name = "TOPIC")
    private String topic;

    /**
     * 消息key
     */
    @Column(name = "`KEY`")
    private String key;

    /**
     * 发送模块
     */
    @Column(name = "MODULE")
    private Byte module;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 发送状态:默认是0:失败,成功后将状态改为1:成功状态
     */
    @Column(name = "`STATUS`")
    private Boolean status;

    /**
     * 发送成功时间
     */
    @Column(name = "SUCCESS_TIME")
    private Date successTime;

    /**
     * 消息value,json
     */
    @Column(name = "MESSAGE")
    private String message;

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
     * 获取1:发送消息;2:接收接收
     *
     * @return TYPE - 1:发送消息;2:接收接收
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1:发送消息;2:接收接收
     *
     * @param type 1:发送消息;2:接收接收
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取发送或接收类名(全路径)
     *
     * @return MODUAL_CLASS - 发送或接收类名(全路径)
     */
    public String getModualClass() {
        return modualClass;
    }

    /**
     * 设置发送或接收类名(全路径)
     *
     * @param modualClass 发送或接收类名(全路径)
     */
    public void setModualClass(String modualClass) {
        this.modualClass = modualClass;
    }

    /**
     * 获取TOPIC
     *
     * @return TOPIC - TOPIC
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置TOPIC
     *
     * @param topic TOPIC
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * 获取消息key
     *
     * @return KEY - 消息key
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置消息key
     *
     * @param key 消息key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取发送模块
     *
     * @return MODULE - 发送模块
     */
    public Byte getModule() {
        return module;
    }

    /**
     * 设置发送模块
     *
     * @param module 发送模块
     */
    public void setModule(Byte module) {
        this.module = module;
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
     * 获取发送状态:默认是0:失败,成功后将状态改为1:成功状态
     *
     * @return STATUS - 发送状态:默认是0:失败,成功后将状态改为1:成功状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置发送状态:默认是0:失败,成功后将状态改为1:成功状态
     *
     * @param status 发送状态:默认是0:失败,成功后将状态改为1:成功状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取发送成功时间
     *
     * @return SUCCESS_TIME - 发送成功时间
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置发送成功时间
     *
     * @param successTime 发送成功时间
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取消息value,json
     *
     * @return MESSAGE - 消息value,json
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置消息value,json
     *
     * @param message 消息value,json
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
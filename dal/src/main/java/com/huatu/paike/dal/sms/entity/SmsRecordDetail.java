package com.huatu.paike.dal.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "sms_record_detail")
public class SmsRecordDetail {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 单发送记录id
     */
    @Column(name = "RECORD_ID")
    private Long recordId;

    /**
     * 模版id
     */
    @Column(name = "TEMPLATE_ID")
    private Long templateId;

    /**
     * 接收人类型：0，学员；1，老师；2，其他
     */
    @Column(name = "RECIEVER_TYPE")
    private Byte recieverType;

    /**
     * 接收人id
     */
    @Column(name = "RECIEVER_ID")
    private Long recieverId;

    /**
     * 接受人工号
     */
    @Column(name = "RECIEVER_NO")
    private String recieverNo;

    /**
     * 手机号
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 短信内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 模版备注
     */
    @Column(name = "REMARK")
    private String remark;

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
     * 短信查看状态:0,未查看；1，已查看
     */
    @Column(name = "VIEW_STATUS")
    private Byte viewStatus;

}
package com.huatu.paike.dal.reward.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "reward_feed_back")
public class RewardFeedBack {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 反馈id
     */
    @Column(name = "FEED_BACK_ID")
    private Long feedBackId;

    /**
     * 课酬结算状态：0,未结算；1，已结算
     */
    @Column(name = "REWARD_STATUS")
    private Byte rewardStatus;

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
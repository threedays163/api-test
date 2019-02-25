package com.huatu.paike.dal.feedback.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "feedback_procedure")
public class FeedbackProcedure {
    /**
     * 主键,自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 反馈ID
     */
    @Column(name = "FEEDBACK_ID")
    private Long feedbackId;

    /**
     * 反馈编号
     */
    @Column(name = "FEEDBACK_NO")
    private String feedbackNo;

    /**
     * 课酬结算是否成功;1:成功;2:不成功
     */
    @Column(name = "REWARD_FINISH")
    private Byte rewardFinish;

    /**
     * 推送到师资是否完成,1:成功;0:不成功
     */
    @Column(name = "PUSH_TO_SHIZI_FINISH")
    private Byte pushToShiziFinish;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 最后一次课酬结算时间
     */
    @Column(name = "REWARD_TIME")
    private Date rewardTime;

    /**
     * 最后一次推送时间
     */
    @Column(name = "PUSH_TIME")
    private Date pushTime;

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
     * 获取反馈ID
     *
     * @return FEEDBACK_ID - 反馈ID
     */
    public Long getFeedbackId() {
        return feedbackId;
    }

    /**
     * 设置反馈ID
     *
     * @param feedbackId 反馈ID
     */
    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * 获取反馈编号
     *
     * @return FEEDBACK_NO - 反馈编号
     */
    public String getFeedbackNo() {
        return feedbackNo;
    }

    /**
     * 设置反馈编号
     *
     * @param feedbackNo 反馈编号
     */
    public void setFeedbackNo(String feedbackNo) {
        this.feedbackNo = feedbackNo;
    }

    /**
     * 获取课酬结算是否成功;1:成功;2:不成功
     *
     * @return REWARD_FINISH - 课酬结算是否成功;1:成功;2:不成功
     */
    public Byte getRewardFinish() {
        return rewardFinish;
    }

    /**
     * 设置课酬结算是否成功;1:成功;2:不成功
     *
     * @param rewardFinish 课酬结算是否成功;1:成功;2:不成功
     */
    public void setRewardFinish(Byte rewardFinish) {
        this.rewardFinish = rewardFinish;
    }

    /**
     * 获取推送到师资是否完成,1:成功;0:不成功
     *
     * @return PUSH_TO_SHIZI_FINISH - 推送到师资是否完成,1:成功;0:不成功
     */
    public Byte getPushToShiziFinish() {
        return pushToShiziFinish;
    }

    /**
     * 设置推送到师资是否完成,1:成功;0:不成功
     *
     * @param pushToShiziFinish 推送到师资是否完成,1:成功;0:不成功
     */
    public void setPushToShiziFinish(Byte pushToShiziFinish) {
        this.pushToShiziFinish = pushToShiziFinish;
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
     * 获取最后一次课酬结算时间
     *
     * @return REWARD_TIME - 最后一次课酬结算时间
     */
    public Date getRewardTime() {
        return rewardTime;
    }

    /**
     * 设置最后一次课酬结算时间
     *
     * @param rewardTime 最后一次课酬结算时间
     */
    public void setRewardTime(Date rewardTime) {
        this.rewardTime = rewardTime;
    }

    /**
     * 获取最后一次推送时间
     *
     * @return PUSH_TIME - 最后一次推送时间
     */
    public Date getPushTime() {
        return pushTime;
    }

    /**
     * 设置最后一次推送时间
     *
     * @param pushTime 最后一次推送时间
     */
    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }
}
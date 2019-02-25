package com.huatu.paike.dal.reward.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "reward_necessary_hour")
public class RewardNecessaryHour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 老师工号
     */
    @Column(name = "teacher_staff_no")
    private String teacherStaffNo;

    /**
     * 年
     */
    private Integer year;

    /**
     * 月:(包断类型为年包断时，月份为0)
     */
    private Integer month;

    /**
     * 包断量（分钟）
     */
    private Integer necessary;

    /**
     * 剩余包断量（分钟）
     */
    @Column(name = "necessary_else")
    private Integer necessaryElse;

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
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取老师工号
     *
     * @return teacher_staff_no - 老师工号
     */
    public String getTeacherStaffNo() {
        return teacherStaffNo;
    }

    /**
     * 设置老师工号
     *
     * @param teacherStaffNo 老师工号
     */
    public void setTeacherStaffNo(String teacherStaffNo) {
        this.teacherStaffNo = teacherStaffNo;
    }

    /**
     * 获取年
     *
     * @return year - 年
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置年
     *
     * @param year 年
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取月:(包断类型为年包断时，月份为0)
     *
     * @return month - 月:(包断类型为年包断时，月份为0)
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 设置月:(包断类型为年包断时，月份为0)
     *
     * @param month 月:(包断类型为年包断时，月份为0)
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * 获取包断量（分钟）
     *
     * @return necessary - 包断量（分钟）
     */
    public Integer getNecessary() {
        return necessary;
    }

    /**
     * 设置包断量（分钟）
     *
     * @param necessary 包断量（分钟）
     */
    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
    }

    /**
     * 获取剩余包断量（分钟）
     *
     * @return necessary_else - 剩余包断量（分钟）
     */
    public Integer getNecessaryElse() {
        return necessaryElse;
    }

    /**
     * 设置剩余包断量（分钟）
     *
     * @param necessaryElse 剩余包断量（分钟）
     */
    public void setNecessaryElse(Integer necessaryElse) {
        this.necessaryElse = necessaryElse;
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
}
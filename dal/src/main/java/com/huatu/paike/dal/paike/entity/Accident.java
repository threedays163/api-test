package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "accident")
public class Accident {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * csst表ID
     */
    @Column(name = "CSST_ID")
    private Long csstId;

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
     * 教学事故老师NO
     */
    @Column(name = "TEACHER_NO")
    private String teacherNo;

    /**
     * 教学事故描述
     */
    @Column(name = "ACCIDENT_DESC")
    private String accidentDesc;

    /**
     * 排课方式; 0:重排未上课节;1:全部重排
     */
    @Column(name = "ARRANGE_TYPE")
    private Byte arrangeType;

    /**
     * 获取自增主键
     *
     * @return ID - 自增主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取csst表ID
     *
     * @return CSST_ID - csst表ID
     */
    public Long getCsstId() {
        return csstId;
    }

    /**
     * 设置csst表ID
     *
     * @param csstId csst表ID
     */
    public void setCsstId(Long csstId) {
        this.csstId = csstId;
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

    /**
     * 获取教学事故老师NO
     *
     * @return TEACHER_NO - 教学事故老师NO
     */
    public String getTeacherNo() {
        return teacherNo;
    }

    /**
     * 设置教学事故老师NO
     *
     * @param teacherNo 教学事故老师NO
     */
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    /**
     * 获取教学事故描述
     *
     * @return ACCIDENT_DESC - 教学事故描述
     */
    public String getAccidentDesc() {
        return accidentDesc;
    }

    /**
     * 设置教学事故描述
     *
     * @param accidentDesc 教学事故描述
     */
    public void setAccidentDesc(String accidentDesc) {
        this.accidentDesc = accidentDesc;
    }

    /**
     * 获取排课方式; 0:重排未上课节;1:全部重排
     *
     * @return ARRANGE_TYPE - 排课方式; 0:重排未上课节;1:全部重排
     */
    public Byte getArrangeType() {
        return arrangeType;
    }

    /**
     * 设置排课方式; 0:重排未上课节;1:全部重排
     *
     * @param arrangeType 排课方式; 0:重排未上课节;1:全部重排
     */
    public void setArrangeType(Byte arrangeType) {
        this.arrangeType = arrangeType;
    }
}
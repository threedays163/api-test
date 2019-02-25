package com.huatu.paike.dal.teacher.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "transfer_apply")
public class TransferApply {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 审批单号
     */
    @Column(name = "APPLY_ID")
    private String applyId;

    /**
     * 被借调的科目ID
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 被借调老师的工号
     */
    @Column(name = "STAFF_NO")
    private String staffNo;

    /**
     * 借调开始日期
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 借调结束日期
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 申请借调的分校/师资单元
     */
    @Column(name = "TEACHER_UNIT_ID")
    private Long teacherUnitId;

    /**
     * 申请借调的员工工号
     */
    @Column(name = "OPERATOR_STAFF_NO")
    private String operatorStaffNo;

    /**
     * 借调申请的审批状态 5-待审批, 3-通过, 4-不通过
     */
    @Column(name = "STATUS")
    private Integer status;

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
     * 逻辑删除标识: 0未删除, 1已删除
     */
    @Column(name = "IS_DEL")
    private Boolean isDel;

    /**
     * 班号
     */
    @Column(name = "CLASS_NO")
    private String classNo;

    /**
     * 场地ID
     */
    @Column(name = "PLACE_ID")
    private Long placeId;

    /**
     * 授课方式
     */
    @Column(name = "TEACH_WAY")
    private Integer teachWay;

    /**
     * 是否主讲老师
     */
    @Column(name = "IS_MAIN")
    private Integer isMain;
 
    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * @return ID
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
     * 获取审批单号
     *
     * @return APPLY_ID - 审批单号
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 设置审批单号
     *
     * @param applyId 审批单号
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取被借调的科目ID
     *
     * @return SUBJECT_ID - 被借调的科目ID
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 设置被借调的科目ID
     *
     * @param subjectId 被借调的科目ID
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取被借调老师的工号
     *
     * @return STAFF_NO - 被借调老师的工号
     */
    public String getStaffNo() {
        return staffNo;
    }

    /**
     * 设置被借调老师的工号
     *
     * @param staffNo 被借调老师的工号
     */
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    /**
     * 获取借调开始日期
     *
     * @return START_DATE - 借调开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置借调开始日期
     *
     * @param startDate 借调开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取借调结束日期
     *
     * @return END_DATE - 借调结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置借调结束日期
     *
     * @param endDate 借调结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取申请借调的分校/师资单元
     *
     * @return TEACHER_UNIT_ID - 申请借调的分校/师资单元
     */
    public Long getTeacherUnitId() {
        return teacherUnitId;
    }

    /**
     * 设置申请借调的分校/师资单元
     *
     * @param teacherUnitId 申请借调的分校/师资单元
     */
    public void setTeacherUnitId(Long teacherUnitId) {
        this.teacherUnitId = teacherUnitId;
    }

    /**
     * 获取申请借调的员工工号
     *
     * @return OPERATOR_STAFF_NO - 申请借调的员工工号
     */
    public String getOperatorStaffNo() {
        return operatorStaffNo;
    }

    /**
     * 设置申请借调的员工工号
     *
     * @param operatorStaffNo 申请借调的员工工号
     */
    public void setOperatorStaffNo(String operatorStaffNo) {
        this.operatorStaffNo = operatorStaffNo;
    }

    /**
     * 获取借调申请的审批状态 0-待审批, 1-通过, 2-不通过
     *
     * @return STATUS - 借调申请的审批状态 0-待审批, 1-通过, 2-不通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置借调申请的审批状态 0-待审批, 1-通过, 2-不通过
     *
     * @param status 借调申请的审批状态 0-待审批, 1-通过, 2-不通过
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取逻辑删除标识: 0未删除, 1已删除
     *
     * @return IS_DEL - 逻辑删除标识: 0未删除, 1已删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置逻辑删除标识: 0未删除, 1已删除
     *
     * @param isDel 逻辑删除标识: 0未删除, 1已删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 获得班号
     * 
     * @return CLASS_NO - 班号
     */
    public String getClassNo() {
        return classNo;
    }

    /**
     * 设置班号
     * 
     * @param classNo 班号
     */
    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    /**
     * 获得场地ID
     * 
     * @return 场地ID
     */
    public Long getPlaceId() {
        return placeId;
    }

    /**
     * 设置场地ID
     * 
     * @param placeId 场地ID
     */
    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    /**
     * 获得备注
     * 
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     * 
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the isMain
     */
    public Integer getIsMain() {
        return isMain;
    }

    /**
     * @param isMain the isMain to set
     */
    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

	public Integer getTeachWay() {
		return teachWay;
	}

	public void setTeachWay(Integer teachWay) {
		this.teachWay = teachWay;
	}

}
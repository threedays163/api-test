package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "CLASS_TEACHER")
public class ClassTeacher {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级id
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 老师工号
     */
    @Column(name = "TEACHER_STAFF_NO")
    private String teacherStaffNo;

    /**
     * 1，主讲；2，助教
     */
    @Column(name = "TEACHER_TYPE")
    private Byte teacherType;

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
     * 获取自增ID
     *
     * @return ID - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取班级id
     *
     * @return CLASS_ID - 班级id
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级id
     *
     * @param classId 班级id
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取老师工号
     *
     * @return TEACHER_STAFF_NO - 老师工号
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
     * 获取1，主讲；2，助教
     *
     * @return TEACHER_TYPE - 1，主讲；2，助教
     */
    public Byte getTeacherType() {
        return teacherType;
    }

    /**
     * 设置1，主讲；2，助教
     *
     * @param teacherType 1，主讲；2，助教
     */
    public void setTeacherType(Byte teacherType) {
        this.teacherType = teacherType;
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
     * 获取创建人id
     *
     * @return CREATOR_ID - 创建人id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人id
     *
     * @param creatorId 创建人id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}
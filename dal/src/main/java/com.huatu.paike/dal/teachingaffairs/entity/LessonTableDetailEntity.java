package com.huatu.paike.dal.teachingaffairs.entity;
import java.io.Serializable;
import java.util.Date;

import java.util.Date;
import javax.persistence.*;

/**
 * 
 * 双师课次管理实体
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月14日 Created
 *
 * </pre>
 * @since 1.
 */
@Table(name = "lesson_table_detail")
public class LessonTableDetailEntity implements Serializable {
    private static final long serialVersionUID = 3535266161724888L;

    /**ID*/
    @Column(name = "ID") 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**创建人*/
    @Column(name = "CREATOR_ID") 
    private Long creatorId;
    /**创建时间*/
    @Column(name = "CREATE_TIME") 
    private Date createTime;
    /**修改时间*/
    @Column(name = "UPDATE_TIME") 
    private Date updateTime;
    /**修改人*/
    @Column(name = "UPDATOR_ID") 
    private Long updatorId;
    /**是否删除（1-是，0-否）*/
    @Column(name = "IS_DEL") 
    private Integer isDel;
    /**课次ID*/
    @Column(name = "TIME_TABLE_ID") 
    private Long timeTableId;
    /**日期*/
    @Column(name = "LESSON_DATE") 
    private Date lessonDate;
    /**主讲端id*/
    @Column(name = "TEACHER_DEVICE_ID") 
    private Long teacherDeviceId;
    /**主讲老师编码*/
    @Column(name = "TEACHER_NO") 
    private String teacherNo;
    /**主讲老师名称*/
    @Column(name = "TEACHER_NAME") 
    private String teacherName;
    /**时长*/
    @Column(name = "DURATION") 
    private Integer duration;
    /**是否是借调老师（0-否，1-是）*/
    @Column(name = "IS_LOCAL")
    private Integer isLocal;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdatorId() {
        return updatorId;
    }
    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    public Integer getIsDel() {
        return isDel;
    }
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Long getTimeTableId() {
        return timeTableId;
    }
    public void setTimeTableId(Long timeTableId) {
        this.timeTableId = timeTableId;
    }

    public Date getLessonDate() {
        return lessonDate;
    }
    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Long getTeacherDeviceId() {
        return teacherDeviceId;
    }
    public void setTeacherDeviceId(Long teacherDeviceId) {
        this.teacherDeviceId = teacherDeviceId;
    }

    public String getTeacherNo() {
        return teacherNo;
    }
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getIsLocal() {
        return isLocal;
    }
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }


}
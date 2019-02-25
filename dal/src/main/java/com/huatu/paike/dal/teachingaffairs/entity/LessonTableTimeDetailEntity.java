package com.huatu.paike.dal.teachingaffairs.entity;
import java.io.Serializable;
import java.util.Date;


import java.util.Date;
import javax.persistence.*;

/**
 * 
 * 双师课次时间段管理实体
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月14日 Created
 *
 * </pre>
 * @since 1.
 */
@Table(name = "lesson_table_time_detail")
public class LessonTableTimeDetailEntity implements Serializable {
    private static final long serialVersionUID = 378941976977254L;

    /**ID*/
    @Column(name = "ID") 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**创建人ID*/
    @Column(name = "CREATOR_ID") 
    private Long creatorId;
    /**创建时间*/
    @Column(name = "CREATE_TIME") 
    private Date createTime;
    /**更新时间*/
    @Column(name = "UPDATE_TIME") 
    private Date updateTime;
    /**更新人id*/
    @Column(name = "UPDATOR_ID") 
    private Long updatorId;
    /**是否删除（1-是，0-否）*/
    @Column(name = "IS_DEL") 
    private Integer isDel;
    /**上课日期*/
    @Column(name = "LESSON_DATE") 
    private Date lessonDate;
    /**开始时间*/
    @Column(name = "START_TIME") 
    private Date startTime;
    /**结束时间*/
    @Column(name = "END_TIME") 
    private Date endTime;
    /**课次子表id*/
    @Column(name = "LESSON_DETAIL_ID") 
    private Long lessonDetailId;
    /**时长*/
    @Column(name = "DURATION") 
    private Integer duration;

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

    public Date getLessonDate() {
        return lessonDate;
    }
    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getLessonDetailId() {
        return lessonDetailId;
    }
    public void setLessonDetailId(Long lessonDetailId) {
        this.lessonDetailId = lessonDetailId;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }


}
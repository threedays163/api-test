package com.huatu.paike.dal.teachingaffairs.entity;
import java.io.Serializable;
import java.util.Date;


import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 * 
 * 班级阶段科目实体
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月12日 Created
 *
 * </pre>
 * @since 1.
 */
@Table(name = "lesson_table_template_detail")
public class LessonTableTemplateDetailEntity implements Serializable {
    private static final long serialVersionUID = 6535599916562217L;

    /**ID*/
    @Column(name = "ID") 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
    /**模版ID*/
    @Column(name = "TEMPLATE_ID") 
    private Long templateId;
    /**天*/
    @Column(name = "DAY_SEQ") 
    private Integer daySeq;
    /**开始时间*/
    @Column(name = "START_TIME") 
    private String startTime;
    /**结束时间*/
    @Column(name = "END_TIME") 
    private String endTime;
    /**知识点*/
    @Column(name = "KNOWLEDGE") 
    private String knowledge;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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

    public Long getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Integer getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Integer daySeq) {
        this.daySeq = daySeq;
    }

    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getKnowledge() {
        return knowledge;
    }
    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonTableTemplateDetailEntity that = (LessonTableTemplateDetailEntity) o;
        return Objects.equals(daySeq, that.daySeq) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(knowledge, that.knowledge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daySeq, startTime, endTime, knowledge);
    }
}
package com.huatu.paike.dal.teachingaffairs.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


import java.util.Date;
import javax.persistence.*;

/**
 * 
 * 课表模版entity
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月09日 Created
 *
 * </pre>
 * @since 1.
 */
@Table(name = "lesson_table_template")
public class LessonTableTemplateEntity implements Serializable {
    private static final long serialVersionUID = 8637304689863365L;

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
    /**更新时间*/
    @Column(name = "UPDATE_TIME") 
    private Date updateTime;
    /**更新人ID*/
    @Column(name = "UPDATOR_ID") 
    private Long updatorId;
    /**是否删除（1-是，0-否）*/
    @Column(name = "IS_DEL")
    private Integer isDel;
    /**模版编码*/
    @Column(name = "TEMPLATE_NO") 
    private String templateNo;
    /**模版名称*/
    @Column(name = "TEMPLATE_NAME") 
    private String templateName;
    /**产品ID*/
    @Column(name = "PRODUCT_ID") 
    private Long productId;
    /**阶段ID*/
    @Column(name = "STAGE_ID") 
    private Long stageId;
    /**科目ID*/
    @Column(name = "SUBJECT_ID") 
    private Long subjectId;
    /**天数*/
    @Column(name = "DAY_DURATION") 
    private BigDecimal dayDuration;
    /**晚数*/
    @Column(name = "NIGHT_DURATION") 
    private BigDecimal nightDuration;
    /**时长*/
    @Column(name = "DURATION")
    private Integer duration;
    /**组织架构id*/
    @Column(name = "NODE_ID")
    private Long nodeId;

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

    public String getTemplateNo() {
        return templateNo;
    }
    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo;
    }

    public String getTemplateName() {
        return templateName;
    }
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStageId() {
        return stageId;
    }
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public Long getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public BigDecimal getDayDuration() {
        return dayDuration;
    }
    public void setDayDuration(BigDecimal dayDuration) {
        this.dayDuration = dayDuration;
    }

    public BigDecimal getNightDuration() {
        return nightDuration;
    }
    public void setNightDuration(BigDecimal nightDuration) {
        this.nightDuration = nightDuration;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Long getNodeId() {
        return nodeId;
    }
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }


}
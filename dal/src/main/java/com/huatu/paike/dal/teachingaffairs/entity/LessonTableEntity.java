package com.huatu.paike.dal.teachingaffairs.entity;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "lesson_table")
public class LessonTableEntity implements Serializable {
    private static final long serialVersionUID = 8128507977356155L;

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
    /**产品ID*/
    @Column(name = "PRODUCT_ID") 
    private Long productId;
    /**阶段ID*/
    @Column(name = "STAGE_ID") 
    private Long stageId;
    /**课次编码*/
    @Column(name = "LESSON_TABLE_NO")
    private String lessonTableNo;
    /**科目ID*/
    @Column(name = "SUBJECT_ID") 
    private Long subjectId;
    /**天数*/
    @Column(name = "DAY_DURATION") 
    private BigDecimal dayDuration;
    /**晚数*/
    @Column(name = "NIGHT_DURATION") 
    private BigDecimal nightDuration;
    /**课表模版ID*/
    @Column(name = "TEMPLATE_ID") 
    private Long templateId;
    /**关联状态(1-打开，0-关闭）*/
    @Column(name = "RELATE_STATUS") 
    private Integer relateStatus;
    /**上课开始时间*/
    @Column(name = "START_TIME") 
    private Date startTime;
    /**上课结束时间*/
    @Column(name = "END_TIME") 
    private Date endTime;
    /**是否包含工作日（1-是，0-否）*/
    @Column(name = "IS_INCLUDE_DAY") 
    private Integer isIncludeDay;
    /**是否包含周末（1-是，0-否）*/
    @Column(name = "IS_INCLUDE_WEEKEND")
    private Integer isIncludeWeekend;
    /**主讲老师编码*/
    @Column(name = "TEACHER_NO") 
    private String teacherNo;
    /**主讲端ID*/
    @Column(name = "TEACHER_DEVICE_ID") 
    private Long teacherDeviceId;
    /**时长*/
    @Column(name = "DURATION") 
    private Integer duration;
    /**虚拟教室ID(百家云虚拟教室)*/
    @Column(name = "CLOUD_ROOM_ID") 
    private String cloudRoomId;
    /**主讲老师名称*/
    @Column(name = "TEACHER_NAME") 
    private String teacherName;
    /**主讲参加码*/
    @Column(name = "TEACHER_JOIN_CODE") 
    private String teacherJoinCode;
    /**学生参加码*/
    @Column(name = "STUDENT_JOIN_CODE") 
    private String studentJoinCode;
    /**助教参加码*/
    @Column(name = "ASSISTANT_JOIN_CODE") 
    private String assistantJoinCode;
    /**组织架构ID*/
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

    public String getLessonTableNo() {
        return lessonTableNo;
    }
    public void setLessonTableNo(String lessonTableNo) {
        this.lessonTableNo = lessonTableNo;
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

    public Long getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Integer getRelateStatus() {
        return relateStatus;
    }
    public void setRelateStatus(Integer relateStatus) {
        this.relateStatus = relateStatus;
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

    public Integer getIsIncludeDay() {
        return isIncludeDay;
    }
    public void setIsIncludeDay(Integer isIncludeDay) {
        this.isIncludeDay = isIncludeDay;
    }

    public Integer getIsIncludeWeekend() {
        return isIncludeWeekend;
    }
    public void setIsIncludeWeekend(Integer isIncludeWeekend) {
        this.isIncludeWeekend = isIncludeWeekend;
    }

    public String getTeacherNo() {
        return teacherNo;
    }
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public Long getTeacherDeviceId() {
        return teacherDeviceId;
    }
    public void setTeacherDeviceId(Long teacherDeviceId) {
        this.teacherDeviceId = teacherDeviceId;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCloudRoomId() {
        return cloudRoomId;
    }
    public void setCloudRoomId(String cloudRoomId) {
        this.cloudRoomId = cloudRoomId;
    }

    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherJoinCode() {
        return teacherJoinCode;
    }
    public void setTeacherJoinCode(String teacherJoinCode) {
        this.teacherJoinCode = teacherJoinCode;
    }

    public String getStudentJoinCode() {
        return studentJoinCode;
    }
    public void setStudentJoinCode(String studentJoinCode) {
        this.studentJoinCode = studentJoinCode;
    }

    public String getAssistantJoinCode() {
        return assistantJoinCode;
    }
    public void setAssistantJoinCode(String assistantJoinCode) {
        this.assistantJoinCode = assistantJoinCode;
    }

    public Long getNodeId() {
        return nodeId;
    }
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }


}
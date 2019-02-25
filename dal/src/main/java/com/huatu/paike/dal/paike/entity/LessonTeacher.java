package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "lesson_teacher")
public class LessonTeacher {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 阶段id
     */
    @Column(name = "STAGE_ID")
    private Long stageId;

    /**
     * 科目id
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 批次数(默认从0开始)
     */
    @Column(name = "BATCH_NUM")
    private Integer batchNum;

    /**
     * 课节ID
     */
    @Column(name = "LESSON_ID")
    private Long lessonId;

    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 班级阶段科目老师表主键
     */
    @Column(name = "CSST_ID")
    private Long csstId;

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
     * 是否已反馈,1:反馈;0:未反馈
     */
    @Column(name = "IF_FEEDBACK")
    private Byte ifFeedback;

    /**
     * 是否推送课酬完成,1:完成;0:未完成
     */
    @Column(name = "IF_PUSH_REWARD")
    private Byte ifPushReward;

    /**
     * 是否是本地老师; 1:本地;2:借调
     */
    @Column(name = "IS_LOCAL")
    private Boolean isLocal;

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
     * @return CLASS_ID
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取阶段id
     *
     * @return STAGE_ID - 阶段id
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * 设置阶段id
     *
     * @param stageId 阶段id
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * 获取科目id
     *
     * @return SUBJECT_ID - 科目id
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 设置科目id
     *
     * @param subjectId 科目id
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取批次数(默认从0开始)
     *
     * @return BATCH_NUM - 批次数(默认从0开始)
     */
    public Integer getBatchNum() {
        return batchNum;
    }

    /**
     * 设置批次数(默认从0开始)
     *
     * @param batchNum 批次数(默认从0开始)
     */
    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    /**
     * 获取课节ID
     *
     * @return LESSON_ID - 课节ID
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * 设置课节ID
     *
     * @param lessonId 课节ID
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * @return NODE_ID
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * @param nodeId
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 获取班级阶段科目老师表主键
     *
     * @return CSST_ID - 班级阶段科目老师表主键
     */
    public Long getCsstId() {
        return csstId;
    }

    /**
     * 设置班级阶段科目老师表主键
     *
     * @param csstId 班级阶段科目老师表主键
     */
    public void setCsstId(Long csstId) {
        this.csstId = csstId;
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

    /**
     * 获取是否已反馈,1:反馈;0:未反馈
     *
     * @return IF_FEEDBACK - 是否已反馈,1:反馈;0:未反馈
     */
    public Byte getIfFeedback() {
        return ifFeedback;
    }

    /**
     * 设置是否已反馈,1:反馈;0:未反馈
     *
     * @param ifFeedback 是否已反馈,1:反馈;0:未反馈
     */
    public void setIfFeedback(Byte ifFeedback) {
        this.ifFeedback = ifFeedback;
    }

    /**
     * 获取是否推送课酬完成,1:完成;0:未完成
     *
     * @return IF_PUSH_REWARD - 是否推送课酬完成,1:完成;0:未完成
     */
    public Byte getIfPushReward() {
        return ifPushReward;
    }

    /**
     * 设置是否推送课酬完成,1:完成;0:未完成
     *
     * @param ifPushReward 是否推送课酬完成,1:完成;0:未完成
     */
    public void setIfPushReward(Byte ifPushReward) {
        this.ifPushReward = ifPushReward;
    }

    /**
     * 获取是否是本地老师; 1:本地;2:借调
     *
     * @return IS_LOCAL - 是否是本地老师; 1:本地;2:借调
     */
    public Boolean getIsLocal() {
        return isLocal;
    }

    /**
     * 设置是否是本地老师; 1:本地;2:借调
     *
     * @param isLocal 是否是本地老师; 1:本地;2:借调
     */
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }
}
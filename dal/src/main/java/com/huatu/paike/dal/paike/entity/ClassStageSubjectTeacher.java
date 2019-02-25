package com.huatu.paike.dal.paike.entity;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "class_stage_subject_teacher")
public class ClassStageSubjectTeacher {
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
     * 教室id
     */
    @Column(name = "ROOM_ID")
    private Long roomId;

    /**
     * 主讲老师no
     */
    @Column(name = "TEACHER_STAFF_NO")
    private String teacherStaffNo;

    @Column(name = "TEACHER_TYPE")
    private Byte teacherType;

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

    @Column(name = "NODE_ID")
    private Long nodeId;

    /**
     * 事故状态：0，没有事故；1，有事故
     */
    @Column(name = "ACCIDENT_STATUS")
    private Boolean accidentStatus;

    /**
     * 事故描述
     */
    @Column(name = "ACCIDENT_DESC")
    private String accidentDesc;

    /**
     * 教师评分明细(讲座用)
     */
    @Column(name = "SCORE_DETAIL")
    private String scoreDetail;

    /**
     * 分数（5分制，扩大100倍）
     */
    @Column(name = "SCORE")
    private Integer score;

    /**
     * 调查问卷数
     */
    @Column(name = "SURVEY_NUM")
    private Integer surveyNum;

    /**
     * 开始日期
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 排课的时长
     */
    @Column(name = "DURATION")
    private Integer duration;

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
     * 课表状态:3,待上课；4，上课中；5，待反馈；6，已反馈
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    @Column(name = "TEACH_WAY")
    private Byte teachWay;

    /**
     * 主讲端老师课表id
     */
    @Column(name = "LESSON_TABLE_ID")
    private Long lessonTableId;

    /**
     * 对应的主讲csstId
     */
    @Column(name = "MASTER_CSST_ID")
    private Long masterCsstId;

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
     * 获取教室id
     *
     * @return ROOM_ID - 教室id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置教室id
     *
     * @param roomId 教室id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取主讲老师no
     *
     * @return TEACHER_STAFF_NO - 主讲老师no
     */
    public String getTeacherStaffNo() {
        return teacherStaffNo;
    }

    /**
     * 设置主讲老师no
     *
     * @param teacherStaffNo 主讲老师no
     */
    public void setTeacherStaffNo(String teacherStaffNo) {
        this.teacherStaffNo = teacherStaffNo;
    }

    /**
     * @return TEACHER_TYPE
     */
    public Byte getTeacherType() {
        return teacherType;
    }

    /**
     * @param teacherType
     */
    public void setTeacherType(Byte teacherType) {
        this.teacherType = teacherType;
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
     * 获取事故状态：0，没有事故；1，有事故
     *
     * @return ACCIDENT_STATUS - 事故状态：0，没有事故；1，有事故
     */
    public Boolean getAccidentStatus() {
        return accidentStatus;
    }

    /**
     * 设置事故状态：0，没有事故；1，有事故
     *
     * @param accidentStatus 事故状态：0，没有事故；1，有事故
     */
    public void setAccidentStatus(Boolean accidentStatus) {
        this.accidentStatus = accidentStatus;
    }

    /**
     * 获取事故描述
     *
     * @return ACCIDENT_DESC - 事故描述
     */
    public String getAccidentDesc() {
        return accidentDesc;
    }

    /**
     * 设置事故描述
     *
     * @param accidentDesc 事故描述
     */
    public void setAccidentDesc(String accidentDesc) {
        this.accidentDesc = accidentDesc;
    }

    /**
     * 获取教师评分明细(讲座用)
     *
     * @return SCORE_DETAIL - 教师评分明细(讲座用)
     */
    public String getScoreDetail() {
        return scoreDetail;
    }

    /**
     * 设置教师评分明细(讲座用)
     *
     * @param scoreDetail 教师评分明细(讲座用)
     */
    public void setScoreDetail(String scoreDetail) {
        this.scoreDetail = scoreDetail;
    }

    /**
     * 获取分数（5分制，扩大100倍）
     *
     * @return SCORE - 分数（5分制，扩大100倍）
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置分数（5分制，扩大100倍）
     *
     * @param score 分数（5分制，扩大100倍）
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取调查问卷数
     *
     * @return SURVEY_NUM - 调查问卷数
     */
    public Integer getSurveyNum() {
        return surveyNum;
    }

    /**
     * 设置调查问卷数
     *
     * @param surveyNum 调查问卷数
     */
    public void setSurveyNum(Integer surveyNum) {
        this.surveyNum = surveyNum;
    }

    /**
     * 获取开始日期
     *
     * @return START_DATE - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return END_DATE - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取排课的时长
     *
     * @return DURATION - 排课的时长
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置排课的时长
     *
     * @param duration 排课的时长
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
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
     * 获取课表状态:3,待上课；4，上课中；5，待反馈；6，已反馈
     *
     * @return STATUS - 课表状态:3,待上课；4，上课中；5，待反馈；6，已反馈
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置课表状态:3,待上课；4，上课中；5，待反馈；6，已反馈
     *
     * @param status 课表状态:3,待上课；4，上课中；5，待反馈；6，已反馈
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     *
     * @return TEACH_WAY - 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    public Byte getTeachWay() {
        return teachWay;
    }

    /**
     * 设置授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     *
     * @param teachWay 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    public void setTeachWay(Byte teachWay) {
        this.teachWay = teachWay;
    }

    /**
     * 获取主讲端老师课表id
     *
     * @return LESSON_TABLE_ID - 主讲端老师课表id
     */
    public Long getLessonTableId() {
        return lessonTableId;
    }

    /**
     * 设置主讲端老师课表id
     *
     * @param lessonTableId 主讲端老师课表id
     */
    public void setLessonTableId(Long lessonTableId) {
        this.lessonTableId = lessonTableId;
    }

    /**
     * 获取对应的主讲csstId
     *
     * @return MASTER_CSST_ID - 对应的主讲csstId
     */
    public Long getMasterCsstId() {
        return masterCsstId;
    }

    /**
     * 设置对应的主讲csstId
     *
     * @param masterCsstId 对应的主讲csstId
     */
    public void setMasterCsstId(Long masterCsstId) {
        this.masterCsstId = masterCsstId;
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
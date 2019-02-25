package com.huatu.paike.dal.paike.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "class_stage_subject_knowledge_point")
public class ClassStageSubjectKnowledgePoint {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级ID
     */
    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 阶段ID
     */
    @Column(name = "STAGE_ID")
    private Long stageId;

    /**
     * 科目ID
     */
    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    /**
     * 知识点ID
     */
    @Column(name = "KNOWLEDGE_POINT_ID")
    private Long knowledgePointId;

    /**
     * 创建人ID
     */
    @Column(name = "CREATOR_ID")
    private Long creatorId;

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
     * 是否删除(Y-是，N-否)
     */
    @Column(name = "IS_DELETE")
    private String isDelete;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取班级ID
     *
     * @return CLASS_ID - 班级ID
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 设置班级ID
     *
     * @param classId 班级ID
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取阶段ID
     *
     * @return STAGE_ID - 阶段ID
     */
    public Long getStageId() {
        return stageId;
    }

    /**
     * 设置阶段ID
     *
     * @param stageId 阶段ID
     */
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * 获取科目ID
     *
     * @return SUBJECT_ID - 科目ID
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 设置科目ID
     *
     * @param subjectId 科目ID
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取知识点ID
     *
     * @return KNOWLEDGE_POINT_ID - 知识点ID
     */
    public Long getKnowledgePointId() {
        return knowledgePointId;
    }

    /**
     * 设置知识点ID
     *
     * @param knowledgePointId 知识点ID
     */
    public void setKnowledgePointId(Long knowledgePointId) {
        this.knowledgePointId = knowledgePointId;
    }

    /**
     * 获取创建人ID
     *
     * @return CREATOR_ID - 创建人ID
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人ID
     *
     * @param creatorId 创建人ID
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
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
     * 获取是否删除(Y-是，N-否)
     *
     * @return IS_DELETE - 是否删除(Y-是，N-否)
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(Y-是，N-否)
     *
     * @param isDelete 是否删除(Y-是，N-否)
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}
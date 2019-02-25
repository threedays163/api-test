package com.huatu.paike.dal.reward.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "reward_clear_record")
public class RewardClearRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 老师工号
     */
    @Column(name = "teacher_staff_no")
    private String teacherStaffNo;

    /**
     * 年
     */
    @Column(name = "year")
    private Integer year;

    /**
     * 月
     */
    @Column(name = "month")
    private Integer month;

    /**
     * 班级id
     */
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
     * 班级阶段科目老师id
     */
    @Column(name = "CSST_ID")
    private Long csstId;

    /**
     * 课节id
     */
    @Column(name = "lesson_id")
    private Long lessonId;

    /**
     * 课时数
     */
    @Column(name = "duration")
    private Integer duration;

    /**
     * 包断量消耗
     */
    @Column(name = "necessary_clear")
    private Integer necessaryClear;

    /**
     * 剩余课时数
     */
    @Column(name = "duration_else")
    private Integer durationElse;

    /**
     * 课酬
     */
    @Column(name = "reward")
    private Long reward;

    /**
     * 是否是主讲
     */
    private Integer teahcerType;

    /**
     * 上课日期
     */
    private Date lessonDate;

    /**
     * 包断类型：0，试岗期；1，月包断；2，年包断
     */
    @Column(name = "necessary_type")
    private Byte necessaryType;

    /**
     * 是否是助教
     */
    @Column(name = "is_lecture")
    private Boolean isLecture;

    /**
     * 笔面试类型
     */
    @Column(name = "exam_way")
    private String examWay;

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

    @Column(name = "BATCH_NUM")
    private Integer batchNum;
}
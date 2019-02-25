package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "teacher_time_array")
public class TeacherTimeArray {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 老师工号
     */
    @Column(name = "teacher_no")
    private String teacherNo;

    /**
     * 是否是双师课次
     */
    @Column(name = "is_double_teacher")
    private Byte isDoubleTeacher;

    /**
     * 主讲端课次id
     */
    @Column(name = "lesson_table_id")
    private Long lessonTableId;

    /**
     * 主讲端课次明细id
     */
    @Column(name = "lesson_table_detail_id")
    private Long lessonTableDetailId;

    /**
     * 班级id
     */
    @Column(name = "class_id")
    private Long classId;

    /**
     * 课节id
     */
    @Column(name = "lesson_id")
    private Long lessonId;

    /**
     * 开始占用时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束占用时间
     */
    @Column(name = "end_time")
    private Date endTime;

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
     * 获取老师工号
     *
     * @return teacher_no - 老师工号
     */
    public String getTeacherNo() {
        return teacherNo;
    }

    /**
     * 设置老师工号
     *
     * @param teacherNo 老师工号
     */
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    /**
     * 获取是否是双师课次
     *
     * @return is_double_teacher - 是否是双师课次
     */
    public Byte getIsDoubleTeacher() {
        return isDoubleTeacher;
    }

    /**
     * 设置是否是双师课次
     *
     * @param isDoubleTeacher 是否是双师课次
     */
    public void setIsDoubleTeacher(Byte isDoubleTeacher) {
        this.isDoubleTeacher = isDoubleTeacher;
    }

    /**
     * 获取主讲端课次id
     *
     * @return lesson_table_id - 主讲端课次id
     */
    public Long getLessonTableId() {
        return lessonTableId;
    }

    /**
     * 设置主讲端课次id
     *
     * @param lessonTableId 主讲端课次id
     */
    public void setLessonTableId(Long lessonTableId) {
        this.lessonTableId = lessonTableId;
    }

    /**
     * 获取主讲端课次明细id
     *
     * @return lesson_table_detail_id - 主讲端课次明细id
     */
    public Long getLessonTableDetailId() {
        return lessonTableDetailId;
    }

    /**
     * 设置主讲端课次明细id
     *
     * @param lessonTableDetailId 主讲端课次明细id
     */
    public void setLessonTableDetailId(Long lessonTableDetailId) {
        this.lessonTableDetailId = lessonTableDetailId;
    }

    /**
     * 获取课节id
     *
     * @return lesson_id - 课节id
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * 设置课节id
     *
     * @param lessonId 课节id
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * 获取开始占用时间
     *
     * @return start_time - 开始占用时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始占用时间
     *
     * @param startTime 开始占用时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束占用时间
     *
     * @return end_time - 结束占用时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束占用时间
     *
     * @param endTime 结束占用时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
}
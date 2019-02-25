/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */
package com.huatu.paike.dal.teacher.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 教师排课信息
 * 
 * @title TeacherLesson
 * @author yanmaoyuan
 * @date 2018年7月30日
 * @version 1.0
 */
public class TeacherLesson implements Serializable {

    private static final long serialVersionUID = 4317072318136613363L;

    private Long lessonId;// 课节ID

    private Date lessonDate;// 上课日期

    private Long subjectId;// 科目

    private Long roomId;// 教室

    private String teacherStaffNo;// 教师工号

    private Integer teacherType;// 教师类型

    public TeacherLesson() {
    }

    /**
     * @return the lessonId
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * @param lessonId the lessonId to set
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * @return the lessonDate
     */
    public Date getLessonDate() {
        return lessonDate;
    }

    /**
     * @param lessonDate the lessonDate to set
     */
    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    /**
     * @return the subjectId
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId the subjectId to set
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * @return the roomId
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the teacherStaffNo
     */
    public String getTeacherStaffNo() {
        return teacherStaffNo;
    }

    /**
     * @param teacherStaffNo the teacherStaffNo to set
     */
    public void setTeacherStaffNo(String teacherStaffNo) {
        this.teacherStaffNo = teacherStaffNo;
    }

    /**
     * @return the teacherType
     */
    public Integer getTeacherType() {
        return teacherType;
    }

    /**
     * @param teacherType the teacherType to set
     */
    public void setTeacherType(Integer teacherType) {
        this.teacherType = teacherType;
    }

}

/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.service;

import com.huatu.paike.api_test.dto.PreparedInfo;
import com.huatu.paike.dal.paike.entity.ClassStageSubjectTeacher;

import java.util.List;

/**
 * @title PreparedService
 * @desc 准备信息
 * @author shanyu
 * @date 2018年7月30日
 * @version 1.0
 */

public interface PreparedService {

    /**
     * 构造准备信息
     * 
     * @param info
     */
    public void buildSomPareparedInfo(PreparedInfo info);

    /**
     * 阶段科目主讲信息
     * 
     * @param info
     */
    public void buildCsstInfo(PreparedInfo info);

    /**
     * 阶段科目助教信息
     * 
     * @param info
     */
    public void buildCssaInfo(PreparedInfo info);

    /**
     * 老师信息
     */
    /* public void buildTeacherInfo(PreparedInfo info); */

    /**
     * 构建老师信息
     * 
     * @param info
     */
    public void buildTeacherInfo2(PreparedInfo info);

    /**
     * 天数
     * 
     * @param info
     */
    public void buildCsstDaysInfo(PreparedInfo info);


    /**
     * 时长（分钟）
     * 
     * @param info
     */
    public void buildCsstDurationInfo(PreparedInfo info);


    /**
     * 已结束时长
     * 
     * @param info
     * @param studentId
     */
    public void buildFinishedDurationInfo(PreparedInfo info, Long studentId);

    /**
     * 课节老师信息
     * 
     * @param info
     */
    public void buildLessonTeacherInfo(PreparedInfo info);

    /**
     * 班级名称信息
     * 
     * @param info
     */
    public void buildClassNameInfo(PreparedInfo info);

    /**
     * 获取班级信息
     * @param info
     */
    public void buildClassInfo(PreparedInfo info);

    /**
     * 课节时间安排信息
     * 
     * @param info
     */
    public void buildLessonTimeArrInfo(PreparedInfo info);

    /**
     * 获取教室信息
     * 
     * @param info
     */
    public void buildRoomInfo(PreparedInfo info);

    /**
     * 查询给定班级阶段科目的学员人数
     * 
     * @param info
     */
    public void buildStudentCount(PreparedInfo info);

    /**
     * 天数(需要这个方法的原因:一个csstId下可能存在不与学生关联的class_lesson,产生这种现象的原因是学员订单退班,没有上过的课需要取消关联)
     *
     * @param info
     */
    public void buildCsstDaysInfo(PreparedInfo info, Long studentId);

    /**
     * 时长（分钟）
     *
     * @param info
     */
    public void buildCsstDurationInfo(PreparedInfo info, Long studentId);

    /**
     * lessonTableNo
     *
     * @param info
     */
    public void buildLessonTableNo(PreparedInfo info);

    /**
     * 事业部和teachWay
     * @param info
     */
    void buildBusinessAndTeachWay(PreparedInfo info,List<ClassStageSubjectTeacher> cssts);

}

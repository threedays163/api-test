package com.huatu.paike.api_test.dto;

import com.huatu.common.annotation.FieldDesc;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName LessonPrintDto
 * @Description
 * @Author zhangjing
 * @DATE 2019/5/8 14:26
 * @Version 1.0
 */
@Data
public class LessonPrintDto {

    @FieldDesc(desc = "班级名称")
    private String className;

    @FieldDesc(desc = "班级编号")
    private String classNo;

    @FieldDesc(desc = "事业部")
    private String businessName;

    @FieldDesc(desc = "考试类型")
    private String examType;

    @FieldDesc(desc = "笔面试类型")
    private String examWay;

    @FieldDesc(desc = "授课方式")
    private String teachWay;

    @FieldDesc(desc = "所属分校")
    private String subSchool;

    @FieldDesc(desc = "阶段")
    private String stageName;

    @FieldDesc(desc = "科目")
    private String subjectName;

    @FieldDesc(desc = "时长")
    private String durationStr;

    @FieldDesc(desc = "开始日期")
    private Date startTime;

    @FieldDesc(desc = "结束日期")
    private Date endTime;

    @FieldDesc(desc = "主讲老师")
    private String masterTeahcer;

    @FieldDesc(desc = "助教老师")
    private String assisTeacher;

    @FieldDesc(desc = "上课地点")
    private String room;

    @FieldDesc(desc = "报班人数")
    private int stuCount;

    @FieldDesc(desc = "状态")
    private String status;

}

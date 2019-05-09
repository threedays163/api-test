package com.huatu.paike.api_test.dto;

import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.common.enums.EnumDto;
import com.huatu.common.service.dto.resp.StageDto;
import com.huatu.common.service.dto.resp.SubjectDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName TimeTableDto
 * @Description
 * @Author zhangjing
 * @DATE 2019/5/8 11:32
 * @Version 1.0
 */
@Data
public class TimeTableDto implements Serializable {


    private static final long serialVersionUID = 8880050156193419017L;

    private Long id;

    private Long subSchool;

    private StageDto stage;// 阶段

    Integer batchNum;// 批次数

    private SubjectDto subject;// 科目

    private int days;// 天数

    private int durations;// 时长,分钟数

    private int finishedDurations;// 已结束时长

    private Date startDate;

    private Date endDate;

    private NoAndNameScoreDto teacher;// 主讲老师

    private Set<NoAndNameScoreDto> assistants;// 助教老师

    private Set<IdAndNameDto> teacherRoomList; // 主讲端

    private Set<IdAndNameDto> stuRoomList;// 教室(或学生端)

    private int teachWay; // 授课方式,@TeachingMethod 0:面授;4:双师课

    private Long lessonTableId; // 双师主讲端课次ID

    private String lessonTableNo; // 双师端课次编码

    private EnumDto status;

    private int score;// 评分

    private Long classId;// 班级ID

    int stuCount; // 学生人数

    boolean isAccident;// 是否教学事故
    /**
     * 事业部
     */
    private Long buId;

    /**
     * 考试类型
     */
    private String examType;
    /**
     * 笔面试类型
     */
    private String examWay;

    private String classNo;

    private String className;
}

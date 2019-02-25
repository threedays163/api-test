
package com.huatu.paike.dal.classes.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;

import java.util.Date;
import java.util.List;
import com.huatu.paike.dal.sys.entity.SysConfigEntity;
import lombok.Data;

@Data
public class ClassListReqDto {
    /**
     * 上课时间起始时间
     */
    Date startTime;
    /**
     * 上课时间结束时间
     */
    Date endTime;
    /**
     * 商品名称/编码
     */
    String goodsQuery;
    /**
     * 班级名称/编码
     */
    String classQuery;

    /**
     * 事业部ID
     */
    Long businessUnitId;
    /**
     * 分校分部nodeID
     */
    Long nodeId;

    /**
     * 分部id
     */
    List<Long> nodeIds;
    /**
     * 笔面试类型编码
     */
    String examWayCode;
    /**
     * 考试类型编码
     */
    String examTypeCode;
    /**
     * 产品类型编码
     */
    Long productTypeId;
    /**
     * 班级状态
     */
    Integer classStatus;
    /**
     * 班级多种状态
     */
    List<Integer> multipleClassStatus;
    /**
     * 班主任ID
     */
    Long masterTeacherID;

    Integer queryStatus;// 状态查询：0，新开班；1，待排课次；2，已排课

    PageDto pageDto;

    Integer teachWay;

    /**
     * 科目
     */
    private Long subjectId;
    /**
     * 老师编码
     */
    private String teacherStaffNo;

    /**
     * 老师编码List
     */
    private List<String> teacherStaffNos;

    /**
     * 不需要排主讲的阶段信息
     */
    private List<SysConfigEntity> noMainTeacherStages;

    /**
     * 不需要排主讲的科目信息
     */
    private List<SysConfigEntity> noMainTeacherSubjects;

    /**
     * 主讲助教二选一的阶段
     */
    private List<SysConfigEntity> noMainTeacherOrAssistStages;

    /**
     * 白名单不需要排主讲的阶段信息
     */
    private List<SysConfigEntity> noMainTeacherStagesTemp;

    /**
     * 白名单不需要排主讲的科目信息
     */
    private List<SysConfigEntity> noMainTeacherSubjectsTemp;

    /**
     * 白名单主讲助教二选一的阶段
     */
    private List<SysConfigEntity> noMainTeacherOrAssistStagesTemp;

}

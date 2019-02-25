package com.huatu.paike.dal.teachingaffairs.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 
 * 双师课次管理vo
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月14日 Created
 *
 * </pre>
 * @since 1.
 */
@Data
public class QueryLessonTableParam implements Serializable {
    private static final long serialVersionUID = 9626166305050645L;
    
    /*ID*/
    private Long id;
    /*创建人*/
    private Long creatorId;
    /*创建时间*/
    private Date createTime;
    /*修改时间*/
    private Date updateTime;
    /*修改人*/
    private Long updatorId;
    /*是否删除（1-是，0-否）*/
    private Integer isDel;
    /*产品ID*/
    private Long productId;
    /*阶段ID*/
    private Long stageId;
    /*课次编码*/
    private String lessonTableNo;
    /*科目ID*/
    private Long subjectId;
    /*天数*/
    private BigDecimal dayDuration;
    /*晚数*/
    private BigDecimal nightDuration;
    /*课表模版ID*/
    private Long templateId;
    /*关联状态(1-打开，0-关闭）*/
    private Integer relateStatus;
    /*上课开始时间*/
    private Date startTime;
    /*上课结束时间*/
    private Date endTime;
    /*是否包含工作日（1-是，0-否）*/
    private Integer isIncludeDay;
    /*是否包含周末（1-是，0-否）*/
    private Integer isIncludeWeekend;
    /*主讲老师编码*/
    private String teacherNo;
    /*主讲端ID*/
    private Long teacherDeviceId;
    /*时长*/
    private Integer duration;
    /*虚拟教室ID(百家云虚拟教室)*/
    private String cloudRoomId;
    /*主讲老师名称*/
    private String teacherName;
    /*主讲参加码*/
    private String teacherJoinCode;
    /*学生参加码*/
    private String studentJoinCode;
    /*助教参加码*/
    private String assistantJoinCode;
    /*拆分后的产品数组*/
    private List<List<Long>> splitProductIds;
    /*查询课次*/
    private String lessonTableQuery;
    /*教师查询条件*/
    private String teacherQuery;
    /*查询条件开始时间*/
    private Date queryStartTime;
    /*查询结束时间*/
    private Date queryEndTime;
    /*id集合*/
    private Collection<Long> ids;
    /*组织架构ID*/
    private Long nodeId;
    /*组织架构ID数组*/
    private Collection<Long> nodeIds;

    private PageDto pageDto;// 分页
    /*模版ids*/
    private Collection<Long> templateIds;
    /*按关联状态开放、关闭，开课时间升序排序*/
    private String isOrderByStatusAndStartTime;

}
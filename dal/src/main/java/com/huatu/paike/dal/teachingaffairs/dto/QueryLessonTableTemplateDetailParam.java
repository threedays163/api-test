package com.huatu.paike.dal.teachingaffairs.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 班级阶段科目vo
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月12日 Created
 *
 * </pre>
 * @since 1.
 */
@Data
public class QueryLessonTableTemplateDetailParam implements Serializable {
    private static final long serialVersionUID = 2373448599577292L;
    
    /*ID*/
    private Integer id;
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
    /*模版ID*/
    private Long templateId;
    /*天*/
    private Integer daySeq;
    /*开始时间*/
    private String startTime;
    /*结束时间*/
    private String endTime;
    /*知识点*/
    private String knowledge;
    /*分页*/
    private PageDto pageDto;
    /*是否根据开始结束时间排序*/
    private String isOrderByStartEndTime;
}
package com.huatu.paike.dal.teachingaffairs.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * 
 * 双师课次时间段管理vo
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
public class QueryLessonTableTimeDetailParam implements Serializable {
    private static final long serialVersionUID = 4560929996909717L;
    
    /*ID*/
    private Long id;
    /*创建人ID*/
    private Long creatorId;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;
    /*更新人id*/
    private Long updatorId;
    /*是否删除（1-是，0-否）*/
    private Integer isDel;
    /*上课日期*/
    private Date lessonDate;
    /*开始时间*/
    private Date startTime;
    /*结束时间*/
    private Date endTime;
    /*课次子表id*/
    private Long lessonDetailId;
    /*时长*/
    private Integer duration;
    /*课次子表id数组*/
    private Collection<Long> detailIds;
    /*是否根据开始时间，结束时间排序*/
    private String isOrderByStartEndTime;

    private PageDto pageDto;// 分页

}
package com.huatu.paike.dal.teachingaffairs.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
public class QueryLessonTableDetailParam implements Serializable {
    private static final long serialVersionUID = 3783960777298198L;
    
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
    /*课次ID*/
    private Long timeTableId;
    /*日期*/
    private Date lessonDate;
    /*主讲端id*/
    private Long teacherDeviceId;
    /*主讲老师编码*/
    private String teacherNo;
    /*主讲老师名称*/
    private String teacherName;
    /*时长*/
    private Integer duration;
    /*是否是本地老师（1-是，0-否）*/
    private Integer isLocal;

    private PageDto pageDto;// 分页
    /*是否按上课日期排序*/
    private String isOrderByLessonDate;
    /*ids*/
    private Collection<Long> ids;
    /*课表模版ID*/
    private Collection<Long> lessonTableIds;

}
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
 * 班级阶段科目vo
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月09日 Created
 *
 * </pre>
 * @since 1.
 */
@Data
public class QueryLessonTableTemplateParam implements Serializable {
    private static final long serialVersionUID = 4158560740726920L;
    
    /*ID*/
    private Long id;
    /*创建人*/
    private Long creatorId;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;
    /*更新人ID*/
    private Long updatorId;
    /*是否删除（1-是，0-否）*/
    private Integer isDel;
    /*模版编码*/
    private String templateNo;
    /*模版名称*/
    private String templateName;
    /*产品ID*/
    private Long productId;
    /*阶段ID*/
    private Long stageId;
    /*科目ID*/
    private Long subjectId;
    /*天数*/
    private BigDecimal dayDuration;
    /*晚数*/
    private BigDecimal nightDuration;
    /*时长*/
    private Integer duration;
    /*排除id*/
    private Long notInId;
    /*拆分后的产品数组*/
    private List<List<Long>> splitProductIds;
    private PageDto pageDto;// 分页
    /*模版名称和编码*/
    private String templateQuery;
    /*根据创建时间倒序排序*/
    private String isOrderByCreateTimeDesc;
    /*根据ids查询*/
    private Collection<Long> ids;
    /*组织架构id*/
    private Long nodeId;

}
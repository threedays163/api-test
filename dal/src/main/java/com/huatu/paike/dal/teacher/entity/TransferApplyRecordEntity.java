package com.huatu.paike.dal.teacher.entity;
import java.io.Serializable;

import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;


/**
 * 
 * 课节学生实体
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2019年01月23日 Created
 *
 * </pre>
 * @since 1.
 */
@Data
public class TransferApplyRecordEntity implements Serializable {
    private static final long serialVersionUID = 9821444695928023L;
    
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
    /*审批单号*/
    private String applyId;
    /*旧审批单号*/
    private String oldApplyId;
    /*操作类型（1-修改）*/
    private Integer operatorType;
}
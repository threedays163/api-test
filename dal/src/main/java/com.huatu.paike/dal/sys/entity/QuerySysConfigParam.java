package com.huatu.paike.dal.sys.entity;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QuerySysConfigParam implements Serializable {

    private static final long serialVersionUID = 2213091290203579209L;
    /**自增主键*/
    private Long id;
    /**创建时间*/
    private Date createTime;
    /**配置名称*/
    private String confName;
    /**配置值*/
    private String confValue;
    /**配置值2*/
    private String confValue2;
    /**配置值3*/
    private String confValue3;
    /**配置类型*/
    private String confType;
    /**备注*/
    private String remark;
    /**confNameLike的值*/
    private String confNameLike;

    private PageDto pageDto;// 分页
}

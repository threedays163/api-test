package com.huatu.paike.dal.sys.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


import java.util.Date;
import javax.persistence.*;

/**
 * 
 * 系统配置表实体
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年12月12日 Created
 *
 * </pre>
 * @since 1.
 */
@Table(name = "sys_config")
@Data
public class SysConfigEntity implements Serializable {
    private static final long serialVersionUID = 3451154397510437L;

    /**自增主键*/
    @Column(name = "ID") 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**创建时间*/
    @Column(name = "CREATE_TIME") 
    private Date createTime;
    /**配置名称*/
    @Column(name = "CONF_NAME") 
    private String confName;
    /**配置值*/
    @Column(name = "CONF_VALUE") 
    private String confValue;
    /**配置值2*/
    @Column(name = "CONF_VALUE2") 
    private String confValue2;
    /**配置值3*/
    @Column(name = "CONF_VALUE3")
    private String confValue3;
    /**配置类型*/
    @Column(name = "CONF_TYPE")
    private String confType;
    /**备注*/
    @Column(name = "REMARK") 
    private String remark;
}
package com.huatu.paike.dal.failure.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * 
 * 双师课次时间段管理实体
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  2018年11月21日 Created
 *
 * </pre>
 * @since 1.
 */
@Table(name = "failure_msg")
public class FailureMsgEntity implements Serializable {
    private static final long serialVersionUID = 6425090079520980L;

    /**ID*/
    @Column(name = "ID") 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**创建人*/
    @Column(name = "CREATOR_ID") 
    private Long creatorId;
    /**创建时间*/
    @Column(name = "CREATE_TIME") 
    private Date createTime;
    /**更新时间*/
    @Column(name = "UPDATE_TIME") 
    private Date updateTime;
    /**更新人ID*/
    @Column(name = "UPDATOR_ID") 
    private Long updatorId;
    /**是否删除（1-是，0-否）*/
    @Column(name = "IS_DEL") 
    private Integer isDel;
    /**类型（1-百家云解绑失败（创建课次时，推送失败且解绑失败））*/
    @Column(name = "ERROR_TYPE") 
    private Integer errorType;
    /**模版名称*/
    @Column(name = "PARAM") 
    private String param;
    /**产品ID*/
    @Column(name = "ERROR_MSG") 
    private String errorMsg;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdatorId() {
        return updatorId;
    }
    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    public Integer getIsDel() {
        return isDel;
    }
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getErrorType() {
        return errorType;
    }
    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }

    public String getParam() {
        return param;
    }
    public void setParam(String param) {
        this.param = param;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


}
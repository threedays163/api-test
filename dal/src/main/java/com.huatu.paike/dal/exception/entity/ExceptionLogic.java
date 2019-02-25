package com.huatu.paike.dal.exception.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "exception_logic")
public class ExceptionLogic {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类名
     */
    @Column(name = "CLASS_NAME")
    private String className;

    /**
     * 方法名
     */
    @Column(name = "METHOD_NAME")
    private String methodName;

    /**
     * 行数
     */
    @Column(name = "LINE_NUM")
    private Integer lineNum;

    /**
     * 异常信息内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 是否已解决,0:待解决,1:已解决
     */
    @Column(name = "IS_SOLVE")
    private Boolean isSolve;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取类名
     *
     * @return CLASS_NAME - 类名
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置类名
     *
     * @param className 类名
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取方法名
     *
     * @return METHOD_NAME - 方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置方法名
     *
     * @param methodName 方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取行数
     *
     * @return LINE_NUM - 行数
     */
    public Integer getLineNum() {
        return lineNum;
    }

    /**
     * 设置行数
     *
     * @param lineNum 行数
     */
    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    /**
     * 获取异常信息内容
     *
     * @return CONTENT - 异常信息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置异常信息内容
     *
     * @param content 异常信息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取是否已解决,0:待解决,1:已解决
     *
     * @return IS_SOLVE - 是否已解决,0:待解决,1:已解决
     */
    public Boolean getIsSolve() {
        return isSolve;
    }

    /**
     * 设置是否已解决,0:待解决,1:已解决
     *
     * @param isSolve 是否已解决,0:待解决,1:已解决
     */
    public void setIsSolve(Boolean isSolve) {
        this.isSolve = isSolve;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.huatu.paike.dal.sys.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@ToString
@Table(name = "task_record")
public class TaskRecord {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 任务类型：1，结课订单阶段筛选任务；2，结课订单阶段处理任务；3，老师课酬结算任务
     */
    @Column(name = "TASK_ID")
    private Integer taskId;

    /**
     * 任务执行时间
     */
    @Column(name = "EXCUTE_TIME")
    private Date excuteTime;

    /**
     * 获取自增ID
     *
     * @return ID - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取任务类型：1，结课订单阶段筛选任务；2，结课订单阶段处理任务；3，老师课酬结算任务
     *
     * @return TASK_ID - 任务类型：1，结课订单阶段筛选任务；2，结课订单阶段处理任务；3，老师课酬结算任务
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * 设置任务类型：1，结课订单阶段筛选任务；2，结课订单阶段处理任务；3，老师课酬结算任务
     *
     * @param taskId 任务类型：1，结课订单阶段筛选任务；2，结课订单阶段处理任务；3，老师课酬结算任务
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取任务执行时间
     *
     * @return EXCUTE_TIME - 任务执行时间
     */
    public Date getExcuteTime() {
        return excuteTime;
    }

    /**
     * 设置任务执行时间
     *
     * @param excuteTime 任务执行时间
     */
    public void setExcuteTime(Date excuteTime) {
        this.excuteTime = excuteTime;
    }
}
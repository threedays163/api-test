package com.huatu.paike.dal.paike.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "room_time_array")
public class RoomTimeArray {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 教室id
     */
    @Column(name = "room_id")
    private Long roomId;

    /**
     * 是否是双师课次
     */
    @Column(name = "is_double_teacher")
    private Byte isDoubleTeacher;

    /**
     * 主讲端课次id
     */
    @Column(name = "lesson_table_id")
    private Long lessonTableId;

    /**
     * 主讲端课次明细id
     */
    @Column(name = "lesson_table_detail_id")
    private Long lessonTableDetailId;

    /**
     * 班级id
     */
    @Column(name = "class_id")
    private Long classId;

    /**
     * 课节id
     */
    @Column(name = "lesson_id")
    private Long lessonId;

    /**
     * 开始占用时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束占用时间
     */
    @Column(name = "end_time")
    private Date endTime;

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

}
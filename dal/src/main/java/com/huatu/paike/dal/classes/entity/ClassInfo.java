package com.huatu.paike.dal.classes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Table(name = "class_info")
public class ClassInfo {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 班级编号
     */
    @Column(name = "CLASS_NO")
    private String classNo;

    /**
     * 班级名称
     */
    @Column(name = "CLASS_NAME")
    private String className;

    /**
     * 产品类型ID
     */
    @Column(name = "PRODUCT_TYPE_ID")
    private Long productTypeId;

    /**
     * 考试类型CODE
     */
    @Column(name = "EXAM_TYPE")
    private String examType;

    /**
     * 笔面试类型：B(笔试),M（面试）,Z（综合）
     */
    @Column(name = "EXAM_WAY")
    private String examWay;

    /**
     * 事业部id
     */
    @Column(name = "BU_ID")
    private Long buId;

    /**
     * 分校id
     */
    @Column(name = "BRANCH_ID")
    private Long branchId;

    /**
     * 分部id
     */
    @Column(name = "SUBSECTORS_ID")
    private Long subsectorsId;

    /**
     * 协议类型 B协议商品 A非协议商品
     */
    @Column(name = "PROTOCOL_TYPE")
    private String protocolType;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_NO")
    private String goodsNo;

    /**
     * 商品名称
     */
    @Column(name = "GOODS_NAME")
    private String goodsName;

    /**
     * 班级状态,业务状态
     */
    @Column(name = "CLASS_STATUS")
    private Byte classStatus;

    /**
     * 最大人数
     */
    @Column(name = "MAX_STU_COUNT")
    private Integer maxStuCount;

    /**
     * 班主任id
     */
    @Column(name = "HEAD_MASTER_STAFF_ID")
    private Long headMasterStaffId;

    /**
     * 课时分钟数
     */
    @Column(name = "DURATION_TIME")
    private Integer durationTime;

    /**
     * 已排课课时分钟数
     */
    @Column(name = "PAIKE_DURATION")
    private Long paikeDuration;

    /**
     * 已上课课时数分钟数
     */
    @Column(name = "FINISH_DURATION")
    private Long finishDuration;

    /**
     * 教室id
     */
    @Column(name = "ROOM_ID")
    private Long roomId;

    /**
     * 是否时职位保护：0，否；1，是；
     */
    @Column(name = "IS_TEACHER_PROTECTED")
    private Byte isTeacherProtected;

    /**
     * 受保护的职位id
     */
    @Column(name = "POSITION_ID")
    private Long positionId;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 开始时间
     */
    @Column(name = "BEGIN_TIME")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "END_TIME")
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

    /**
     * 创建人id
     */
    @Column(name = "CREATOR_ID")
    private Long creatorId;

    /**
     * 班级类型;0:默认班级;1:滚动排课班级
     */
    @Column(name = "CLASS_TYPE")
    private Byte classType;

    /**
     * 是否自动入班; 1:自动入班;0:手动入班
     */
    @Column(name = "IS_AUTO_INCOME")
    private Byte isAutoIncome;

    /**
     * 授课方式:0,⾯授，1,直播，2,录播—⼤屏，3,录播—⼩屏，4,双师
     */
    @Column(name = "TEACH_WAY")
    private Byte teachWay;
}
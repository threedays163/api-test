/*
 Navicat Premium Data Transfer

 Source Server         : paike
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : 172.30.9.102:3306
 Source Schema         : paike

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : 65001

 Date: 17/07/2018 19:23:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for CLASS_GOOD
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_GOOD`;
CREATE TABLE `CLASS_GOOD` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `GOODS_NO` varchar(20) NOT NULL DEFAULT '' COMMENT '商品编号',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级ID',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CLASS_GOODS` (`GOODS_NO`,`CLASS_ID`) USING BTREE COMMENT 'class_id 和 goods_no联合主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级商品关联';

-- ----------------------------
-- Table structure for CLASS_INFO
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_INFO`;
CREATE TABLE `CLASS_INFO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CLASS_NO` varchar(30) NOT NULL DEFAULT '' COMMENT '班级编号',
  `CLASS_NAME` varchar(60) NOT NULL DEFAULT '' COMMENT '班级名称',
  `PRODUCT_TYPE` tinyint(4) NOT NULL DEFAULT '0' COMMENT '产品类型',
  `EXAM_TYPE` tinyint(4) NOT NULL DEFAULT '0' COMMENT '考试类型',
  `BU_ID` tinyint(4) NOT NULL DEFAULT '0' COMMENT '事业部id',
  `BRANCH_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '分校id',
  `SUBSECTORS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '分部id',
  `PROTOCOL_TYPE` char(1) NOT NULL COMMENT '协议类型  X协议商品 P非协议商品',
  `GOODS_NO` varchar(20) NOT NULL DEFAULT '' COMMENT '商品编号',
  `GOODS_NAME` varchar(50) NOT NULL DEFAULT '' COMMENT '商品名称',
  `CLASS_STATUS` tinyint(4) NOT NULL DEFAULT '0' COMMENT '班级状态,业务状态',
  `MAX_STU_COUNT` int(11) NOT NULL DEFAULT '0' COMMENT '最大人数',
  `HEAD_MASTER_STAFF_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班主任id',
  `DURATION_TIME` int(11) NOT NULL DEFAULT '0' COMMENT '课时分钟数',
  `ROOM_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '教室id',
  `IS_TEACHER_PROTECTED` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否时职位保护：0，否；1，是；',
  `POSITION_ID` tinyint(4) NOT NULL DEFAULT '0' COMMENT '受保护的职位id',
  `BEGIN_TIME` datetime DEFAULT NULL COMMENT '开始时间',
  `END_TIME` datetime DEFAULT NULL COMMENT '结束时间',
  `SEQ_CODE` int(11) NOT NULL DEFAULT '0' COMMENT '顺序编码',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CLASS_NO` (`CLASS_NO`) COMMENT '班级编号唯一字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级信息';

-- ----------------------------
-- Table structure for CLASS_LESSON
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_LESSON`;
CREATE TABLE `CLASS_LESSON` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CSST_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级阶段科目老师表主键id',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级编号',
  `ROOM_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '教室id',
  `STAGE_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '阶段id',
  `SUBJECT_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '科目id',
  `LESSON_DATE` datetime DEFAULT NULL COMMENT '上课日期',
  `START_TIME` datetime DEFAULT NULL COMMENT '开始时间',
  `END_TIME` datetime DEFAULT NULL COMMENT '结束时间',
  `LESSON_DURATION` int(11) NOT NULL DEFAULT '0' COMMENT '课节时长（单位：分钟）',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级课节表';

-- ----------------------------
-- Table structure for CLASS_STAGE_SUBJECT_ASSISTANT
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_STAGE_SUBJECT_ASSISTANT`;
CREATE TABLE `CLASS_STAGE_SUBJECT_ASSISTANT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CSST_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级阶段科目老师表主键ID',
  `ASSISTANT_STAFF_NO` varchar(20) NOT NULL DEFAULT '0' COMMENT '主讲老师no',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CRTSS` (`CSST_ID`,`ASSISTANT_STAFF_NO`) COMMENT '班级阶段科目老师表主键ID，助教工号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级阶段科目老师表（排课中间表）';

-- ----------------------------
-- Table structure for CLASS_STAGE_SUBJECT_TEACHER
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_STAGE_SUBJECT_TEACHER`;
CREATE TABLE `CLASS_STAGE_SUBJECT_TEACHER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CLASS_ID` varchar(30) NOT NULL DEFAULT '' COMMENT '班级id',
  `ROOM_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '教室id',
  `TEACHER_STAFF_NO` varchar(20) NOT NULL DEFAULT '0' COMMENT '主讲老师no',
  `STAGE_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '阶段id',
  `SUBJECT_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '科目id',
  `ACCIDENT_STATUS` tinyint(1) NOT NULL DEFAULT '0' COMMENT '事故状态：0，没有事故；1，有事故',
  `ACCIDENT_DESC` varchar(1000) NOT NULL DEFAULT '' COMMENT '事故描述',
  `SCORE` int(11) NOT NULL DEFAULT '0' COMMENT '分数（5分制，扩大100倍）',
  `START_DATE` datetime DEFAULT NULL COMMENT '开始日期',
  `END_DATE` datetime DEFAULT NULL COMMENT '结束日期',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CRTSS` (`CLASS_ID`,`TEACHER_STAFF_NO`,`STAGE_ID`,`SUBJECT_ID`) COMMENT '班级ID，老师ID，阶段ID，科目ID联合主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级阶段科目老师表（排课中间表）';

-- ----------------------------
-- Table structure for CLASS_STUDENT
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_STUDENT`;
CREATE TABLE `CLASS_STUDENT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级id',
  `STUDENT_ID` bigint(30) NOT NULL DEFAULT '0' COMMENT '学员id',
  `ORDER_NO` varchar(32) NOT NULL DEFAULT '' COMMENT '订单编号',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CLASS_ORDER` (`CLASS_ID`,`ORDER_NO`) COMMENT '班级id，订单编号联合主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级学员表';

-- ----------------------------
-- Table structure for CLASS_STUDENT_RECORD
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_STUDENT_RECORD`;
CREATE TABLE `CLASS_STUDENT_RECORD` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级id',
  `STUDENT_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '学员id',
  `ORDER_NO` varchar(32) NOT NULL DEFAULT '' COMMENT '订单编号',
  `OPERATE_TYPE` tinyint(3) NOT NULL DEFAULT '0' COMMENT '出入班状态：0，入班；1，出班',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级学员出入班记录表';

-- ----------------------------
-- Table structure for CLASS_TEACHER
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_TEACHER`;
CREATE TABLE `CLASS_TEACHER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级id',
  `TEACHER_STAFF_NO` varchar(30) NOT NULL DEFAULT '' COMMENT '老师工号',
  `TEACHER_TYPE` tinyint(2) NOT NULL DEFAULT '1' COMMENT '1，主讲；2，助教',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CLASS_TEACHER` (`CLASS_ID`,`TEACHER_STAFF_NO`) COMMENT '班级-老师唯一'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='班级老师';

-- ----------------------------
-- Table structure for FEED_BACK
-- ----------------------------
DROP TABLE IF EXISTS `FEED_BACK`;
CREATE TABLE `FEED_BACK` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0',
  `REMARK` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='反馈表';

-- ----------------------------
-- Table structure for FEED_BACK_STAGE
-- ----------------------------
DROP TABLE IF EXISTS `FEED_BACK_STAGE`;
CREATE TABLE `FEED_BACK_STAGE` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `FEED_BACK_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '反馈id',
  `STAGE_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '阶段id',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级ID',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_CLASS_STAGE` (`STAGE_ID`,`CLASS_ID`) COMMENT '班级编号和阶段联合主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='反馈阶段关联表';

-- ----------------------------
-- Table structure for GOODS_AUTO_CLASS
-- ----------------------------
DROP TABLE IF EXISTS `GOODS_AUTO_CLASS`;
CREATE TABLE `GOODS_AUTO_CLASS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `GOODS_NO` varchar(20) NOT NULL DEFAULT '' COMMENT '商品编号',
  `CLASS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级ID',
  `NUM` int(11) NOT NULL DEFAULT '0' COMMENT '自动建班顺序',
  `IS_FULL` tinyint(1) NOT NULL DEFAULT '0' COMMENT '班级人数是否已满：0，未满，可以继续进班；1，已满，不可以继续进班',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品自动建班班级关联,用于先建班级并关联商品，实际操作为入班操作';

-- ----------------------------
-- Table structure for GOODS_AUTO_CONF
-- ----------------------------
DROP TABLE IF EXISTS `GOODS_AUTO_CONF`;
CREATE TABLE `GOODS_AUTO_CONF` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `GOODS_NO` varchar(20) NOT NULL DEFAULT '' COMMENT '商品编号',
  `IS_AUTO_BUILD` tinyint(3) NOT NULL DEFAULT '0' COMMENT '是否自动建班，0:手动；1:自动',
  `MIN_COUNT` int(11) NOT NULL DEFAULT '0' COMMENT '最低开班人数',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_GOODS` (`GOODS_NO`) COMMENT '商品编号唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品自动建班配置';

-- ----------------------------
-- Table structure for LESSON_STUDENT
-- ----------------------------
DROP TABLE IF EXISTS `LESSON_STUDENT`;
CREATE TABLE `LESSON_STUDENT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `LESSON_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '课节id',
  `ORDER_NO` varchar(32) NOT NULL DEFAULT '' COMMENT '订单编号',
  `STUDENT_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '学员id',
  `PRICE` bigint(20) NOT NULL COMMENT '价格，按元为单位扩大一万倍',
  `COST` bigint(20) NOT NULL COMMENT '成本，按元为单位扩大一万倍',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_LESSON_STUDENT` (`LESSON_ID`,`STUDENT_ID`) COMMENT '课节ID和学员id联合主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课节学员表';

-- ----------------------------
-- Table structure for LESSON_TEACHER
-- ----------------------------
DROP TABLE IF EXISTS `LESSON_TEACHER`;
CREATE TABLE `LESSON_TEACHER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `LESSON_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '课节ID',
  `TEACHER_STAFF_NO` varchar(30) NOT NULL DEFAULT '' COMMENT '老师工号',
  `TEACHER_TYPE` tinyint(2) NOT NULL DEFAULT '1' COMMENT '1，主讲；2，助教',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_LESSON_TEACHER` (`LESSON_ID`,`TEACHER_STAFF_NO`) COMMENT '课节id，老师（助教）工号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课节老师（助教）表';

-- ----------------------------
-- Table structure for ORDER_INFO
-- ----------------------------
DROP TABLE IF EXISTS `ORDER_INFO`;
CREATE TABLE `ORDER_INFO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID,自增',
  `ORDER_NO` varchar(32) NOT NULL DEFAULT '' COMMENT '订单编号',
  `GOODS_NO` varchar(20) NOT NULL DEFAULT '' COMMENT '商品编号',
  `STUDENT_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '学员编号',
  `IS_MEAL` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否包餐',
  `IS_BED` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否住宿',
  `DURATION_TIME` smallint(11) NOT NULL COMMENT '时长：排课系统单位为分钟，商品订单系统单位是天，需要做转换',
  `ORDER_STATE` tinyint(3) NOT NULL COMMENT '订单状态:排课业务状态',
  `START_DATE` date NOT NULL COMMENT '开课日期',
  `END_DATE` date NOT NULL COMMENT '结课日期',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `ARRANGED_DURATION` int(11) NOT NULL COMMENT '已排课课时数,单位：分钟',
  `ENDED_DURATION` int(11) NOT NULL COMMENT '已结课课时数,单位：分钟',
  `COST` bigint(20) NOT NULL COMMENT '成本，按元为单位扩大一万倍',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE KEY `UNQ_ORDER_NO` (`ORDER_NO`) USING BTREE COMMENT 'ORDER唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

-- ----------------------------
-- Table structure for PLACE
-- ----------------------------
DROP TABLE IF EXISTS `PLACE`;
CREATE TABLE `PLACE` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `BRANCH_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '分校id',
  `SUBSECTORS_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '分部id',
  `AREA_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '城市id',
  `PLACE_TYPE` tinyint(4) NOT NULL DEFAULT '0' COMMENT '场地类别:0,教室；1，酒店会议室；2，酒店房间',
  `PLACE_NAME` varchar(100) NOT NULL DEFAULT '' COMMENT '名称',
  `ADDRESS` varchar(100) NOT NULL DEFAULT '' COMMENT '地址',
  `FLOOR` varchar(20) NOT NULL DEFAULT '0' COMMENT '楼层',
  `ROOM_NO` varchar(20) NOT NULL DEFAULT '' COMMENT '教室号/房间号/会议室',
  `ROOM_TYPE` varchar(20) NOT NULL DEFAULT '' COMMENT '房间类型(大床房，标间等等)',
  `MAX_COUNT` int(11) NOT NULL DEFAULT '0' COMMENT '最大容量',
  `TELEPHONE_NO` varchar(30) NOT NULL DEFAULT '' COMMENT '电话号码',
  `SIGN_DATE` datetime NOT NULL COMMENT '签订时间',
  `EXPIRE_DATE` datetime NOT NULL COMMENT '过期时间',
  `PRICE` bigint(20) NOT NULL DEFAULT '0' COMMENT '酒店会议室价格/天 单位：元扩大一万倍',
  `PRICE_WITHOUT_BREAKFAST` bigint(20) NOT NULL COMMENT '酒店房间价格不含早 单位：元扩大一万倍',
  `PRICE_WITH_BREAKFAST` bigint(20) NOT NULL DEFAULT '0' COMMENT '酒店房间价格含早 单位：元扩大一万倍',
  `WITH_DINNER` tinyint(2) NOT NULL COMMENT '是否含晚饭：0，不包含；1，包含，酒店会议室用',
  `IS_EFFECTIVE` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否有效',
  `LONGITUDE` decimal(10,7) NOT NULL DEFAULT '0.0000000' COMMENT '经度',
  `LATITUDE` decimal(10,7) NOT NULL DEFAULT '0.0000000' COMMENT '纬度',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='场地表';

-- ----------------------------
-- Table structure for TEACHER_TRIP
-- ----------------------------
DROP TABLE IF EXISTS `TEACHER_TRIP`;
CREATE TABLE `TEACHER_TRIP` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `FEED_BACK_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '反馈id',
  `CSST_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '阶段科目老师表主键id',
  `START_TIME` datetime DEFAULT NULL COMMENT '开始时间',
  `END_TIME` datetime DEFAULT NULL COMMENT '结束时间',
  `desc` varchar(1000) NOT NULL DEFAULT '' COMMENT '行程明细',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `CREATOR_ID` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_SST_FEEDBACK` (`FEED_BACK_ID`,`CSST_ID`) COMMENT 'SST和反馈ID联合主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='老师行程表';

-- ----------------------------
-- Table structure for TRANSFER_APPLY
-- ----------------------------
DROP TABLE IF EXISTS `TRANSFER_APPLY`;
CREATE TABLE `TRANSFER_APPLY` (
 `ID` BIGINT(20) NOT NULL AUTO_INCREMENT,
 `APPLY_ID` VARCHAR(128) NOT NULL UNIQUE COMMENT '审批单号',
 `SUBJECT_ID` BIGINT(20) COMMENT '被借调的科目ID',
 `STAFF_NO` VARCHAR(16) NOT NULL COMMENT '被借调老师的工号',
 `START_DATE` DATETIME NOT NULL COMMENT '借调开始日期',
 `END_DATE` DATETIME NOT NULL COMMENT '借调结束日期',
 `CLASS_NO` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '班号',
 `PLACE_ID` BIGINT(20) NOT NULL COMMENT '场地ID',
 `REMARK` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '备注',
 `TEACHER_UNIT_ID` BIGINT(20) NOT NULL COMMENT '申请借调的分校/师资单元',
 `OPERATOR_STAFF_NO` VARCHAR(16) NOT NULL COMMENT '申请借调的员工工号',
 `STATUS` INT(4) NOT NULL DEFAULT 0 COMMENT '借调申请的审批状态 0-待审批, 1-通过, 2-不通过',
 `CREATE_TIME` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `UPDATE_TIME` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
 `IS_DEL` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除标识: 0未删除, 1已删除',
 PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '老师借调申请';

SET FOREIGN_KEY_CHECKS = 1;

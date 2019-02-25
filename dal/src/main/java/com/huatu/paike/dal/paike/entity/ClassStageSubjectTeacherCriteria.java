package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassStageSubjectTeacherCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassStageSubjectTeacherCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Long value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Long value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Long value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Long value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Long value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Long> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Long> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Long value1, Long value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Long value1, Long value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Long value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Long value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Long value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Long value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Long> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Long> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Long value1, Long value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Long value1, Long value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoIsNull() {
            addCriterion("TEACHER_STAFF_NO is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoIsNotNull() {
            addCriterion("TEACHER_STAFF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoEqualTo(String value) {
            addCriterion("TEACHER_STAFF_NO =", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotEqualTo(String value) {
            addCriterion("TEACHER_STAFF_NO <>", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoGreaterThan(String value) {
            addCriterion("TEACHER_STAFF_NO >", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_STAFF_NO >=", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoLessThan(String value) {
            addCriterion("TEACHER_STAFF_NO <", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_STAFF_NO <=", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoLike(String value) {
            addCriterion("TEACHER_STAFF_NO like", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotLike(String value) {
            addCriterion("TEACHER_STAFF_NO not like", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoIn(List<String> values) {
            addCriterion("TEACHER_STAFF_NO in", values, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotIn(List<String> values) {
            addCriterion("TEACHER_STAFF_NO not in", values, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoBetween(String value1, String value2) {
            addCriterion("TEACHER_STAFF_NO between", value1, value2, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotBetween(String value1, String value2) {
            addCriterion("TEACHER_STAFF_NO not between", value1, value2, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIsNull() {
            addCriterion("TEACHER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIsNotNull() {
            addCriterion("TEACHER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeEqualTo(Byte value) {
            addCriterion("TEACHER_TYPE =", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeNotEqualTo(Byte value) {
            addCriterion("TEACHER_TYPE <>", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeGreaterThan(Byte value) {
            addCriterion("TEACHER_TYPE >", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("TEACHER_TYPE >=", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeLessThan(Byte value) {
            addCriterion("TEACHER_TYPE <", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeLessThanOrEqualTo(Byte value) {
            addCriterion("TEACHER_TYPE <=", value, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeIn(List<Byte> values) {
            addCriterion("TEACHER_TYPE in", values, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeNotIn(List<Byte> values) {
            addCriterion("TEACHER_TYPE not in", values, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeBetween(Byte value1, Byte value2) {
            addCriterion("TEACHER_TYPE between", value1, value2, "teacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("TEACHER_TYPE not between", value1, value2, "teacherType");
            return (Criteria) this;
        }

        public Criteria andStageIdIsNull() {
            addCriterion("STAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStageIdIsNotNull() {
            addCriterion("STAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStageIdEqualTo(Long value) {
            addCriterion("STAGE_ID =", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotEqualTo(Long value) {
            addCriterion("STAGE_ID <>", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdGreaterThan(Long value) {
            addCriterion("STAGE_ID >", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STAGE_ID >=", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLessThan(Long value) {
            addCriterion("STAGE_ID <", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLessThanOrEqualTo(Long value) {
            addCriterion("STAGE_ID <=", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdIn(List<Long> values) {
            addCriterion("STAGE_ID in", values, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotIn(List<Long> values) {
            addCriterion("STAGE_ID not in", values, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdBetween(Long value1, Long value2) {
            addCriterion("STAGE_ID between", value1, value2, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotBetween(Long value1, Long value2) {
            addCriterion("STAGE_ID not between", value1, value2, "stageId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("SUBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("SUBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Long value) {
            addCriterion("SUBJECT_ID =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Long value) {
            addCriterion("SUBJECT_ID <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Long value) {
            addCriterion("SUBJECT_ID >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBJECT_ID >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Long value) {
            addCriterion("SUBJECT_ID <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("SUBJECT_ID <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Long> values) {
            addCriterion("SUBJECT_ID in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Long> values) {
            addCriterion("SUBJECT_ID not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Long value1, Long value2) {
            addCriterion("SUBJECT_ID between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("SUBJECT_ID not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNull() {
            addCriterion("BATCH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNotNull() {
            addCriterion("BATCH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumEqualTo(Integer value) {
            addCriterion("BATCH_NUM =", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotEqualTo(Integer value) {
            addCriterion("BATCH_NUM <>", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThan(Integer value) {
            addCriterion("BATCH_NUM >", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BATCH_NUM >=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThan(Integer value) {
            addCriterion("BATCH_NUM <", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThanOrEqualTo(Integer value) {
            addCriterion("BATCH_NUM <=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumIn(List<Integer> values) {
            addCriterion("BATCH_NUM in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotIn(List<Integer> values) {
            addCriterion("BATCH_NUM not in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumBetween(Integer value1, Integer value2) {
            addCriterion("BATCH_NUM between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("BATCH_NUM not between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Long value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Long value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Long value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Long value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Long> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Long> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Long value1, Long value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusIsNull() {
            addCriterion("ACCIDENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusIsNotNull() {
            addCriterion("ACCIDENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusEqualTo(Boolean value) {
            addCriterion("ACCIDENT_STATUS =", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotEqualTo(Boolean value) {
            addCriterion("ACCIDENT_STATUS <>", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusGreaterThan(Boolean value) {
            addCriterion("ACCIDENT_STATUS >", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ACCIDENT_STATUS >=", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusLessThan(Boolean value) {
            addCriterion("ACCIDENT_STATUS <", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("ACCIDENT_STATUS <=", value, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusIn(List<Boolean> values) {
            addCriterion("ACCIDENT_STATUS in", values, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotIn(List<Boolean> values) {
            addCriterion("ACCIDENT_STATUS not in", values, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("ACCIDENT_STATUS between", value1, value2, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ACCIDENT_STATUS not between", value1, value2, "accidentStatus");
            return (Criteria) this;
        }

        public Criteria andAccidentDescIsNull() {
            addCriterion("ACCIDENT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAccidentDescIsNotNull() {
            addCriterion("ACCIDENT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentDescEqualTo(String value) {
            addCriterion("ACCIDENT_DESC =", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescNotEqualTo(String value) {
            addCriterion("ACCIDENT_DESC <>", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescGreaterThan(String value) {
            addCriterion("ACCIDENT_DESC >", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescGreaterThanOrEqualTo(String value) {
            addCriterion("ACCIDENT_DESC >=", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescLessThan(String value) {
            addCriterion("ACCIDENT_DESC <", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescLessThanOrEqualTo(String value) {
            addCriterion("ACCIDENT_DESC <=", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescLike(String value) {
            addCriterion("ACCIDENT_DESC like", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescNotLike(String value) {
            addCriterion("ACCIDENT_DESC not like", value, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescIn(List<String> values) {
            addCriterion("ACCIDENT_DESC in", values, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescNotIn(List<String> values) {
            addCriterion("ACCIDENT_DESC not in", values, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescBetween(String value1, String value2) {
            addCriterion("ACCIDENT_DESC between", value1, value2, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andAccidentDescNotBetween(String value1, String value2) {
            addCriterion("ACCIDENT_DESC not between", value1, value2, "accidentDesc");
            return (Criteria) this;
        }

        public Criteria andScoreDetailIsNull() {
            addCriterion("SCORE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andScoreDetailIsNotNull() {
            addCriterion("SCORE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andScoreDetailEqualTo(String value) {
            addCriterion("SCORE_DETAIL =", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailNotEqualTo(String value) {
            addCriterion("SCORE_DETAIL <>", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailGreaterThan(String value) {
            addCriterion("SCORE_DETAIL >", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE_DETAIL >=", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailLessThan(String value) {
            addCriterion("SCORE_DETAIL <", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailLessThanOrEqualTo(String value) {
            addCriterion("SCORE_DETAIL <=", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailLike(String value) {
            addCriterion("SCORE_DETAIL like", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailNotLike(String value) {
            addCriterion("SCORE_DETAIL not like", value, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailIn(List<String> values) {
            addCriterion("SCORE_DETAIL in", values, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailNotIn(List<String> values) {
            addCriterion("SCORE_DETAIL not in", values, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailBetween(String value1, String value2) {
            addCriterion("SCORE_DETAIL between", value1, value2, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreDetailNotBetween(String value1, String value2) {
            addCriterion("SCORE_DETAIL not between", value1, value2, "scoreDetail");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSurveyNumIsNull() {
            addCriterion("SURVEY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSurveyNumIsNotNull() {
            addCriterion("SURVEY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyNumEqualTo(Integer value) {
            addCriterion("SURVEY_NUM =", value, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumNotEqualTo(Integer value) {
            addCriterion("SURVEY_NUM <>", value, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumGreaterThan(Integer value) {
            addCriterion("SURVEY_NUM >", value, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SURVEY_NUM >=", value, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumLessThan(Integer value) {
            addCriterion("SURVEY_NUM <", value, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumLessThanOrEqualTo(Integer value) {
            addCriterion("SURVEY_NUM <=", value, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumIn(List<Integer> values) {
            addCriterion("SURVEY_NUM in", values, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumNotIn(List<Integer> values) {
            addCriterion("SURVEY_NUM not in", values, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumBetween(Integer value1, Integer value2) {
            addCriterion("SURVEY_NUM between", value1, value2, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andSurveyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SURVEY_NUM not between", value1, value2, "surveyNum");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTeachWayIsNull() {
            addCriterion("TEACH_WAY is null");
            return (Criteria) this;
        }

        public Criteria andTeachWayIsNotNull() {
            addCriterion("TEACH_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andTeachWayEqualTo(Byte value) {
            addCriterion("TEACH_WAY =", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayNotEqualTo(Byte value) {
            addCriterion("TEACH_WAY <>", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayGreaterThan(Byte value) {
            addCriterion("TEACH_WAY >", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("TEACH_WAY >=", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayLessThan(Byte value) {
            addCriterion("TEACH_WAY <", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayLessThanOrEqualTo(Byte value) {
            addCriterion("TEACH_WAY <=", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayIn(List<Byte> values) {
            addCriterion("TEACH_WAY in", values, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayNotIn(List<Byte> values) {
            addCriterion("TEACH_WAY not in", values, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayBetween(Byte value1, Byte value2) {
            addCriterion("TEACH_WAY between", value1, value2, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayNotBetween(Byte value1, Byte value2) {
            addCriterion("TEACH_WAY not between", value1, value2, "teachWay");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdIsNull() {
            addCriterion("LESSON_TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdIsNotNull() {
            addCriterion("LESSON_TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdEqualTo(Long value) {
            addCriterion("LESSON_TABLE_ID =", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdNotEqualTo(Long value) {
            addCriterion("LESSON_TABLE_ID <>", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdGreaterThan(Long value) {
            addCriterion("LESSON_TABLE_ID >", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LESSON_TABLE_ID >=", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdLessThan(Long value) {
            addCriterion("LESSON_TABLE_ID <", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdLessThanOrEqualTo(Long value) {
            addCriterion("LESSON_TABLE_ID <=", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdIn(List<Long> values) {
            addCriterion("LESSON_TABLE_ID in", values, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdNotIn(List<Long> values) {
            addCriterion("LESSON_TABLE_ID not in", values, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdBetween(Long value1, Long value2) {
            addCriterion("LESSON_TABLE_ID between", value1, value2, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdNotBetween(Long value1, Long value2) {
            addCriterion("LESSON_TABLE_ID not between", value1, value2, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdIsNull() {
            addCriterion("MASTER_CSST_ID is null");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdIsNotNull() {
            addCriterion("MASTER_CSST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdEqualTo(Long value) {
            addCriterion("MASTER_CSST_ID =", value, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdNotEqualTo(Long value) {
            addCriterion("MASTER_CSST_ID <>", value, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdGreaterThan(Long value) {
            addCriterion("MASTER_CSST_ID >", value, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MASTER_CSST_ID >=", value, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdLessThan(Long value) {
            addCriterion("MASTER_CSST_ID <", value, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdLessThanOrEqualTo(Long value) {
            addCriterion("MASTER_CSST_ID <=", value, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdIn(List<Long> values) {
            addCriterion("MASTER_CSST_ID in", values, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdNotIn(List<Long> values) {
            addCriterion("MASTER_CSST_ID not in", values, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdBetween(Long value1, Long value2) {
            addCriterion("MASTER_CSST_ID between", value1, value2, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andMasterCsstIdNotBetween(Long value1, Long value2) {
            addCriterion("MASTER_CSST_ID not between", value1, value2, "masterCsstId");
            return (Criteria) this;
        }

        public Criteria andIsLocalIsNull() {
            addCriterion("IS_LOCAL is null");
            return (Criteria) this;
        }

        public Criteria andIsLocalIsNotNull() {
            addCriterion("IS_LOCAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocalEqualTo(Boolean value) {
            addCriterion("IS_LOCAL =", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotEqualTo(Boolean value) {
            addCriterion("IS_LOCAL <>", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalGreaterThan(Boolean value) {
            addCriterion("IS_LOCAL >", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_LOCAL >=", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalLessThan(Boolean value) {
            addCriterion("IS_LOCAL <", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_LOCAL <=", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalIn(List<Boolean> values) {
            addCriterion("IS_LOCAL in", values, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotIn(List<Boolean> values) {
            addCriterion("IS_LOCAL not in", values, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_LOCAL between", value1, value2, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_LOCAL not between", value1, value2, "isLocal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
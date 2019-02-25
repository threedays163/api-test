package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccidentClassLessonCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccidentClassLessonCriteria() {
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

        public Criteria andAccidentIdIsNull() {
            addCriterion("ACCIDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccidentIdIsNotNull() {
            addCriterion("ACCIDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentIdEqualTo(Long value) {
            addCriterion("ACCIDENT_ID =", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdNotEqualTo(Long value) {
            addCriterion("ACCIDENT_ID <>", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdGreaterThan(Long value) {
            addCriterion("ACCIDENT_ID >", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCIDENT_ID >=", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdLessThan(Long value) {
            addCriterion("ACCIDENT_ID <", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCIDENT_ID <=", value, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdIn(List<Long> values) {
            addCriterion("ACCIDENT_ID in", values, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdNotIn(List<Long> values) {
            addCriterion("ACCIDENT_ID not in", values, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdBetween(Long value1, Long value2) {
            addCriterion("ACCIDENT_ID between", value1, value2, "accidentId");
            return (Criteria) this;
        }

        public Criteria andAccidentIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCIDENT_ID not between", value1, value2, "accidentId");
            return (Criteria) this;
        }

        public Criteria andCsstIdIsNull() {
            addCriterion("CSST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsstIdIsNotNull() {
            addCriterion("CSST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsstIdEqualTo(Long value) {
            addCriterion("CSST_ID =", value, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdNotEqualTo(Long value) {
            addCriterion("CSST_ID <>", value, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdGreaterThan(Long value) {
            addCriterion("CSST_ID >", value, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CSST_ID >=", value, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdLessThan(Long value) {
            addCriterion("CSST_ID <", value, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdLessThanOrEqualTo(Long value) {
            addCriterion("CSST_ID <=", value, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdIn(List<Long> values) {
            addCriterion("CSST_ID in", values, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdNotIn(List<Long> values) {
            addCriterion("CSST_ID not in", values, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdBetween(Long value1, Long value2) {
            addCriterion("CSST_ID between", value1, value2, "csstId");
            return (Criteria) this;
        }

        public Criteria andCsstIdNotBetween(Long value1, Long value2) {
            addCriterion("CSST_ID not between", value1, value2, "csstId");
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

        public Criteria andLessonDateIsNull() {
            addCriterion("LESSON_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLessonDateIsNotNull() {
            addCriterion("LESSON_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLessonDateEqualTo(Date value) {
            addCriterion("LESSON_DATE =", value, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateNotEqualTo(Date value) {
            addCriterion("LESSON_DATE <>", value, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateGreaterThan(Date value) {
            addCriterion("LESSON_DATE >", value, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LESSON_DATE >=", value, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateLessThan(Date value) {
            addCriterion("LESSON_DATE <", value, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateLessThanOrEqualTo(Date value) {
            addCriterion("LESSON_DATE <=", value, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateIn(List<Date> values) {
            addCriterion("LESSON_DATE in", values, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateNotIn(List<Date> values) {
            addCriterion("LESSON_DATE not in", values, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateBetween(Date value1, Date value2) {
            addCriterion("LESSON_DATE between", value1, value2, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDateNotBetween(Date value1, Date value2) {
            addCriterion("LESSON_DATE not between", value1, value2, "lessonDate");
            return (Criteria) this;
        }

        public Criteria andLessonDurationIsNull() {
            addCriterion("LESSON_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andLessonDurationIsNotNull() {
            addCriterion("LESSON_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andLessonDurationEqualTo(Integer value) {
            addCriterion("LESSON_DURATION =", value, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationNotEqualTo(Integer value) {
            addCriterion("LESSON_DURATION <>", value, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationGreaterThan(Integer value) {
            addCriterion("LESSON_DURATION >", value, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("LESSON_DURATION >=", value, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationLessThan(Integer value) {
            addCriterion("LESSON_DURATION <", value, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationLessThanOrEqualTo(Integer value) {
            addCriterion("LESSON_DURATION <=", value, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationIn(List<Integer> values) {
            addCriterion("LESSON_DURATION in", values, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationNotIn(List<Integer> values) {
            addCriterion("LESSON_DURATION not in", values, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationBetween(Integer value1, Integer value2) {
            addCriterion("LESSON_DURATION between", value1, value2, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andLessonDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("LESSON_DURATION not between", value1, value2, "lessonDuration");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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

        public Criteria andIsAdditionalIsNull() {
            addCriterion("IS_ADDITIONAL is null");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalIsNotNull() {
            addCriterion("IS_ADDITIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalEqualTo(Boolean value) {
            addCriterion("IS_ADDITIONAL =", value, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalNotEqualTo(Boolean value) {
            addCriterion("IS_ADDITIONAL <>", value, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalGreaterThan(Boolean value) {
            addCriterion("IS_ADDITIONAL >", value, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_ADDITIONAL >=", value, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalLessThan(Boolean value) {
            addCriterion("IS_ADDITIONAL <", value, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_ADDITIONAL <=", value, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalIn(List<Boolean> values) {
            addCriterion("IS_ADDITIONAL in", values, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalNotIn(List<Boolean> values) {
            addCriterion("IS_ADDITIONAL not in", values, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ADDITIONAL between", value1, value2, "isAdditional");
            return (Criteria) this;
        }

        public Criteria andIsAdditionalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ADDITIONAL not between", value1, value2, "isAdditional");
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

        public Criteria andHasCostIsNull() {
            addCriterion("HAS_COST is null");
            return (Criteria) this;
        }

        public Criteria andHasCostIsNotNull() {
            addCriterion("HAS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andHasCostEqualTo(Boolean value) {
            addCriterion("HAS_COST =", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostNotEqualTo(Boolean value) {
            addCriterion("HAS_COST <>", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostGreaterThan(Boolean value) {
            addCriterion("HAS_COST >", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HAS_COST >=", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostLessThan(Boolean value) {
            addCriterion("HAS_COST <", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostLessThanOrEqualTo(Boolean value) {
            addCriterion("HAS_COST <=", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostIn(List<Boolean> values) {
            addCriterion("HAS_COST in", values, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostNotIn(List<Boolean> values) {
            addCriterion("HAS_COST not in", values, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostBetween(Boolean value1, Boolean value2) {
            addCriterion("HAS_COST between", value1, value2, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HAS_COST not between", value1, value2, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasRewardIsNull() {
            addCriterion("HAS_REWARD is null");
            return (Criteria) this;
        }

        public Criteria andHasRewardIsNotNull() {
            addCriterion("HAS_REWARD is not null");
            return (Criteria) this;
        }

        public Criteria andHasRewardEqualTo(Boolean value) {
            addCriterion("HAS_REWARD =", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardNotEqualTo(Boolean value) {
            addCriterion("HAS_REWARD <>", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardGreaterThan(Boolean value) {
            addCriterion("HAS_REWARD >", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HAS_REWARD >=", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardLessThan(Boolean value) {
            addCriterion("HAS_REWARD <", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardLessThanOrEqualTo(Boolean value) {
            addCriterion("HAS_REWARD <=", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardIn(List<Boolean> values) {
            addCriterion("HAS_REWARD in", values, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardNotIn(List<Boolean> values) {
            addCriterion("HAS_REWARD not in", values, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardBetween(Boolean value1, Boolean value2) {
            addCriterion("HAS_REWARD between", value1, value2, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HAS_REWARD not between", value1, value2, "hasReward");
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

        public Criteria andIsDiscardIsNull() {
            addCriterion("IS_DISCARD is null");
            return (Criteria) this;
        }

        public Criteria andIsDiscardIsNotNull() {
            addCriterion("IS_DISCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiscardEqualTo(Boolean value) {
            addCriterion("IS_DISCARD =", value, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardNotEqualTo(Boolean value) {
            addCriterion("IS_DISCARD <>", value, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardGreaterThan(Boolean value) {
            addCriterion("IS_DISCARD >", value, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DISCARD >=", value, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardLessThan(Boolean value) {
            addCriterion("IS_DISCARD <", value, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DISCARD <=", value, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardIn(List<Boolean> values) {
            addCriterion("IS_DISCARD in", values, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardNotIn(List<Boolean> values) {
            addCriterion("IS_DISCARD not in", values, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DISCARD between", value1, value2, "isDiscard");
            return (Criteria) this;
        }

        public Criteria andIsDiscardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DISCARD not between", value1, value2, "isDiscard");
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

        public Criteria andLessonTableDetailIdIsNull() {
            addCriterion("LESSON_TABLE_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdIsNotNull() {
            addCriterion("LESSON_TABLE_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdEqualTo(Long value) {
            addCriterion("LESSON_TABLE_DETAIL_ID =", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdNotEqualTo(Long value) {
            addCriterion("LESSON_TABLE_DETAIL_ID <>", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdGreaterThan(Long value) {
            addCriterion("LESSON_TABLE_DETAIL_ID >", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LESSON_TABLE_DETAIL_ID >=", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdLessThan(Long value) {
            addCriterion("LESSON_TABLE_DETAIL_ID <", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("LESSON_TABLE_DETAIL_ID <=", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdIn(List<Long> values) {
            addCriterion("LESSON_TABLE_DETAIL_ID in", values, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdNotIn(List<Long> values) {
            addCriterion("LESSON_TABLE_DETAIL_ID not in", values, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdBetween(Long value1, Long value2) {
            addCriterion("LESSON_TABLE_DETAIL_ID between", value1, value2, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("LESSON_TABLE_DETAIL_ID not between", value1, value2, "lessonTableDetailId");
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
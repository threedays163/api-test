package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassStageSubjectCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassStageSubjectCriteria() {
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

        public Criteria andDayDurationIsNull() {
            addCriterion("DAY_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDayDurationIsNotNull() {
            addCriterion("DAY_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDayDurationEqualTo(Float value) {
            addCriterion("DAY_DURATION =", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationNotEqualTo(Float value) {
            addCriterion("DAY_DURATION <>", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationGreaterThan(Float value) {
            addCriterion("DAY_DURATION >", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationGreaterThanOrEqualTo(Float value) {
            addCriterion("DAY_DURATION >=", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationLessThan(Float value) {
            addCriterion("DAY_DURATION <", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationLessThanOrEqualTo(Float value) {
            addCriterion("DAY_DURATION <=", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationIn(List<Float> values) {
            addCriterion("DAY_DURATION in", values, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationNotIn(List<Float> values) {
            addCriterion("DAY_DURATION not in", values, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationBetween(Float value1, Float value2) {
            addCriterion("DAY_DURATION between", value1, value2, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationNotBetween(Float value1, Float value2) {
            addCriterion("DAY_DURATION not between", value1, value2, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationIsNull() {
            addCriterion("NIGHT_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andNightDurationIsNotNull() {
            addCriterion("NIGHT_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andNightDurationEqualTo(Integer value) {
            addCriterion("NIGHT_DURATION =", value, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationNotEqualTo(Integer value) {
            addCriterion("NIGHT_DURATION <>", value, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationGreaterThan(Integer value) {
            addCriterion("NIGHT_DURATION >", value, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("NIGHT_DURATION >=", value, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationLessThan(Integer value) {
            addCriterion("NIGHT_DURATION <", value, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationLessThanOrEqualTo(Integer value) {
            addCriterion("NIGHT_DURATION <=", value, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationIn(List<Integer> values) {
            addCriterion("NIGHT_DURATION in", values, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationNotIn(List<Integer> values) {
            addCriterion("NIGHT_DURATION not in", values, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationBetween(Integer value1, Integer value2) {
            addCriterion("NIGHT_DURATION between", value1, value2, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andNightDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("NIGHT_DURATION not between", value1, value2, "nightDuration");
            return (Criteria) this;
        }

        public Criteria andRealNumIsNull() {
            addCriterion("REAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRealNumIsNotNull() {
            addCriterion("REAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRealNumEqualTo(Integer value) {
            addCriterion("REAL_NUM =", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumNotEqualTo(Integer value) {
            addCriterion("REAL_NUM <>", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumGreaterThan(Integer value) {
            addCriterion("REAL_NUM >", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("REAL_NUM >=", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumLessThan(Integer value) {
            addCriterion("REAL_NUM <", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumLessThanOrEqualTo(Integer value) {
            addCriterion("REAL_NUM <=", value, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumIn(List<Integer> values) {
            addCriterion("REAL_NUM in", values, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumNotIn(List<Integer> values) {
            addCriterion("REAL_NUM not in", values, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumBetween(Integer value1, Integer value2) {
            addCriterion("REAL_NUM between", value1, value2, "realNum");
            return (Criteria) this;
        }

        public Criteria andRealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("REAL_NUM not between", value1, value2, "realNum");
            return (Criteria) this;
        }

        public Criteria andTotalDurationIsNull() {
            addCriterion("TOTAL_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andTotalDurationIsNotNull() {
            addCriterion("TOTAL_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDurationEqualTo(Integer value) {
            addCriterion("TOTAL_DURATION =", value, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationNotEqualTo(Integer value) {
            addCriterion("TOTAL_DURATION <>", value, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationGreaterThan(Integer value) {
            addCriterion("TOTAL_DURATION >", value, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_DURATION >=", value, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationLessThan(Integer value) {
            addCriterion("TOTAL_DURATION <", value, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_DURATION <=", value, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationIn(List<Integer> values) {
            addCriterion("TOTAL_DURATION in", values, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationNotIn(List<Integer> values) {
            addCriterion("TOTAL_DURATION not in", values, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_DURATION between", value1, value2, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andTotalDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_DURATION not between", value1, value2, "totalDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationIsNull() {
            addCriterion("PAIKE_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationIsNotNull() {
            addCriterion("PAIKE_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationEqualTo(Integer value) {
            addCriterion("PAIKE_DURATION =", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationNotEqualTo(Integer value) {
            addCriterion("PAIKE_DURATION <>", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationGreaterThan(Integer value) {
            addCriterion("PAIKE_DURATION >", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAIKE_DURATION >=", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationLessThan(Integer value) {
            addCriterion("PAIKE_DURATION <", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationLessThanOrEqualTo(Integer value) {
            addCriterion("PAIKE_DURATION <=", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationIn(List<Integer> values) {
            addCriterion("PAIKE_DURATION in", values, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationNotIn(List<Integer> values) {
            addCriterion("PAIKE_DURATION not in", values, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationBetween(Integer value1, Integer value2) {
            addCriterion("PAIKE_DURATION between", value1, value2, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("PAIKE_DURATION not between", value1, value2, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationIsNull() {
            addCriterion("FINISH_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andFinishDurationIsNotNull() {
            addCriterion("FINISH_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDurationEqualTo(Integer value) {
            addCriterion("FINISH_DURATION =", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationNotEqualTo(Integer value) {
            addCriterion("FINISH_DURATION <>", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationGreaterThan(Integer value) {
            addCriterion("FINISH_DURATION >", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINISH_DURATION >=", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationLessThan(Integer value) {
            addCriterion("FINISH_DURATION <", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationLessThanOrEqualTo(Integer value) {
            addCriterion("FINISH_DURATION <=", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationIn(List<Integer> values) {
            addCriterion("FINISH_DURATION in", values, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationNotIn(List<Integer> values) {
            addCriterion("FINISH_DURATION not in", values, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationBetween(Integer value1, Integer value2) {
            addCriterion("FINISH_DURATION between", value1, value2, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("FINISH_DURATION not between", value1, value2, "finishDuration");
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

        public Criteria andEnableIsNull() {
            addCriterion("`ENABLE` is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("`ENABLE` is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Boolean value) {
            addCriterion("`ENABLE` =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Boolean value) {
            addCriterion("`ENABLE` <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Boolean value) {
            addCriterion("`ENABLE` >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`ENABLE` >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Boolean value) {
            addCriterion("`ENABLE` <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("`ENABLE` <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Boolean> values) {
            addCriterion("`ENABLE` in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Boolean> values) {
            addCriterion("`ENABLE` not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("`ENABLE` between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`ENABLE` not between", value1, value2, "enable");
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
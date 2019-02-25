package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LessonModRecordCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LessonModRecordCriteria() {
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

        public Criteria andLessonIdIsNull() {
            addCriterion("LESSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNotNull() {
            addCriterion("LESSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLessonIdEqualTo(Long value) {
            addCriterion("LESSON_ID =", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotEqualTo(Long value) {
            addCriterion("LESSON_ID <>", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThan(Long value) {
            addCriterion("LESSON_ID >", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LESSON_ID >=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThan(Long value) {
            addCriterion("LESSON_ID <", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThanOrEqualTo(Long value) {
            addCriterion("LESSON_ID <=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdIn(List<Long> values) {
            addCriterion("LESSON_ID in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotIn(List<Long> values) {
            addCriterion("LESSON_ID not in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdBetween(Long value1, Long value2) {
            addCriterion("LESSON_ID between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotBetween(Long value1, Long value2) {
            addCriterion("LESSON_ID not between", value1, value2, "lessonId");
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

        public Criteria andModRecordBeforeIsNull() {
            addCriterion("MOD_RECORD_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeIsNotNull() {
            addCriterion("MOD_RECORD_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeEqualTo(String value) {
            addCriterion("MOD_RECORD_BEFORE =", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeNotEqualTo(String value) {
            addCriterion("MOD_RECORD_BEFORE <>", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeGreaterThan(String value) {
            addCriterion("MOD_RECORD_BEFORE >", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_RECORD_BEFORE >=", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeLessThan(String value) {
            addCriterion("MOD_RECORD_BEFORE <", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeLessThanOrEqualTo(String value) {
            addCriterion("MOD_RECORD_BEFORE <=", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeLike(String value) {
            addCriterion("MOD_RECORD_BEFORE like", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeNotLike(String value) {
            addCriterion("MOD_RECORD_BEFORE not like", value, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeIn(List<String> values) {
            addCriterion("MOD_RECORD_BEFORE in", values, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeNotIn(List<String> values) {
            addCriterion("MOD_RECORD_BEFORE not in", values, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeBetween(String value1, String value2) {
            addCriterion("MOD_RECORD_BEFORE between", value1, value2, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordBeforeNotBetween(String value1, String value2) {
            addCriterion("MOD_RECORD_BEFORE not between", value1, value2, "modRecordBefore");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterIsNull() {
            addCriterion("MOD_RECORD_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterIsNotNull() {
            addCriterion("MOD_RECORD_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterEqualTo(String value) {
            addCriterion("MOD_RECORD_AFTER =", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterNotEqualTo(String value) {
            addCriterion("MOD_RECORD_AFTER <>", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterGreaterThan(String value) {
            addCriterion("MOD_RECORD_AFTER >", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_RECORD_AFTER >=", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterLessThan(String value) {
            addCriterion("MOD_RECORD_AFTER <", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterLessThanOrEqualTo(String value) {
            addCriterion("MOD_RECORD_AFTER <=", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterLike(String value) {
            addCriterion("MOD_RECORD_AFTER like", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterNotLike(String value) {
            addCriterion("MOD_RECORD_AFTER not like", value, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterIn(List<String> values) {
            addCriterion("MOD_RECORD_AFTER in", values, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterNotIn(List<String> values) {
            addCriterion("MOD_RECORD_AFTER not in", values, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterBetween(String value1, String value2) {
            addCriterion("MOD_RECORD_AFTER between", value1, value2, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andModRecordAfterNotBetween(String value1, String value2) {
            addCriterion("MOD_RECORD_AFTER not between", value1, value2, "modRecordAfter");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
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
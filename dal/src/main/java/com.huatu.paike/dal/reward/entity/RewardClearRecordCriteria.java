package com.huatu.paike.dal.reward.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RewardClearRecordCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardClearRecordCriteria() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoIsNull() {
            addCriterion("teacher_staff_no is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoIsNotNull() {
            addCriterion("teacher_staff_no is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoEqualTo(String value) {
            addCriterion("teacher_staff_no =", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotEqualTo(String value) {
            addCriterion("teacher_staff_no <>", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoGreaterThan(String value) {
            addCriterion("teacher_staff_no >", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_staff_no >=", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoLessThan(String value) {
            addCriterion("teacher_staff_no <", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoLessThanOrEqualTo(String value) {
            addCriterion("teacher_staff_no <=", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoLike(String value) {
            addCriterion("teacher_staff_no like", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotLike(String value) {
            addCriterion("teacher_staff_no not like", value, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoIn(List<String> values) {
            addCriterion("teacher_staff_no in", values, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotIn(List<String> values) {
            addCriterion("teacher_staff_no not in", values, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoBetween(String value1, String value2) {
            addCriterion("teacher_staff_no between", value1, value2, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andTeacherStaffNoNotBetween(String value1, String value2) {
            addCriterion("teacher_staff_no not between", value1, value2, "teacherStaffNo");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("`year` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`year` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("`year` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("`year` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("`year` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("`year` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("`year` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("`year` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("`year` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("`year` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("`year` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("`year` not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("`month` is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("`month` is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("`month` =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("`month` <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("`month` >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("`month` >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("`month` <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("`month` <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("`month` in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("`month` not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("`month` between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("`month` not between", value1, value2, "month");
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

        public Criteria andClassNoIsNull() {
            addCriterion("CLASS_NO is null");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNotNull() {
            addCriterion("CLASS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClassNoEqualTo(String value) {
            addCriterion("CLASS_NO =", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotEqualTo(String value) {
            addCriterion("CLASS_NO <>", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThan(String value) {
            addCriterion("CLASS_NO >", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NO >=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThan(String value) {
            addCriterion("CLASS_NO <", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NO <=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLike(String value) {
            addCriterion("CLASS_NO like", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotLike(String value) {
            addCriterion("CLASS_NO not like", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoIn(List<String> values) {
            addCriterion("CLASS_NO in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotIn(List<String> values) {
            addCriterion("CLASS_NO not in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoBetween(String value1, String value2) {
            addCriterion("CLASS_NO between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotBetween(String value1, String value2) {
            addCriterion("CLASS_NO not between", value1, value2, "classNo");
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

        public Criteria andLessonIdIsNull() {
            addCriterion("lesson_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNotNull() {
            addCriterion("lesson_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonIdEqualTo(Long value) {
            addCriterion("lesson_id =", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotEqualTo(Long value) {
            addCriterion("lesson_id <>", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThan(Long value) {
            addCriterion("lesson_id >", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lesson_id >=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThan(Long value) {
            addCriterion("lesson_id <", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThanOrEqualTo(Long value) {
            addCriterion("lesson_id <=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdIn(List<Long> values) {
            addCriterion("lesson_id in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotIn(List<Long> values) {
            addCriterion("lesson_id not in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdBetween(Long value1, Long value2) {
            addCriterion("lesson_id between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotBetween(Long value1, Long value2) {
            addCriterion("lesson_id not between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearIsNull() {
            addCriterion("necessary_clear is null");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearIsNotNull() {
            addCriterion("necessary_clear is not null");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearEqualTo(Integer value) {
            addCriterion("necessary_clear =", value, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearNotEqualTo(Integer value) {
            addCriterion("necessary_clear <>", value, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearGreaterThan(Integer value) {
            addCriterion("necessary_clear >", value, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearGreaterThanOrEqualTo(Integer value) {
            addCriterion("necessary_clear >=", value, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearLessThan(Integer value) {
            addCriterion("necessary_clear <", value, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearLessThanOrEqualTo(Integer value) {
            addCriterion("necessary_clear <=", value, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearIn(List<Integer> values) {
            addCriterion("necessary_clear in", values, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearNotIn(List<Integer> values) {
            addCriterion("necessary_clear not in", values, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearBetween(Integer value1, Integer value2) {
            addCriterion("necessary_clear between", value1, value2, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andNecessaryClearNotBetween(Integer value1, Integer value2) {
            addCriterion("necessary_clear not between", value1, value2, "necessaryClear");
            return (Criteria) this;
        }

        public Criteria andDurationElseIsNull() {
            addCriterion("duration_else is null");
            return (Criteria) this;
        }

        public Criteria andDurationElseIsNotNull() {
            addCriterion("duration_else is not null");
            return (Criteria) this;
        }

        public Criteria andDurationElseEqualTo(Integer value) {
            addCriterion("duration_else =", value, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseNotEqualTo(Integer value) {
            addCriterion("duration_else <>", value, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseGreaterThan(Integer value) {
            addCriterion("duration_else >", value, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration_else >=", value, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseLessThan(Integer value) {
            addCriterion("duration_else <", value, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseLessThanOrEqualTo(Integer value) {
            addCriterion("duration_else <=", value, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseIn(List<Integer> values) {
            addCriterion("duration_else in", values, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseNotIn(List<Integer> values) {
            addCriterion("duration_else not in", values, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseBetween(Integer value1, Integer value2) {
            addCriterion("duration_else between", value1, value2, "durationElse");
            return (Criteria) this;
        }

        public Criteria andDurationElseNotBetween(Integer value1, Integer value2) {
            addCriterion("duration_else not between", value1, value2, "durationElse");
            return (Criteria) this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(Long value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(Long value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(Long value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(Long value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(Long value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(Long value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<Long> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<Long> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(Long value1, Long value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(Long value1, Long value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeIsNull() {
            addCriterion("NECESSARY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeIsNotNull() {
            addCriterion("NECESSARY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeEqualTo(Byte value) {
            addCriterion("NECESSARY_TYPE =", value, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeNotEqualTo(Byte value) {
            addCriterion("NECESSARY_TYPE <>", value, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeGreaterThan(Byte value) {
            addCriterion("NECESSARY_TYPE >", value, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NECESSARY_TYPE >=", value, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeLessThan(Byte value) {
            addCriterion("NECESSARY_TYPE <", value, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NECESSARY_TYPE <=", value, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeIn(List<Byte> values) {
            addCriterion("NECESSARY_TYPE in", values, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeNotIn(List<Byte> values) {
            addCriterion("NECESSARY_TYPE not in", values, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeBetween(Byte value1, Byte value2) {
            addCriterion("NECESSARY_TYPE between", value1, value2, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andNecessaryTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NECESSARY_TYPE not between", value1, value2, "necessaryType");
            return (Criteria) this;
        }

        public Criteria andExamWayIsNull() {
            addCriterion("EXAM_WAY is null");
            return (Criteria) this;
        }

        public Criteria andExamWayIsNotNull() {
            addCriterion("EXAM_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andExamWayEqualTo(String value) {
            addCriterion("EXAM_WAY =", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayNotEqualTo(String value) {
            addCriterion("EXAM_WAY <>", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayGreaterThan(String value) {
            addCriterion("EXAM_WAY >", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_WAY >=", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayLessThan(String value) {
            addCriterion("EXAM_WAY <", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayLessThanOrEqualTo(String value) {
            addCriterion("EXAM_WAY <=", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayLike(String value) {
            addCriterion("EXAM_WAY like", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayNotLike(String value) {
            addCriterion("EXAM_WAY not like", value, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayIn(List<String> values) {
            addCriterion("EXAM_WAY in", values, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayNotIn(List<String> values) {
            addCriterion("EXAM_WAY not in", values, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayBetween(String value1, String value2) {
            addCriterion("EXAM_WAY between", value1, value2, "examWay");
            return (Criteria) this;
        }

        public Criteria andExamWayNotBetween(String value1, String value2) {
            addCriterion("EXAM_WAY not between", value1, value2, "examWay");
            return (Criteria) this;
        }

        public Criteria andIsLectureIsNull() {
            addCriterion("IS_LECTURE is null");
            return (Criteria) this;
        }

        public Criteria andIsLectureIsNotNull() {
            addCriterion("IS_LECTURE is not null");
            return (Criteria) this;
        }

        public Criteria andIsLectureEqualTo(Boolean value) {
            addCriterion("IS_LECTURE =", value, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureNotEqualTo(Boolean value) {
            addCriterion("IS_LECTURE <>", value, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureGreaterThan(Boolean value) {
            addCriterion("IS_LECTURE >", value, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_LECTURE >=", value, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureLessThan(Boolean value) {
            addCriterion("IS_LECTURE <", value, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_LECTURE <=", value, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureIn(List<Boolean> values) {
            addCriterion("IS_LECTURE in", values, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureNotIn(List<Boolean> values) {
            addCriterion("IS_LECTURE not in", values, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_LECTURE between", value1, value2, "isLecture");
            return (Criteria) this;
        }

        public Criteria andIsLectureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_LECTURE not between", value1, value2, "isLecture");
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
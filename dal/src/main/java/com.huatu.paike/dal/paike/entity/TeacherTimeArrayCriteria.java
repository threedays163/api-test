package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherTimeArrayCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherTimeArrayCriteria() {
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

        public Criteria andTeacherNoIsNull() {
            addCriterion("teacher_no is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIsNotNull() {
            addCriterion("teacher_no is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoEqualTo(String value) {
            addCriterion("teacher_no =", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotEqualTo(String value) {
            addCriterion("teacher_no <>", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThan(String value) {
            addCriterion("teacher_no >", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_no >=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThan(String value) {
            addCriterion("teacher_no <", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThanOrEqualTo(String value) {
            addCriterion("teacher_no <=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLike(String value) {
            addCriterion("teacher_no like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotLike(String value) {
            addCriterion("teacher_no not like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIn(List<String> values) {
            addCriterion("teacher_no in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotIn(List<String> values) {
            addCriterion("teacher_no not in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoBetween(String value1, String value2) {
            addCriterion("teacher_no between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotBetween(String value1, String value2) {
            addCriterion("teacher_no not between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherIsNull() {
            addCriterion("is_double_teacher is null");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherIsNotNull() {
            addCriterion("is_double_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherEqualTo(Byte value) {
            addCriterion("is_double_teacher =", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherNotEqualTo(Byte value) {
            addCriterion("is_double_teacher <>", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherGreaterThan(Byte value) {
            addCriterion("is_double_teacher >", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_double_teacher >=", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherLessThan(Byte value) {
            addCriterion("is_double_teacher <", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherLessThanOrEqualTo(Byte value) {
            addCriterion("is_double_teacher <=", value, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherIn(List<Byte> values) {
            addCriterion("is_double_teacher in", values, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherNotIn(List<Byte> values) {
            addCriterion("is_double_teacher not in", values, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherBetween(Byte value1, Byte value2) {
            addCriterion("is_double_teacher between", value1, value2, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andIsDoubleTeacherNotBetween(Byte value1, Byte value2) {
            addCriterion("is_double_teacher not between", value1, value2, "isDoubleTeacher");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdIsNull() {
            addCriterion("lesson_table_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdIsNotNull() {
            addCriterion("lesson_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdEqualTo(Long value) {
            addCriterion("lesson_table_id =", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdNotEqualTo(Long value) {
            addCriterion("lesson_table_id <>", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdGreaterThan(Long value) {
            addCriterion("lesson_table_id >", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lesson_table_id >=", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdLessThan(Long value) {
            addCriterion("lesson_table_id <", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdLessThanOrEqualTo(Long value) {
            addCriterion("lesson_table_id <=", value, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdIn(List<Long> values) {
            addCriterion("lesson_table_id in", values, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdNotIn(List<Long> values) {
            addCriterion("lesson_table_id not in", values, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdBetween(Long value1, Long value2) {
            addCriterion("lesson_table_id between", value1, value2, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableIdNotBetween(Long value1, Long value2) {
            addCriterion("lesson_table_id not between", value1, value2, "lessonTableId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdIsNull() {
            addCriterion("lesson_table_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdIsNotNull() {
            addCriterion("lesson_table_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdEqualTo(Long value) {
            addCriterion("lesson_table_detail_id =", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdNotEqualTo(Long value) {
            addCriterion("lesson_table_detail_id <>", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdGreaterThan(Long value) {
            addCriterion("lesson_table_detail_id >", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lesson_table_detail_id >=", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdLessThan(Long value) {
            addCriterion("lesson_table_detail_id <", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("lesson_table_detail_id <=", value, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdIn(List<Long> values) {
            addCriterion("lesson_table_detail_id in", values, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdNotIn(List<Long> values) {
            addCriterion("lesson_table_detail_id not in", values, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdBetween(Long value1, Long value2) {
            addCriterion("lesson_table_detail_id between", value1, value2, "lessonTableDetailId");
            return (Criteria) this;
        }

        public Criteria andLessonTableDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("lesson_table_detail_id not between", value1, value2, "lessonTableDetailId");
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Long value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Long value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Long value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Long value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Long value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Long> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Long> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Long value1, Long value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Long value1, Long value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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
package com.huatu.paike.dal.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimeConfDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeConfDetailCriteria() {
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

        public Criteria andTimeConfIdIsNull() {
            addCriterion("TIME_CONF_ID is null");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdIsNotNull() {
            addCriterion("TIME_CONF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdEqualTo(Long value) {
            addCriterion("TIME_CONF_ID =", value, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdNotEqualTo(Long value) {
            addCriterion("TIME_CONF_ID <>", value, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdGreaterThan(Long value) {
            addCriterion("TIME_CONF_ID >", value, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TIME_CONF_ID >=", value, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdLessThan(Long value) {
            addCriterion("TIME_CONF_ID <", value, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdLessThanOrEqualTo(Long value) {
            addCriterion("TIME_CONF_ID <=", value, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdIn(List<Long> values) {
            addCriterion("TIME_CONF_ID in", values, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdNotIn(List<Long> values) {
            addCriterion("TIME_CONF_ID not in", values, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdBetween(Long value1, Long value2) {
            addCriterion("TIME_CONF_ID between", value1, value2, "timeConfId");
            return (Criteria) this;
        }

        public Criteria andTimeConfIdNotBetween(Long value1, Long value2) {
            addCriterion("TIME_CONF_ID not between", value1, value2, "timeConfId");
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

        public Criteria andStartTimeStrIsNull() {
            addCriterion("START_TIME_STR is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrIsNotNull() {
            addCriterion("START_TIME_STR is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrEqualTo(String value) {
            addCriterion("START_TIME_STR =", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrNotEqualTo(String value) {
            addCriterion("START_TIME_STR <>", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrGreaterThan(String value) {
            addCriterion("START_TIME_STR >", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME_STR >=", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrLessThan(String value) {
            addCriterion("START_TIME_STR <", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrLessThanOrEqualTo(String value) {
            addCriterion("START_TIME_STR <=", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrLike(String value) {
            addCriterion("START_TIME_STR like", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrNotLike(String value) {
            addCriterion("START_TIME_STR not like", value, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrIn(List<String> values) {
            addCriterion("START_TIME_STR in", values, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrNotIn(List<String> values) {
            addCriterion("START_TIME_STR not in", values, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrBetween(String value1, String value2) {
            addCriterion("START_TIME_STR between", value1, value2, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andStartTimeStrNotBetween(String value1, String value2) {
            addCriterion("START_TIME_STR not between", value1, value2, "startTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrIsNull() {
            addCriterion("END_TIME_STR is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrIsNotNull() {
            addCriterion("END_TIME_STR is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrEqualTo(String value) {
            addCriterion("END_TIME_STR =", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrNotEqualTo(String value) {
            addCriterion("END_TIME_STR <>", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrGreaterThan(String value) {
            addCriterion("END_TIME_STR >", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME_STR >=", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrLessThan(String value) {
            addCriterion("END_TIME_STR <", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrLessThanOrEqualTo(String value) {
            addCriterion("END_TIME_STR <=", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrLike(String value) {
            addCriterion("END_TIME_STR like", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrNotLike(String value) {
            addCriterion("END_TIME_STR not like", value, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrIn(List<String> values) {
            addCriterion("END_TIME_STR in", values, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrNotIn(List<String> values) {
            addCriterion("END_TIME_STR not in", values, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrBetween(String value1, String value2) {
            addCriterion("END_TIME_STR between", value1, value2, "endTimeStr");
            return (Criteria) this;
        }

        public Criteria andEndTimeStrNotBetween(String value1, String value2) {
            addCriterion("END_TIME_STR not between", value1, value2, "endTimeStr");
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
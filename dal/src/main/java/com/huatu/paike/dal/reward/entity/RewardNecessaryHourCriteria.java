package com.huatu.paike.dal.reward.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RewardNecessaryHourCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardNecessaryHourCriteria() {
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

        public Criteria andNecessaryIsNull() {
            addCriterion("necessary is null");
            return (Criteria) this;
        }

        public Criteria andNecessaryIsNotNull() {
            addCriterion("necessary is not null");
            return (Criteria) this;
        }

        public Criteria andNecessaryEqualTo(Integer value) {
            addCriterion("necessary =", value, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryNotEqualTo(Integer value) {
            addCriterion("necessary <>", value, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryGreaterThan(Integer value) {
            addCriterion("necessary >", value, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("necessary >=", value, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryLessThan(Integer value) {
            addCriterion("necessary <", value, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryLessThanOrEqualTo(Integer value) {
            addCriterion("necessary <=", value, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryIn(List<Integer> values) {
            addCriterion("necessary in", values, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryNotIn(List<Integer> values) {
            addCriterion("necessary not in", values, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryBetween(Integer value1, Integer value2) {
            addCriterion("necessary between", value1, value2, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryNotBetween(Integer value1, Integer value2) {
            addCriterion("necessary not between", value1, value2, "necessary");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseIsNull() {
            addCriterion("necessary_else is null");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseIsNotNull() {
            addCriterion("necessary_else is not null");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseEqualTo(Integer value) {
            addCriterion("necessary_else =", value, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseNotEqualTo(Integer value) {
            addCriterion("necessary_else <>", value, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseGreaterThan(Integer value) {
            addCriterion("necessary_else >", value, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseGreaterThanOrEqualTo(Integer value) {
            addCriterion("necessary_else >=", value, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseLessThan(Integer value) {
            addCriterion("necessary_else <", value, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseLessThanOrEqualTo(Integer value) {
            addCriterion("necessary_else <=", value, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseIn(List<Integer> values) {
            addCriterion("necessary_else in", values, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseNotIn(List<Integer> values) {
            addCriterion("necessary_else not in", values, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseBetween(Integer value1, Integer value2) {
            addCriterion("necessary_else between", value1, value2, "necessaryElse");
            return (Criteria) this;
        }

        public Criteria andNecessaryElseNotBetween(Integer value1, Integer value2) {
            addCriterion("necessary_else not between", value1, value2, "necessaryElse");
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
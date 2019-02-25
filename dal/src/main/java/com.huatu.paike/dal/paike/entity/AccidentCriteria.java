package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccidentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccidentCriteria() {
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

        public Criteria andTeacherNoIsNull() {
            addCriterion("TEACHER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIsNotNull() {
            addCriterion("TEACHER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoEqualTo(String value) {
            addCriterion("TEACHER_NO =", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotEqualTo(String value) {
            addCriterion("TEACHER_NO <>", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThan(String value) {
            addCriterion("TEACHER_NO >", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_NO >=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThan(String value) {
            addCriterion("TEACHER_NO <", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_NO <=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLike(String value) {
            addCriterion("TEACHER_NO like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotLike(String value) {
            addCriterion("TEACHER_NO not like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIn(List<String> values) {
            addCriterion("TEACHER_NO in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotIn(List<String> values) {
            addCriterion("TEACHER_NO not in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoBetween(String value1, String value2) {
            addCriterion("TEACHER_NO between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotBetween(String value1, String value2) {
            addCriterion("TEACHER_NO not between", value1, value2, "teacherNo");
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

        public Criteria andArrangeTypeIsNull() {
            addCriterion("ARRANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeIsNotNull() {
            addCriterion("ARRANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeEqualTo(Byte value) {
            addCriterion("ARRANGE_TYPE =", value, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeNotEqualTo(Byte value) {
            addCriterion("ARRANGE_TYPE <>", value, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeGreaterThan(Byte value) {
            addCriterion("ARRANGE_TYPE >", value, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ARRANGE_TYPE >=", value, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeLessThan(Byte value) {
            addCriterion("ARRANGE_TYPE <", value, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ARRANGE_TYPE <=", value, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeIn(List<Byte> values) {
            addCriterion("ARRANGE_TYPE in", values, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeNotIn(List<Byte> values) {
            addCriterion("ARRANGE_TYPE not in", values, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeBetween(Byte value1, Byte value2) {
            addCriterion("ARRANGE_TYPE between", value1, value2, "arrangeType");
            return (Criteria) this;
        }

        public Criteria andArrangeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ARRANGE_TYPE not between", value1, value2, "arrangeType");
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
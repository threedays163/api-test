package com.huatu.paike.dal.message.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SendFailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendFailCriteria() {
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

        public Criteria andTypeIsNull() {
            addCriterion("`TYPE` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`TYPE` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`TYPE` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`TYPE` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`TYPE` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`TYPE` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`TYPE` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`TYPE` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`TYPE` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`TYPE` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`TYPE` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`TYPE` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andModualClassIsNull() {
            addCriterion("MODUAL_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andModualClassIsNotNull() {
            addCriterion("MODUAL_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andModualClassEqualTo(String value) {
            addCriterion("MODUAL_CLASS =", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassNotEqualTo(String value) {
            addCriterion("MODUAL_CLASS <>", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassGreaterThan(String value) {
            addCriterion("MODUAL_CLASS >", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassGreaterThanOrEqualTo(String value) {
            addCriterion("MODUAL_CLASS >=", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassLessThan(String value) {
            addCriterion("MODUAL_CLASS <", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassLessThanOrEqualTo(String value) {
            addCriterion("MODUAL_CLASS <=", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassLike(String value) {
            addCriterion("MODUAL_CLASS like", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassNotLike(String value) {
            addCriterion("MODUAL_CLASS not like", value, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassIn(List<String> values) {
            addCriterion("MODUAL_CLASS in", values, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassNotIn(List<String> values) {
            addCriterion("MODUAL_CLASS not in", values, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassBetween(String value1, String value2) {
            addCriterion("MODUAL_CLASS between", value1, value2, "modualClass");
            return (Criteria) this;
        }

        public Criteria andModualClassNotBetween(String value1, String value2) {
            addCriterion("MODUAL_CLASS not between", value1, value2, "modualClass");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("TOPIC is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("TOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("TOPIC =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("TOPIC <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("TOPIC >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("TOPIC <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("TOPIC <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("TOPIC like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("TOPIC not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("TOPIC in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("TOPIC not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("TOPIC between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("TOPIC not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("`KEY` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`KEY` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("`KEY` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("`KEY` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("`KEY` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`KEY` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("`KEY` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("`KEY` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("`KEY` like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("`KEY` not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("`KEY` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("`KEY` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("`KEY` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("`KEY` not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("`MODULE` is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("`MODULE` is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(Byte value) {
            addCriterion("`MODULE` =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(Byte value) {
            addCriterion("`MODULE` <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(Byte value) {
            addCriterion("`MODULE` >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(Byte value) {
            addCriterion("`MODULE` >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(Byte value) {
            addCriterion("`MODULE` <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(Byte value) {
            addCriterion("`MODULE` <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<Byte> values) {
            addCriterion("`MODULE` in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<Byte> values) {
            addCriterion("`MODULE` not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(Byte value1, Byte value2) {
            addCriterion("`MODULE` between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(Byte value1, Byte value2) {
            addCriterion("`MODULE` not between", value1, value2, "module");
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

        public Criteria andStatusIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Date value) {
            addCriterion("SUCCESS_TIME =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Date value) {
            addCriterion("SUCCESS_TIME >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Date value) {
            addCriterion("SUCCESS_TIME <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Date> values) {
            addCriterion("SUCCESS_TIME in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Date> values) {
            addCriterion("SUCCESS_TIME not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME not between", value1, value2, "successTime");
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
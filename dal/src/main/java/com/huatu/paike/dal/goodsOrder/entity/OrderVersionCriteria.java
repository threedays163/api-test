package com.huatu.paike.dal.goodsOrder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderVersionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderVersionCriteria() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNull() {
            addCriterion("ORDER_GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNotNull() {
            addCriterion("ORDER_GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdEqualTo(Long value) {
            addCriterion("ORDER_GOODS_ID =", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotEqualTo(Long value) {
            addCriterion("ORDER_GOODS_ID <>", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThan(Long value) {
            addCriterion("ORDER_GOODS_ID >", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_GOODS_ID >=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThan(Long value) {
            addCriterion("ORDER_GOODS_ID <", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_GOODS_ID <=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIn(List<Long> values) {
            addCriterion("ORDER_GOODS_ID in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotIn(List<Long> values) {
            addCriterion("ORDER_GOODS_ID not in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_GOODS_ID between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_GOODS_ID not between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andJsonIsNull() {
            addCriterion("JSON is null");
            return (Criteria) this;
        }

        public Criteria andJsonIsNotNull() {
            addCriterion("JSON is not null");
            return (Criteria) this;
        }

        public Criteria andJsonEqualTo(String value) {
            addCriterion("JSON =", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotEqualTo(String value) {
            addCriterion("JSON <>", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonGreaterThan(String value) {
            addCriterion("JSON >", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonGreaterThanOrEqualTo(String value) {
            addCriterion("JSON >=", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonLessThan(String value) {
            addCriterion("JSON <", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonLessThanOrEqualTo(String value) {
            addCriterion("JSON <=", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonLike(String value) {
            addCriterion("JSON like", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotLike(String value) {
            addCriterion("JSON not like", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonIn(List<String> values) {
            addCriterion("JSON in", values, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotIn(List<String> values) {
            addCriterion("JSON not in", values, "json");
            return (Criteria) this;
        }

        public Criteria andJsonBetween(String value1, String value2) {
            addCriterion("JSON between", value1, value2, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotBetween(String value1, String value2) {
            addCriterion("JSON not between", value1, value2, "json");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Integer value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Integer value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Integer value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Integer value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Integer> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Integer> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_NUM not between", value1, value2, "seqNum");
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

        public Criteria andSourceIsNull() {
            addCriterion("`SOURCE` is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("`SOURCE` is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("`SOURCE` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("`SOURCE` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("`SOURCE` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("`SOURCE` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("`SOURCE` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("`SOURCE` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("`SOURCE` like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("`SOURCE` not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("`SOURCE` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("`SOURCE` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("`SOURCE` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("`SOURCE` not between", value1, value2, "source");
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
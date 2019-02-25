package com.huatu.paike.dal.feedback.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackProcedureCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackProcedureCriteria() {
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

        public Criteria andFeedbackIdIsNull() {
            addCriterion("FEEDBACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("FEEDBACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(Long value) {
            addCriterion("FEEDBACK_ID =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(Long value) {
            addCriterion("FEEDBACK_ID <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(Long value) {
            addCriterion("FEEDBACK_ID >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_ID >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(Long value) {
            addCriterion("FEEDBACK_ID <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_ID <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<Long> values) {
            addCriterion("FEEDBACK_ID in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<Long> values) {
            addCriterion("FEEDBACK_ID not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_ID between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_ID not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoIsNull() {
            addCriterion("FEEDBACK_NO is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoIsNotNull() {
            addCriterion("FEEDBACK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoEqualTo(String value) {
            addCriterion("FEEDBACK_NO =", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoNotEqualTo(String value) {
            addCriterion("FEEDBACK_NO <>", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoGreaterThan(String value) {
            addCriterion("FEEDBACK_NO >", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_NO >=", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoLessThan(String value) {
            addCriterion("FEEDBACK_NO <", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_NO <=", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoLike(String value) {
            addCriterion("FEEDBACK_NO like", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoNotLike(String value) {
            addCriterion("FEEDBACK_NO not like", value, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoIn(List<String> values) {
            addCriterion("FEEDBACK_NO in", values, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoNotIn(List<String> values) {
            addCriterion("FEEDBACK_NO not in", values, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoBetween(String value1, String value2) {
            addCriterion("FEEDBACK_NO between", value1, value2, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andFeedbackNoNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_NO not between", value1, value2, "feedbackNo");
            return (Criteria) this;
        }

        public Criteria andRewardFinishIsNull() {
            addCriterion("REWARD_FINISH is null");
            return (Criteria) this;
        }

        public Criteria andRewardFinishIsNotNull() {
            addCriterion("REWARD_FINISH is not null");
            return (Criteria) this;
        }

        public Criteria andRewardFinishEqualTo(Byte value) {
            addCriterion("REWARD_FINISH =", value, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishNotEqualTo(Byte value) {
            addCriterion("REWARD_FINISH <>", value, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishGreaterThan(Byte value) {
            addCriterion("REWARD_FINISH >", value, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishGreaterThanOrEqualTo(Byte value) {
            addCriterion("REWARD_FINISH >=", value, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishLessThan(Byte value) {
            addCriterion("REWARD_FINISH <", value, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishLessThanOrEqualTo(Byte value) {
            addCriterion("REWARD_FINISH <=", value, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishIn(List<Byte> values) {
            addCriterion("REWARD_FINISH in", values, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishNotIn(List<Byte> values) {
            addCriterion("REWARD_FINISH not in", values, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishBetween(Byte value1, Byte value2) {
            addCriterion("REWARD_FINISH between", value1, value2, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andRewardFinishNotBetween(Byte value1, Byte value2) {
            addCriterion("REWARD_FINISH not between", value1, value2, "rewardFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishIsNull() {
            addCriterion("PUSH_TO_SHIZI_FINISH is null");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishIsNotNull() {
            addCriterion("PUSH_TO_SHIZI_FINISH is not null");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishEqualTo(Byte value) {
            addCriterion("PUSH_TO_SHIZI_FINISH =", value, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishNotEqualTo(Byte value) {
            addCriterion("PUSH_TO_SHIZI_FINISH <>", value, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishGreaterThan(Byte value) {
            addCriterion("PUSH_TO_SHIZI_FINISH >", value, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishGreaterThanOrEqualTo(Byte value) {
            addCriterion("PUSH_TO_SHIZI_FINISH >=", value, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishLessThan(Byte value) {
            addCriterion("PUSH_TO_SHIZI_FINISH <", value, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishLessThanOrEqualTo(Byte value) {
            addCriterion("PUSH_TO_SHIZI_FINISH <=", value, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishIn(List<Byte> values) {
            addCriterion("PUSH_TO_SHIZI_FINISH in", values, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishNotIn(List<Byte> values) {
            addCriterion("PUSH_TO_SHIZI_FINISH not in", values, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishBetween(Byte value1, Byte value2) {
            addCriterion("PUSH_TO_SHIZI_FINISH between", value1, value2, "pushToShiziFinish");
            return (Criteria) this;
        }

        public Criteria andPushToShiziFinishNotBetween(Byte value1, Byte value2) {
            addCriterion("PUSH_TO_SHIZI_FINISH not between", value1, value2, "pushToShiziFinish");
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

        public Criteria andRewardTimeIsNull() {
            addCriterion("REWARD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIsNotNull() {
            addCriterion("REWARD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRewardTimeEqualTo(Date value) {
            addCriterion("REWARD_TIME =", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotEqualTo(Date value) {
            addCriterion("REWARD_TIME <>", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeGreaterThan(Date value) {
            addCriterion("REWARD_TIME >", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REWARD_TIME >=", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeLessThan(Date value) {
            addCriterion("REWARD_TIME <", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeLessThanOrEqualTo(Date value) {
            addCriterion("REWARD_TIME <=", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIn(List<Date> values) {
            addCriterion("REWARD_TIME in", values, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotIn(List<Date> values) {
            addCriterion("REWARD_TIME not in", values, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeBetween(Date value1, Date value2) {
            addCriterion("REWARD_TIME between", value1, value2, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotBetween(Date value1, Date value2) {
            addCriterion("REWARD_TIME not between", value1, value2, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("PUSH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("PUSH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("PUSH_TIME =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("PUSH_TIME <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("PUSH_TIME >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PUSH_TIME >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("PUSH_TIME <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("PUSH_TIME <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("PUSH_TIME in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("PUSH_TIME not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("PUSH_TIME between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("PUSH_TIME not between", value1, value2, "pushTime");
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
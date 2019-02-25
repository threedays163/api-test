package com.huatu.paike.dal.cost.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostOrderStageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostOrderStageCriteria() {
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

        public Criteria andGoodsNoIsNull() {
            addCriterion("GOODS_NO is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("GOODS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("GOODS_NO =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("GOODS_NO <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("GOODS_NO >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NO >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("GOODS_NO <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NO <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("GOODS_NO like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("GOODS_NO not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("GOODS_NO in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("GOODS_NO not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("GOODS_NO between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("GOODS_NO not between", value1, value2, "goodsNo");
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

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Long value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Long value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Long value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Long value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Long value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Long value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Long> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Long> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Long value1, Long value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Long value1, Long value2) {
            addCriterion("COST not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("COST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("COST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(Byte value) {
            addCriterion("COST_TYPE =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(Byte value) {
            addCriterion("COST_TYPE <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(Byte value) {
            addCriterion("COST_TYPE >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("COST_TYPE >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(Byte value) {
            addCriterion("COST_TYPE <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(Byte value) {
            addCriterion("COST_TYPE <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<Byte> values) {
            addCriterion("COST_TYPE in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<Byte> values) {
            addCriterion("COST_TYPE not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(Byte value1, Byte value2) {
            addCriterion("COST_TYPE between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("COST_TYPE not between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIsNull() {
            addCriterion("PROTOCOL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIsNotNull() {
            addCriterion("PROTOCOL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE =", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE <>", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeGreaterThan(String value) {
            addCriterion("PROTOCOL_TYPE >", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE >=", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLessThan(String value) {
            addCriterion("PROTOCOL_TYPE <", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_TYPE <=", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLike(String value) {
            addCriterion("PROTOCOL_TYPE like", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotLike(String value) {
            addCriterion("PROTOCOL_TYPE not like", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIn(List<String> values) {
            addCriterion("PROTOCOL_TYPE in", values, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotIn(List<String> values) {
            addCriterion("PROTOCOL_TYPE not in", values, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeBetween(String value1, String value2) {
            addCriterion("PROTOCOL_TYPE between", value1, value2, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL_TYPE not between", value1, value2, "protocolType");
            return (Criteria) this;
        }

        public Criteria andFinishedDateIsNull() {
            addCriterion("FINISHED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFinishedDateIsNotNull() {
            addCriterion("FINISHED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedDateEqualTo(Date value) {
            addCriterion("FINISHED_DATE =", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateNotEqualTo(Date value) {
            addCriterion("FINISHED_DATE <>", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateGreaterThan(Date value) {
            addCriterion("FINISHED_DATE >", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISHED_DATE >=", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateLessThan(Date value) {
            addCriterion("FINISHED_DATE <", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateLessThanOrEqualTo(Date value) {
            addCriterion("FINISHED_DATE <=", value, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateIn(List<Date> values) {
            addCriterion("FINISHED_DATE in", values, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateNotIn(List<Date> values) {
            addCriterion("FINISHED_DATE not in", values, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateBetween(Date value1, Date value2) {
            addCriterion("FINISHED_DATE between", value1, value2, "finishedDate");
            return (Criteria) this;
        }

        public Criteria andFinishedDateNotBetween(Date value1, Date value2) {
            addCriterion("FINISHED_DATE not between", value1, value2, "finishedDate");
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

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Long value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Long value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Long value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Long value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Long> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Long> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Long value1, Long value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("SEQ_NUM not between", value1, value2, "seqNum");
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

        public Criteria andHasCostEqualTo(Byte value) {
            addCriterion("HAS_COST =", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostNotEqualTo(Byte value) {
            addCriterion("HAS_COST <>", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostGreaterThan(Byte value) {
            addCriterion("HAS_COST >", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostGreaterThanOrEqualTo(Byte value) {
            addCriterion("HAS_COST >=", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostLessThan(Byte value) {
            addCriterion("HAS_COST <", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostLessThanOrEqualTo(Byte value) {
            addCriterion("HAS_COST <=", value, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostIn(List<Byte> values) {
            addCriterion("HAS_COST in", values, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostNotIn(List<Byte> values) {
            addCriterion("HAS_COST not in", values, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostBetween(Byte value1, Byte value2) {
            addCriterion("HAS_COST between", value1, value2, "hasCost");
            return (Criteria) this;
        }

        public Criteria andHasCostNotBetween(Byte value1, Byte value2) {
            addCriterion("HAS_COST not between", value1, value2, "hasCost");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNull() {
            addCriterion("PUSH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNotNull() {
            addCriterion("PUSH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPushTypeEqualTo(Boolean value) {
            addCriterion("PUSH_TYPE =", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotEqualTo(Boolean value) {
            addCriterion("PUSH_TYPE <>", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThan(Boolean value) {
            addCriterion("PUSH_TYPE >", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PUSH_TYPE >=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThan(Boolean value) {
            addCriterion("PUSH_TYPE <", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("PUSH_TYPE <=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeIn(List<Boolean> values) {
            addCriterion("PUSH_TYPE in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotIn(List<Boolean> values) {
            addCriterion("PUSH_TYPE not in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("PUSH_TYPE between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PUSH_TYPE not between", value1, value2, "pushType");
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

        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("`SOURCE` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("`SOURCE` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("`SOURCE` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("`SOURCE` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Byte value) {
            addCriterion("`SOURCE` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("`SOURCE` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("`SOURCE` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("`SOURCE` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("`SOURCE` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
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
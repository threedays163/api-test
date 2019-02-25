package com.huatu.paike.dal.classes.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassInfoCriteria() {
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

        public Criteria andClassNameIsNull() {
            addCriterion("CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("CLASS_NAME =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("CLASS_NAME <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("CLASS_NAME >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("CLASS_NAME <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("CLASS_NAME like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("CLASS_NAME not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("CLASS_NAME in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("CLASS_NAME not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("CLASS_NAME between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_NAME not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("PRODUCT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("PRODUCT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Long value) {
            addCriterion("PRODUCT_TYPE_ID =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Long value) {
            addCriterion("PRODUCT_TYPE_ID <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Long value) {
            addCriterion("PRODUCT_TYPE_ID >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_TYPE_ID >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Long value) {
            addCriterion("PRODUCT_TYPE_ID <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_TYPE_ID <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Long> values) {
            addCriterion("PRODUCT_TYPE_ID in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Long> values) {
            addCriterion("PRODUCT_TYPE_ID not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_TYPE_ID between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_TYPE_ID not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andExamTypeIsNull() {
            addCriterion("EXAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExamTypeIsNotNull() {
            addCriterion("EXAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExamTypeEqualTo(String value) {
            addCriterion("EXAM_TYPE =", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotEqualTo(String value) {
            addCriterion("EXAM_TYPE <>", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeGreaterThan(String value) {
            addCriterion("EXAM_TYPE >", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_TYPE >=", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLessThan(String value) {
            addCriterion("EXAM_TYPE <", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLessThanOrEqualTo(String value) {
            addCriterion("EXAM_TYPE <=", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeLike(String value) {
            addCriterion("EXAM_TYPE like", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotLike(String value) {
            addCriterion("EXAM_TYPE not like", value, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeIn(List<String> values) {
            addCriterion("EXAM_TYPE in", values, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotIn(List<String> values) {
            addCriterion("EXAM_TYPE not in", values, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeBetween(String value1, String value2) {
            addCriterion("EXAM_TYPE between", value1, value2, "examType");
            return (Criteria) this;
        }

        public Criteria andExamTypeNotBetween(String value1, String value2) {
            addCriterion("EXAM_TYPE not between", value1, value2, "examType");
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

        public Criteria andBuIdIsNull() {
            addCriterion("BU_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuIdIsNotNull() {
            addCriterion("BU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuIdEqualTo(Long value) {
            addCriterion("BU_ID =", value, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdNotEqualTo(Long value) {
            addCriterion("BU_ID <>", value, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdGreaterThan(Long value) {
            addCriterion("BU_ID >", value, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BU_ID >=", value, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdLessThan(Long value) {
            addCriterion("BU_ID <", value, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdLessThanOrEqualTo(Long value) {
            addCriterion("BU_ID <=", value, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdIn(List<Long> values) {
            addCriterion("BU_ID in", values, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdNotIn(List<Long> values) {
            addCriterion("BU_ID not in", values, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdBetween(Long value1, Long value2) {
            addCriterion("BU_ID between", value1, value2, "buId");
            return (Criteria) this;
        }

        public Criteria andBuIdNotBetween(Long value1, Long value2) {
            addCriterion("BU_ID not between", value1, value2, "buId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(Long value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(Long value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(Long value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(Long value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(Long value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<Long> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<Long> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(Long value1, Long value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(Long value1, Long value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdIsNull() {
            addCriterion("SUBSECTORS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdIsNotNull() {
            addCriterion("SUBSECTORS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdEqualTo(Long value) {
            addCriterion("SUBSECTORS_ID =", value, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdNotEqualTo(Long value) {
            addCriterion("SUBSECTORS_ID <>", value, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdGreaterThan(Long value) {
            addCriterion("SUBSECTORS_ID >", value, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBSECTORS_ID >=", value, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdLessThan(Long value) {
            addCriterion("SUBSECTORS_ID <", value, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdLessThanOrEqualTo(Long value) {
            addCriterion("SUBSECTORS_ID <=", value, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdIn(List<Long> values) {
            addCriterion("SUBSECTORS_ID in", values, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdNotIn(List<Long> values) {
            addCriterion("SUBSECTORS_ID not in", values, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdBetween(Long value1, Long value2) {
            addCriterion("SUBSECTORS_ID between", value1, value2, "subsectorsId");
            return (Criteria) this;
        }

        public Criteria andSubsectorsIdNotBetween(Long value1, Long value2) {
            addCriterion("SUBSECTORS_ID not between", value1, value2, "subsectorsId");
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNull() {
            addCriterion("CLASS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNotNull() {
            addCriterion("CLASS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andClassStatusEqualTo(Byte value) {
            addCriterion("CLASS_STATUS =", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotEqualTo(Byte value) {
            addCriterion("CLASS_STATUS <>", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThan(Byte value) {
            addCriterion("CLASS_STATUS >", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("CLASS_STATUS >=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThan(Byte value) {
            addCriterion("CLASS_STATUS <", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThanOrEqualTo(Byte value) {
            addCriterion("CLASS_STATUS <=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusIn(List<Byte> values) {
            addCriterion("CLASS_STATUS in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotIn(List<Byte> values) {
            addCriterion("CLASS_STATUS not in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusBetween(Byte value1, Byte value2) {
            addCriterion("CLASS_STATUS between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("CLASS_STATUS not between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountIsNull() {
            addCriterion("MAX_STU_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountIsNotNull() {
            addCriterion("MAX_STU_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountEqualTo(Integer value) {
            addCriterion("MAX_STU_COUNT =", value, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountNotEqualTo(Integer value) {
            addCriterion("MAX_STU_COUNT <>", value, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountGreaterThan(Integer value) {
            addCriterion("MAX_STU_COUNT >", value, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_STU_COUNT >=", value, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountLessThan(Integer value) {
            addCriterion("MAX_STU_COUNT <", value, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_STU_COUNT <=", value, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountIn(List<Integer> values) {
            addCriterion("MAX_STU_COUNT in", values, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountNotIn(List<Integer> values) {
            addCriterion("MAX_STU_COUNT not in", values, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountBetween(Integer value1, Integer value2) {
            addCriterion("MAX_STU_COUNT between", value1, value2, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andMaxStuCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_STU_COUNT not between", value1, value2, "maxStuCount");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdIsNull() {
            addCriterion("HEAD_MASTER_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdIsNotNull() {
            addCriterion("HEAD_MASTER_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdEqualTo(Long value) {
            addCriterion("HEAD_MASTER_STAFF_ID =", value, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdNotEqualTo(Long value) {
            addCriterion("HEAD_MASTER_STAFF_ID <>", value, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdGreaterThan(Long value) {
            addCriterion("HEAD_MASTER_STAFF_ID >", value, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HEAD_MASTER_STAFF_ID >=", value, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdLessThan(Long value) {
            addCriterion("HEAD_MASTER_STAFF_ID <", value, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("HEAD_MASTER_STAFF_ID <=", value, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdIn(List<Long> values) {
            addCriterion("HEAD_MASTER_STAFF_ID in", values, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdNotIn(List<Long> values) {
            addCriterion("HEAD_MASTER_STAFF_ID not in", values, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdBetween(Long value1, Long value2) {
            addCriterion("HEAD_MASTER_STAFF_ID between", value1, value2, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andHeadMasterStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("HEAD_MASTER_STAFF_ID not between", value1, value2, "headMasterStaffId");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIsNull() {
            addCriterion("DURATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIsNotNull() {
            addCriterion("DURATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDurationTimeEqualTo(Integer value) {
            addCriterion("DURATION_TIME =", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotEqualTo(Integer value) {
            addCriterion("DURATION_TIME <>", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeGreaterThan(Integer value) {
            addCriterion("DURATION_TIME >", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DURATION_TIME >=", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeLessThan(Integer value) {
            addCriterion("DURATION_TIME <", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeLessThanOrEqualTo(Integer value) {
            addCriterion("DURATION_TIME <=", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIn(List<Integer> values) {
            addCriterion("DURATION_TIME in", values, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotIn(List<Integer> values) {
            addCriterion("DURATION_TIME not in", values, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeBetween(Integer value1, Integer value2) {
            addCriterion("DURATION_TIME between", value1, value2, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("DURATION_TIME not between", value1, value2, "durationTime");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationIsNull() {
            addCriterion("PAIKE_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationIsNotNull() {
            addCriterion("PAIKE_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationEqualTo(Long value) {
            addCriterion("PAIKE_DURATION =", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationNotEqualTo(Long value) {
            addCriterion("PAIKE_DURATION <>", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationGreaterThan(Long value) {
            addCriterion("PAIKE_DURATION >", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("PAIKE_DURATION >=", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationLessThan(Long value) {
            addCriterion("PAIKE_DURATION <", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationLessThanOrEqualTo(Long value) {
            addCriterion("PAIKE_DURATION <=", value, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationIn(List<Long> values) {
            addCriterion("PAIKE_DURATION in", values, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationNotIn(List<Long> values) {
            addCriterion("PAIKE_DURATION not in", values, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationBetween(Long value1, Long value2) {
            addCriterion("PAIKE_DURATION between", value1, value2, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andPaikeDurationNotBetween(Long value1, Long value2) {
            addCriterion("PAIKE_DURATION not between", value1, value2, "paikeDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationIsNull() {
            addCriterion("FINISH_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andFinishDurationIsNotNull() {
            addCriterion("FINISH_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDurationEqualTo(Long value) {
            addCriterion("FINISH_DURATION =", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationNotEqualTo(Long value) {
            addCriterion("FINISH_DURATION <>", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationGreaterThan(Long value) {
            addCriterion("FINISH_DURATION >", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("FINISH_DURATION >=", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationLessThan(Long value) {
            addCriterion("FINISH_DURATION <", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationLessThanOrEqualTo(Long value) {
            addCriterion("FINISH_DURATION <=", value, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationIn(List<Long> values) {
            addCriterion("FINISH_DURATION in", values, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationNotIn(List<Long> values) {
            addCriterion("FINISH_DURATION not in", values, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationBetween(Long value1, Long value2) {
            addCriterion("FINISH_DURATION between", value1, value2, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andFinishDurationNotBetween(Long value1, Long value2) {
            addCriterion("FINISH_DURATION not between", value1, value2, "finishDuration");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Long value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Long value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Long value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Long value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Long> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Long> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Long value1, Long value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Long value1, Long value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedIsNull() {
            addCriterion("IS_TEACHER_PROTECTED is null");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedIsNotNull() {
            addCriterion("IS_TEACHER_PROTECTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedEqualTo(Byte value) {
            addCriterion("IS_TEACHER_PROTECTED =", value, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedNotEqualTo(Byte value) {
            addCriterion("IS_TEACHER_PROTECTED <>", value, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedGreaterThan(Byte value) {
            addCriterion("IS_TEACHER_PROTECTED >", value, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_TEACHER_PROTECTED >=", value, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedLessThan(Byte value) {
            addCriterion("IS_TEACHER_PROTECTED <", value, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedLessThanOrEqualTo(Byte value) {
            addCriterion("IS_TEACHER_PROTECTED <=", value, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedIn(List<Byte> values) {
            addCriterion("IS_TEACHER_PROTECTED in", values, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedNotIn(List<Byte> values) {
            addCriterion("IS_TEACHER_PROTECTED not in", values, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedBetween(Byte value1, Byte value2) {
            addCriterion("IS_TEACHER_PROTECTED between", value1, value2, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andIsTeacherProtectedNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_TEACHER_PROTECTED not between", value1, value2, "isTeacherProtected");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Long value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Long value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Long value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Long value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Long value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Long> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Long> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Long value1, Long value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Long value1, Long value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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

        public Criteria andClassTypeIsNull() {
            addCriterion("CLASS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("CLASS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(Byte value) {
            addCriterion("CLASS_TYPE =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(Byte value) {
            addCriterion("CLASS_TYPE <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(Byte value) {
            addCriterion("CLASS_TYPE >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CLASS_TYPE >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(Byte value) {
            addCriterion("CLASS_TYPE <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CLASS_TYPE <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<Byte> values) {
            addCriterion("CLASS_TYPE in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<Byte> values) {
            addCriterion("CLASS_TYPE not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(Byte value1, Byte value2) {
            addCriterion("CLASS_TYPE between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CLASS_TYPE not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeIsNull() {
            addCriterion("IS_AUTO_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeIsNotNull() {
            addCriterion("IS_AUTO_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeEqualTo(Byte value) {
            addCriterion("IS_AUTO_INCOME =", value, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeNotEqualTo(Byte value) {
            addCriterion("IS_AUTO_INCOME <>", value, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeGreaterThan(Byte value) {
            addCriterion("IS_AUTO_INCOME >", value, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_AUTO_INCOME >=", value, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeLessThan(Byte value) {
            addCriterion("IS_AUTO_INCOME <", value, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeLessThanOrEqualTo(Byte value) {
            addCriterion("IS_AUTO_INCOME <=", value, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeIn(List<Byte> values) {
            addCriterion("IS_AUTO_INCOME in", values, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeNotIn(List<Byte> values) {
            addCriterion("IS_AUTO_INCOME not in", values, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeBetween(Byte value1, Byte value2) {
            addCriterion("IS_AUTO_INCOME between", value1, value2, "isAutoIncome");
            return (Criteria) this;
        }

        public Criteria andIsAutoIncomeNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_AUTO_INCOME not between", value1, value2, "isAutoIncome");
            return (Criteria) this;
        }

        //
        public Criteria andTeachWayIsNull() {
            addCriterion("TEACH_WAY is null");
            return (Criteria) this;
        }

        public Criteria andTeachWayIsNotNull() {
            addCriterion("TEACH_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andTeachWayEqualTo(Byte value) {
            addCriterion("TEACH_WAY =", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayNotEqualTo(Byte value) {
            addCriterion("TEACH_WAY <>", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayGreaterThan(Byte value) {
            addCriterion("TEACH_WAY >", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("TEACH_WAY >=", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayLessThan(Byte value) {
            addCriterion("TEACH_WAY <", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayLessThanOrEqualTo(Byte value) {
            addCriterion("TEACH_WAY <=", value, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayIn(List<Byte> values) {
            addCriterion("TEACH_WAY in", values, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayNotIn(List<Byte> values) {
            addCriterion("TEACH_WAY not in", values, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayBetween(Byte value1, Byte value2) {
            addCriterion("TEACH_WAY between", value1, value2, "teachWay");
            return (Criteria) this;
        }

        public Criteria andTeachWayNotBetween(Byte value1, Byte value2) {
            addCriterion("TEACH_WAY not between", value1, value2, "teachWay");
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
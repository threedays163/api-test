package com.huatu.paike.dal.goodsOrder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOldOrderNoIsNull() {
            addCriterion("OLD_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIsNotNull() {
            addCriterion("OLD_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoEqualTo(String value) {
            addCriterion("OLD_ORDER_NO =", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotEqualTo(String value) {
            addCriterion("OLD_ORDER_NO <>", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoGreaterThan(String value) {
            addCriterion("OLD_ORDER_NO >", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_ORDER_NO >=", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLessThan(String value) {
            addCriterion("OLD_ORDER_NO <", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLessThanOrEqualTo(String value) {
            addCriterion("OLD_ORDER_NO <=", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLike(String value) {
            addCriterion("OLD_ORDER_NO like", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotLike(String value) {
            addCriterion("OLD_ORDER_NO not like", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIn(List<String> values) {
            addCriterion("OLD_ORDER_NO in", values, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotIn(List<String> values) {
            addCriterion("OLD_ORDER_NO not in", values, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoBetween(String value1, String value2) {
            addCriterion("OLD_ORDER_NO between", value1, value2, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotBetween(String value1, String value2) {
            addCriterion("OLD_ORDER_NO not between", value1, value2, "oldOrderNo");
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

        public Criteria andLicenceIdIsNull() {
            addCriterion("LICENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLicenceIdIsNotNull() {
            addCriterion("LICENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceIdEqualTo(String value) {
            addCriterion("LICENCE_ID =", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotEqualTo(String value) {
            addCriterion("LICENCE_ID <>", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdGreaterThan(String value) {
            addCriterion("LICENCE_ID >", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("LICENCE_ID >=", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdLessThan(String value) {
            addCriterion("LICENCE_ID <", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdLessThanOrEqualTo(String value) {
            addCriterion("LICENCE_ID <=", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdLike(String value) {
            addCriterion("LICENCE_ID like", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotLike(String value) {
            addCriterion("LICENCE_ID not like", value, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdIn(List<String> values) {
            addCriterion("LICENCE_ID in", values, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotIn(List<String> values) {
            addCriterion("LICENCE_ID not in", values, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdBetween(String value1, String value2) {
            addCriterion("LICENCE_ID between", value1, value2, "licenceId");
            return (Criteria) this;
        }

        public Criteria andLicenceIdNotBetween(String value1, String value2) {
            addCriterion("LICENCE_ID not between", value1, value2, "licenceId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdIsNull() {
            addCriterion("ENTRY_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdIsNotNull() {
            addCriterion("ENTRY_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdEqualTo(Long value) {
            addCriterion("ENTRY_NODE_ID =", value, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdNotEqualTo(Long value) {
            addCriterion("ENTRY_NODE_ID <>", value, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdGreaterThan(Long value) {
            addCriterion("ENTRY_NODE_ID >", value, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ENTRY_NODE_ID >=", value, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdLessThan(Long value) {
            addCriterion("ENTRY_NODE_ID <", value, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("ENTRY_NODE_ID <=", value, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdIn(List<Long> values) {
            addCriterion("ENTRY_NODE_ID in", values, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdNotIn(List<Long> values) {
            addCriterion("ENTRY_NODE_ID not in", values, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdBetween(Long value1, Long value2) {
            addCriterion("ENTRY_NODE_ID between", value1, value2, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andEntryNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("ENTRY_NODE_ID not between", value1, value2, "entryNodeId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Long value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Long value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Long value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Long value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Long value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Long> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Long> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Long value1, Long value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Long value1, Long value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("STUDENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("STUDENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("STUDENT_NAME =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("STUDENT_NAME <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("STUDENT_NAME >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("STUDENT_NAME <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("STUDENT_NAME like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("STUDENT_NAME not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("STUDENT_NAME in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("STUDENT_NAME not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andIsMealIsNull() {
            addCriterion("IS_MEAL is null");
            return (Criteria) this;
        }

        public Criteria andIsMealIsNotNull() {
            addCriterion("IS_MEAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsMealEqualTo(Boolean value) {
            addCriterion("IS_MEAL =", value, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealNotEqualTo(Boolean value) {
            addCriterion("IS_MEAL <>", value, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealGreaterThan(Boolean value) {
            addCriterion("IS_MEAL >", value, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_MEAL >=", value, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealLessThan(Boolean value) {
            addCriterion("IS_MEAL <", value, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_MEAL <=", value, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealIn(List<Boolean> values) {
            addCriterion("IS_MEAL in", values, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealNotIn(List<Boolean> values) {
            addCriterion("IS_MEAL not in", values, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_MEAL between", value1, value2, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsMealNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_MEAL not between", value1, value2, "isMeal");
            return (Criteria) this;
        }

        public Criteria andIsBedIsNull() {
            addCriterion("IS_BED is null");
            return (Criteria) this;
        }

        public Criteria andIsBedIsNotNull() {
            addCriterion("IS_BED is not null");
            return (Criteria) this;
        }

        public Criteria andIsBedEqualTo(Boolean value) {
            addCriterion("IS_BED =", value, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedNotEqualTo(Boolean value) {
            addCriterion("IS_BED <>", value, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedGreaterThan(Boolean value) {
            addCriterion("IS_BED >", value, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_BED >=", value, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedLessThan(Boolean value) {
            addCriterion("IS_BED <", value, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_BED <=", value, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedIn(List<Boolean> values) {
            addCriterion("IS_BED in", values, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedNotIn(List<Boolean> values) {
            addCriterion("IS_BED not in", values, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_BED between", value1, value2, "isBed");
            return (Criteria) this;
        }

        public Criteria andIsBedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_BED not between", value1, value2, "isBed");
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

        public Criteria andOrderStateIsNull() {
            addCriterion("ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Byte value) {
            addCriterion("ORDER_STATE =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Byte value) {
            addCriterion("ORDER_STATE <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Byte value) {
            addCriterion("ORDER_STATE >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("ORDER_STATE >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Byte value) {
            addCriterion("ORDER_STATE <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Byte value) {
            addCriterion("ORDER_STATE <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Byte> values) {
            addCriterion("ORDER_STATE in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Byte> values) {
            addCriterion("ORDER_STATE not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Byte value1, Byte value2) {
            addCriterion("ORDER_STATE between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("ORDER_STATE not between", value1, value2, "orderState");
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

        public Criteria andBuyTimeIsNull() {
            addCriterion("BUY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("BUY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterion("BUY_TIME =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterion("BUY_TIME <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterion("BUY_TIME >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUY_TIME >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterion("BUY_TIME <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUY_TIME <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterion("BUY_TIME in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterion("BUY_TIME not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterion("BUY_TIME between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUY_TIME not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
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

        public Criteria andArrangedDurationIsNull() {
            addCriterion("ARRANGED_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationIsNotNull() {
            addCriterion("ARRANGED_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationEqualTo(Integer value) {
            addCriterion("ARRANGED_DURATION =", value, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationNotEqualTo(Integer value) {
            addCriterion("ARRANGED_DURATION <>", value, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationGreaterThan(Integer value) {
            addCriterion("ARRANGED_DURATION >", value, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARRANGED_DURATION >=", value, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationLessThan(Integer value) {
            addCriterion("ARRANGED_DURATION <", value, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationLessThanOrEqualTo(Integer value) {
            addCriterion("ARRANGED_DURATION <=", value, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationIn(List<Integer> values) {
            addCriterion("ARRANGED_DURATION in", values, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationNotIn(List<Integer> values) {
            addCriterion("ARRANGED_DURATION not in", values, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationBetween(Integer value1, Integer value2) {
            addCriterion("ARRANGED_DURATION between", value1, value2, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andArrangedDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("ARRANGED_DURATION not between", value1, value2, "arrangedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationIsNull() {
            addCriterion("ENDED_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andEndedDurationIsNotNull() {
            addCriterion("ENDED_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andEndedDurationEqualTo(Integer value) {
            addCriterion("ENDED_DURATION =", value, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationNotEqualTo(Integer value) {
            addCriterion("ENDED_DURATION <>", value, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationGreaterThan(Integer value) {
            addCriterion("ENDED_DURATION >", value, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENDED_DURATION >=", value, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationLessThan(Integer value) {
            addCriterion("ENDED_DURATION <", value, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationLessThanOrEqualTo(Integer value) {
            addCriterion("ENDED_DURATION <=", value, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationIn(List<Integer> values) {
            addCriterion("ENDED_DURATION in", values, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationNotIn(List<Integer> values) {
            addCriterion("ENDED_DURATION not in", values, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationBetween(Integer value1, Integer value2) {
            addCriterion("ENDED_DURATION between", value1, value2, "endedDuration");
            return (Criteria) this;
        }

        public Criteria andEndedDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("ENDED_DURATION not between", value1, value2, "endedDuration");
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

        public Criteria andAvailableIsNull() {
            addCriterion("AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Integer value) {
            addCriterion("AVAILABLE =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Integer value) {
            addCriterion("AVAILABLE <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Integer value) {
            addCriterion("AVAILABLE >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("AVAILABLE >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Integer value) {
            addCriterion("AVAILABLE <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("AVAILABLE <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Integer> values) {
            addCriterion("AVAILABLE in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Integer> values) {
            addCriterion("AVAILABLE not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Integer value1, Integer value2) {
            addCriterion("AVAILABLE between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("AVAILABLE not between", value1, value2, "available");
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

        public Criteria andScoreHavePassIsNull() {
            addCriterion("SCORE_HAVE_PASS is null");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassIsNotNull() {
            addCriterion("SCORE_HAVE_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassEqualTo(Boolean value) {
            addCriterion("SCORE_HAVE_PASS =", value, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassNotEqualTo(Boolean value) {
            addCriterion("SCORE_HAVE_PASS <>", value, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassGreaterThan(Boolean value) {
            addCriterion("SCORE_HAVE_PASS >", value, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SCORE_HAVE_PASS >=", value, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassLessThan(Boolean value) {
            addCriterion("SCORE_HAVE_PASS <", value, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassLessThanOrEqualTo(Boolean value) {
            addCriterion("SCORE_HAVE_PASS <=", value, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassIn(List<Boolean> values) {
            addCriterion("SCORE_HAVE_PASS in", values, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassNotIn(List<Boolean> values) {
            addCriterion("SCORE_HAVE_PASS not in", values, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassBetween(Boolean value1, Boolean value2) {
            addCriterion("SCORE_HAVE_PASS between", value1, value2, "scoreHavePass");
            return (Criteria) this;
        }

        public Criteria andScoreHavePassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SCORE_HAVE_PASS not between", value1, value2, "scoreHavePass");
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
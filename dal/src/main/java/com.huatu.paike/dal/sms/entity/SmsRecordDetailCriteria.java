package com.huatu.paike.dal.sms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsRecordDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsRecordDetailCriteria() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("RECORD_ID =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("RECORD_ID <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("RECORD_ID >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECORD_ID >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("RECORD_ID <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("RECORD_ID <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("RECORD_ID in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("RECORD_ID not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("RECORD_ID between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("RECORD_ID not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Long value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Long value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Long value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Long value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Long> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Long> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeIsNull() {
            addCriterion("RECIEVER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeIsNotNull() {
            addCriterion("RECIEVER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeEqualTo(Byte value) {
            addCriterion("RECIEVER_TYPE =", value, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeNotEqualTo(Byte value) {
            addCriterion("RECIEVER_TYPE <>", value, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeGreaterThan(Byte value) {
            addCriterion("RECIEVER_TYPE >", value, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("RECIEVER_TYPE >=", value, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeLessThan(Byte value) {
            addCriterion("RECIEVER_TYPE <", value, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeLessThanOrEqualTo(Byte value) {
            addCriterion("RECIEVER_TYPE <=", value, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeIn(List<Byte> values) {
            addCriterion("RECIEVER_TYPE in", values, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeNotIn(List<Byte> values) {
            addCriterion("RECIEVER_TYPE not in", values, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeBetween(Byte value1, Byte value2) {
            addCriterion("RECIEVER_TYPE between", value1, value2, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("RECIEVER_TYPE not between", value1, value2, "recieverType");
            return (Criteria) this;
        }

        public Criteria andRecieverIdIsNull() {
            addCriterion("RECIEVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecieverIdIsNotNull() {
            addCriterion("RECIEVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecieverIdEqualTo(Long value) {
            addCriterion("RECIEVER_ID =", value, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdNotEqualTo(Long value) {
            addCriterion("RECIEVER_ID <>", value, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdGreaterThan(Long value) {
            addCriterion("RECIEVER_ID >", value, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECIEVER_ID >=", value, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdLessThan(Long value) {
            addCriterion("RECIEVER_ID <", value, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdLessThanOrEqualTo(Long value) {
            addCriterion("RECIEVER_ID <=", value, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdIn(List<Long> values) {
            addCriterion("RECIEVER_ID in", values, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdNotIn(List<Long> values) {
            addCriterion("RECIEVER_ID not in", values, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdBetween(Long value1, Long value2) {
            addCriterion("RECIEVER_ID between", value1, value2, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverIdNotBetween(Long value1, Long value2) {
            addCriterion("RECIEVER_ID not between", value1, value2, "recieverId");
            return (Criteria) this;
        }

        public Criteria andRecieverNoIsNull() {
            addCriterion("RECIEVER_NO is null");
            return (Criteria) this;
        }

        public Criteria andRecieverNoIsNotNull() {
            addCriterion("RECIEVER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRecieverNoEqualTo(String value) {
            addCriterion("RECIEVER_NO =", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoNotEqualTo(String value) {
            addCriterion("RECIEVER_NO <>", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoGreaterThan(String value) {
            addCriterion("RECIEVER_NO >", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoGreaterThanOrEqualTo(String value) {
            addCriterion("RECIEVER_NO >=", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoLessThan(String value) {
            addCriterion("RECIEVER_NO <", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoLessThanOrEqualTo(String value) {
            addCriterion("RECIEVER_NO <=", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoLike(String value) {
            addCriterion("RECIEVER_NO like", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoNotLike(String value) {
            addCriterion("RECIEVER_NO not like", value, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoIn(List<String> values) {
            addCriterion("RECIEVER_NO in", values, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoNotIn(List<String> values) {
            addCriterion("RECIEVER_NO not in", values, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoBetween(String value1, String value2) {
            addCriterion("RECIEVER_NO between", value1, value2, "recieverNo");
            return (Criteria) this;
        }

        public Criteria andRecieverNoNotBetween(String value1, String value2) {
            addCriterion("RECIEVER_NO not between", value1, value2, "recieverNo");
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

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
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

        public Criteria andViewStatusIsNull() {
            addCriterion("VIEW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andViewStatusIsNotNull() {
            addCriterion("VIEW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andViewStatusEqualTo(Byte value) {
            addCriterion("VIEW_STATUS =", value, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusNotEqualTo(Byte value) {
            addCriterion("VIEW_STATUS <>", value, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusGreaterThan(Byte value) {
            addCriterion("VIEW_STATUS >", value, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("VIEW_STATUS >=", value, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusLessThan(Byte value) {
            addCriterion("VIEW_STATUS <", value, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("VIEW_STATUS <=", value, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusIn(List<Byte> values) {
            addCriterion("VIEW_STATUS in", values, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusNotIn(List<Byte> values) {
            addCriterion("VIEW_STATUS not in", values, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusBetween(Byte value1, Byte value2) {
            addCriterion("VIEW_STATUS between", value1, value2, "viewStatus");
            return (Criteria) this;
        }

        public Criteria andViewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("VIEW_STATUS not between", value1, value2, "viewStatus");
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
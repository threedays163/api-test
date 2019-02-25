package com.huatu.paike.dal.feedback.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedBackCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedBackCriteria() {
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

        public Criteria andStatusIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
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

        public Criteria andStudentSuggestionIsNull() {
            addCriterion("STUDENT_SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionIsNotNull() {
            addCriterion("STUDENT_SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionEqualTo(String value) {
            addCriterion("STUDENT_SUGGESTION =", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionNotEqualTo(String value) {
            addCriterion("STUDENT_SUGGESTION <>", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionGreaterThan(String value) {
            addCriterion("STUDENT_SUGGESTION >", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_SUGGESTION >=", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionLessThan(String value) {
            addCriterion("STUDENT_SUGGESTION <", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_SUGGESTION <=", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionLike(String value) {
            addCriterion("STUDENT_SUGGESTION like", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionNotLike(String value) {
            addCriterion("STUDENT_SUGGESTION not like", value, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionIn(List<String> values) {
            addCriterion("STUDENT_SUGGESTION in", values, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionNotIn(List<String> values) {
            addCriterion("STUDENT_SUGGESTION not in", values, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionBetween(String value1, String value2) {
            addCriterion("STUDENT_SUGGESTION between", value1, value2, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andStudentSuggestionNotBetween(String value1, String value2) {
            addCriterion("STUDENT_SUGGESTION not between", value1, value2, "studentSuggestion");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNull() {
            addCriterion("QUIT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNotNull() {
            addCriterion("QUIT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonEqualTo(String value) {
            addCriterion("QUIT_REASON =", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotEqualTo(String value) {
            addCriterion("QUIT_REASON <>", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThan(String value) {
            addCriterion("QUIT_REASON >", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON >=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThan(String value) {
            addCriterion("QUIT_REASON <", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON <=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLike(String value) {
            addCriterion("QUIT_REASON like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotLike(String value) {
            addCriterion("QUIT_REASON not like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIn(List<String> values) {
            addCriterion("QUIT_REASON in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotIn(List<String> values) {
            addCriterion("QUIT_REASON not in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonBetween(String value1, String value2) {
            addCriterion("QUIT_REASON between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotBetween(String value1, String value2) {
            addCriterion("QUIT_REASON not between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andEffctDescIsNull() {
            addCriterion("EFFCT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andEffctDescIsNotNull() {
            addCriterion("EFFCT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andEffctDescEqualTo(String value) {
            addCriterion("EFFCT_DESC =", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescNotEqualTo(String value) {
            addCriterion("EFFCT_DESC <>", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescGreaterThan(String value) {
            addCriterion("EFFCT_DESC >", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescGreaterThanOrEqualTo(String value) {
            addCriterion("EFFCT_DESC >=", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescLessThan(String value) {
            addCriterion("EFFCT_DESC <", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescLessThanOrEqualTo(String value) {
            addCriterion("EFFCT_DESC <=", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescLike(String value) {
            addCriterion("EFFCT_DESC like", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescNotLike(String value) {
            addCriterion("EFFCT_DESC not like", value, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescIn(List<String> values) {
            addCriterion("EFFCT_DESC in", values, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescNotIn(List<String> values) {
            addCriterion("EFFCT_DESC not in", values, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescBetween(String value1, String value2) {
            addCriterion("EFFCT_DESC between", value1, value2, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andEffctDescNotBetween(String value1, String value2) {
            addCriterion("EFFCT_DESC not between", value1, value2, "effctDesc");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestIsNull() {
            addCriterion("SUBSCHOOL_SUGGEST is null");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestIsNotNull() {
            addCriterion("SUBSCHOOL_SUGGEST is not null");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestEqualTo(String value) {
            addCriterion("SUBSCHOOL_SUGGEST =", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestNotEqualTo(String value) {
            addCriterion("SUBSCHOOL_SUGGEST <>", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestGreaterThan(String value) {
            addCriterion("SUBSCHOOL_SUGGEST >", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCHOOL_SUGGEST >=", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestLessThan(String value) {
            addCriterion("SUBSCHOOL_SUGGEST <", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestLessThanOrEqualTo(String value) {
            addCriterion("SUBSCHOOL_SUGGEST <=", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestLike(String value) {
            addCriterion("SUBSCHOOL_SUGGEST like", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestNotLike(String value) {
            addCriterion("SUBSCHOOL_SUGGEST not like", value, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestIn(List<String> values) {
            addCriterion("SUBSCHOOL_SUGGEST in", values, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestNotIn(List<String> values) {
            addCriterion("SUBSCHOOL_SUGGEST not in", values, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestBetween(String value1, String value2) {
            addCriterion("SUBSCHOOL_SUGGEST between", value1, value2, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andSubschoolSuggestNotBetween(String value1, String value2) {
            addCriterion("SUBSCHOOL_SUGGEST not between", value1, value2, "subschoolSuggest");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionIsNull() {
            addCriterion("TEACH_AGAIN_SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionIsNotNull() {
            addCriterion("TEACH_AGAIN_SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionEqualTo(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION =", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionNotEqualTo(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION <>", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionGreaterThan(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION >", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION >=", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionLessThan(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION <", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionLessThanOrEqualTo(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION <=", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionLike(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION like", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionNotLike(String value) {
            addCriterion("TEACH_AGAIN_SUGGESTION not like", value, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionIn(List<String> values) {
            addCriterion("TEACH_AGAIN_SUGGESTION in", values, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionNotIn(List<String> values) {
            addCriterion("TEACH_AGAIN_SUGGESTION not in", values, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionBetween(String value1, String value2) {
            addCriterion("TEACH_AGAIN_SUGGESTION between", value1, value2, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTeachAgainSuggestionNotBetween(String value1, String value2) {
            addCriterion("TEACH_AGAIN_SUGGESTION not between", value1, value2, "teachAgainSuggestion");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
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

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Date value) {
            addCriterion("FEEDBACK_TIME >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Date value) {
            addCriterion("FEEDBACK_TIME <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_TIME <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Date> values) {
            addCriterion("FEEDBACK_TIME in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Date> values) {
            addCriterion("FEEDBACK_TIME not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_TIME between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_TIME not between", value1, value2, "feedbackTime");
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
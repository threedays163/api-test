package com.huatu.paike.dal.paike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoFragmentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoFragmentCriteria() {
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

        public Criteria andCloudRoomIdIsNull() {
            addCriterion("CLOUD_ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdIsNotNull() {
            addCriterion("CLOUD_ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdEqualTo(String value) {
            addCriterion("CLOUD_ROOM_ID =", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdNotEqualTo(String value) {
            addCriterion("CLOUD_ROOM_ID <>", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdGreaterThan(String value) {
            addCriterion("CLOUD_ROOM_ID >", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLOUD_ROOM_ID >=", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdLessThan(String value) {
            addCriterion("CLOUD_ROOM_ID <", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdLessThanOrEqualTo(String value) {
            addCriterion("CLOUD_ROOM_ID <=", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdLike(String value) {
            addCriterion("CLOUD_ROOM_ID like", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdNotLike(String value) {
            addCriterion("CLOUD_ROOM_ID not like", value, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdIn(List<String> values) {
            addCriterion("CLOUD_ROOM_ID in", values, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdNotIn(List<String> values) {
            addCriterion("CLOUD_ROOM_ID not in", values, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdBetween(String value1, String value2) {
            addCriterion("CLOUD_ROOM_ID between", value1, value2, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andCloudRoomIdNotBetween(String value1, String value2) {
            addCriterion("CLOUD_ROOM_ID not between", value1, value2, "cloudRoomId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdIsNull() {
            addCriterion("RELATE_TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdIsNotNull() {
            addCriterion("RELATE_TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdEqualTo(Long value) {
            addCriterion("RELATE_TEMPLATE_ID =", value, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdNotEqualTo(Long value) {
            addCriterion("RELATE_TEMPLATE_ID <>", value, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdGreaterThan(Long value) {
            addCriterion("RELATE_TEMPLATE_ID >", value, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RELATE_TEMPLATE_ID >=", value, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdLessThan(Long value) {
            addCriterion("RELATE_TEMPLATE_ID <", value, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("RELATE_TEMPLATE_ID <=", value, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdIn(List<Long> values) {
            addCriterion("RELATE_TEMPLATE_ID in", values, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdNotIn(List<Long> values) {
            addCriterion("RELATE_TEMPLATE_ID not in", values, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdBetween(Long value1, Long value2) {
            addCriterion("RELATE_TEMPLATE_ID between", value1, value2, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andRelateTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("RELATE_TEMPLATE_ID not between", value1, value2, "relateTemplateId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`DATE` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`DATE` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`DATE` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`DATE` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`DATE` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`DATE` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`DATE` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`DATE` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`DATE` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`DATE` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`DATE` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`DATE` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(Long value) {
            addCriterion("SESSION_ID =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(Long value) {
            addCriterion("SESSION_ID <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(Long value) {
            addCriterion("SESSION_ID >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SESSION_ID >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(Long value) {
            addCriterion("SESSION_ID <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(Long value) {
            addCriterion("SESSION_ID <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<Long> values) {
            addCriterion("SESSION_ID in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<Long> values) {
            addCriterion("SESSION_ID not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(Long value1, Long value2) {
            addCriterion("SESSION_ID between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(Long value1, Long value2) {
            addCriterion("SESSION_ID not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("VIDEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("VIDEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("VIDEO_ID =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("VIDEO_ID <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("VIDEO_ID >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VIDEO_ID >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("VIDEO_ID <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("VIDEO_ID <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("VIDEO_ID in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("VIDEO_ID not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("VIDEO_ID between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("VIDEO_ID not between", value1, value2, "videoId");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTotalSizeIsNull() {
            addCriterion("TOTAL_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTotalSizeIsNotNull() {
            addCriterion("TOTAL_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSizeEqualTo(Long value) {
            addCriterion("TOTAL_SIZE =", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeNotEqualTo(Long value) {
            addCriterion("TOTAL_SIZE <>", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeGreaterThan(Long value) {
            addCriterion("TOTAL_SIZE >", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_SIZE >=", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeLessThan(Long value) {
            addCriterion("TOTAL_SIZE <", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_SIZE <=", value, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeIn(List<Long> values) {
            addCriterion("TOTAL_SIZE in", values, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeNotIn(List<Long> values) {
            addCriterion("TOTAL_SIZE not in", values, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeBetween(Long value1, Long value2) {
            addCriterion("TOTAL_SIZE between", value1, value2, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalSizeNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_SIZE not between", value1, value2, "totalSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeIsNull() {
            addCriterion("TOTAL_TRANSCODE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeIsNotNull() {
            addCriterion("TOTAL_TRANSCODE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeEqualTo(Long value) {
            addCriterion("TOTAL_TRANSCODE_SIZE =", value, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeNotEqualTo(Long value) {
            addCriterion("TOTAL_TRANSCODE_SIZE <>", value, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeGreaterThan(Long value) {
            addCriterion("TOTAL_TRANSCODE_SIZE >", value, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_TRANSCODE_SIZE >=", value, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeLessThan(Long value) {
            addCriterion("TOTAL_TRANSCODE_SIZE <", value, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_TRANSCODE_SIZE <=", value, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeIn(List<Long> values) {
            addCriterion("TOTAL_TRANSCODE_SIZE in", values, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeNotIn(List<Long> values) {
            addCriterion("TOTAL_TRANSCODE_SIZE not in", values, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeBetween(Long value1, Long value2) {
            addCriterion("TOTAL_TRANSCODE_SIZE between", value1, value2, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andTotalTranscodeSizeNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_TRANSCODE_SIZE not between", value1, value2, "totalTranscodeSize");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("`LENGTH` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`LENGTH` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Long value) {
            addCriterion("`LENGTH` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Long value) {
            addCriterion("`LENGTH` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Long value) {
            addCriterion("`LENGTH` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("`LENGTH` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Long value) {
            addCriterion("`LENGTH` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Long value) {
            addCriterion("`LENGTH` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Long> values) {
            addCriterion("`LENGTH` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Long> values) {
            addCriterion("`LENGTH` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Long value1, Long value2) {
            addCriterion("`LENGTH` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Long value1, Long value2) {
            addCriterion("`LENGTH` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andFileMd5IsNull() {
            addCriterion("FILE_MD5 is null");
            return (Criteria) this;
        }

        public Criteria andFileMd5IsNotNull() {
            addCriterion("FILE_MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andFileMd5EqualTo(String value) {
            addCriterion("FILE_MD5 =", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotEqualTo(String value) {
            addCriterion("FILE_MD5 <>", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5GreaterThan(String value) {
            addCriterion("FILE_MD5 >", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5GreaterThanOrEqualTo(String value) {
            addCriterion("FILE_MD5 >=", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5LessThan(String value) {
            addCriterion("FILE_MD5 <", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5LessThanOrEqualTo(String value) {
            addCriterion("FILE_MD5 <=", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5Like(String value) {
            addCriterion("FILE_MD5 like", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotLike(String value) {
            addCriterion("FILE_MD5 not like", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5In(List<String> values) {
            addCriterion("FILE_MD5 in", values, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotIn(List<String> values) {
            addCriterion("FILE_MD5 not in", values, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5Between(String value1, String value2) {
            addCriterion("FILE_MD5 between", value1, value2, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotBetween(String value1, String value2) {
            addCriterion("FILE_MD5 not between", value1, value2, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionIsNull() {
            addCriterion("NOW_DEFINITION is null");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionIsNotNull() {
            addCriterion("NOW_DEFINITION is not null");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionEqualTo(String value) {
            addCriterion("NOW_DEFINITION =", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionNotEqualTo(String value) {
            addCriterion("NOW_DEFINITION <>", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionGreaterThan(String value) {
            addCriterion("NOW_DEFINITION >", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_DEFINITION >=", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionLessThan(String value) {
            addCriterion("NOW_DEFINITION <", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionLessThanOrEqualTo(String value) {
            addCriterion("NOW_DEFINITION <=", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionLike(String value) {
            addCriterion("NOW_DEFINITION like", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionNotLike(String value) {
            addCriterion("NOW_DEFINITION not like", value, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionIn(List<String> values) {
            addCriterion("NOW_DEFINITION in", values, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionNotIn(List<String> values) {
            addCriterion("NOW_DEFINITION not in", values, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionBetween(String value1, String value2) {
            addCriterion("NOW_DEFINITION between", value1, value2, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andNowDefinitionNotBetween(String value1, String value2) {
            addCriterion("NOW_DEFINITION not between", value1, value2, "nowDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionIsNull() {
            addCriterion("ORIGIN_DEFINITION is null");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionIsNotNull() {
            addCriterion("ORIGIN_DEFINITION is not null");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionEqualTo(String value) {
            addCriterion("ORIGIN_DEFINITION =", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionNotEqualTo(String value) {
            addCriterion("ORIGIN_DEFINITION <>", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionGreaterThan(String value) {
            addCriterion("ORIGIN_DEFINITION >", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_DEFINITION >=", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionLessThan(String value) {
            addCriterion("ORIGIN_DEFINITION <", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_DEFINITION <=", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionLike(String value) {
            addCriterion("ORIGIN_DEFINITION like", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionNotLike(String value) {
            addCriterion("ORIGIN_DEFINITION not like", value, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionIn(List<String> values) {
            addCriterion("ORIGIN_DEFINITION in", values, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionNotIn(List<String> values) {
            addCriterion("ORIGIN_DEFINITION not in", values, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionBetween(String value1, String value2) {
            addCriterion("ORIGIN_DEFINITION between", value1, value2, "originDefinition");
            return (Criteria) this;
        }

        public Criteria andOriginDefinitionNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_DEFINITION not between", value1, value2, "originDefinition");
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

        public Criteria andPrefaceUrlIsNull() {
            addCriterion("PREFACE_URL is null");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlIsNotNull() {
            addCriterion("PREFACE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlEqualTo(String value) {
            addCriterion("PREFACE_URL =", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlNotEqualTo(String value) {
            addCriterion("PREFACE_URL <>", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlGreaterThan(String value) {
            addCriterion("PREFACE_URL >", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PREFACE_URL >=", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlLessThan(String value) {
            addCriterion("PREFACE_URL <", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlLessThanOrEqualTo(String value) {
            addCriterion("PREFACE_URL <=", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlLike(String value) {
            addCriterion("PREFACE_URL like", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlNotLike(String value) {
            addCriterion("PREFACE_URL not like", value, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlIn(List<String> values) {
            addCriterion("PREFACE_URL in", values, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlNotIn(List<String> values) {
            addCriterion("PREFACE_URL not in", values, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlBetween(String value1, String value2) {
            addCriterion("PREFACE_URL between", value1, value2, "prefaceUrl");
            return (Criteria) this;
        }

        public Criteria andPrefaceUrlNotBetween(String value1, String value2) {
            addCriterion("PREFACE_URL not between", value1, value2, "prefaceUrl");
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
package com.huatu.paike.dal.place.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceCriteria() {
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

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Long value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Long value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Long value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Long value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Long> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Long> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Long value1, Long value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
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

        public Criteria andHotelNameIsNull() {
            addCriterion("HOTEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("HOTEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("HOTEL_NAME =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("HOTEL_NAME <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("HOTEL_NAME >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_NAME >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("HOTEL_NAME <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_NAME <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("HOTEL_NAME like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("HOTEL_NAME not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("HOTEL_NAME in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("HOTEL_NAME not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("HOTEL_NAME between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("HOTEL_NAME not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("`FLOOR` is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("`FLOOR` is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("`FLOOR` =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("`FLOOR` <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("`FLOOR` >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("`FLOOR` >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("`FLOOR` <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("`FLOOR` <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("`FLOOR` like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("`FLOOR` not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("`FLOOR` in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("`FLOOR` not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("`FLOOR` between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("`FLOOR` not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameIsNull() {
            addCriterion("CLASS_ROOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameIsNotNull() {
            addCriterion("CLASS_ROOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameEqualTo(String value) {
            addCriterion("CLASS_ROOM_NAME =", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameNotEqualTo(String value) {
            addCriterion("CLASS_ROOM_NAME <>", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameGreaterThan(String value) {
            addCriterion("CLASS_ROOM_NAME >", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ROOM_NAME >=", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameLessThan(String value) {
            addCriterion("CLASS_ROOM_NAME <", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ROOM_NAME <=", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameLike(String value) {
            addCriterion("CLASS_ROOM_NAME like", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameNotLike(String value) {
            addCriterion("CLASS_ROOM_NAME not like", value, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameIn(List<String> values) {
            addCriterion("CLASS_ROOM_NAME in", values, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameNotIn(List<String> values) {
            addCriterion("CLASS_ROOM_NAME not in", values, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameBetween(String value1, String value2) {
            addCriterion("CLASS_ROOM_NAME between", value1, value2, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andClassRoomNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_ROOM_NAME not between", value1, value2, "classRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeIsNull() {
            addCriterion("HOTEL_ROOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeIsNotNull() {
            addCriterion("HOTEL_ROOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeEqualTo(Byte value) {
            addCriterion("HOTEL_ROOM_TYPE =", value, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeNotEqualTo(Byte value) {
            addCriterion("HOTEL_ROOM_TYPE <>", value, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeGreaterThan(Byte value) {
            addCriterion("HOTEL_ROOM_TYPE >", value, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("HOTEL_ROOM_TYPE >=", value, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeLessThan(Byte value) {
            addCriterion("HOTEL_ROOM_TYPE <", value, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeLessThanOrEqualTo(Byte value) {
            addCriterion("HOTEL_ROOM_TYPE <=", value, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeIn(List<Byte> values) {
            addCriterion("HOTEL_ROOM_TYPE in", values, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeNotIn(List<Byte> values) {
            addCriterion("HOTEL_ROOM_TYPE not in", values, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeBetween(Byte value1, Byte value2) {
            addCriterion("HOTEL_ROOM_TYPE between", value1, value2, "hotelRoomType");
            return (Criteria) this;
        }

        public Criteria andHotelRoomTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("HOTEL_ROOM_TYPE not between", value1, value2, "hotelRoomType");
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

        public Criteria andContentEqualTo(Integer value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(Integer value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(Integer value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(Integer value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(Integer value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<Integer> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<Integer> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(Integer value1, Integer value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
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

        public Criteria andSignDateIsNull() {
            addCriterion("SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterion("SIGN_DATE =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterion("SIGN_DATE <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterion("SIGN_DATE >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGN_DATE >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterion("SIGN_DATE <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterion("SIGN_DATE <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterion("SIGN_DATE in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterion("SIGN_DATE not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterion("SIGN_DATE between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterion("SIGN_DATE not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("EXPIRE_DATE =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("EXPIRE_DATE >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("EXPIRE_DATE <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("EXPIRE_DATE in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("EXPIRE_DATE not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountIsNull() {
            addCriterion("MEETING_ROOM_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountIsNotNull() {
            addCriterion("MEETING_ROOM_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountEqualTo(Long value) {
            addCriterion("MEETING_ROOM_AMOUNT =", value, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountNotEqualTo(Long value) {
            addCriterion("MEETING_ROOM_AMOUNT <>", value, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountGreaterThan(Long value) {
            addCriterion("MEETING_ROOM_AMOUNT >", value, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("MEETING_ROOM_AMOUNT >=", value, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountLessThan(Long value) {
            addCriterion("MEETING_ROOM_AMOUNT <", value, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountLessThanOrEqualTo(Long value) {
            addCriterion("MEETING_ROOM_AMOUNT <=", value, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountIn(List<Long> values) {
            addCriterion("MEETING_ROOM_AMOUNT in", values, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountNotIn(List<Long> values) {
            addCriterion("MEETING_ROOM_AMOUNT not in", values, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountBetween(Long value1, Long value2) {
            addCriterion("MEETING_ROOM_AMOUNT between", value1, value2, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomAmountNotBetween(Long value1, Long value2) {
            addCriterion("MEETING_ROOM_AMOUNT not between", value1, value2, "meetingRoomAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountIsNull() {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountIsNotNull() {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT =", value, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountNotEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT <>", value, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountGreaterThan(Long value) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT >", value, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT >=", value, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountLessThan(Long value) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT <", value, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountLessThanOrEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT <=", value, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountIn(List<Long> values) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT in", values, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountNotIn(List<Long> values) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT not in", values, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountBetween(Long value1, Long value2) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT between", value1, value2, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomRawAmountNotBetween(Long value1, Long value2) {
            addCriterion("HOTEL_ROOM_RAW_AMOUNT not between", value1, value2, "hotelRoomRawAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountIsNull() {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountIsNotNull() {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT =", value, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountNotEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT <>", value, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountGreaterThan(Long value) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT >", value, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT >=", value, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountLessThan(Long value) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT <", value, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountLessThanOrEqualTo(Long value) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT <=", value, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountIn(List<Long> values) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT in", values, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountNotIn(List<Long> values) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT not in", values, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountBetween(Long value1, Long value2) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT between", value1, value2, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andHotelRoomBrekkerAmountNotBetween(Long value1, Long value2) {
            addCriterion("HOTEL_ROOM_BREKKER_AMOUNT not between", value1, value2, "hotelRoomBrekkerAmount");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerIsNull() {
            addCriterion("IS_COVER_DINNER is null");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerIsNotNull() {
            addCriterion("IS_COVER_DINNER is not null");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerEqualTo(Byte value) {
            addCriterion("IS_COVER_DINNER =", value, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerNotEqualTo(Byte value) {
            addCriterion("IS_COVER_DINNER <>", value, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerGreaterThan(Byte value) {
            addCriterion("IS_COVER_DINNER >", value, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_COVER_DINNER >=", value, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerLessThan(Byte value) {
            addCriterion("IS_COVER_DINNER <", value, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerLessThanOrEqualTo(Byte value) {
            addCriterion("IS_COVER_DINNER <=", value, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerIn(List<Byte> values) {
            addCriterion("IS_COVER_DINNER in", values, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerNotIn(List<Byte> values) {
            addCriterion("IS_COVER_DINNER not in", values, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerBetween(Byte value1, Byte value2) {
            addCriterion("IS_COVER_DINNER between", value1, value2, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsCoverDinnerNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_COVER_DINNER not between", value1, value2, "isCoverDinner");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("IS_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("IS_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(Byte value) {
            addCriterion("IS_EFFECTIVE =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(Byte value) {
            addCriterion("IS_EFFECTIVE <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(Byte value) {
            addCriterion("IS_EFFECTIVE >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_EFFECTIVE >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(Byte value) {
            addCriterion("IS_EFFECTIVE <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(Byte value) {
            addCriterion("IS_EFFECTIVE <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<Byte> values) {
            addCriterion("IS_EFFECTIVE in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<Byte> values) {
            addCriterion("IS_EFFECTIVE not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(Byte value1, Byte value2) {
            addCriterion("IS_EFFECTIVE between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_EFFECTIVE not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
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

        public Criteria andHotelRoomNameIsNull() {
            addCriterion("HOTEL_ROOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameIsNotNull() {
            addCriterion("HOTEL_ROOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameEqualTo(String value) {
            addCriterion("HOTEL_ROOM_NAME =", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameNotEqualTo(String value) {
            addCriterion("HOTEL_ROOM_NAME <>", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameGreaterThan(String value) {
            addCriterion("HOTEL_ROOM_NAME >", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_ROOM_NAME >=", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameLessThan(String value) {
            addCriterion("HOTEL_ROOM_NAME <", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_ROOM_NAME <=", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameLike(String value) {
            addCriterion("HOTEL_ROOM_NAME like", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameNotLike(String value) {
            addCriterion("HOTEL_ROOM_NAME not like", value, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameIn(List<String> values) {
            addCriterion("HOTEL_ROOM_NAME in", values, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameNotIn(List<String> values) {
            addCriterion("HOTEL_ROOM_NAME not in", values, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameBetween(String value1, String value2) {
            addCriterion("HOTEL_ROOM_NAME between", value1, value2, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andHotelRoomNameNotBetween(String value1, String value2) {
            addCriterion("HOTEL_ROOM_NAME not between", value1, value2, "hotelRoomName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("UNIT_NAME =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("UNIT_NAME <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("UNIT_NAME >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("UNIT_NAME <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("UNIT_NAME like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("UNIT_NAME not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("UNIT_NAME in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("UNIT_NAME not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("UNIT_NAME between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("UNIT_NAME not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Long value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Long value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Long value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Long value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Long> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Long> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Long value1, Long value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueIsNull() {
            addCriterion("DEVICE_UNIQUE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueIsNotNull() {
            addCriterion("DEVICE_UNIQUE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueEqualTo(String value) {
            addCriterion("DEVICE_UNIQUE =", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueNotEqualTo(String value) {
            addCriterion("DEVICE_UNIQUE <>", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueGreaterThan(String value) {
            addCriterion("DEVICE_UNIQUE >", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_UNIQUE >=", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueLessThan(String value) {
            addCriterion("DEVICE_UNIQUE <", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_UNIQUE <=", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueLike(String value) {
            addCriterion("DEVICE_UNIQUE like", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueNotLike(String value) {
            addCriterion("DEVICE_UNIQUE not like", value, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueIn(List<String> values) {
            addCriterion("DEVICE_UNIQUE in", values, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueNotIn(List<String> values) {
            addCriterion("DEVICE_UNIQUE not in", values, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueBetween(String value1, String value2) {
            addCriterion("DEVICE_UNIQUE between", value1, value2, "deviceUnique");
            return (Criteria) this;
        }

        public Criteria andDeviceUniqueNotBetween(String value1, String value2) {
            addCriterion("DEVICE_UNIQUE not between", value1, value2, "deviceUnique");
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
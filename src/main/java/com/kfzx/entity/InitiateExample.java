package com.kfzx.entity;

import java.util.ArrayList;
import java.util.List;

public class InitiateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InitiateExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNeednumberIsNull() {
            addCriterion("neednumber is null");
            return (Criteria) this;
        }

        public Criteria andNeednumberIsNotNull() {
            addCriterion("neednumber is not null");
            return (Criteria) this;
        }

        public Criteria andNeednumberEqualTo(Double value) {
            addCriterion("neednumber =", value, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberNotEqualTo(Double value) {
            addCriterion("neednumber <>", value, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberGreaterThan(Double value) {
            addCriterion("neednumber >", value, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberGreaterThanOrEqualTo(Double value) {
            addCriterion("neednumber >=", value, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberLessThan(Double value) {
            addCriterion("neednumber <", value, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberLessThanOrEqualTo(Double value) {
            addCriterion("neednumber <=", value, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberIn(List<Double> values) {
            addCriterion("neednumber in", values, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberNotIn(List<Double> values) {
            addCriterion("neednumber not in", values, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberBetween(Double value1, Double value2) {
            addCriterion("neednumber between", value1, value2, "neednumber");
            return (Criteria) this;
        }

        public Criteria andNeednumberNotBetween(Double value1, Double value2) {
            addCriterion("neednumber not between", value1, value2, "neednumber");
            return (Criteria) this;
        }

        public Criteria andMynumberIsNull() {
            addCriterion("mynumber is null");
            return (Criteria) this;
        }

        public Criteria andMynumberIsNotNull() {
            addCriterion("mynumber is not null");
            return (Criteria) this;
        }

        public Criteria andMynumberEqualTo(Double value) {
            addCriterion("mynumber =", value, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberNotEqualTo(Double value) {
            addCriterion("mynumber <>", value, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberGreaterThan(Double value) {
            addCriterion("mynumber >", value, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberGreaterThanOrEqualTo(Double value) {
            addCriterion("mynumber >=", value, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberLessThan(Double value) {
            addCriterion("mynumber <", value, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberLessThanOrEqualTo(Double value) {
            addCriterion("mynumber <=", value, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberIn(List<Double> values) {
            addCriterion("mynumber in", values, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberNotIn(List<Double> values) {
            addCriterion("mynumber not in", values, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberBetween(Double value1, Double value2) {
            addCriterion("mynumber between", value1, value2, "mynumber");
            return (Criteria) this;
        }

        public Criteria andMynumberNotBetween(Double value1, Double value2) {
            addCriterion("mynumber not between", value1, value2, "mynumber");
            return (Criteria) this;
        }

        public Criteria andDescesIsNull() {
            addCriterion("desces is null");
            return (Criteria) this;
        }

        public Criteria andDescesIsNotNull() {
            addCriterion("desces is not null");
            return (Criteria) this;
        }

        public Criteria andDescesEqualTo(String value) {
            addCriterion("desces =", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesNotEqualTo(String value) {
            addCriterion("desces <>", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesGreaterThan(String value) {
            addCriterion("desces >", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesGreaterThanOrEqualTo(String value) {
            addCriterion("desces >=", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesLessThan(String value) {
            addCriterion("desces <", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesLessThanOrEqualTo(String value) {
            addCriterion("desces <=", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesLike(String value) {
            addCriterion("desces like", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesNotLike(String value) {
            addCriterion("desces not like", value, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesIn(List<String> values) {
            addCriterion("desces in", values, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesNotIn(List<String> values) {
            addCriterion("desces not in", values, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesBetween(String value1, String value2) {
            addCriterion("desces between", value1, value2, "desces");
            return (Criteria) this;
        }

        public Criteria andDescesNotBetween(String value1, String value2) {
            addCriterion("desces not between", value1, value2, "desces");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeIsNull() {
            addCriterion("ceasetime is null");
            return (Criteria) this;
        }

        public Criteria andCeasetimeIsNotNull() {
            addCriterion("ceasetime is not null");
            return (Criteria) this;
        }

        public Criteria andCeasetimeEqualTo(String value) {
            addCriterion("ceasetime =", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeNotEqualTo(String value) {
            addCriterion("ceasetime <>", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeGreaterThan(String value) {
            addCriterion("ceasetime >", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ceasetime >=", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeLessThan(String value) {
            addCriterion("ceasetime <", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeLessThanOrEqualTo(String value) {
            addCriterion("ceasetime <=", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeLike(String value) {
            addCriterion("ceasetime like", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeNotLike(String value) {
            addCriterion("ceasetime not like", value, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeIn(List<String> values) {
            addCriterion("ceasetime in", values, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeNotIn(List<String> values) {
            addCriterion("ceasetime not in", values, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeBetween(String value1, String value2) {
            addCriterion("ceasetime between", value1, value2, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andCeasetimeNotBetween(String value1, String value2) {
            addCriterion("ceasetime not between", value1, value2, "ceasetime");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
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
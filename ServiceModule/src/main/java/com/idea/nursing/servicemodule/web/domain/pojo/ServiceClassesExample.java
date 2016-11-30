package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceClassesExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServeClassnameIsNull() {
            addCriterion("serve_classname is null");
            return (Criteria) this;
        }

        public Criteria andServeClassnameIsNotNull() {
            addCriterion("serve_classname is not null");
            return (Criteria) this;
        }

        public Criteria andServeClassnameEqualTo(String value) {
            addCriterion("serve_classname =", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameNotEqualTo(String value) {
            addCriterion("serve_classname <>", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameGreaterThan(String value) {
            addCriterion("serve_classname >", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("serve_classname >=", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameLessThan(String value) {
            addCriterion("serve_classname <", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameLessThanOrEqualTo(String value) {
            addCriterion("serve_classname <=", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameLike(String value) {
            addCriterion("serve_classname like", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameNotLike(String value) {
            addCriterion("serve_classname not like", value, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameIn(List<String> values) {
            addCriterion("serve_classname in", values, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameNotIn(List<String> values) {
            addCriterion("serve_classname not in", values, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameBetween(String value1, String value2) {
            addCriterion("serve_classname between", value1, value2, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClassnameNotBetween(String value1, String value2) {
            addCriterion("serve_classname not between", value1, value2, "serveClassname");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelIsNull() {
            addCriterion("serve_classlevel is null");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelIsNotNull() {
            addCriterion("serve_classlevel is not null");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelEqualTo(Byte value) {
            addCriterion("serve_classlevel =", value, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelNotEqualTo(Byte value) {
            addCriterion("serve_classlevel <>", value, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelGreaterThan(Byte value) {
            addCriterion("serve_classlevel >", value, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("serve_classlevel >=", value, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelLessThan(Byte value) {
            addCriterion("serve_classlevel <", value, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelLessThanOrEqualTo(Byte value) {
            addCriterion("serve_classlevel <=", value, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelIn(List<Byte> values) {
            addCriterion("serve_classlevel in", values, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelNotIn(List<Byte> values) {
            addCriterion("serve_classlevel not in", values, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelBetween(Byte value1, Byte value2) {
            addCriterion("serve_classlevel between", value1, value2, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andServeClasslevelNotBetween(Byte value1, Byte value2) {
            addCriterion("serve_classlevel not between", value1, value2, "serveClasslevel");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("tid not between", value1, value2, "tid");
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
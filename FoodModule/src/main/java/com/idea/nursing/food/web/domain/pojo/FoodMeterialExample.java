package com.idea.nursing.food.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class FoodMeterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodMeterialExample() {
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

        public Criteria andMeterialTypeNameIsNull() {
            addCriterion("meterial_type_name is null");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameIsNotNull() {
            addCriterion("meterial_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameEqualTo(String value) {
            addCriterion("meterial_type_name =", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameNotEqualTo(String value) {
            addCriterion("meterial_type_name <>", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameGreaterThan(String value) {
            addCriterion("meterial_type_name >", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("meterial_type_name >=", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameLessThan(String value) {
            addCriterion("meterial_type_name <", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameLessThanOrEqualTo(String value) {
            addCriterion("meterial_type_name <=", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameLike(String value) {
            addCriterion("meterial_type_name like", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameNotLike(String value) {
            addCriterion("meterial_type_name not like", value, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameIn(List<String> values) {
            addCriterion("meterial_type_name in", values, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameNotIn(List<String> values) {
            addCriterion("meterial_type_name not in", values, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameBetween(String value1, String value2) {
            addCriterion("meterial_type_name between", value1, value2, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeNameNotBetween(String value1, String value2) {
            addCriterion("meterial_type_name not between", value1, value2, "meterialTypeName");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelIsNull() {
            addCriterion("meterial_type_level is null");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelIsNotNull() {
            addCriterion("meterial_type_level is not null");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelEqualTo(Byte value) {
            addCriterion("meterial_type_level =", value, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelNotEqualTo(Byte value) {
            addCriterion("meterial_type_level <>", value, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelGreaterThan(Byte value) {
            addCriterion("meterial_type_level >", value, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("meterial_type_level >=", value, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelLessThan(Byte value) {
            addCriterion("meterial_type_level <", value, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelLessThanOrEqualTo(Byte value) {
            addCriterion("meterial_type_level <=", value, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelIn(List<Byte> values) {
            addCriterion("meterial_type_level in", values, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelNotIn(List<Byte> values) {
            addCriterion("meterial_type_level not in", values, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelBetween(Byte value1, Byte value2) {
            addCriterion("meterial_type_level between", value1, value2, "meterialTypeLevel");
            return (Criteria) this;
        }

        public Criteria andMeterialTypeLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("meterial_type_level not between", value1, value2, "meterialTypeLevel");
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
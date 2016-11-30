package com.idea.nursing.inspection.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class InspectionItemInspectionResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionItemInspectionResultExample() {
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

        public Criteria andInspectionIdIsNull() {
            addCriterion("inspection_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectionIdIsNotNull() {
            addCriterion("inspection_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionIdEqualTo(Long value) {
            addCriterion("inspection_id =", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotEqualTo(Long value) {
            addCriterion("inspection_id <>", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdGreaterThan(Long value) {
            addCriterion("inspection_id >", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspection_id >=", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLessThan(Long value) {
            addCriterion("inspection_id <", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLessThanOrEqualTo(Long value) {
            addCriterion("inspection_id <=", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdIn(List<Long> values) {
            addCriterion("inspection_id in", values, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotIn(List<Long> values) {
            addCriterion("inspection_id not in", values, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdBetween(Long value1, Long value2) {
            addCriterion("inspection_id between", value1, value2, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotBetween(Long value1, Long value2) {
            addCriterion("inspection_id not between", value1, value2, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdIsNull() {
            addCriterion("inspection_item_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdIsNotNull() {
            addCriterion("inspection_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdEqualTo(Long value) {
            addCriterion("inspection_item_id =", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdNotEqualTo(Long value) {
            addCriterion("inspection_item_id <>", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdGreaterThan(Long value) {
            addCriterion("inspection_item_id >", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspection_item_id >=", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdLessThan(Long value) {
            addCriterion("inspection_item_id <", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdLessThanOrEqualTo(Long value) {
            addCriterion("inspection_item_id <=", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdIn(List<Long> values) {
            addCriterion("inspection_item_id in", values, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdNotIn(List<Long> values) {
            addCriterion("inspection_item_id not in", values, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdBetween(Long value1, Long value2) {
            addCriterion("inspection_item_id between", value1, value2, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdNotBetween(Long value1, Long value2) {
            addCriterion("inspection_item_id not between", value1, value2, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueIsNull() {
            addCriterion("inspection_item_value is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueIsNotNull() {
            addCriterion("inspection_item_value is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueEqualTo(String value) {
            addCriterion("inspection_item_value =", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueNotEqualTo(String value) {
            addCriterion("inspection_item_value <>", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueGreaterThan(String value) {
            addCriterion("inspection_item_value >", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_item_value >=", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueLessThan(String value) {
            addCriterion("inspection_item_value <", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueLessThanOrEqualTo(String value) {
            addCriterion("inspection_item_value <=", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueLike(String value) {
            addCriterion("inspection_item_value like", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueNotLike(String value) {
            addCriterion("inspection_item_value not like", value, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueIn(List<String> values) {
            addCriterion("inspection_item_value in", values, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueNotIn(List<String> values) {
            addCriterion("inspection_item_value not in", values, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueBetween(String value1, String value2) {
            addCriterion("inspection_item_value between", value1, value2, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueNotBetween(String value1, String value2) {
            addCriterion("inspection_item_value not between", value1, value2, "inspectionItemValue");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdIsNull() {
            addCriterion("inspection_item_select_value_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdIsNotNull() {
            addCriterion("inspection_item_select_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdEqualTo(Long value) {
            addCriterion("inspection_item_select_value_id =", value, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdNotEqualTo(Long value) {
            addCriterion("inspection_item_select_value_id <>", value, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdGreaterThan(Long value) {
            addCriterion("inspection_item_select_value_id >", value, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspection_item_select_value_id >=", value, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdLessThan(Long value) {
            addCriterion("inspection_item_select_value_id <", value, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdLessThanOrEqualTo(Long value) {
            addCriterion("inspection_item_select_value_id <=", value, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdIn(List<Long> values) {
            addCriterion("inspection_item_select_value_id in", values, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdNotIn(List<Long> values) {
            addCriterion("inspection_item_select_value_id not in", values, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdBetween(Long value1, Long value2) {
            addCriterion("inspection_item_select_value_id between", value1, value2, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemSelectValueIdNotBetween(Long value1, Long value2) {
            addCriterion("inspection_item_select_value_id not between", value1, value2, "inspectionItemSelectValueId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdIsNull() {
            addCriterion("service_people_id is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdIsNotNull() {
            addCriterion("service_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdEqualTo(Long value) {
            addCriterion("service_people_id =", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdNotEqualTo(Long value) {
            addCriterion("service_people_id <>", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdGreaterThan(Long value) {
            addCriterion("service_people_id >", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_people_id >=", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdLessThan(Long value) {
            addCriterion("service_people_id <", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdLessThanOrEqualTo(Long value) {
            addCriterion("service_people_id <=", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdIn(List<Long> values) {
            addCriterion("service_people_id in", values, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdNotIn(List<Long> values) {
            addCriterion("service_people_id not in", values, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdBetween(Long value1, Long value2) {
            addCriterion("service_people_id between", value1, value2, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdNotBetween(Long value1, Long value2) {
            addCriterion("service_people_id not between", value1, value2, "servicePeopleId");
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
package com.mmt.myblog.bean;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbg.generated
     */
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNull() {
            addCriterion("art_title is null");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNotNull() {
            addCriterion("art_title is not null");
            return (Criteria) this;
        }

        public Criteria andArtTitleEqualTo(String value) {
            addCriterion("art_title =", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotEqualTo(String value) {
            addCriterion("art_title <>", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThan(String value) {
            addCriterion("art_title >", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("art_title >=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThan(String value) {
            addCriterion("art_title <", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThanOrEqualTo(String value) {
            addCriterion("art_title <=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLike(String value) {
            addCriterion("art_title like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotLike(String value) {
            addCriterion("art_title not like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleIn(List<String> values) {
            addCriterion("art_title in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotIn(List<String> values) {
            addCriterion("art_title not in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleBetween(String value1, String value2) {
            addCriterion("art_title between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotBetween(String value1, String value2) {
            addCriterion("art_title not between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeIsNull() {
            addCriterion("art_post_time is null");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeIsNotNull() {
            addCriterion("art_post_time is not null");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeEqualTo(String value) {
            addCriterion("art_post_time =", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeNotEqualTo(String value) {
            addCriterion("art_post_time <>", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeGreaterThan(String value) {
            addCriterion("art_post_time >", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeGreaterThanOrEqualTo(String value) {
            addCriterion("art_post_time >=", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeLessThan(String value) {
            addCriterion("art_post_time <", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeLessThanOrEqualTo(String value) {
            addCriterion("art_post_time <=", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeLike(String value) {
            addCriterion("art_post_time like", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeNotLike(String value) {
            addCriterion("art_post_time not like", value, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeIn(List<String> values) {
            addCriterion("art_post_time in", values, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeNotIn(List<String> values) {
            addCriterion("art_post_time not in", values, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeBetween(String value1, String value2) {
            addCriterion("art_post_time between", value1, value2, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtPostTimeNotBetween(String value1, String value2) {
            addCriterion("art_post_time not between", value1, value2, "artPostTime");
            return (Criteria) this;
        }

        public Criteria andArtCategoryIsNull() {
            addCriterion("art_category is null");
            return (Criteria) this;
        }

        public Criteria andArtCategoryIsNotNull() {
            addCriterion("art_category is not null");
            return (Criteria) this;
        }

        public Criteria andArtCategoryEqualTo(String value) {
            addCriterion("art_category =", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryNotEqualTo(String value) {
            addCriterion("art_category <>", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryGreaterThan(String value) {
            addCriterion("art_category >", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("art_category >=", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryLessThan(String value) {
            addCriterion("art_category <", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryLessThanOrEqualTo(String value) {
            addCriterion("art_category <=", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryLike(String value) {
            addCriterion("art_category like", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryNotLike(String value) {
            addCriterion("art_category not like", value, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryIn(List<String> values) {
            addCriterion("art_category in", values, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryNotIn(List<String> values) {
            addCriterion("art_category not in", values, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryBetween(String value1, String value2) {
            addCriterion("art_category between", value1, value2, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtCategoryNotBetween(String value1, String value2) {
            addCriterion("art_category not between", value1, value2, "artCategory");
            return (Criteria) this;
        }

        public Criteria andArtVisitorIsNull() {
            addCriterion("art_visitor is null");
            return (Criteria) this;
        }

        public Criteria andArtVisitorIsNotNull() {
            addCriterion("art_visitor is not null");
            return (Criteria) this;
        }

        public Criteria andArtVisitorEqualTo(Integer value) {
            addCriterion("art_visitor =", value, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorNotEqualTo(Integer value) {
            addCriterion("art_visitor <>", value, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorGreaterThan(Integer value) {
            addCriterion("art_visitor >", value, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_visitor >=", value, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorLessThan(Integer value) {
            addCriterion("art_visitor <", value, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorLessThanOrEqualTo(Integer value) {
            addCriterion("art_visitor <=", value, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorIn(List<Integer> values) {
            addCriterion("art_visitor in", values, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorNotIn(List<Integer> values) {
            addCriterion("art_visitor not in", values, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorBetween(Integer value1, Integer value2) {
            addCriterion("art_visitor between", value1, value2, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtVisitorNotBetween(Integer value1, Integer value2) {
            addCriterion("art_visitor not between", value1, value2, "artVisitor");
            return (Criteria) this;
        }

        public Criteria andArtContextIsNull() {
            addCriterion("art_context is null");
            return (Criteria) this;
        }

        public Criteria andArtContextIsNotNull() {
            addCriterion("art_context is not null");
            return (Criteria) this;
        }

        public Criteria andArtContextEqualTo(String value) {
            addCriterion("art_context =", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextNotEqualTo(String value) {
            addCriterion("art_context <>", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextGreaterThan(String value) {
            addCriterion("art_context >", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextGreaterThanOrEqualTo(String value) {
            addCriterion("art_context >=", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextLessThan(String value) {
            addCriterion("art_context <", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextLessThanOrEqualTo(String value) {
            addCriterion("art_context <=", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextLike(String value) {
            addCriterion("art_context like", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextNotLike(String value) {
            addCriterion("art_context not like", value, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextIn(List<String> values) {
            addCriterion("art_context in", values, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextNotIn(List<String> values) {
            addCriterion("art_context not in", values, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextBetween(String value1, String value2) {
            addCriterion("art_context between", value1, value2, "artContext");
            return (Criteria) this;
        }

        public Criteria andArtContextNotBetween(String value1, String value2) {
            addCriterion("art_context not between", value1, value2, "artContext");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbg.generated
     */
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
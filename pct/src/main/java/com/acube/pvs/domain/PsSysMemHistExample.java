package com.acube.pvs.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PsSysMemHistExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public PsSysMemHistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
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
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
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

        public Criteria andDatetimeIsNull() {
            addCriterion("DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("DATETIME =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("DATETIME <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("DATETIME >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATETIME >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("DATETIME <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("DATETIME <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("DATETIME like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("DATETIME not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("DATETIME in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("DATETIME not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("DATETIME between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("DATETIME not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTotIsNull() {
            addCriterion("TOT is null");
            return (Criteria) this;
        }

        public Criteria andTotIsNotNull() {
            addCriterion("TOT is not null");
            return (Criteria) this;
        }

        public Criteria andTotEqualTo(Long value) {
            addCriterion("TOT =", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotNotEqualTo(Long value) {
            addCriterion("TOT <>", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotGreaterThan(Long value) {
            addCriterion("TOT >", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotGreaterThanOrEqualTo(Long value) {
            addCriterion("TOT >=", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotLessThan(Long value) {
            addCriterion("TOT <", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotLessThanOrEqualTo(Long value) {
            addCriterion("TOT <=", value, "tot");
            return (Criteria) this;
        }

        public Criteria andTotIn(List<Long> values) {
            addCriterion("TOT in", values, "tot");
            return (Criteria) this;
        }

        public Criteria andTotNotIn(List<Long> values) {
            addCriterion("TOT not in", values, "tot");
            return (Criteria) this;
        }

        public Criteria andTotBetween(Long value1, Long value2) {
            addCriterion("TOT between", value1, value2, "tot");
            return (Criteria) this;
        }

        public Criteria andTotNotBetween(Long value1, Long value2) {
            addCriterion("TOT not between", value1, value2, "tot");
            return (Criteria) this;
        }

        public Criteria andUseIsNull() {
            addCriterion("USE is null");
            return (Criteria) this;
        }

        public Criteria andUseIsNotNull() {
            addCriterion("USE is not null");
            return (Criteria) this;
        }

        public Criteria andUseEqualTo(Long value) {
            addCriterion("USE =", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotEqualTo(Long value) {
            addCriterion("USE <>", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThan(Long value) {
            addCriterion("USE >", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThanOrEqualTo(Long value) {
            addCriterion("USE >=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThan(Long value) {
            addCriterion("USE <", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThanOrEqualTo(Long value) {
            addCriterion("USE <=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseIn(List<Long> values) {
            addCriterion("USE in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotIn(List<Long> values) {
            addCriterion("USE not in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseBetween(Long value1, Long value2) {
            addCriterion("USE between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotBetween(Long value1, Long value2) {
            addCriterion("USE not between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUnuseIsNull() {
            addCriterion("UNUSE is null");
            return (Criteria) this;
        }

        public Criteria andUnuseIsNotNull() {
            addCriterion("UNUSE is not null");
            return (Criteria) this;
        }

        public Criteria andUnuseEqualTo(Long value) {
            addCriterion("UNUSE =", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseNotEqualTo(Long value) {
            addCriterion("UNUSE <>", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseGreaterThan(Long value) {
            addCriterion("UNUSE >", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseGreaterThanOrEqualTo(Long value) {
            addCriterion("UNUSE >=", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseLessThan(Long value) {
            addCriterion("UNUSE <", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseLessThanOrEqualTo(Long value) {
            addCriterion("UNUSE <=", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseIn(List<Long> values) {
            addCriterion("UNUSE in", values, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseNotIn(List<Long> values) {
            addCriterion("UNUSE not in", values, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseBetween(Long value1, Long value2) {
            addCriterion("UNUSE between", value1, value2, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseNotBetween(Long value1, Long value2) {
            addCriterion("UNUSE not between", value1, value2, "unuse");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("RATIO is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(BigDecimal value) {
            addCriterion("RATIO =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(BigDecimal value) {
            addCriterion("RATIO <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(BigDecimal value) {
            addCriterion("RATIO >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATIO >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(BigDecimal value) {
            addCriterion("RATIO <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATIO <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<BigDecimal> values) {
            addCriterion("RATIO in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<BigDecimal> values) {
            addCriterion("RATIO not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATIO between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATIO not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("HOSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("HOSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("HOSTNAME =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("HOSTNAME <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("HOSTNAME >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSTNAME >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("HOSTNAME <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("HOSTNAME <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("HOSTNAME like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("HOSTNAME not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("HOSTNAME in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("HOSTNAME not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("HOSTNAME between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("HOSTNAME not between", value1, value2, "hostname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 01 10:41:35 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
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
package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.List;

public class ProdParameterInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public ProdParameterInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
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

		public Criteria andProdCdIsNull() {
			addCriterion("PROD_CD is null");
			return (Criteria) this;
		}

		public Criteria andProdCdIsNotNull() {
			addCriterion("PROD_CD is not null");
			return (Criteria) this;
		}

		public Criteria andProdCdEqualTo(String value) {
			addCriterion("PROD_CD =", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdNotEqualTo(String value) {
			addCriterion("PROD_CD <>", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdGreaterThan(String value) {
			addCriterion("PROD_CD >", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdGreaterThanOrEqualTo(String value) {
			addCriterion("PROD_CD >=", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdLessThan(String value) {
			addCriterion("PROD_CD <", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdLessThanOrEqualTo(String value) {
			addCriterion("PROD_CD <=", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdLike(String value) {
			addCriterion("PROD_CD like", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdNotLike(String value) {
			addCriterion("PROD_CD not like", value, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdIn(List<String> values) {
			addCriterion("PROD_CD in", values, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdNotIn(List<String> values) {
			addCriterion("PROD_CD not in", values, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdBetween(String value1, String value2) {
			addCriterion("PROD_CD between", value1, value2, "prodCd");
			return (Criteria) this;
		}

		public Criteria andProdCdNotBetween(String value1, String value2) {
			addCriterion("PROD_CD not between", value1, value2, "prodCd");
			return (Criteria) this;
		}

		public Criteria andShortCodeIsNull() {
			addCriterion("SHORT_CODE is null");
			return (Criteria) this;
		}

		public Criteria andShortCodeIsNotNull() {
			addCriterion("SHORT_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andShortCodeEqualTo(String value) {
			addCriterion("SHORT_CODE =", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeNotEqualTo(String value) {
			addCriterion("SHORT_CODE <>", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeGreaterThan(String value) {
			addCriterion("SHORT_CODE >", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeGreaterThanOrEqualTo(String value) {
			addCriterion("SHORT_CODE >=", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeLessThan(String value) {
			addCriterion("SHORT_CODE <", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeLessThanOrEqualTo(String value) {
			addCriterion("SHORT_CODE <=", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeLike(String value) {
			addCriterion("SHORT_CODE like", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeNotLike(String value) {
			addCriterion("SHORT_CODE not like", value, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeIn(List<String> values) {
			addCriterion("SHORT_CODE in", values, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeNotIn(List<String> values) {
			addCriterion("SHORT_CODE not in", values, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeBetween(String value1, String value2) {
			addCriterion("SHORT_CODE between", value1, value2, "shortCode");
			return (Criteria) this;
		}

		public Criteria andShortCodeNotBetween(String value1, String value2) {
			addCriterion("SHORT_CODE not between", value1, value2, "shortCode");
			return (Criteria) this;
		}

		public Criteria andExpireDaysIsNull() {
			addCriterion("EXPIRE_DAYS is null");
			return (Criteria) this;
		}

		public Criteria andExpireDaysIsNotNull() {
			addCriterion("EXPIRE_DAYS is not null");
			return (Criteria) this;
		}

		public Criteria andExpireDaysEqualTo(Long value) {
			addCriterion("EXPIRE_DAYS =", value, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysNotEqualTo(Long value) {
			addCriterion("EXPIRE_DAYS <>", value, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysGreaterThan(Long value) {
			addCriterion("EXPIRE_DAYS >", value, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysGreaterThanOrEqualTo(Long value) {
			addCriterion("EXPIRE_DAYS >=", value, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysLessThan(Long value) {
			addCriterion("EXPIRE_DAYS <", value, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysLessThanOrEqualTo(Long value) {
			addCriterion("EXPIRE_DAYS <=", value, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysIn(List<Long> values) {
			addCriterion("EXPIRE_DAYS in", values, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysNotIn(List<Long> values) {
			addCriterion("EXPIRE_DAYS not in", values, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysBetween(Long value1, Long value2) {
			addCriterion("EXPIRE_DAYS between", value1, value2, "expireDays");
			return (Criteria) this;
		}

		public Criteria andExpireDaysNotBetween(Long value1, Long value2) {
			addCriterion("EXPIRE_DAYS not between", value1, value2, "expireDays");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("AMOUNT is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("AMOUNT is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(Long value) {
			addCriterion("AMOUNT =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(Long value) {
			addCriterion("AMOUNT <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(Long value) {
			addCriterion("AMOUNT >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(Long value) {
			addCriterion("AMOUNT >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(Long value) {
			addCriterion("AMOUNT <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(Long value) {
			addCriterion("AMOUNT <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<Long> values) {
			addCriterion("AMOUNT in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<Long> values) {
			addCriterion("AMOUNT not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(Long value1, Long value2) {
			addCriterion("AMOUNT between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(Long value1, Long value2) {
			addCriterion("AMOUNT not between", value1, value2, "amount");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ABACUS.ABA_PD_PROD_PARAMETER_INFO
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
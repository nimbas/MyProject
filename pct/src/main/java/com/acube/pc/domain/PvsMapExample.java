package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.List;

public class PvsMapExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public PvsMapExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_PVS_MAP
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

		public Criteria andParamIsNull() {
			addCriterion("PARAM is null");
			return (Criteria) this;
		}

		public Criteria andParamIsNotNull() {
			addCriterion("PARAM is not null");
			return (Criteria) this;
		}

		public Criteria andParamEqualTo(String value) {
			addCriterion("PARAM =", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamNotEqualTo(String value) {
			addCriterion("PARAM <>", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamGreaterThan(String value) {
			addCriterion("PARAM >", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamGreaterThanOrEqualTo(String value) {
			addCriterion("PARAM >=", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamLessThan(String value) {
			addCriterion("PARAM <", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamLessThanOrEqualTo(String value) {
			addCriterion("PARAM <=", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamLike(String value) {
			addCriterion("PARAM like", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamNotLike(String value) {
			addCriterion("PARAM not like", value, "param");
			return (Criteria) this;
		}

		public Criteria andParamIn(List<String> values) {
			addCriterion("PARAM in", values, "param");
			return (Criteria) this;
		}

		public Criteria andParamNotIn(List<String> values) {
			addCriterion("PARAM not in", values, "param");
			return (Criteria) this;
		}

		public Criteria andParamBetween(String value1, String value2) {
			addCriterion("PARAM between", value1, value2, "param");
			return (Criteria) this;
		}

		public Criteria andParamNotBetween(String value1, String value2) {
			addCriterion("PARAM not between", value1, value2, "param");
			return (Criteria) this;
		}

		public Criteria andSvcCdIsNull() {
			addCriterion("SVC_CD is null");
			return (Criteria) this;
		}

		public Criteria andSvcCdIsNotNull() {
			addCriterion("SVC_CD is not null");
			return (Criteria) this;
		}

		public Criteria andSvcCdEqualTo(String value) {
			addCriterion("SVC_CD =", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdNotEqualTo(String value) {
			addCriterion("SVC_CD <>", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdGreaterThan(String value) {
			addCriterion("SVC_CD >", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdGreaterThanOrEqualTo(String value) {
			addCriterion("SVC_CD >=", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdLessThan(String value) {
			addCriterion("SVC_CD <", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdLessThanOrEqualTo(String value) {
			addCriterion("SVC_CD <=", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdLike(String value) {
			addCriterion("SVC_CD like", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdNotLike(String value) {
			addCriterion("SVC_CD not like", value, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdIn(List<String> values) {
			addCriterion("SVC_CD in", values, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdNotIn(List<String> values) {
			addCriterion("SVC_CD not in", values, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdBetween(String value1, String value2) {
			addCriterion("SVC_CD between", value1, value2, "svcCd");
			return (Criteria) this;
		}

		public Criteria andSvcCdNotBetween(String value1, String value2) {
			addCriterion("SVC_CD not between", value1, value2, "svcCd");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_PVS_MAP
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
     * This class corresponds to the database table ABACUS.ABA_PD_PVS_MAP
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
package com.acube.pc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomRcExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public CustomRcExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
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

		public Criteria andInventoryItemIdIsNull() {
			addCriterion("INVENTORY_ITEM_ID is null");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdIsNotNull() {
			addCriterion("INVENTORY_ITEM_ID is not null");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdEqualTo(Long value) {
			addCriterion("INVENTORY_ITEM_ID =", value, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdNotEqualTo(Long value) {
			addCriterion("INVENTORY_ITEM_ID <>", value, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdGreaterThan(Long value) {
			addCriterion("INVENTORY_ITEM_ID >", value, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdGreaterThanOrEqualTo(Long value) {
			addCriterion("INVENTORY_ITEM_ID >=", value, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdLessThan(Long value) {
			addCriterion("INVENTORY_ITEM_ID <", value, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdLessThanOrEqualTo(Long value) {
			addCriterion("INVENTORY_ITEM_ID <=", value, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdIn(List<Long> values) {
			addCriterion("INVENTORY_ITEM_ID in", values, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdNotIn(List<Long> values) {
			addCriterion("INVENTORY_ITEM_ID not in", values, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdBetween(Long value1, Long value2) {
			addCriterion("INVENTORY_ITEM_ID between", value1, value2, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andInventoryItemIdNotBetween(Long value1, Long value2) {
			addCriterion("INVENTORY_ITEM_ID not between", value1, value2, "inventoryItemId");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtIsNull() {
			addCriterion("VALD_STRT_DT is null");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtIsNotNull() {
			addCriterion("VALD_STRT_DT is not null");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtEqualTo(Date value) {
			addCriterion("VALD_STRT_DT =", value, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtNotEqualTo(Date value) {
			addCriterion("VALD_STRT_DT <>", value, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtGreaterThan(Date value) {
			addCriterion("VALD_STRT_DT >", value, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtGreaterThanOrEqualTo(Date value) {
			addCriterion("VALD_STRT_DT >=", value, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtLessThan(Date value) {
			addCriterion("VALD_STRT_DT <", value, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtLessThanOrEqualTo(Date value) {
			addCriterion("VALD_STRT_DT <=", value, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtIn(List<Date> values) {
			addCriterion("VALD_STRT_DT in", values, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtNotIn(List<Date> values) {
			addCriterion("VALD_STRT_DT not in", values, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtBetween(Date value1, Date value2) {
			addCriterion("VALD_STRT_DT between", value1, value2, "valdStrtDt");
			return (Criteria) this;
		}

		public Criteria andValdStrtDtNotBetween(Date value1, Date value2) {
			addCriterion("VALD_STRT_DT not between", value1, value2, "valdStrtDt");
			return (Criteria) this;
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

		public Criteria andRcIndexIsNull() {
			addCriterion("RC_INDEX is null");
			return (Criteria) this;
		}

		public Criteria andRcIndexIsNotNull() {
			addCriterion("RC_INDEX is not null");
			return (Criteria) this;
		}

		public Criteria andRcIndexEqualTo(Short value) {
			addCriterion("RC_INDEX =", value, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexNotEqualTo(Short value) {
			addCriterion("RC_INDEX <>", value, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexGreaterThan(Short value) {
			addCriterion("RC_INDEX >", value, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexGreaterThanOrEqualTo(Short value) {
			addCriterion("RC_INDEX >=", value, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexLessThan(Short value) {
			addCriterion("RC_INDEX <", value, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexLessThanOrEqualTo(Short value) {
			addCriterion("RC_INDEX <=", value, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexIn(List<Short> values) {
			addCriterion("RC_INDEX in", values, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexNotIn(List<Short> values) {
			addCriterion("RC_INDEX not in", values, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexBetween(Short value1, Short value2) {
			addCriterion("RC_INDEX between", value1, value2, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andRcIndexNotBetween(Short value1, Short value2) {
			addCriterion("RC_INDEX not between", value1, value2, "rcIndex");
			return (Criteria) this;
		}

		public Criteria andOnCycleIsNull() {
			addCriterion("ON_CYCLE is null");
			return (Criteria) this;
		}

		public Criteria andOnCycleIsNotNull() {
			addCriterion("ON_CYCLE is not null");
			return (Criteria) this;
		}

		public Criteria andOnCycleEqualTo(String value) {
			addCriterion("ON_CYCLE =", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleNotEqualTo(String value) {
			addCriterion("ON_CYCLE <>", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleGreaterThan(String value) {
			addCriterion("ON_CYCLE >", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleGreaterThanOrEqualTo(String value) {
			addCriterion("ON_CYCLE >=", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleLessThan(String value) {
			addCriterion("ON_CYCLE <", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleLessThanOrEqualTo(String value) {
			addCriterion("ON_CYCLE <=", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleLike(String value) {
			addCriterion("ON_CYCLE like", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleNotLike(String value) {
			addCriterion("ON_CYCLE not like", value, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleIn(List<String> values) {
			addCriterion("ON_CYCLE in", values, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleNotIn(List<String> values) {
			addCriterion("ON_CYCLE not in", values, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleBetween(String value1, String value2) {
			addCriterion("ON_CYCLE between", value1, value2, "onCycle");
			return (Criteria) this;
		}

		public Criteria andOnCycleNotBetween(String value1, String value2) {
			addCriterion("ON_CYCLE not between", value1, value2, "onCycle");
			return (Criteria) this;
		}

		public Criteria andRateIsNull() {
			addCriterion("RATE is null");
			return (Criteria) this;
		}

		public Criteria andRateIsNotNull() {
			addCriterion("RATE is not null");
			return (Criteria) this;
		}

		public Criteria andRateEqualTo(BigDecimal value) {
			addCriterion("RATE =", value, "rate");
			return (Criteria) this;
		}

		public Criteria andRateNotEqualTo(BigDecimal value) {
			addCriterion("RATE <>", value, "rate");
			return (Criteria) this;
		}

		public Criteria andRateGreaterThan(BigDecimal value) {
			addCriterion("RATE >", value, "rate");
			return (Criteria) this;
		}

		public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("RATE >=", value, "rate");
			return (Criteria) this;
		}

		public Criteria andRateLessThan(BigDecimal value) {
			addCriterion("RATE <", value, "rate");
			return (Criteria) this;
		}

		public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
			addCriterion("RATE <=", value, "rate");
			return (Criteria) this;
		}

		public Criteria andRateIn(List<BigDecimal> values) {
			addCriterion("RATE in", values, "rate");
			return (Criteria) this;
		}

		public Criteria andRateNotIn(List<BigDecimal> values) {
			addCriterion("RATE not in", values, "rate");
			return (Criteria) this;
		}

		public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("RATE between", value1, value2, "rate");
			return (Criteria) this;
		}

		public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("RATE not between", value1, value2, "rate");
			return (Criteria) this;
		}

		public Criteria andCondIsNull() {
			addCriterion("COND is null");
			return (Criteria) this;
		}

		public Criteria andCondIsNotNull() {
			addCriterion("COND is not null");
			return (Criteria) this;
		}

		public Criteria andCondEqualTo(String value) {
			addCriterion("COND =", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondNotEqualTo(String value) {
			addCriterion("COND <>", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondGreaterThan(String value) {
			addCriterion("COND >", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondGreaterThanOrEqualTo(String value) {
			addCriterion("COND >=", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondLessThan(String value) {
			addCriterion("COND <", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondLessThanOrEqualTo(String value) {
			addCriterion("COND <=", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondLike(String value) {
			addCriterion("COND like", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondNotLike(String value) {
			addCriterion("COND not like", value, "cond");
			return (Criteria) this;
		}

		public Criteria andCondIn(List<String> values) {
			addCriterion("COND in", values, "cond");
			return (Criteria) this;
		}

		public Criteria andCondNotIn(List<String> values) {
			addCriterion("COND not in", values, "cond");
			return (Criteria) this;
		}

		public Criteria andCondBetween(String value1, String value2) {
			addCriterion("COND between", value1, value2, "cond");
			return (Criteria) this;
		}

		public Criteria andCondNotBetween(String value1, String value2) {
			addCriterion("COND not between", value1, value2, "cond");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateIsNull() {
			addCriterion("SYS_CREATION_DATE is null");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateIsNotNull() {
			addCriterion("SYS_CREATION_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateEqualTo(Date value) {
			addCriterion("SYS_CREATION_DATE =", value, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateNotEqualTo(Date value) {
			addCriterion("SYS_CREATION_DATE <>", value, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateGreaterThan(Date value) {
			addCriterion("SYS_CREATION_DATE >", value, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateGreaterThanOrEqualTo(Date value) {
			addCriterion("SYS_CREATION_DATE >=", value, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateLessThan(Date value) {
			addCriterion("SYS_CREATION_DATE <", value, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateLessThanOrEqualTo(Date value) {
			addCriterion("SYS_CREATION_DATE <=", value, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateIn(List<Date> values) {
			addCriterion("SYS_CREATION_DATE in", values, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateNotIn(List<Date> values) {
			addCriterion("SYS_CREATION_DATE not in", values, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateBetween(Date value1, Date value2) {
			addCriterion("SYS_CREATION_DATE between", value1, value2, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysCreationDateNotBetween(Date value1, Date value2) {
			addCriterion("SYS_CREATION_DATE not between", value1, value2, "sysCreationDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateIsNull() {
			addCriterion("SYS_UPDATE_DATE is null");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateIsNotNull() {
			addCriterion("SYS_UPDATE_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateEqualTo(Date value) {
			addCriterion("SYS_UPDATE_DATE =", value, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateNotEqualTo(Date value) {
			addCriterion("SYS_UPDATE_DATE <>", value, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateGreaterThan(Date value) {
			addCriterion("SYS_UPDATE_DATE >", value, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("SYS_UPDATE_DATE >=", value, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateLessThan(Date value) {
			addCriterion("SYS_UPDATE_DATE <", value, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("SYS_UPDATE_DATE <=", value, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateIn(List<Date> values) {
			addCriterion("SYS_UPDATE_DATE in", values, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateNotIn(List<Date> values) {
			addCriterion("SYS_UPDATE_DATE not in", values, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateBetween(Date value1, Date value2) {
			addCriterion("SYS_UPDATE_DATE between", value1, value2, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andSysUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("SYS_UPDATE_DATE not between", value1, value2, "sysUpdateDate");
			return (Criteria) this;
		}

		public Criteria andOperatorIdIsNull() {
			addCriterion("OPERATOR_ID is null");
			return (Criteria) this;
		}

		public Criteria andOperatorIdIsNotNull() {
			addCriterion("OPERATOR_ID is not null");
			return (Criteria) this;
		}

		public Criteria andOperatorIdEqualTo(String value) {
			addCriterion("OPERATOR_ID =", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdNotEqualTo(String value) {
			addCriterion("OPERATOR_ID <>", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdGreaterThan(String value) {
			addCriterion("OPERATOR_ID >", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
			addCriterion("OPERATOR_ID >=", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdLessThan(String value) {
			addCriterion("OPERATOR_ID <", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdLessThanOrEqualTo(String value) {
			addCriterion("OPERATOR_ID <=", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdLike(String value) {
			addCriterion("OPERATOR_ID like", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdNotLike(String value) {
			addCriterion("OPERATOR_ID not like", value, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdIn(List<String> values) {
			addCriterion("OPERATOR_ID in", values, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdNotIn(List<String> values) {
			addCriterion("OPERATOR_ID not in", values, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdBetween(String value1, String value2) {
			addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
			return (Criteria) this;
		}

		public Criteria andOperatorIdNotBetween(String value1, String value2) {
			addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdIsNull() {
			addCriterion("APPLICATION_ID is null");
			return (Criteria) this;
		}

		public Criteria andApplicationIdIsNotNull() {
			addCriterion("APPLICATION_ID is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationIdEqualTo(String value) {
			addCriterion("APPLICATION_ID =", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdNotEqualTo(String value) {
			addCriterion("APPLICATION_ID <>", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdGreaterThan(String value) {
			addCriterion("APPLICATION_ID >", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
			addCriterion("APPLICATION_ID >=", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdLessThan(String value) {
			addCriterion("APPLICATION_ID <", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdLessThanOrEqualTo(String value) {
			addCriterion("APPLICATION_ID <=", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdLike(String value) {
			addCriterion("APPLICATION_ID like", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdNotLike(String value) {
			addCriterion("APPLICATION_ID not like", value, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdIn(List<String> values) {
			addCriterion("APPLICATION_ID in", values, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdNotIn(List<String> values) {
			addCriterion("APPLICATION_ID not in", values, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdBetween(String value1, String value2) {
			addCriterion("APPLICATION_ID between", value1, value2, "applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdNotBetween(String value1, String value2) {
			addCriterion("APPLICATION_ID not between", value1, value2, "applicationId");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeIsNull() {
			addCriterion("DL_SERVICE_CODE is null");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeIsNotNull() {
			addCriterion("DL_SERVICE_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeEqualTo(String value) {
			addCriterion("DL_SERVICE_CODE =", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeNotEqualTo(String value) {
			addCriterion("DL_SERVICE_CODE <>", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeGreaterThan(String value) {
			addCriterion("DL_SERVICE_CODE >", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeGreaterThanOrEqualTo(String value) {
			addCriterion("DL_SERVICE_CODE >=", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeLessThan(String value) {
			addCriterion("DL_SERVICE_CODE <", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeLessThanOrEqualTo(String value) {
			addCriterion("DL_SERVICE_CODE <=", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeLike(String value) {
			addCriterion("DL_SERVICE_CODE like", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeNotLike(String value) {
			addCriterion("DL_SERVICE_CODE not like", value, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeIn(List<String> values) {
			addCriterion("DL_SERVICE_CODE in", values, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeNotIn(List<String> values) {
			addCriterion("DL_SERVICE_CODE not in", values, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeBetween(String value1, String value2) {
			addCriterion("DL_SERVICE_CODE between", value1, value2, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlServiceCodeNotBetween(String value1, String value2) {
			addCriterion("DL_SERVICE_CODE not between", value1, value2, "dlServiceCode");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampIsNull() {
			addCriterion("DL_UPDATE_STAMP is null");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampIsNotNull() {
			addCriterion("DL_UPDATE_STAMP is not null");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampEqualTo(Short value) {
			addCriterion("DL_UPDATE_STAMP =", value, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampNotEqualTo(Short value) {
			addCriterion("DL_UPDATE_STAMP <>", value, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampGreaterThan(Short value) {
			addCriterion("DL_UPDATE_STAMP >", value, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampGreaterThanOrEqualTo(Short value) {
			addCriterion("DL_UPDATE_STAMP >=", value, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampLessThan(Short value) {
			addCriterion("DL_UPDATE_STAMP <", value, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampLessThanOrEqualTo(Short value) {
			addCriterion("DL_UPDATE_STAMP <=", value, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampIn(List<Short> values) {
			addCriterion("DL_UPDATE_STAMP in", values, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampNotIn(List<Short> values) {
			addCriterion("DL_UPDATE_STAMP not in", values, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampBetween(Short value1, Short value2) {
			addCriterion("DL_UPDATE_STAMP between", value1, value2, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andDlUpdateStampNotBetween(Short value1, Short value2) {
			addCriterion("DL_UPDATE_STAMP not between", value1, value2, "dlUpdateStamp");
			return (Criteria) this;
		}

		public Criteria andPpsRateIsNull() {
			addCriterion("PPS_RATE is null");
			return (Criteria) this;
		}

		public Criteria andPpsRateIsNotNull() {
			addCriterion("PPS_RATE is not null");
			return (Criteria) this;
		}

		public Criteria andPpsRateEqualTo(BigDecimal value) {
			addCriterion("PPS_RATE =", value, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateNotEqualTo(BigDecimal value) {
			addCriterion("PPS_RATE <>", value, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateGreaterThan(BigDecimal value) {
			addCriterion("PPS_RATE >", value, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("PPS_RATE >=", value, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateLessThan(BigDecimal value) {
			addCriterion("PPS_RATE <", value, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateLessThanOrEqualTo(BigDecimal value) {
			addCriterion("PPS_RATE <=", value, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateIn(List<BigDecimal> values) {
			addCriterion("PPS_RATE in", values, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateNotIn(List<BigDecimal> values) {
			addCriterion("PPS_RATE not in", values, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("PPS_RATE between", value1, value2, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsRateNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("PPS_RATE not between", value1, value2, "ppsRate");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleIsNull() {
			addCriterion("PPS_ON_CYCLE is null");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleIsNotNull() {
			addCriterion("PPS_ON_CYCLE is not null");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleEqualTo(String value) {
			addCriterion("PPS_ON_CYCLE =", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleNotEqualTo(String value) {
			addCriterion("PPS_ON_CYCLE <>", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleGreaterThan(String value) {
			addCriterion("PPS_ON_CYCLE >", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleGreaterThanOrEqualTo(String value) {
			addCriterion("PPS_ON_CYCLE >=", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleLessThan(String value) {
			addCriterion("PPS_ON_CYCLE <", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleLessThanOrEqualTo(String value) {
			addCriterion("PPS_ON_CYCLE <=", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleLike(String value) {
			addCriterion("PPS_ON_CYCLE like", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleNotLike(String value) {
			addCriterion("PPS_ON_CYCLE not like", value, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleIn(List<String> values) {
			addCriterion("PPS_ON_CYCLE in", values, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleNotIn(List<String> values) {
			addCriterion("PPS_ON_CYCLE not in", values, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleBetween(String value1, String value2) {
			addCriterion("PPS_ON_CYCLE between", value1, value2, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsOnCycleNotBetween(String value1, String value2) {
			addCriterion("PPS_ON_CYCLE not between", value1, value2, "ppsOnCycle");
			return (Criteria) this;
		}

		public Criteria andPpsCondIsNull() {
			addCriterion("PPS_COND is null");
			return (Criteria) this;
		}

		public Criteria andPpsCondIsNotNull() {
			addCriterion("PPS_COND is not null");
			return (Criteria) this;
		}

		public Criteria andPpsCondEqualTo(String value) {
			addCriterion("PPS_COND =", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondNotEqualTo(String value) {
			addCriterion("PPS_COND <>", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondGreaterThan(String value) {
			addCriterion("PPS_COND >", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondGreaterThanOrEqualTo(String value) {
			addCriterion("PPS_COND >=", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondLessThan(String value) {
			addCriterion("PPS_COND <", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondLessThanOrEqualTo(String value) {
			addCriterion("PPS_COND <=", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondLike(String value) {
			addCriterion("PPS_COND like", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondNotLike(String value) {
			addCriterion("PPS_COND not like", value, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondIn(List<String> values) {
			addCriterion("PPS_COND in", values, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondNotIn(List<String> values) {
			addCriterion("PPS_COND not in", values, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondBetween(String value1, String value2) {
			addCriterion("PPS_COND between", value1, value2, "ppsCond");
			return (Criteria) this;
		}

		public Criteria andPpsCondNotBetween(String value1, String value2) {
			addCriterion("PPS_COND not between", value1, value2, "ppsCond");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
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
     * This class corresponds to the database table ABACUS.ABA_PD_CUSTOM_RC
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
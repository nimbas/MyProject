package com.acube.pc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoucherRchargeProdExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public VoucherRchargeProdExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
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

		public Criteria andVoucherIdIsNull() {
			addCriterion("VOUCHER_ID is null");
			return (Criteria) this;
		}

		public Criteria andVoucherIdIsNotNull() {
			addCriterion("VOUCHER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andVoucherIdEqualTo(String value) {
			addCriterion("VOUCHER_ID =", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdNotEqualTo(String value) {
			addCriterion("VOUCHER_ID <>", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdGreaterThan(String value) {
			addCriterion("VOUCHER_ID >", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdGreaterThanOrEqualTo(String value) {
			addCriterion("VOUCHER_ID >=", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdLessThan(String value) {
			addCriterion("VOUCHER_ID <", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdLessThanOrEqualTo(String value) {
			addCriterion("VOUCHER_ID <=", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdLike(String value) {
			addCriterion("VOUCHER_ID like", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdNotLike(String value) {
			addCriterion("VOUCHER_ID not like", value, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdIn(List<String> values) {
			addCriterion("VOUCHER_ID in", values, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdNotIn(List<String> values) {
			addCriterion("VOUCHER_ID not in", values, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdBetween(String value1, String value2) {
			addCriterion("VOUCHER_ID between", value1, value2, "voucherId");
			return (Criteria) this;
		}

		public Criteria andVoucherIdNotBetween(String value1, String value2) {
			addCriterion("VOUCHER_ID not between", value1, value2, "voucherId");
			return (Criteria) this;
		}

		public Criteria andProdIdIsNull() {
			addCriterion("PROD_ID is null");
			return (Criteria) this;
		}

		public Criteria andProdIdIsNotNull() {
			addCriterion("PROD_ID is not null");
			return (Criteria) this;
		}

		public Criteria andProdIdEqualTo(String value) {
			addCriterion("PROD_ID =", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotEqualTo(String value) {
			addCriterion("PROD_ID <>", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdGreaterThan(String value) {
			addCriterion("PROD_ID >", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdGreaterThanOrEqualTo(String value) {
			addCriterion("PROD_ID >=", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLessThan(String value) {
			addCriterion("PROD_ID <", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLessThanOrEqualTo(String value) {
			addCriterion("PROD_ID <=", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLike(String value) {
			addCriterion("PROD_ID like", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotLike(String value) {
			addCriterion("PROD_ID not like", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdIn(List<String> values) {
			addCriterion("PROD_ID in", values, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotIn(List<String> values) {
			addCriterion("PROD_ID not in", values, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdBetween(String value1, String value2) {
			addCriterion("PROD_ID between", value1, value2, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotBetween(String value1, String value2) {
			addCriterion("PROD_ID not between", value1, value2, "prodId");
			return (Criteria) this;
		}

		public Criteria andCounterIdIsNull() {
			addCriterion("COUNTER_ID is null");
			return (Criteria) this;
		}

		public Criteria andCounterIdIsNotNull() {
			addCriterion("COUNTER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andCounterIdEqualTo(Long value) {
			addCriterion("COUNTER_ID =", value, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdNotEqualTo(Long value) {
			addCriterion("COUNTER_ID <>", value, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdGreaterThan(Long value) {
			addCriterion("COUNTER_ID >", value, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdGreaterThanOrEqualTo(Long value) {
			addCriterion("COUNTER_ID >=", value, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdLessThan(Long value) {
			addCriterion("COUNTER_ID <", value, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdLessThanOrEqualTo(Long value) {
			addCriterion("COUNTER_ID <=", value, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdIn(List<Long> values) {
			addCriterion("COUNTER_ID in", values, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdNotIn(List<Long> values) {
			addCriterion("COUNTER_ID not in", values, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdBetween(Long value1, Long value2) {
			addCriterion("COUNTER_ID between", value1, value2, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterIdNotBetween(Long value1, Long value2) {
			addCriterion("COUNTER_ID not between", value1, value2, "counterId");
			return (Criteria) this;
		}

		public Criteria andCounterTypeIsNull() {
			addCriterion("COUNTER_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andCounterTypeIsNotNull() {
			addCriterion("COUNTER_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andCounterTypeEqualTo(String value) {
			addCriterion("COUNTER_TYPE =", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeNotEqualTo(String value) {
			addCriterion("COUNTER_TYPE <>", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeGreaterThan(String value) {
			addCriterion("COUNTER_TYPE >", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeGreaterThanOrEqualTo(String value) {
			addCriterion("COUNTER_TYPE >=", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeLessThan(String value) {
			addCriterion("COUNTER_TYPE <", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeLessThanOrEqualTo(String value) {
			addCriterion("COUNTER_TYPE <=", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeLike(String value) {
			addCriterion("COUNTER_TYPE like", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeNotLike(String value) {
			addCriterion("COUNTER_TYPE not like", value, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeIn(List<String> values) {
			addCriterion("COUNTER_TYPE in", values, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeNotIn(List<String> values) {
			addCriterion("COUNTER_TYPE not in", values, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeBetween(String value1, String value2) {
			addCriterion("COUNTER_TYPE between", value1, value2, "counterType");
			return (Criteria) this;
		}

		public Criteria andCounterTypeNotBetween(String value1, String value2) {
			addCriterion("COUNTER_TYPE not between", value1, value2, "counterType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeIsNull() {
			addCriterion("BILLING_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andBillingTypeIsNotNull() {
			addCriterion("BILLING_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andBillingTypeEqualTo(String value) {
			addCriterion("BILLING_TYPE =", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeNotEqualTo(String value) {
			addCriterion("BILLING_TYPE <>", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeGreaterThan(String value) {
			addCriterion("BILLING_TYPE >", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeGreaterThanOrEqualTo(String value) {
			addCriterion("BILLING_TYPE >=", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeLessThan(String value) {
			addCriterion("BILLING_TYPE <", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeLessThanOrEqualTo(String value) {
			addCriterion("BILLING_TYPE <=", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeLike(String value) {
			addCriterion("BILLING_TYPE like", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeNotLike(String value) {
			addCriterion("BILLING_TYPE not like", value, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeIn(List<String> values) {
			addCriterion("BILLING_TYPE in", values, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeNotIn(List<String> values) {
			addCriterion("BILLING_TYPE not in", values, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeBetween(String value1, String value2) {
			addCriterion("BILLING_TYPE between", value1, value2, "billingType");
			return (Criteria) this;
		}

		public Criteria andBillingTypeNotBetween(String value1, String value2) {
			addCriterion("BILLING_TYPE not between", value1, value2, "billingType");
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

		public Criteria andAmountEqualTo(BigDecimal value) {
			addCriterion("AMOUNT =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(BigDecimal value) {
			addCriterion("AMOUNT <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(BigDecimal value) {
			addCriterion("AMOUNT >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("AMOUNT >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(BigDecimal value) {
			addCriterion("AMOUNT <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("AMOUNT <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<BigDecimal> values) {
			addCriterion("AMOUNT in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<BigDecimal> values) {
			addCriterion("AMOUNT not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("AMOUNT between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("AMOUNT not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andUnitIsNull() {
			addCriterion("UNIT is null");
			return (Criteria) this;
		}

		public Criteria andUnitIsNotNull() {
			addCriterion("UNIT is not null");
			return (Criteria) this;
		}

		public Criteria andUnitEqualTo(String value) {
			addCriterion("UNIT =", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotEqualTo(String value) {
			addCriterion("UNIT <>", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThan(String value) {
			addCriterion("UNIT >", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThanOrEqualTo(String value) {
			addCriterion("UNIT >=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThan(String value) {
			addCriterion("UNIT <", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThanOrEqualTo(String value) {
			addCriterion("UNIT <=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLike(String value) {
			addCriterion("UNIT like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotLike(String value) {
			addCriterion("UNIT not like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIn(List<String> values) {
			addCriterion("UNIT in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotIn(List<String> values) {
			addCriterion("UNIT not in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitBetween(String value1, String value2) {
			addCriterion("UNIT between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotBetween(String value1, String value2) {
			addCriterion("UNIT not between", value1, value2, "unit");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
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
     * This class corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_PROD
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:14:47 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
package com.acube.common.domain.mbg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeSecurityProfileInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public SeSecurityProfileInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
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

		public Criteria andMarketCodeIsNull() {
			addCriterion("MARKET_CODE is null");
			return (Criteria) this;
		}

		public Criteria andMarketCodeIsNotNull() {
			addCriterion("MARKET_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andMarketCodeEqualTo(String value) {
			addCriterion("MARKET_CODE =", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeNotEqualTo(String value) {
			addCriterion("MARKET_CODE <>", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeGreaterThan(String value) {
			addCriterion("MARKET_CODE >", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeGreaterThanOrEqualTo(String value) {
			addCriterion("MARKET_CODE >=", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeLessThan(String value) {
			addCriterion("MARKET_CODE <", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeLessThanOrEqualTo(String value) {
			addCriterion("MARKET_CODE <=", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeLike(String value) {
			addCriterion("MARKET_CODE like", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeNotLike(String value) {
			addCriterion("MARKET_CODE not like", value, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeIn(List<String> values) {
			addCriterion("MARKET_CODE in", values, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeNotIn(List<String> values) {
			addCriterion("MARKET_CODE not in", values, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeBetween(String value1, String value2) {
			addCriterion("MARKET_CODE between", value1, value2, "marketCode");
			return (Criteria) this;
		}

		public Criteria andMarketCodeNotBetween(String value1, String value2) {
			addCriterion("MARKET_CODE not between", value1, value2, "marketCode");
			return (Criteria) this;
		}

		public Criteria andProfileIdIsNull() {
			addCriterion("PROFILE_ID is null");
			return (Criteria) this;
		}

		public Criteria andProfileIdIsNotNull() {
			addCriterion("PROFILE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andProfileIdEqualTo(String value) {
			addCriterion("PROFILE_ID =", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdNotEqualTo(String value) {
			addCriterion("PROFILE_ID <>", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdGreaterThan(String value) {
			addCriterion("PROFILE_ID >", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdGreaterThanOrEqualTo(String value) {
			addCriterion("PROFILE_ID >=", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdLessThan(String value) {
			addCriterion("PROFILE_ID <", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdLessThanOrEqualTo(String value) {
			addCriterion("PROFILE_ID <=", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdLike(String value) {
			addCriterion("PROFILE_ID like", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdNotLike(String value) {
			addCriterion("PROFILE_ID not like", value, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdIn(List<String> values) {
			addCriterion("PROFILE_ID in", values, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdNotIn(List<String> values) {
			addCriterion("PROFILE_ID not in", values, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdBetween(String value1, String value2) {
			addCriterion("PROFILE_ID between", value1, value2, "profileId");
			return (Criteria) this;
		}

		public Criteria andProfileIdNotBetween(String value1, String value2) {
			addCriterion("PROFILE_ID not between", value1, value2, "profileId");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("DESCRIPTION is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("DESCRIPTION is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("DESCRIPTION =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("DESCRIPTION <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("DESCRIPTION >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("DESCRIPTION >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("DESCRIPTION <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("DESCRIPTION <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("DESCRIPTION like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("DESCRIPTION not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("DESCRIPTION in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("DESCRIPTION not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("DESCRIPTION between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("DESCRIPTION not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andProfileTypeIsNull() {
			addCriterion("PROFILE_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andProfileTypeIsNotNull() {
			addCriterion("PROFILE_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andProfileTypeEqualTo(String value) {
			addCriterion("PROFILE_TYPE =", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeNotEqualTo(String value) {
			addCriterion("PROFILE_TYPE <>", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeGreaterThan(String value) {
			addCriterion("PROFILE_TYPE >", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeGreaterThanOrEqualTo(String value) {
			addCriterion("PROFILE_TYPE >=", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeLessThan(String value) {
			addCriterion("PROFILE_TYPE <", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeLessThanOrEqualTo(String value) {
			addCriterion("PROFILE_TYPE <=", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeLike(String value) {
			addCriterion("PROFILE_TYPE like", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeNotLike(String value) {
			addCriterion("PROFILE_TYPE not like", value, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeIn(List<String> values) {
			addCriterion("PROFILE_TYPE in", values, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeNotIn(List<String> values) {
			addCriterion("PROFILE_TYPE not in", values, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeBetween(String value1, String value2) {
			addCriterion("PROFILE_TYPE between", value1, value2, "profileType");
			return (Criteria) this;
		}

		public Criteria andProfileTypeNotBetween(String value1, String value2) {
			addCriterion("PROFILE_TYPE not between", value1, value2, "profileType");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateIsNull() {
			addCriterion("SYS_CREATE_DATE is null");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateIsNotNull() {
			addCriterion("SYS_CREATE_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateEqualTo(Date value) {
			addCriterion("SYS_CREATE_DATE =", value, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateNotEqualTo(Date value) {
			addCriterion("SYS_CREATE_DATE <>", value, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateGreaterThan(Date value) {
			addCriterion("SYS_CREATE_DATE >", value, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("SYS_CREATE_DATE >=", value, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateLessThan(Date value) {
			addCriterion("SYS_CREATE_DATE <", value, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("SYS_CREATE_DATE <=", value, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateIn(List<Date> values) {
			addCriterion("SYS_CREATE_DATE in", values, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateNotIn(List<Date> values) {
			addCriterion("SYS_CREATE_DATE not in", values, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateBetween(Date value1, Date value2) {
			addCriterion("SYS_CREATE_DATE between", value1, value2, "sysCreateDate");
			return (Criteria) this;
		}

		public Criteria andSysCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("SYS_CREATE_DATE not between", value1, value2, "sysCreateDate");
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

		public Criteria andSysOperatorIdIsNull() {
			addCriterion("SYS_OPERATOR_ID is null");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdIsNotNull() {
			addCriterion("SYS_OPERATOR_ID is not null");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdEqualTo(String value) {
			addCriterion("SYS_OPERATOR_ID =", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdNotEqualTo(String value) {
			addCriterion("SYS_OPERATOR_ID <>", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdGreaterThan(String value) {
			addCriterion("SYS_OPERATOR_ID >", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdGreaterThanOrEqualTo(String value) {
			addCriterion("SYS_OPERATOR_ID >=", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdLessThan(String value) {
			addCriterion("SYS_OPERATOR_ID <", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdLessThanOrEqualTo(String value) {
			addCriterion("SYS_OPERATOR_ID <=", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdLike(String value) {
			addCriterion("SYS_OPERATOR_ID like", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdNotLike(String value) {
			addCriterion("SYS_OPERATOR_ID not like", value, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdIn(List<String> values) {
			addCriterion("SYS_OPERATOR_ID in", values, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdNotIn(List<String> values) {
			addCriterion("SYS_OPERATOR_ID not in", values, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdBetween(String value1, String value2) {
			addCriterion("SYS_OPERATOR_ID between", value1, value2, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysOperatorIdNotBetween(String value1, String value2) {
			addCriterion("SYS_OPERATOR_ID not between", value1, value2, "sysOperatorId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdIsNull() {
			addCriterion("SYS_APPLICATION_ID is null");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdIsNotNull() {
			addCriterion("SYS_APPLICATION_ID is not null");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdEqualTo(String value) {
			addCriterion("SYS_APPLICATION_ID =", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdNotEqualTo(String value) {
			addCriterion("SYS_APPLICATION_ID <>", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdGreaterThan(String value) {
			addCriterion("SYS_APPLICATION_ID >", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdGreaterThanOrEqualTo(String value) {
			addCriterion("SYS_APPLICATION_ID >=", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdLessThan(String value) {
			addCriterion("SYS_APPLICATION_ID <", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdLessThanOrEqualTo(String value) {
			addCriterion("SYS_APPLICATION_ID <=", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdLike(String value) {
			addCriterion("SYS_APPLICATION_ID like", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdNotLike(String value) {
			addCriterion("SYS_APPLICATION_ID not like", value, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdIn(List<String> values) {
			addCriterion("SYS_APPLICATION_ID in", values, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdNotIn(List<String> values) {
			addCriterion("SYS_APPLICATION_ID not in", values, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdBetween(String value1, String value2) {
			addCriterion("SYS_APPLICATION_ID between", value1, value2, "sysApplicationId");
			return (Criteria) this;
		}

		public Criteria andSysApplicationIdNotBetween(String value1, String value2) {
			addCriterion("SYS_APPLICATION_ID not between", value1, value2, "sysApplicationId");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
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
     * This class corresponds to the database table ABACUS.ABA_SE_SECURITY_PROFILE_INFO
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 29 17:52:11 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
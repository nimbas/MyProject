package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LifecycleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public LifecycleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
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

		public Criteria andLifeCycleIdIsNull() {
			addCriterion("LIFE_CYCLE_ID is null");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdIsNotNull() {
			addCriterion("LIFE_CYCLE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdEqualTo(String value) {
			addCriterion("LIFE_CYCLE_ID =", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdNotEqualTo(String value) {
			addCriterion("LIFE_CYCLE_ID <>", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdGreaterThan(String value) {
			addCriterion("LIFE_CYCLE_ID >", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdGreaterThanOrEqualTo(String value) {
			addCriterion("LIFE_CYCLE_ID >=", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdLessThan(String value) {
			addCriterion("LIFE_CYCLE_ID <", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdLessThanOrEqualTo(String value) {
			addCriterion("LIFE_CYCLE_ID <=", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdLike(String value) {
			addCriterion("LIFE_CYCLE_ID like", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdNotLike(String value) {
			addCriterion("LIFE_CYCLE_ID not like", value, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdIn(List<String> values) {
			addCriterion("LIFE_CYCLE_ID in", values, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdNotIn(List<String> values) {
			addCriterion("LIFE_CYCLE_ID not in", values, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdBetween(String value1, String value2) {
			addCriterion("LIFE_CYCLE_ID between", value1, value2, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleIdNotBetween(String value1, String value2) {
			addCriterion("LIFE_CYCLE_ID not between", value1, value2, "lifeCycleId");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameIsNull() {
			addCriterion("LIFE_CYCLE_NAME is null");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameIsNotNull() {
			addCriterion("LIFE_CYCLE_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameEqualTo(String value) {
			addCriterion("LIFE_CYCLE_NAME =", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameNotEqualTo(String value) {
			addCriterion("LIFE_CYCLE_NAME <>", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameGreaterThan(String value) {
			addCriterion("LIFE_CYCLE_NAME >", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameGreaterThanOrEqualTo(String value) {
			addCriterion("LIFE_CYCLE_NAME >=", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameLessThan(String value) {
			addCriterion("LIFE_CYCLE_NAME <", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameLessThanOrEqualTo(String value) {
			addCriterion("LIFE_CYCLE_NAME <=", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameLike(String value) {
			addCriterion("LIFE_CYCLE_NAME like", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameNotLike(String value) {
			addCriterion("LIFE_CYCLE_NAME not like", value, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameIn(List<String> values) {
			addCriterion("LIFE_CYCLE_NAME in", values, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameNotIn(List<String> values) {
			addCriterion("LIFE_CYCLE_NAME not in", values, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameBetween(String value1, String value2) {
			addCriterion("LIFE_CYCLE_NAME between", value1, value2, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andLifeCycleNameNotBetween(String value1, String value2) {
			addCriterion("LIFE_CYCLE_NAME not between", value1, value2, "lifeCycleName");
			return (Criteria) this;
		}

		public Criteria andDomainIsNull() {
			addCriterion("DOMAIN is null");
			return (Criteria) this;
		}

		public Criteria andDomainIsNotNull() {
			addCriterion("DOMAIN is not null");
			return (Criteria) this;
		}

		public Criteria andDomainEqualTo(String value) {
			addCriterion("DOMAIN =", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainNotEqualTo(String value) {
			addCriterion("DOMAIN <>", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainGreaterThan(String value) {
			addCriterion("DOMAIN >", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainGreaterThanOrEqualTo(String value) {
			addCriterion("DOMAIN >=", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainLessThan(String value) {
			addCriterion("DOMAIN <", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainLessThanOrEqualTo(String value) {
			addCriterion("DOMAIN <=", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainLike(String value) {
			addCriterion("DOMAIN like", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainNotLike(String value) {
			addCriterion("DOMAIN not like", value, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainIn(List<String> values) {
			addCriterion("DOMAIN in", values, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainNotIn(List<String> values) {
			addCriterion("DOMAIN not in", values, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainBetween(String value1, String value2) {
			addCriterion("DOMAIN between", value1, value2, "domain");
			return (Criteria) this;
		}

		public Criteria andDomainNotBetween(String value1, String value2) {
			addCriterion("DOMAIN not between", value1, value2, "domain");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
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
     * This class corresponds to the database table ABACUS.ABA_PD_LIFECYCLE
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
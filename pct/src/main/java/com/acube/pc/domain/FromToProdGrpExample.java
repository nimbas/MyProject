package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FromToProdGrpExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public FromToProdGrpExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
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

		public Criteria andChangeSchemeIdIsNull() {
			addCriterion("CHANGE_SCHEME_ID is null");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdIsNotNull() {
			addCriterion("CHANGE_SCHEME_ID is not null");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdEqualTo(String value) {
			addCriterion("CHANGE_SCHEME_ID =", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdNotEqualTo(String value) {
			addCriterion("CHANGE_SCHEME_ID <>", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdGreaterThan(String value) {
			addCriterion("CHANGE_SCHEME_ID >", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdGreaterThanOrEqualTo(String value) {
			addCriterion("CHANGE_SCHEME_ID >=", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdLessThan(String value) {
			addCriterion("CHANGE_SCHEME_ID <", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdLessThanOrEqualTo(String value) {
			addCriterion("CHANGE_SCHEME_ID <=", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdLike(String value) {
			addCriterion("CHANGE_SCHEME_ID like", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdNotLike(String value) {
			addCriterion("CHANGE_SCHEME_ID not like", value, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdIn(List<String> values) {
			addCriterion("CHANGE_SCHEME_ID in", values, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdNotIn(List<String> values) {
			addCriterion("CHANGE_SCHEME_ID not in", values, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdBetween(String value1, String value2) {
			addCriterion("CHANGE_SCHEME_ID between", value1, value2, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andChangeSchemeIdNotBetween(String value1, String value2) {
			addCriterion("CHANGE_SCHEME_ID not between", value1, value2, "changeSchemeId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdIsNull() {
			addCriterion("PROD_GRP_ID is null");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdIsNotNull() {
			addCriterion("PROD_GRP_ID is not null");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdEqualTo(String value) {
			addCriterion("PROD_GRP_ID =", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdNotEqualTo(String value) {
			addCriterion("PROD_GRP_ID <>", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdGreaterThan(String value) {
			addCriterion("PROD_GRP_ID >", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdGreaterThanOrEqualTo(String value) {
			addCriterion("PROD_GRP_ID >=", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdLessThan(String value) {
			addCriterion("PROD_GRP_ID <", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdLessThanOrEqualTo(String value) {
			addCriterion("PROD_GRP_ID <=", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdLike(String value) {
			addCriterion("PROD_GRP_ID like", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdNotLike(String value) {
			addCriterion("PROD_GRP_ID not like", value, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdIn(List<String> values) {
			addCriterion("PROD_GRP_ID in", values, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdNotIn(List<String> values) {
			addCriterion("PROD_GRP_ID not in", values, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdBetween(String value1, String value2) {
			addCriterion("PROD_GRP_ID between", value1, value2, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andProdGrpIdNotBetween(String value1, String value2) {
			addCriterion("PROD_GRP_ID not between", value1, value2, "prodGrpId");
			return (Criteria) this;
		}

		public Criteria andFromToFlagIsNull() {
			addCriterion("FROM_TO_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andFromToFlagIsNotNull() {
			addCriterion("FROM_TO_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andFromToFlagEqualTo(String value) {
			addCriterion("FROM_TO_FLAG =", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagNotEqualTo(String value) {
			addCriterion("FROM_TO_FLAG <>", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagGreaterThan(String value) {
			addCriterion("FROM_TO_FLAG >", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagGreaterThanOrEqualTo(String value) {
			addCriterion("FROM_TO_FLAG >=", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagLessThan(String value) {
			addCriterion("FROM_TO_FLAG <", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagLessThanOrEqualTo(String value) {
			addCriterion("FROM_TO_FLAG <=", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagLike(String value) {
			addCriterion("FROM_TO_FLAG like", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagNotLike(String value) {
			addCriterion("FROM_TO_FLAG not like", value, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagIn(List<String> values) {
			addCriterion("FROM_TO_FLAG in", values, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagNotIn(List<String> values) {
			addCriterion("FROM_TO_FLAG not in", values, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagBetween(String value1, String value2) {
			addCriterion("FROM_TO_FLAG between", value1, value2, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andFromToFlagNotBetween(String value1, String value2) {
			addCriterion("FROM_TO_FLAG not between", value1, value2, "fromToFlag");
			return (Criteria) this;
		}

		public Criteria andAplyYnIsNull() {
			addCriterion("APLY_YN is null");
			return (Criteria) this;
		}

		public Criteria andAplyYnIsNotNull() {
			addCriterion("APLY_YN is not null");
			return (Criteria) this;
		}

		public Criteria andAplyYnEqualTo(String value) {
			addCriterion("APLY_YN =", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnNotEqualTo(String value) {
			addCriterion("APLY_YN <>", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnGreaterThan(String value) {
			addCriterion("APLY_YN >", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnGreaterThanOrEqualTo(String value) {
			addCriterion("APLY_YN >=", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnLessThan(String value) {
			addCriterion("APLY_YN <", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnLessThanOrEqualTo(String value) {
			addCriterion("APLY_YN <=", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnLike(String value) {
			addCriterion("APLY_YN like", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnNotLike(String value) {
			addCriterion("APLY_YN not like", value, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnIn(List<String> values) {
			addCriterion("APLY_YN in", values, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnNotIn(List<String> values) {
			addCriterion("APLY_YN not in", values, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnBetween(String value1, String value2) {
			addCriterion("APLY_YN between", value1, value2, "aplyYn");
			return (Criteria) this;
		}

		public Criteria andAplyYnNotBetween(String value1, String value2) {
			addCriterion("APLY_YN not between", value1, value2, "aplyYn");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
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
     * This class corresponds to the database table ABACUS.ABA_PD_FROM_TO_PROD_GRP
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
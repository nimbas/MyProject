package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnetimeAttrExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public OnetimeAttrExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
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

		public Criteria andFtrCdIsNull() {
			addCriterion("FTR_CD is null");
			return (Criteria) this;
		}

		public Criteria andFtrCdIsNotNull() {
			addCriterion("FTR_CD is not null");
			return (Criteria) this;
		}

		public Criteria andFtrCdEqualTo(String value) {
			addCriterion("FTR_CD =", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdNotEqualTo(String value) {
			addCriterion("FTR_CD <>", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdGreaterThan(String value) {
			addCriterion("FTR_CD >", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdGreaterThanOrEqualTo(String value) {
			addCriterion("FTR_CD >=", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdLessThan(String value) {
			addCriterion("FTR_CD <", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdLessThanOrEqualTo(String value) {
			addCriterion("FTR_CD <=", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdLike(String value) {
			addCriterion("FTR_CD like", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdNotLike(String value) {
			addCriterion("FTR_CD not like", value, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdIn(List<String> values) {
			addCriterion("FTR_CD in", values, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdNotIn(List<String> values) {
			addCriterion("FTR_CD not in", values, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdBetween(String value1, String value2) {
			addCriterion("FTR_CD between", value1, value2, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andFtrCdNotBetween(String value1, String value2) {
			addCriterion("FTR_CD not between", value1, value2, "ftrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdIsNull() {
			addCriterion("PROD_ATTR_CD is null");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdIsNotNull() {
			addCriterion("PROD_ATTR_CD is not null");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdEqualTo(String value) {
			addCriterion("PROD_ATTR_CD =", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdNotEqualTo(String value) {
			addCriterion("PROD_ATTR_CD <>", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdGreaterThan(String value) {
			addCriterion("PROD_ATTR_CD >", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdGreaterThanOrEqualTo(String value) {
			addCriterion("PROD_ATTR_CD >=", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdLessThan(String value) {
			addCriterion("PROD_ATTR_CD <", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdLessThanOrEqualTo(String value) {
			addCriterion("PROD_ATTR_CD <=", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdLike(String value) {
			addCriterion("PROD_ATTR_CD like", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdNotLike(String value) {
			addCriterion("PROD_ATTR_CD not like", value, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdIn(List<String> values) {
			addCriterion("PROD_ATTR_CD in", values, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdNotIn(List<String> values) {
			addCriterion("PROD_ATTR_CD not in", values, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdBetween(String value1, String value2) {
			addCriterion("PROD_ATTR_CD between", value1, value2, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrCdNotBetween(String value1, String value2) {
			addCriterion("PROD_ATTR_CD not between", value1, value2, "prodAttrCd");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameIsNull() {
			addCriterion("PROD_ATTR_NAME is null");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameIsNotNull() {
			addCriterion("PROD_ATTR_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameEqualTo(String value) {
			addCriterion("PROD_ATTR_NAME =", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameNotEqualTo(String value) {
			addCriterion("PROD_ATTR_NAME <>", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameGreaterThan(String value) {
			addCriterion("PROD_ATTR_NAME >", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameGreaterThanOrEqualTo(String value) {
			addCriterion("PROD_ATTR_NAME >=", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameLessThan(String value) {
			addCriterion("PROD_ATTR_NAME <", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameLessThanOrEqualTo(String value) {
			addCriterion("PROD_ATTR_NAME <=", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameLike(String value) {
			addCriterion("PROD_ATTR_NAME like", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameNotLike(String value) {
			addCriterion("PROD_ATTR_NAME not like", value, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameIn(List<String> values) {
			addCriterion("PROD_ATTR_NAME in", values, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameNotIn(List<String> values) {
			addCriterion("PROD_ATTR_NAME not in", values, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameBetween(String value1, String value2) {
			addCriterion("PROD_ATTR_NAME between", value1, value2, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andProdAttrNameNotBetween(String value1, String value2) {
			addCriterion("PROD_ATTR_NAME not between", value1, value2, "prodAttrName");
			return (Criteria) this;
		}

		public Criteria andValueIsNull() {
			addCriterion("VALUE is null");
			return (Criteria) this;
		}

		public Criteria andValueIsNotNull() {
			addCriterion("VALUE is not null");
			return (Criteria) this;
		}

		public Criteria andValueEqualTo(String value) {
			addCriterion("VALUE =", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotEqualTo(String value) {
			addCriterion("VALUE <>", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThan(String value) {
			addCriterion("VALUE >", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThanOrEqualTo(String value) {
			addCriterion("VALUE >=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThan(String value) {
			addCriterion("VALUE <", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThanOrEqualTo(String value) {
			addCriterion("VALUE <=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLike(String value) {
			addCriterion("VALUE like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotLike(String value) {
			addCriterion("VALUE not like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueIn(List<String> values) {
			addCriterion("VALUE in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotIn(List<String> values) {
			addCriterion("VALUE not in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueBetween(String value1, String value2) {
			addCriterion("VALUE between", value1, value2, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotBetween(String value1, String value2) {
			addCriterion("VALUE not between", value1, value2, "value");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
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
     * This class corresponds to the database table ABACUS.ABA_PD_ONETIME_ATTR
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
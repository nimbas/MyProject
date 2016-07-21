package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmlvExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public TmlvExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TMLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_TMLV
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

		public Criteria andTimeBandCdIsNull() {
			addCriterion("TIME_BAND_CD is null");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdIsNotNull() {
			addCriterion("TIME_BAND_CD is not null");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdEqualTo(String value) {
			addCriterion("TIME_BAND_CD =", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdNotEqualTo(String value) {
			addCriterion("TIME_BAND_CD <>", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdGreaterThan(String value) {
			addCriterion("TIME_BAND_CD >", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdGreaterThanOrEqualTo(String value) {
			addCriterion("TIME_BAND_CD >=", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdLessThan(String value) {
			addCriterion("TIME_BAND_CD <", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdLessThanOrEqualTo(String value) {
			addCriterion("TIME_BAND_CD <=", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdLike(String value) {
			addCriterion("TIME_BAND_CD like", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdNotLike(String value) {
			addCriterion("TIME_BAND_CD not like", value, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdIn(List<String> values) {
			addCriterion("TIME_BAND_CD in", values, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdNotIn(List<String> values) {
			addCriterion("TIME_BAND_CD not in", values, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdBetween(String value1, String value2) {
			addCriterion("TIME_BAND_CD between", value1, value2, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTimeBandCdNotBetween(String value1, String value2) {
			addCriterion("TIME_BAND_CD not between", value1, value2, "timeBandCd");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdIsNull() {
			addCriterion("TM_ZONE_ID is null");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdIsNotNull() {
			addCriterion("TM_ZONE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdEqualTo(String value) {
			addCriterion("TM_ZONE_ID =", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdNotEqualTo(String value) {
			addCriterion("TM_ZONE_ID <>", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdGreaterThan(String value) {
			addCriterion("TM_ZONE_ID >", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdGreaterThanOrEqualTo(String value) {
			addCriterion("TM_ZONE_ID >=", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdLessThan(String value) {
			addCriterion("TM_ZONE_ID <", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdLessThanOrEqualTo(String value) {
			addCriterion("TM_ZONE_ID <=", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdLike(String value) {
			addCriterion("TM_ZONE_ID like", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdNotLike(String value) {
			addCriterion("TM_ZONE_ID not like", value, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdIn(List<String> values) {
			addCriterion("TM_ZONE_ID in", values, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdNotIn(List<String> values) {
			addCriterion("TM_ZONE_ID not in", values, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdBetween(String value1, String value2) {
			addCriterion("TM_ZONE_ID between", value1, value2, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andTmZoneIdNotBetween(String value1, String value2) {
			addCriterion("TM_ZONE_ID not between", value1, value2, "tmZoneId");
			return (Criteria) this;
		}

		public Criteria andDowCdIsNull() {
			addCriterion("DOW_CD is null");
			return (Criteria) this;
		}

		public Criteria andDowCdIsNotNull() {
			addCriterion("DOW_CD is not null");
			return (Criteria) this;
		}

		public Criteria andDowCdEqualTo(String value) {
			addCriterion("DOW_CD =", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdNotEqualTo(String value) {
			addCriterion("DOW_CD <>", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdGreaterThan(String value) {
			addCriterion("DOW_CD >", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdGreaterThanOrEqualTo(String value) {
			addCriterion("DOW_CD >=", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdLessThan(String value) {
			addCriterion("DOW_CD <", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdLessThanOrEqualTo(String value) {
			addCriterion("DOW_CD <=", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdLike(String value) {
			addCriterion("DOW_CD like", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdNotLike(String value) {
			addCriterion("DOW_CD not like", value, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdIn(List<String> values) {
			addCriterion("DOW_CD in", values, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdNotIn(List<String> values) {
			addCriterion("DOW_CD not in", values, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdBetween(String value1, String value2) {
			addCriterion("DOW_CD between", value1, value2, "dowCd");
			return (Criteria) this;
		}

		public Criteria andDowCdNotBetween(String value1, String value2) {
			addCriterion("DOW_CD not between", value1, value2, "dowCd");
			return (Criteria) this;
		}

		public Criteria andStrtTmIsNull() {
			addCriterion("STRT_TM is null");
			return (Criteria) this;
		}

		public Criteria andStrtTmIsNotNull() {
			addCriterion("STRT_TM is not null");
			return (Criteria) this;
		}

		public Criteria andStrtTmEqualTo(String value) {
			addCriterion("STRT_TM =", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmNotEqualTo(String value) {
			addCriterion("STRT_TM <>", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmGreaterThan(String value) {
			addCriterion("STRT_TM >", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmGreaterThanOrEqualTo(String value) {
			addCriterion("STRT_TM >=", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmLessThan(String value) {
			addCriterion("STRT_TM <", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmLessThanOrEqualTo(String value) {
			addCriterion("STRT_TM <=", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmLike(String value) {
			addCriterion("STRT_TM like", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmNotLike(String value) {
			addCriterion("STRT_TM not like", value, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmIn(List<String> values) {
			addCriterion("STRT_TM in", values, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmNotIn(List<String> values) {
			addCriterion("STRT_TM not in", values, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmBetween(String value1, String value2) {
			addCriterion("STRT_TM between", value1, value2, "strtTm");
			return (Criteria) this;
		}

		public Criteria andStrtTmNotBetween(String value1, String value2) {
			addCriterion("STRT_TM not between", value1, value2, "strtTm");
			return (Criteria) this;
		}

		public Criteria andEndTmIsNull() {
			addCriterion("END_TM is null");
			return (Criteria) this;
		}

		public Criteria andEndTmIsNotNull() {
			addCriterion("END_TM is not null");
			return (Criteria) this;
		}

		public Criteria andEndTmEqualTo(String value) {
			addCriterion("END_TM =", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmNotEqualTo(String value) {
			addCriterion("END_TM <>", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmGreaterThan(String value) {
			addCriterion("END_TM >", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmGreaterThanOrEqualTo(String value) {
			addCriterion("END_TM >=", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmLessThan(String value) {
			addCriterion("END_TM <", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmLessThanOrEqualTo(String value) {
			addCriterion("END_TM <=", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmLike(String value) {
			addCriterion("END_TM like", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmNotLike(String value) {
			addCriterion("END_TM not like", value, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmIn(List<String> values) {
			addCriterion("END_TM in", values, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmNotIn(List<String> values) {
			addCriterion("END_TM not in", values, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmBetween(String value1, String value2) {
			addCriterion("END_TM between", value1, value2, "endTm");
			return (Criteria) this;
		}

		public Criteria andEndTmNotBetween(String value1, String value2) {
			addCriterion("END_TM not between", value1, value2, "endTm");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_TMLV
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
     * This class corresponds to the database table ABACUS.ABA_PD_TMLV
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
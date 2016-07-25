package com.acube.pc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvNeInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public ProvNeInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
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

		public Criteria andNeIdIsNull() {
			addCriterion("NE_ID is null");
			return (Criteria) this;
		}

		public Criteria andNeIdIsNotNull() {
			addCriterion("NE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andNeIdEqualTo(String value) {
			addCriterion("NE_ID =", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdNotEqualTo(String value) {
			addCriterion("NE_ID <>", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdGreaterThan(String value) {
			addCriterion("NE_ID >", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdGreaterThanOrEqualTo(String value) {
			addCriterion("NE_ID >=", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdLessThan(String value) {
			addCriterion("NE_ID <", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdLessThanOrEqualTo(String value) {
			addCriterion("NE_ID <=", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdLike(String value) {
			addCriterion("NE_ID like", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdNotLike(String value) {
			addCriterion("NE_ID not like", value, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdIn(List<String> values) {
			addCriterion("NE_ID in", values, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdNotIn(List<String> values) {
			addCriterion("NE_ID not in", values, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdBetween(String value1, String value2) {
			addCriterion("NE_ID between", value1, value2, "neId");
			return (Criteria) this;
		}

		public Criteria andNeIdNotBetween(String value1, String value2) {
			addCriterion("NE_ID not between", value1, value2, "neId");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupIsNull() {
			addCriterion("NETWORK_GROUP is null");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupIsNotNull() {
			addCriterion("NETWORK_GROUP is not null");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupEqualTo(String value) {
			addCriterion("NETWORK_GROUP =", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupNotEqualTo(String value) {
			addCriterion("NETWORK_GROUP <>", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupGreaterThan(String value) {
			addCriterion("NETWORK_GROUP >", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupGreaterThanOrEqualTo(String value) {
			addCriterion("NETWORK_GROUP >=", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupLessThan(String value) {
			addCriterion("NETWORK_GROUP <", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupLessThanOrEqualTo(String value) {
			addCriterion("NETWORK_GROUP <=", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupLike(String value) {
			addCriterion("NETWORK_GROUP like", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupNotLike(String value) {
			addCriterion("NETWORK_GROUP not like", value, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupIn(List<String> values) {
			addCriterion("NETWORK_GROUP in", values, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupNotIn(List<String> values) {
			addCriterion("NETWORK_GROUP not in", values, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupBetween(String value1, String value2) {
			addCriterion("NETWORK_GROUP between", value1, value2, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andNetworkGroupNotBetween(String value1, String value2) {
			addCriterion("NETWORK_GROUP not between", value1, value2, "networkGroup");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoIsNull() {
			addCriterion("MAIN_CONNECT_INFO is null");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoIsNotNull() {
			addCriterion("MAIN_CONNECT_INFO is not null");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoEqualTo(String value) {
			addCriterion("MAIN_CONNECT_INFO =", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoNotEqualTo(String value) {
			addCriterion("MAIN_CONNECT_INFO <>", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoGreaterThan(String value) {
			addCriterion("MAIN_CONNECT_INFO >", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoGreaterThanOrEqualTo(String value) {
			addCriterion("MAIN_CONNECT_INFO >=", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoLessThan(String value) {
			addCriterion("MAIN_CONNECT_INFO <", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoLessThanOrEqualTo(String value) {
			addCriterion("MAIN_CONNECT_INFO <=", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoLike(String value) {
			addCriterion("MAIN_CONNECT_INFO like", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoNotLike(String value) {
			addCriterion("MAIN_CONNECT_INFO not like", value, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoIn(List<String> values) {
			addCriterion("MAIN_CONNECT_INFO in", values, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoNotIn(List<String> values) {
			addCriterion("MAIN_CONNECT_INFO not in", values, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoBetween(String value1, String value2) {
			addCriterion("MAIN_CONNECT_INFO between", value1, value2, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainConnectInfoNotBetween(String value1, String value2) {
			addCriterion("MAIN_CONNECT_INFO not between", value1, value2, "mainConnectInfo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoIsNull() {
			addCriterion("MAIN_PORT_NO is null");
			return (Criteria) this;
		}

		public Criteria andMainPortNoIsNotNull() {
			addCriterion("MAIN_PORT_NO is not null");
			return (Criteria) this;
		}

		public Criteria andMainPortNoEqualTo(Long value) {
			addCriterion("MAIN_PORT_NO =", value, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoNotEqualTo(Long value) {
			addCriterion("MAIN_PORT_NO <>", value, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoGreaterThan(Long value) {
			addCriterion("MAIN_PORT_NO >", value, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoGreaterThanOrEqualTo(Long value) {
			addCriterion("MAIN_PORT_NO >=", value, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoLessThan(Long value) {
			addCriterion("MAIN_PORT_NO <", value, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoLessThanOrEqualTo(Long value) {
			addCriterion("MAIN_PORT_NO <=", value, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoIn(List<Long> values) {
			addCriterion("MAIN_PORT_NO in", values, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoNotIn(List<Long> values) {
			addCriterion("MAIN_PORT_NO not in", values, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoBetween(Long value1, Long value2) {
			addCriterion("MAIN_PORT_NO between", value1, value2, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andMainPortNoNotBetween(Long value1, Long value2) {
			addCriterion("MAIN_PORT_NO not between", value1, value2, "mainPortNo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoIsNull() {
			addCriterion("SCND_CONNECT_INFO is null");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoIsNotNull() {
			addCriterion("SCND_CONNECT_INFO is not null");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoEqualTo(String value) {
			addCriterion("SCND_CONNECT_INFO =", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoNotEqualTo(String value) {
			addCriterion("SCND_CONNECT_INFO <>", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoGreaterThan(String value) {
			addCriterion("SCND_CONNECT_INFO >", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoGreaterThanOrEqualTo(String value) {
			addCriterion("SCND_CONNECT_INFO >=", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoLessThan(String value) {
			addCriterion("SCND_CONNECT_INFO <", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoLessThanOrEqualTo(String value) {
			addCriterion("SCND_CONNECT_INFO <=", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoLike(String value) {
			addCriterion("SCND_CONNECT_INFO like", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoNotLike(String value) {
			addCriterion("SCND_CONNECT_INFO not like", value, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoIn(List<String> values) {
			addCriterion("SCND_CONNECT_INFO in", values, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoNotIn(List<String> values) {
			addCriterion("SCND_CONNECT_INFO not in", values, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoBetween(String value1, String value2) {
			addCriterion("SCND_CONNECT_INFO between", value1, value2, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndConnectInfoNotBetween(String value1, String value2) {
			addCriterion("SCND_CONNECT_INFO not between", value1, value2, "scndConnectInfo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoIsNull() {
			addCriterion("SCND_PORT_NO is null");
			return (Criteria) this;
		}

		public Criteria andScndPortNoIsNotNull() {
			addCriterion("SCND_PORT_NO is not null");
			return (Criteria) this;
		}

		public Criteria andScndPortNoEqualTo(Long value) {
			addCriterion("SCND_PORT_NO =", value, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoNotEqualTo(Long value) {
			addCriterion("SCND_PORT_NO <>", value, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoGreaterThan(Long value) {
			addCriterion("SCND_PORT_NO >", value, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoGreaterThanOrEqualTo(Long value) {
			addCriterion("SCND_PORT_NO >=", value, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoLessThan(Long value) {
			addCriterion("SCND_PORT_NO <", value, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoLessThanOrEqualTo(Long value) {
			addCriterion("SCND_PORT_NO <=", value, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoIn(List<Long> values) {
			addCriterion("SCND_PORT_NO in", values, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoNotIn(List<Long> values) {
			addCriterion("SCND_PORT_NO not in", values, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoBetween(Long value1, Long value2) {
			addCriterion("SCND_PORT_NO between", value1, value2, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andScndPortNoNotBetween(Long value1, Long value2) {
			addCriterion("SCND_PORT_NO not between", value1, value2, "scndPortNo");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("USER_ID =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("USER_ID <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("USER_ID >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("USER_ID >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("USER_ID <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("USER_ID <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("USER_ID like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("USER_ID not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("USER_ID in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("USER_ID not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andPasswdIsNull() {
			addCriterion("PASSWD is null");
			return (Criteria) this;
		}

		public Criteria andPasswdIsNotNull() {
			addCriterion("PASSWD is not null");
			return (Criteria) this;
		}

		public Criteria andPasswdEqualTo(String value) {
			addCriterion("PASSWD =", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotEqualTo(String value) {
			addCriterion("PASSWD <>", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdGreaterThan(String value) {
			addCriterion("PASSWD >", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdGreaterThanOrEqualTo(String value) {
			addCriterion("PASSWD >=", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdLessThan(String value) {
			addCriterion("PASSWD <", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdLessThanOrEqualTo(String value) {
			addCriterion("PASSWD <=", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdLike(String value) {
			addCriterion("PASSWD like", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotLike(String value) {
			addCriterion("PASSWD not like", value, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdIn(List<String> values) {
			addCriterion("PASSWD in", values, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotIn(List<String> values) {
			addCriterion("PASSWD not in", values, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdBetween(String value1, String value2) {
			addCriterion("PASSWD between", value1, value2, "passwd");
			return (Criteria) this;
		}

		public Criteria andPasswdNotBetween(String value1, String value2) {
			addCriterion("PASSWD not between", value1, value2, "passwd");
			return (Criteria) this;
		}

		public Criteria andMgmtBandIsNull() {
			addCriterion("MGMT_BAND is null");
			return (Criteria) this;
		}

		public Criteria andMgmtBandIsNotNull() {
			addCriterion("MGMT_BAND is not null");
			return (Criteria) this;
		}

		public Criteria andMgmtBandEqualTo(String value) {
			addCriterion("MGMT_BAND =", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandNotEqualTo(String value) {
			addCriterion("MGMT_BAND <>", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandGreaterThan(String value) {
			addCriterion("MGMT_BAND >", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandGreaterThanOrEqualTo(String value) {
			addCriterion("MGMT_BAND >=", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandLessThan(String value) {
			addCriterion("MGMT_BAND <", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandLessThanOrEqualTo(String value) {
			addCriterion("MGMT_BAND <=", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandLike(String value) {
			addCriterion("MGMT_BAND like", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandNotLike(String value) {
			addCriterion("MGMT_BAND not like", value, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandIn(List<String> values) {
			addCriterion("MGMT_BAND in", values, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandNotIn(List<String> values) {
			addCriterion("MGMT_BAND not in", values, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandBetween(String value1, String value2) {
			addCriterion("MGMT_BAND between", value1, value2, "mgmtBand");
			return (Criteria) this;
		}

		public Criteria andMgmtBandNotBetween(String value1, String value2) {
			addCriterion("MGMT_BAND not between", value1, value2, "mgmtBand");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
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
     * This class corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 20 14:06:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
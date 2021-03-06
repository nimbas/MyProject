package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.NumPrefixBySvc;
import com.acube.pc.domain.NumPrefixBySvcExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NumPrefixBySvcMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(NumPrefixBySvcExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(NumPrefixBySvcExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("prefixAllowed") String prefixAllowed, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(NumPrefixBySvc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(NumPrefixBySvc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<NumPrefixBySvc> selectByExampleWithRowbounds(NumPrefixBySvcExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<NumPrefixBySvc> selectByExample(NumPrefixBySvcExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	NumPrefixBySvc selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("prefixAllowed") String prefixAllowed, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") NumPrefixBySvc record, @Param("example") NumPrefixBySvcExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") NumPrefixBySvc record, @Param("example") NumPrefixBySvcExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(NumPrefixBySvc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUM_PREFIX_BY_SVC
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(NumPrefixBySvc record);
}
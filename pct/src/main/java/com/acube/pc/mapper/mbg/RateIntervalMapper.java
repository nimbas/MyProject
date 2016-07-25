package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.RateInterval;
import com.acube.pc.domain.RateIntervalExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RateIntervalMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(RateIntervalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(RateIntervalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("inventoryItemId") Long inventoryItemId, @Param("timeBandCd") String timeBandCd, @Param("fromValue") BigDecimal fromValue);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(RateInterval record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(RateInterval record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<RateInterval> selectByExampleWithRowbounds(RateIntervalExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<RateInterval> selectByExample(RateIntervalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	RateInterval selectByPrimaryKey(@Param("inventoryItemId") Long inventoryItemId, @Param("timeBandCd") String timeBandCd, @Param("fromValue") BigDecimal fromValue);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") RateInterval record, @Param("example") RateIntervalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") RateInterval record, @Param("example") RateIntervalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(RateInterval record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_RATE_INTERVAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(RateInterval record);
}
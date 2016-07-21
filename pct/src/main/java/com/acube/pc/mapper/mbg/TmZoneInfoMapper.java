package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.TmZoneInfo;
import com.acube.pc.domain.TmZoneInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TmZoneInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(TmZoneInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(TmZoneInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("timeBandCd") String timeBandCd, @Param("tmZoneId") String tmZoneId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(TmZoneInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(TmZoneInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<TmZoneInfo> selectByExampleWithRowbounds(TmZoneInfoExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<TmZoneInfo> selectByExample(TmZoneInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	TmZoneInfo selectByPrimaryKey(@Param("timeBandCd") String timeBandCd, @Param("tmZoneId") String tmZoneId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") TmZoneInfo record, @Param("example") TmZoneInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") TmZoneInfo record, @Param("example") TmZoneInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(TmZoneInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_TM_ZONE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(TmZoneInfo record);
}
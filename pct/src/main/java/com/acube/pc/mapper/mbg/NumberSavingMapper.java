package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.NumberSaving;
import com.acube.pc.domain.NumberSavingExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NumberSavingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(NumberSavingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(NumberSavingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("savingPeriod") String savingPeriod, @Param("validStrtDt") Date validStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(NumberSaving record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(NumberSaving record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<NumberSaving> selectByExampleWithRowbounds(NumberSavingExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<NumberSaving> selectByExample(NumberSavingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	NumberSaving selectByPrimaryKey(@Param("savingPeriod") String savingPeriod, @Param("validStrtDt") Date validStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") NumberSaving record, @Param("example") NumberSavingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") NumberSaving record, @Param("example") NumberSavingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(NumberSaving record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NUMBER_SAVING
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(NumberSaving record);
}
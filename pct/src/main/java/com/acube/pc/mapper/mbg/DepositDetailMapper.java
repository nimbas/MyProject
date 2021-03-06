package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.DepositDetail;
import com.acube.pc.domain.DepositDetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DepositDetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(DepositDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(DepositDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("depositId") String depositId, @Param("depositSetId") String depositSetId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(DepositDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(DepositDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DepositDetail> selectByExampleWithRowbounds(DepositDetailExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DepositDetail> selectByExample(DepositDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	DepositDetail selectByPrimaryKey(@Param("depositId") String depositId, @Param("depositSetId") String depositSetId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") DepositDetail record, @Param("example") DepositDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") DepositDetail record, @Param("example") DepositDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(DepositDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_DETAIL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(DepositDetail record);
}
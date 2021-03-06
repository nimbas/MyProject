package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.VoucherRechargeLoyal;
import com.acube.pc.domain.VoucherRechargeLoyalExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoucherRechargeLoyalMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(VoucherRechargeLoyalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(VoucherRechargeLoyalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("voucherId") String voucherId, @Param("strtDay") Short strtDay);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(VoucherRechargeLoyal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(VoucherRechargeLoyal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<VoucherRechargeLoyal> selectByExampleWithRowbounds(VoucherRechargeLoyalExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<VoucherRechargeLoyal> selectByExample(VoucherRechargeLoyalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	VoucherRechargeLoyal selectByPrimaryKey(@Param("voucherId") String voucherId, @Param("strtDay") Short strtDay);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") VoucherRechargeLoyal record, @Param("example") VoucherRechargeLoyalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") VoucherRechargeLoyal record, @Param("example") VoucherRechargeLoyalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(VoucherRechargeLoyal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_RECHARGE_LOYAL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(VoucherRechargeLoyal record);
}
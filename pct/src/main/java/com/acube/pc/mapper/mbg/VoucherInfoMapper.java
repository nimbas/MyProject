package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.VoucherInfo;
import com.acube.pc.domain.VoucherInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoucherInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(VoucherInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(VoucherInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(String voucherId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(VoucherInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(VoucherInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<VoucherInfo> selectByExampleWithRowbounds(VoucherInfoExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<VoucherInfo> selectByExample(VoucherInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	VoucherInfo selectByPrimaryKey(String voucherId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") VoucherInfo record, @Param("example") VoucherInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") VoucherInfo record, @Param("example") VoucherInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(VoucherInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_VOUCHER_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(VoucherInfo record);
}
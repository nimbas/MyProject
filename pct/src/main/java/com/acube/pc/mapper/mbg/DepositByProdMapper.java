package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.DepositByProd;
import com.acube.pc.domain.DepositByProdExample;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DepositByProdMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(DepositByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(DepositByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("deposit") BigDecimal deposit, @Param("highThreshold") BigDecimal highThreshold, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(DepositByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(DepositByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DepositByProd> selectByExampleWithRowbounds(DepositByProdExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DepositByProd> selectByExample(DepositByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	DepositByProd selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("deposit") BigDecimal deposit, @Param("highThreshold") BigDecimal highThreshold, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") DepositByProd record, @Param("example") DepositByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") DepositByProd record, @Param("example") DepositByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(DepositByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEPOSIT_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(DepositByProd record);
}
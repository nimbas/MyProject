package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ProdChngTranfCounter;
import com.acube.pc.domain.ProdChngTranfCounterExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProdChngTranfCounterMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ProdChngTranfCounterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ProdChngTranfCounterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("changeSchemeId") String changeSchemeId, @Param("counterId") String counterId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ProdChngTranfCounter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ProdChngTranfCounter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdChngTranfCounter> selectByExampleWithRowbounds(ProdChngTranfCounterExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdChngTranfCounter> selectByExample(ProdChngTranfCounterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ProdChngTranfCounter selectByPrimaryKey(@Param("changeSchemeId") String changeSchemeId, @Param("counterId") String counterId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ProdChngTranfCounter record, @Param("example") ProdChngTranfCounterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ProdChngTranfCounter record, @Param("example") ProdChngTranfCounterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ProdChngTranfCounter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_CHNG_TRANF_COUNTER
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ProdChngTranfCounter record);
}
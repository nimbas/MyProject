package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ThresholdByProd;
import com.acube.pc.domain.ThresholdByProdExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ThresholdByProdMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ThresholdByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ThresholdByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("thresholdId") String thresholdId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ThresholdByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ThresholdByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ThresholdByProd> selectByExampleWithRowbounds(ThresholdByProdExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ThresholdByProd> selectByExample(ThresholdByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ThresholdByProd selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("thresholdId") String thresholdId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ThresholdByProd record, @Param("example") ThresholdByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ThresholdByProd record, @Param("example") ThresholdByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ThresholdByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_THRESHOLD_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ThresholdByProd record);
}
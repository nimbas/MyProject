package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ProvNeByProd;
import com.acube.pc.domain.ProvNeByProdExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProvNeByProdMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ProvNeByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ProvNeByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("neId") String neId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ProvNeByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ProvNeByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProvNeByProd> selectByExampleWithRowbounds(ProvNeByProdExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProvNeByProd> selectByExample(ProvNeByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ProvNeByProd selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("neId") String neId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ProvNeByProd record, @Param("example") ProvNeByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ProvNeByProd record, @Param("example") ProvNeByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ProvNeByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ProvNeByProd record);
}
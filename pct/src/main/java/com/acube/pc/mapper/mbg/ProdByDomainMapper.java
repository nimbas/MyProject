package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ProdByDomain;
import com.acube.pc.domain.ProdByDomainExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProdByDomainMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ProdByDomainExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ProdByDomainExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("svcDomain") String svcDomain);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ProdByDomain record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ProdByDomain record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdByDomain> selectByExampleWithRowbounds(ProdByDomainExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdByDomain> selectByExample(ProdByDomainExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ProdByDomain selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("svcDomain") String svcDomain);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ProdByDomain record, @Param("example") ProdByDomainExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ProdByDomain record, @Param("example") ProdByDomainExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ProdByDomain record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_BY_DOMAIN
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ProdByDomain record);
}
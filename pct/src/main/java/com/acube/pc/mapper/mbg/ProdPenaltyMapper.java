package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ProdPenalty;
import com.acube.pc.domain.ProdPenaltyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProdPenaltyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ProdPenaltyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ProdPenaltyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("trgtProdCd") String trgtProdCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ProdPenalty record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ProdPenalty record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdPenalty> selectByExampleWithRowbounds(ProdPenaltyExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdPenalty> selectByExample(ProdPenaltyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ProdPenalty selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("trgtProdCd") String trgtProdCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ProdPenalty record, @Param("example") ProdPenaltyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ProdPenalty record, @Param("example") ProdPenaltyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ProdPenalty record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_PENALTY
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ProdPenalty record);
}
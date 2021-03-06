package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ProdDpndRels;
import com.acube.pc.domain.ProdDpndRelsExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProdDpndRelsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ProdDpndRelsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ProdDpndRelsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("relsSeqno") Date relsSeqno, @Param("prodCd") String prodCd, @Param("trgtProdCd") String trgtProdCd, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ProdDpndRels record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ProdDpndRels record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdDpndRels> selectByExampleWithRowbounds(ProdDpndRelsExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProdDpndRels> selectByExample(ProdDpndRelsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ProdDpndRels selectByPrimaryKey(@Param("relsSeqno") Date relsSeqno, @Param("prodCd") String prodCd, @Param("trgtProdCd") String trgtProdCd, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ProdDpndRels record, @Param("example") ProdDpndRelsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ProdDpndRels record, @Param("example") ProdDpndRelsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ProdDpndRels record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROD_DPND_RELS
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ProdDpndRels record);
}
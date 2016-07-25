package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.PvsMap;
import com.acube.pc.domain.PvsMapExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PvsMapMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(PvsMapExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(PvsMapExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("param") String param, @Param("svcCd") String svcCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(PvsMap record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(PvsMap record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<PvsMap> selectByExampleWithRowbounds(PvsMapExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<PvsMap> selectByExample(PvsMapExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") PvsMap record, @Param("example") PvsMapExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PVS_MAP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") PvsMap record, @Param("example") PvsMapExample example);
}
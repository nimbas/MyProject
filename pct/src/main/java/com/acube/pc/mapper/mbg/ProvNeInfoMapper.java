package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ProvNeInfo;
import com.acube.pc.domain.ProvNeInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProvNeInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ProvNeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ProvNeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(String neId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ProvNeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ProvNeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProvNeInfo> selectByExampleWithRowbounds(ProvNeInfoExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ProvNeInfo> selectByExample(ProvNeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	ProvNeInfo selectByPrimaryKey(String neId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ProvNeInfo record, @Param("example") ProvNeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ProvNeInfo record, @Param("example") ProvNeInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(ProvNeInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_PROV_NE_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(ProvNeInfo record);
}
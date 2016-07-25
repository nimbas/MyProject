package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.SectSetCd;
import com.acube.pc.domain.SectSetCdExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SectSetCdMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(SectSetCdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(SectSetCdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(String sectSetCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(SectSetCd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(SectSetCd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<SectSetCd> selectByExampleWithRowbounds(SectSetCdExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<SectSetCd> selectByExample(SectSetCdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	SectSetCd selectByPrimaryKey(String sectSetCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") SectSetCd record, @Param("example") SectSetCdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") SectSetCd record, @Param("example") SectSetCdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(SectSetCd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECT_SET_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(SectSetCd record);
}
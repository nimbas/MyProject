package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.DscntFtr;
import com.acube.pc.domain.DscntFtrExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DscntFtrMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(DscntFtrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(DscntFtrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("dscntFtrSeqNo") Long dscntFtrSeqNo, @Param("dscntGrpId") String dscntGrpId, @Param("valdStrtDt") String valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(DscntFtr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(DscntFtr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DscntFtr> selectByExampleWithRowbounds(DscntFtrExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DscntFtr> selectByExample(DscntFtrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	DscntFtr selectByPrimaryKey(@Param("dscntFtrSeqNo") Long dscntFtrSeqNo, @Param("dscntGrpId") String dscntGrpId, @Param("valdStrtDt") String valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") DscntFtr record, @Param("example") DscntFtrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") DscntFtr record, @Param("example") DscntFtrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(DscntFtr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DSCNT_FTR
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(DscntFtr record);
}
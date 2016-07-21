package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.NatnGrpDetailInfo;
import com.acube.pc.domain.NatnGrpDetailInfoExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NatnGrpDetailInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(NatnGrpDetailInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(NatnGrpDetailInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("valdStrtDt") Date valdStrtDt, @Param("countryCd") String countryCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(NatnGrpDetailInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(NatnGrpDetailInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<NatnGrpDetailInfo> selectByExampleWithRowbounds(NatnGrpDetailInfoExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<NatnGrpDetailInfo> selectByExample(NatnGrpDetailInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	NatnGrpDetailInfo selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("valdStrtDt") Date valdStrtDt, @Param("countryCd") String countryCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") NatnGrpDetailInfo record, @Param("example") NatnGrpDetailInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") NatnGrpDetailInfo record, @Param("example") NatnGrpDetailInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(NatnGrpDetailInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_NATN_GRP_DETAIL_INFO
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(NatnGrpDetailInfo record);
}
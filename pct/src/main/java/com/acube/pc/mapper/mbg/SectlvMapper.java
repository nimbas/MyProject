package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.Sectlv;
import com.acube.pc.domain.SectlvExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SectlvMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(SectlvExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(SectlvExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(String sectlNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(Sectlv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(Sectlv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<Sectlv> selectByExampleWithRowbounds(SectlvExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<Sectlv> selectByExample(SectlvExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	Sectlv selectByPrimaryKey(String sectlNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") Sectlv record, @Param("example") SectlvExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") Sectlv record, @Param("example") SectlvExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(Sectlv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_SECTLV
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(Sectlv record);
}
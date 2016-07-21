package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.ExreHist;
import com.acube.pc.domain.ExreHistExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExreHistMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ExreHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ExreHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(ExreHist record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(ExreHist record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ExreHist> selectByExampleWithRowbounds(ExreHistExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<ExreHist> selectByExample(ExreHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") ExreHist record, @Param("example") ExreHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_EXRE_HIST
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") ExreHist record, @Param("example") ExreHistExample example);
}
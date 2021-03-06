package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.Chnl;
import com.acube.pc.domain.ChnlExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChnlMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(ChnlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(ChnlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(String saleChnlCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(Chnl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(Chnl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<Chnl> selectByExampleWithRowbounds(ChnlExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<Chnl> selectByExample(ChnlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	Chnl selectByPrimaryKey(String saleChnlCd);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") Chnl record, @Param("example") ChnlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") Chnl record, @Param("example") ChnlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(Chnl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_CHNL
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(Chnl record);
}
package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.DevByProd;
import com.acube.pc.domain.DevByProdExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DevByProdMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(DevByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(DevByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("prodCd") String prodCd, @Param("devId") String devId, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(DevByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(DevByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DevByProd> selectByExampleWithRowbounds(DevByProdExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<DevByProd> selectByExample(DevByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	DevByProd selectByPrimaryKey(@Param("prodCd") String prodCd, @Param("devId") String devId, @Param("valdStrtDt") Date valdStrtDt);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") DevByProd record, @Param("example") DevByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") DevByProd record, @Param("example") DevByProdExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(DevByProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_DEV_BY_PROD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(DevByProd record);
}
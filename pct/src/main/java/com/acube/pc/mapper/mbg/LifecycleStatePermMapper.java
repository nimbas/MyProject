package com.acube.pc.mapper.mbg;

import com.acube.pc.domain.LifecycleStatePerm;
import com.acube.pc.domain.LifecycleStatePermExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LifecycleStatePermMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int countByExample(LifecycleStatePermExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByExample(LifecycleStatePermExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int deleteByPrimaryKey(@Param("lifeCycleId") String lifeCycleId, @Param("states") String states, @Param("permission") String permission);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insert(LifecycleStatePerm record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int insertSelective(LifecycleStatePerm record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<LifecycleStatePerm> selectByExampleWithRowbounds(LifecycleStatePermExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	List<LifecycleStatePerm> selectByExample(LifecycleStatePermExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	LifecycleStatePerm selectByPrimaryKey(@Param("lifeCycleId") String lifeCycleId, @Param("states") String states, @Param("permission") String permission);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExampleSelective(@Param("record") LifecycleStatePerm record, @Param("example") LifecycleStatePermExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByExample(@Param("record") LifecycleStatePerm record, @Param("example") LifecycleStatePermExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKeySelective(LifecycleStatePerm record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ABACUS.ABA_PD_LIFECYCLE_STATE_PERM
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	int updateByPrimaryKey(LifecycleStatePerm record);
}
package com.acube.pvs.mapper.mbg;

import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.domain.PsProvNeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PsProvNeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int countByExample(PsProvNeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByExample(PsProvNeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByPrimaryKey(String neId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insert(PsProvNeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insertSelective(PsProvNeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsProvNeInfo> selectByExampleWithRowbounds(PsProvNeInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsProvNeInfo> selectByExample(PsProvNeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    PsProvNeInfo selectByPrimaryKey(String neId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExampleSelective(@Param("record") PsProvNeInfo record, @Param("example") PsProvNeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExample(@Param("record") PsProvNeInfo record, @Param("example") PsProvNeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKeySelective(PsProvNeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_NE_INFO
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKey(PsProvNeInfo record);
}
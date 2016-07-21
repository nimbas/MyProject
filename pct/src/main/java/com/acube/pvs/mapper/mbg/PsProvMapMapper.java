package com.acube.pvs.mapper.mbg;

import com.acube.pvs.domain.PsProvMap;
import com.acube.pvs.domain.PsProvMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PsProvMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int countByExample(PsProvMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByExample(PsProvMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByPrimaryKey(@Param("srcNeId") String srcNeId, @Param("srcCmd") String srcCmd, @Param("srcFtrCd") String srcFtrCd, @Param("provOrder") Short provOrder, @Param("trgtNeId") String trgtNeId, @Param("trgtCmd") String trgtCmd, @Param("trgtFtrCd") String trgtFtrCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insert(PsProvMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insertSelective(PsProvMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsProvMap> selectByExampleWithRowbounds(PsProvMapExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsProvMap> selectByExample(PsProvMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    PsProvMap selectByPrimaryKey(@Param("srcNeId") String srcNeId, @Param("srcCmd") String srcCmd, @Param("srcFtrCd") String srcFtrCd, @Param("provOrder") Short provOrder, @Param("trgtNeId") String trgtNeId, @Param("trgtCmd") String trgtCmd, @Param("trgtFtrCd") String trgtFtrCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExampleSelective(@Param("record") PsProvMap record, @Param("example") PsProvMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExample(@Param("record") PsProvMap record, @Param("example") PsProvMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKeySelective(PsProvMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKey(PsProvMap record);
}
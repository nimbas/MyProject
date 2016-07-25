package com.acube.pvs.mapper.mbg;

import com.acube.pvs.domain.PsParamMap;
import com.acube.pvs.domain.PsParamMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PsParamMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int countByExample(PsParamMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByExample(PsParamMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByPrimaryKey(@Param("ne") String ne, @Param("cmd") String cmd, @Param("fromNe") String fromNe, @Param("fromCmd") String fromCmd, @Param("fromFtrCd") String fromFtrCd, @Param("fromCmdIoInd") String fromCmdIoInd, @Param("fromParamId") String fromParamId, @Param("toNe") String toNe, @Param("toCmd") String toCmd, @Param("toFtrCd") String toFtrCd, @Param("toCmdIoInd") String toCmdIoInd, @Param("toParamId") String toParamId, @Param("defValue") String defValue);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insert(PsParamMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insertSelective(PsParamMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsParamMap> selectByExampleWithRowbounds(PsParamMapExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsParamMap> selectByExample(PsParamMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExampleSelective(@Param("record") PsParamMap record, @Param("example") PsParamMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PARAM_MAP
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExample(@Param("record") PsParamMap record, @Param("example") PsParamMapExample example);
}
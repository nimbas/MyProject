package com.acube.pvs.mapper.mbg;

import com.acube.pvs.domain.PsProvParamSeq;
import com.acube.pvs.domain.PsProvParamSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PsProvParamSeqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int countByExample(PsProvParamSeqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByExample(PsProvParamSeqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByPrimaryKey(@Param("cmd") String cmd, @Param("neId") String neId, @Param("ftrCd") String ftrCd, @Param("reqRspInd") String reqRspInd, @Param("paramId") String paramId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insert(PsProvParamSeq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insertSelective(PsProvParamSeq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsProvParamSeq> selectByExampleWithRowbounds(PsProvParamSeqExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsProvParamSeq> selectByExample(PsProvParamSeqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    PsProvParamSeq selectByPrimaryKey(@Param("cmd") String cmd, @Param("neId") String neId, @Param("ftrCd") String ftrCd, @Param("reqRspInd") String reqRspInd, @Param("paramId") String paramId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExampleSelective(@Param("record") PsProvParamSeq record, @Param("example") PsProvParamSeqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExample(@Param("record") PsProvParamSeq record, @Param("example") PsProvParamSeqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKeySelective(PsProvParamSeq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_PROV_PARAM_SEQ
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKey(PsProvParamSeq record);
}
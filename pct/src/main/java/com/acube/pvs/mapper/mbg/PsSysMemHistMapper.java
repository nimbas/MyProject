package com.acube.pvs.mapper.mbg;

import com.acube.pvs.domain.PsSysMemHist;
import com.acube.pvs.domain.PsSysMemHistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PsSysMemHistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int countByExample(PsSysMemHistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByExample(PsSysMemHistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int deleteByPrimaryKey(@Param("datetime") String datetime, @Param("name") String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insert(PsSysMemHist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int insertSelective(PsSysMemHist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsSysMemHist> selectByExampleWithRowbounds(PsSysMemHistExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    List<PsSysMemHist> selectByExample(PsSysMemHistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    PsSysMemHist selectByPrimaryKey(@Param("datetime") String datetime, @Param("name") String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExampleSelective(@Param("record") PsSysMemHist record, @Param("example") PsSysMemHistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByExample(@Param("record") PsSysMemHist record, @Param("example") PsSysMemHistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKeySelective(PsSysMemHist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PMSADM.ABA_PS_SYS_MEM_HIST
     *
     * @mbggenerated Mon Dec 01 10:41:35 KST 2014
     */
    int updateByPrimaryKey(PsSysMemHist record);
}
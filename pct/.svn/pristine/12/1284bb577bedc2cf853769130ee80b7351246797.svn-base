package com.acube.pvs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;

public class PsProvParamInfo extends BaseDomain implements Serializable{
    /*  */
	private static final long serialVersionUID = 6731244922723968846L;
	private String neId;
    private String csParamId;
    private String pvParamId;
    private String paramType;
    private String paramMaxLen;
    private String descr;
    private String defValue;
    private PsProvNeInfo provNeInfo;
    private List<PsProvEnum> provEnums;
    private String enumList ;//엑셀 임포트용
	public String getNeId() {
		return neId;
	}
	public void setNeId(String neId) {
		this.neId = neId;
	}
	public String getCsParamId() {
		return csParamId;
	}
	public void setCsParamId(String csParamId) {
		this.csParamId = csParamId;
	}
	public String getPvParamId() {
		return pvParamId;
	}
	public void setPvParamId(String pvParamId) {
		this.pvParamId = pvParamId;
	}
	public String getParamType() {
		return paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public String getParamMaxLen() {
		return paramMaxLen;
	}
	public void setParamMaxLen(String paramMaxLen) {
		this.paramMaxLen = paramMaxLen;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getDefValue() {
		return defValue;
	}
	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}
	public PsProvNeInfo getProvNeInfo() {
		return provNeInfo;
	}
	public void setProvNeInfo(PsProvNeInfo provNeInfo) {
		this.provNeInfo = provNeInfo;
	}
	public List<PsProvEnum> getProvEnums() {
		return provEnums;
	}
	public void setProvEnums(List<PsProvEnum> provEnums) {
		this.provEnums = provEnums;
	}
	public String getEnumList() {
		return enumList;
	}
	public void setEnumList(String enumList) {
		this.enumList = enumList;
	}
	@Override
	public String toString() {
		return "PsProvParamInfo [neId=" + neId + ", csParamId=" + csParamId + ", pvParamId=" + pvParamId + ", paramType=" + paramType + ", paramMaxLen=" + paramMaxLen + ", descr=" + descr + ", defValue=" + defValue + ", provNeInfo=" + provNeInfo + ", provEnums=" + provEnums + "]";
	}
	public PsProvParamInfo validateExcelInfo(){
		
		if(StringUtils.isEmpty(this.neId)){
			throw new AcubeException("NE ID is null");
		}
		if(StringUtils.isEmpty(this.pvParamId)){
			throw new AcubeException("Parameter ID is null");
		}
		if(StringUtils.isEmpty(this.csParamId)){
			throw new AcubeException("Parameter Name is null");
		}
		if(StringUtils.isEmpty(this.paramType)){
			throw new AcubeException("Parameter Type is null");
		}
		
		if(this.paramType.equals("E") && (!StringUtils.isEmpty(enumList))){
			provEnums = new ArrayList<PsProvEnum>();
			String enums[] = enumList.split(";");
			for(String enumInfo : enums){
				if(StringUtils.isEmpty(enumInfo)){
					break;
				}
				String enumInfoArr[] = enumInfo.split(","); 
				PsProvEnum enum1 = new PsProvEnum();
				enum1.setPvParamId(this.pvParamId);
				enum1.setEnumValue(enumInfoArr[0]);
				enum1.setOrderNo(enumInfoArr[1]);
				enum1.setEnumRealValue(enumInfoArr[2]);
				provEnums.add(enum1);
			}
		}
		
		if(this.paramType.equals("E") && (provEnums == null || provEnums.size()==0)){
			throw new AcubeException("Enum List is null");
		}
		return this; 
	}
}
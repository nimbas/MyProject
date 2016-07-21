package com.acube.sub.domain;

import java.io.Serializable;

public class CustAttributeEnum implements Serializable {
	private static final long serialVersionUID = 2340439431540824432L;
	private String pvParamId ;
	private String enumValue ;
	private String enumText  ;
	private String enumOrder ;
	public String getPvParamId() {
		return pvParamId;
	}
	public void setPvParamId(String pvParamId) {
		this.pvParamId = pvParamId;
	}
	public String getEnumValue() {
		return enumValue;
	}
	public void setEnumValue(String enumValue) {
		this.enumValue = enumValue;
	}
	public String getEnumText() {
		return enumText;
	}
	public void setEnumText(String enumText) {
		this.enumText = enumText;
	}
	public String getEnumOrder() {
		return enumOrder;
	}
	public void setEnumOrder(String enumOrder) {
		this.enumOrder = enumOrder;
	}

}

package com.acube.common.domain;

public enum ControlType {
	S("InputBox"), //text
	N("Number"), //number
	C("CheckBox"), //checkbox
	R("Radio"), //radio
	D("Date"), //date
	T("TextArea"), //textare
	B("Boolean"), //boolean (yes or no combo)
	E("ComboBox"); //combo
	
	private String typeName ;
	private ControlType(String typeName){
		this.typeName = typeName; 
	}
	public String getTypeName() {
		return this.typeName;
	}
	
}

package com.acube.common.domain.searchFilter;

import java.io.Serializable;

/**
 * JQGrid multiple filter object
 *
 * @author YangByeongSub
 * @since
 *
 */
public class Rules implements Serializable{
	/*  */
	private static final long serialVersionUID = -6586338681582116197L;
	private String field ;
	private String op ;
	private String data;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}	
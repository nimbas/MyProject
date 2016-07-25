package com.acube.pvs.domain.statistics;

public class ProvNeStatistic extends ProvStatistic {

	public ProvNeStatistic(){
		super();
	}
	/**
	 * @param reqDate
	 * @param sCnt
	 * @param eCnt
	 * @param pCnt
	 * @param nCnt
	 */
	public ProvNeStatistic(String reqDate, int sCnt, int eCnt, int pCnt, int nCnt) {
		super(reqDate, sCnt, eCnt, pCnt, nCnt);
	}
	/*  */
	private static final long serialVersionUID = -6715917636065596797L;
	private String ne;
	
	public String getNe() {
		return ne;
	}
	public void setNe(String ne) {
		this.ne = ne;
	}
}

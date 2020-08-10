package com.hk.todayworkwork.dto;

public class Com_customerDTO {

	private String ID;
	private String PW;
	private String NAME;
	private String ADDR;
	private String COM_NAME;
	private String COM_ADDR;
	private String COM_NUM;
	private String PHONE;
	private String COM_TEL;
	private String EMAIL;
	@Override
	public String toString() {
		return "Com_customerDTO [ID=" + ID + ", PW=" + PW + ", NAME=" + NAME + ", ADDR=" + ADDR + ", COM_NAME="
				+ COM_NAME + ", COM_ADDR=" + COM_ADDR + ", COM_NUM=" + COM_NUM + ", PHONE=" + PHONE + ", COM_TEL="
				+ COM_TEL + ", EMAIL=" + EMAIL + "]";
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getADDR() {
		return ADDR;
	}
	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}
	public String getCOM_NAME() {
		return COM_NAME;
	}
	public void setCOM_NAME(String cOM_NAME) {
		COM_NAME = cOM_NAME;
	}
	public String getCOM_ADDR() {
		return COM_ADDR;
	}
	public void setCOM_ADDR(String cOM_ADDR) {
		COM_ADDR = cOM_ADDR;
	}
	public String getCOM_NUM() {
		return COM_NUM;
	}
	public void setCOM_NUM(String cOM_NUM) {
		COM_NUM = cOM_NUM;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getCOM_TEL() {
		return COM_TEL;
	}
	public void setCOM_TEL(String cOM_TEL) {
		COM_TEL = cOM_TEL;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	
	
}

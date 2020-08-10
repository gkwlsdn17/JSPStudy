package com.hk.todayworkwork.dto;

public class CustomerDTO {

	private String ID;
	private String PW;
	private String NAME;
	private String ADDR;
	private String EMAIL;
	private String PHONE;
	@Override
	public String toString() {
		return "CustomerDTO [ID=" + ID + ", PW=" + PW + ", NAME=" + NAME + ", ADDR=" + ADDR + ", EMAIL=" + EMAIL
				+ ", PHONE=" + PHONE + "]";
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
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	
	
}

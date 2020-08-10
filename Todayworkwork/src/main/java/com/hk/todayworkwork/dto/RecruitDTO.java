package com.hk.todayworkwork.dto;

public class RecruitDTO {

	private int W_NUM;
	private String ID;
	private String NAME;
	private String SUBJECT;
	private String COM_NAME;
	private String FIELD;
	private int PAY;
	private String W_START_TIME;
	private String W_END_TIME;
	private String W_PLACE;
	private String W_DATE;
	private String PERIOD;
	private String W_CONTENT;
	private int COUNT;
	private int A_COUNT;
	
	
	
	@Override
	public String toString() {
		return "RecruitDTO [W_NUM=" + W_NUM + ", ID=" + ID + ", NAME=" + NAME + ", SUBJECT=" + SUBJECT + ", COM_NAME="
				+ COM_NAME + ", FIELD=" + FIELD + ", PAY=" + PAY + ", W_START_TIME=" + W_START_TIME + ", W_END_TIME="
				+ W_END_TIME + ", W_PLACE=" + W_PLACE + ", W_DATE=" + W_DATE + ", PERIOD=" + PERIOD + ", W_CONTENT="
				+ W_CONTENT + ", COUNT=" + COUNT + ", A_COUNT=" + A_COUNT + "]";
	}
	public int getW_NUM() {
		return W_NUM;
	}
	public void setW_NUM(int w_NUM) {
		W_NUM = w_NUM;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
	public String getCOM_NAME() {
		return COM_NAME;
	}
	public void setCOM_NAME(String cOM_NAME) {
		COM_NAME = cOM_NAME;
	}
	public String getFIELD() {
		return FIELD;
	}
	public void setFIELD(String fIELD) {
		FIELD = fIELD;
	}
	public int getPAY() {
		return PAY;
	}
	public void setPAY(int pAY) {
		PAY = pAY;
	}
	public String getW_START_TIME() {
		return W_START_TIME;
	}
	public void setW_START_TIME(String w_START_TIME) {
		W_START_TIME = w_START_TIME;
	}
	public String getW_END_TIME() {
		return W_END_TIME;
	}
	public void setW_END_TIME(String w_END_TIME) {
		W_END_TIME = w_END_TIME;
	}
	public String getW_PLACE() {
		return W_PLACE;
	}
	public void setW_PLACE(String w_PLACE) {
		W_PLACE = w_PLACE;
	}
	public String getW_DATE() {
		return W_DATE;
	}
	public void setW_DATE(String w_DATE) {
		W_DATE = w_DATE;
	}
	public String getPERIOD() {
		return PERIOD;
	}
	public void setPERIOD(String pERIOD) {
		PERIOD = pERIOD;
	}
	public String getW_CONTENT() {
		return W_CONTENT;
	}
	public void setW_CONTENT(String w_CONTENT) {
		W_CONTENT = w_CONTENT;
	}
	public int getCOUNT() {
		return COUNT;
	}
	public void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}
	public int getA_COUNT() {
		return A_COUNT;
	}
	public void setA_COUNT(int a_COUNT) {
		A_COUNT = a_COUNT;
	}
	
	
}

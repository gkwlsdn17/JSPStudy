package com.mh.org;

public class Student {

	private int stu_number;
	private String gender;
	private String remark;
	
	
	@Override
	public String toString() {
		return "Student [stu_number=" + stu_number + ", gender=" + gender + ", remark=" + remark + "]";
	}
	public int getStu_number() {
		return stu_number;
	}
	public void setStu_number(int stu_number) {
		this.stu_number = stu_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}

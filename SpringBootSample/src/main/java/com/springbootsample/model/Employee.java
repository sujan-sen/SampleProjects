package com.springbootsample.model;

public class Employee {
	private String empName;
	private String empPhone;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empName=");
		builder.append(empName);
		builder.append(", empPhone=");
		builder.append(empPhone);
		builder.append("]");
		return builder.toString();
	}
	
	

}

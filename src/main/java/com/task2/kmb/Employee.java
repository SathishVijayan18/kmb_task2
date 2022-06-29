package com.task2.kmb;

public class Employee {
	protected int empId;
	protected String empName;
	protected int empSal;
	protected int DeptCode;
	public Employee(int empId, String empName, int empSal, int deptCode) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		DeptCode = deptCode;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", DeptCode=" + DeptCode + "";
	}
}

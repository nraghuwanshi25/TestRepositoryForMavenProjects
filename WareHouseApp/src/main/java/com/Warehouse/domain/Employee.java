package com.Warehouse.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private Integer empId;
	private String empName;
	private String empQual;
	private String empAddr;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpQual() {
		return empQual;
	}
	public void setEmpQual(String empQual) {
		this.empQual = empQual;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	
	public Employee() {
		//super();
	}
	public Employee(Integer empId, String empName, String empQual, String empAddr) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.empQual = empQual;
		this.empAddr = empAddr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empQual=" + empQual + ", empAddr=" + empAddr
				+ "]";
	}
	
	
	
}

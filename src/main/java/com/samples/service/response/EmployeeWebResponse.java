package com.samples.service.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employee")
@XmlType(name = "", propOrder = {"employeeId","employeeName", "salary", "hireDate", "totalExpenseClaim", "department", "error"})
public class EmployeeWebResponse {
	
	@XmlElement(name = "employeeId", required = true)
	private Integer employeeId;
	
	@XmlElement(name = "employeeName", required = true)
	private String employeeName;
	
	@XmlElement(name = "salary", required = true)
	private Double salary;
	
	@XmlElement(name = "hireDate", required = true)
	private XMLGregorianCalendar hireDate;
	
	@XmlElement(name = "totalExpenseClaim", required = true)
	private Double totalExpenseClaim;
	
	@XmlElement(name = "department", required = true)
	private DepartmentWebResponse department;
	
	@XmlElement(name = "error", required = true)
	private Error error;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public XMLGregorianCalendar getHireDate() {
		return hireDate;
	}

	public void setHireDate(XMLGregorianCalendar hireDate) {
		this.hireDate = hireDate;
	}
	
	public Double getTotalExpenseClaim() {
		return totalExpenseClaim;
	}

	public void setTotalExpenseClaim(Double totalExpenseClaim) {
		this.totalExpenseClaim = totalExpenseClaim.doubleValue();
	}
	
	public DepartmentWebResponse getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentWebResponse department) {
		this.department = department;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}

package com.samples.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "createEmployeeWebRequest")
@XmlType(name = "", propOrder = {"firstName","lastName", "salary", "hireDate", "deptId"})
public class CreateEmployeeWebRequest {
	
	@XmlElement(name = "firstName", required = true)
	private String firstName;
	
	@XmlElement(name = "lastName", required = true)
	private String lastName;
	
	@XmlElement(name = "salary", required = true)
	private Double salary;
	
	@XmlElement(name = "hireDate", required = true)
	private XMLGregorianCalendar hireDate;
	
	@XmlElement(name = "deptId", required = true)
	private Integer deptId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
}

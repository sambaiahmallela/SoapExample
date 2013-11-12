package com.samples.service.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employees")
@XmlType(name = "", propOrder = {"employeeWebResponse", "error"})
public class EmployeeWebResponses {
	
	@XmlElement(name = "employee", required = true)
	private List<EmployeeWebResponse> employeeWebResponse;
	
	@XmlElement(name = "error", required = true)
	private Error error;

	public List<EmployeeWebResponse> getEmployeeWebResponse() {
		return employeeWebResponse;
	}

	public void setEmployeeWebResponse(List<EmployeeWebResponse> employeeWebResponse) {
		this.employeeWebResponse = employeeWebResponse;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
}

package com.samples.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.PathParam;

import com.samples.service.response.EmployeeWebResponse;

@WebService
public interface EmployeeServiceWS {
	
	@WebMethod
	public EmployeeWebResponse getEmployee(@WebParam(name="employeeId") String empId);
	
}
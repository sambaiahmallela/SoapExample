package com.samples.adapter;

import java.util.List;

import com.samples.domain.Employee;
import com.samples.service.response.EmployeeWebResponse;
import com.samples.service.response.EmployeeWebResponses;

public interface EmployeeAdapter {
	public EmployeeWebResponse convertToEmpWebResponse(Employee employee,
			EmployeeWebResponse getEmployeeResponse);
	
	public EmployeeWebResponses convertToEmpWebResponse(List<Employee> empList);
}

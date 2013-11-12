package com.samples.adapter.impl;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.samples.adapter.EmployeeAdapter;
import com.samples.common.ErrorName;
import com.samples.domain.Employee;
import com.samples.domain.EmployeeExpense;
import com.samples.service.response.DepartmentWebResponse;
import com.samples.service.response.EmployeeWebResponse;
import com.samples.service.response.EmployeeWebResponses;

@Component("employeeAdapter")
public class EmployeeAdapterImpl implements EmployeeAdapter {
    private static Logger log = LoggerFactory.getLogger(EmployeeAdapterImpl.class);

    public EmployeeWebResponses convertToEmpWebResponse(List<Employee> empList) {
    	
    	EmployeeWebResponses empWebResponses = new EmployeeWebResponses();
		List<EmployeeWebResponse> employeeWebResponseList = new ArrayList<EmployeeWebResponse>();
		empWebResponses.setEmployeeWebResponse(employeeWebResponseList);
		
		if (empList == null) {
			com.samples.service.response.Error error = new com.samples.service.response.Error();
			empWebResponses.setError(error);
			error.setErrorCode(ErrorName.NOTFOUND.getErrorCode());
			error.setErrorName(ErrorName.NOTFOUND.getErrorName());
			error.setErrorDesc(ErrorName.NOTFOUND.getErrorDesc());
			return empWebResponses;
		}
		
		if (empList != null) {
			for (Employee employee: empList) {
				EmployeeWebResponse empWebResponse = new EmployeeWebResponse();
				this.convertToEmpWebResponse(employee, empWebResponse);
				empWebResponses.getEmployeeWebResponse().add(empWebResponse);
			}
		}
    	return empWebResponses;
    }
    
	public EmployeeWebResponse convertToEmpWebResponse(Employee employee,
			EmployeeWebResponse employeeWebResponse) {
		
		if (employee == null) {
			com.samples.service.response.Error error = new com.samples.service.response.Error();
			employeeWebResponse.setError(error);
			error.setErrorCode(ErrorName.NOTFOUND.getErrorCode());
			error.setErrorName(ErrorName.NOTFOUND.getErrorName());
			error.setErrorDesc(ErrorName.NOTFOUND.getErrorDesc());
			return employeeWebResponse;
		}
		
		if (employee.getEmpId() != null) {
			employeeWebResponse.setEmployeeId(employee.getEmpId());
		}
		if (employee.getFname()!= null && employee.getLname()!= null) {
			employeeWebResponse.setEmployeeName(employee.getFname() + " " + employee.getLname());
		}
		if (employee.getSalary() != null) {
			employeeWebResponse.setSalary(Double.valueOf(employee.getSalary().toString()));
		}
		if (employee.getHireDate() != null) {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(employee.getHireDate());
			try {
			XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			employeeWebResponse.setHireDate(xmlCalendar);
			} catch (DatatypeConfigurationException e) {
				log.warn("Exception while converting calendar to XML Calendar");
			}
		}
		
		if (employee.getEmployeeExpenses() != null) {
			Double totalEmpExpenseClaim = 0.0;
			for (EmployeeExpense ee: employee.getEmployeeExpenses()) {
				log.info("employee expense: " + ee.getExpenseClaim());
				totalEmpExpenseClaim += ee.getExpenseClaim();
			}
			employeeWebResponse.setTotalExpenseClaim(totalEmpExpenseClaim);
		}
		
		if (employee.getDepartment() != null) {
			DepartmentWebResponse deptWebResponse = new DepartmentWebResponse();
			deptWebResponse.setDeptId(employee.getDepartment().getDeptId());
			deptWebResponse.setDeptName(employee.getDepartment().getName());
			employeeWebResponse.setDepartment(deptWebResponse);
			log.info("employee department response done");
		}
		
		return employeeWebResponse;
	}

}

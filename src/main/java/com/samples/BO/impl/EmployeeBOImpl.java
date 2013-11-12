package com.samples.BO.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.BO.EmployeeBO;
import com.samples.DAO.EmployeeDAO;
import com.samples.DAO.impl.EmployeeDAOImpl;
import com.samples.adapter.EmployeeAdapter;
import com.samples.common.ErrorName;
import com.samples.domain.Department;
import com.samples.domain.Employee;
import com.samples.service.response.EmployeeWebResponse;
import com.samples.service.response.EmployeeWebResponses;

@Component("employeeBO")
public class EmployeeBOImpl implements EmployeeBO {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
    @Autowired
    private EmployeeAdapter employeeAdapter;
    
	private static Logger log = LoggerFactory.getLogger(EmployeeBOImpl.class);

	public EmployeeWebResponse createEmployee(
			com.samples.service.request.CreateEmployeeWebRequest createEmployeeWebRequest) {
		EmployeeWebResponse employeeWebResponse = new EmployeeWebResponse();
		if (createEmployeeWebRequest != null) {
			if (createEmployeeWebRequest.getFirstName() == null) {
				employeeWebResponse
						.setError(getErrorResponse(ErrorName.INPUT_MISSING_FNAME));
				return employeeWebResponse;
			}
			if (createEmployeeWebRequest.getLastName() == null) {
				employeeWebResponse
						.setError(getErrorResponse(ErrorName.INPUT_MISSING_LNAME));
				return employeeWebResponse;
			}
			if (createEmployeeWebRequest.getSalary() == null) {
				employeeWebResponse
						.setError(getErrorResponse(ErrorName.INPUT_MISSING_SALARY));
				return employeeWebResponse;
			}

			Employee employee = new Employee();
			employee.setFname(createEmployeeWebRequest.getFirstName());
			employee.setLname(createEmployeeWebRequest.getLastName());
			employee.setSalary(createEmployeeWebRequest.getSalary().longValue());

			employee.setHireDate(createEmployeeWebRequest.getHireDate()
					.toGregorianCalendar().getTime());
			employee.setActive(true);

			if (createEmployeeWebRequest.getDeptId() == null) {
				createEmployeeWebRequest.setDeptId(Integer.valueOf(40));
			}
			Department dept = employeeDAO
					.getDepartment(createEmployeeWebRequest.getDeptId());
			log.info("dept from BO=" + dept);

			// Set Bidirectional association - employee in dept and dept in
			employee.setDepartment(dept);
			dept.getEmployees().add(employee);

			Integer empAdd = employeeDAO.add(employee);
			if (empAdd != null) {
				employee.setEmpId(empAdd);
				employeeAdapter.convertToEmpWebResponse(employee, employeeWebResponse);
			} else {
				log.warn("employee was not added");
			}
		}
		return employeeWebResponse;
	}

	public EmployeeWebResponse getEmployee(Integer empId) throws Exception {
		EmployeeWebResponse empWebResponse = new EmployeeWebResponse();
		empWebResponse.setEmployeeId(empId);
		Employee emp = employeeDAO.getEmployee(empId);	
		return employeeAdapter.convertToEmpWebResponse(emp, empWebResponse);
	}
	
	public EmployeeWebResponses getAllEmployees() throws Exception {
		List<Employee> empList = employeeDAO.getAllEmployees();
		return employeeAdapter.convertToEmpWebResponse(empList);
	}
	
	public boolean updateEmployeeSalary(Integer empId, Long salary) throws Exception {
		return employeeDAO.updateEmployeeSalary(empId, salary);
	}
	
	public boolean deleteEmployee(Integer empId) throws Exception {
		return employeeDAO.deleteEmployee(empId);
	}
	
	private com.samples.service.response.Error getErrorResponse(ErrorName errorCode) {
		com.samples.service.response.Error error = new com.samples.service.response.Error();
		error.setErrorCode(errorCode.getErrorCode());
		error.setErrorName(errorCode.getErrorName());
		error.setErrorDesc(errorCode.getErrorDesc());
		return error;
	}

}

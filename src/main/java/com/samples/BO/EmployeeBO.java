package com.samples.BO;

import java.util.List;

import com.samples.domain.Employee;
import com.samples.service.request.CreateEmployeeWebRequest;
import com.samples.service.response.EmployeeWebResponse;
import com.samples.service.response.EmployeeWebResponses;


public interface EmployeeBO {
//	public Integer add(String fname, String lname, Long deptId, Long mgrEmpId, Long salary, Date hireDate, Integer jobId)  throws Exception;
	public EmployeeWebResponse createEmployee(CreateEmployeeWebRequest createEmployeeWebRequest);
	public EmployeeWebResponse getEmployee(Integer empId) throws Exception;
	public EmployeeWebResponses getAllEmployees() throws Exception;
	public boolean updateEmployeeSalary(Integer empId, Long salary) throws Exception;
	public boolean deleteEmployee(Integer empId) throws Exception;
}

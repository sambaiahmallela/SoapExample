package com.samples.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.samples.BO.EmployeeBO;
import com.samples.adapter.EmployeeAdapter;
import com.samples.service.EmployeeService;
import com.samples.service.request.CreateEmployeeWebRequest;
import com.samples.service.response.EmployeeWebResponse;
import com.samples.service.response.EmployeeWebResponses;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    private static Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    
    @Autowired
    private EmployeeBO employeeBO;
    
    @Autowired
    private EmployeeAdapter employeeAdapter;
	
    @Transactional
	public EmployeeWebResponses getAllEmployees() {
		log.info("list Employees");
		EmployeeWebResponses empWebResponses = null;
		try {
			empWebResponses = employeeBO.getAllEmployees();
		} catch (Exception e) {
			log.error("received exception", e);
		}
		return empWebResponses;
	}
	
    @Transactional(propagation=Propagation.REQUIRES_NEW)
	public EmployeeWebResponse getEmployee(String empId) {
		log.info("get employee for empId=" + empId);
		EmployeeWebResponse empWebResponse = new EmployeeWebResponse();
		empWebResponse.setEmployeeId(Integer.valueOf(empId));
		
		try {
			empWebResponse = employeeBO.getEmployee(Integer.valueOf(empId));
		} catch (Exception e) {
			log.error("exception received=" + e);
		}
		return empWebResponse;
	}

    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public EmployeeWebResponse createEmployee(
			CreateEmployeeWebRequest createEmployeeWebRequest) {
		log.info("createEmployee for name="
				+ createEmployeeWebRequest.getFirstName() + " "
				+ createEmployeeWebRequest.getLastName());
		EmployeeWebResponse empWebResponse = new EmployeeWebResponse();
		try {
			empWebResponse = employeeBO.createEmployee(createEmployeeWebRequest);
		} catch (Exception e) {
			log.error("received exception", e);
		}
		return empWebResponse;
	}

	
    /*
    @Transactional(propagation=Propagation.REQUIRED)
	public boolean updateEmployeeSalary(Integer empId, Long salary) {
		log.info("update employee");
		boolean result = false;
		try {
			result = employeeBO.updateEmployeeSalary(empId, salary);
		} catch (Exception e) {
			log.error("received exception", e);
		}
		return result;
	}
	
    @Transactional(propagation=Propagation.REQUIRED)
	public boolean deleteEmployee(Integer empId) {
		log.info("delete employee");
		boolean result = false;
		try {
			result = employeeBO.deleteEmployee(empId);
		} catch (Exception e) {
			log.error("received exception", e);
		}
		return result;
	}

	public Integer createEmployee() {
		log.info("create employee");
		return null;
	} */
}

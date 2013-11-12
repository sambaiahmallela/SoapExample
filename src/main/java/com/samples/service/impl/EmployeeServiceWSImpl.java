package com.samples.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.samples.BO.EmployeeBO;
import com.samples.adapter.EmployeeAdapter;
import com.samples.service.EmployeeServiceWS;
import com.samples.service.response.EmployeeWebResponse;

@Service("employeeServiceWS")
@WebService(endpointInterface="com.samples.service.EmployeeServiceWS")
public class EmployeeServiceWSImpl implements EmployeeServiceWS {
    private static Logger log = LoggerFactory.getLogger(EmployeeServiceWSImpl.class);
    
    @Autowired
    private EmployeeBO employeeBO;
    
    @Autowired
    private EmployeeAdapter employeeAdapter;
    
    @Transactional(propagation=Propagation.REQUIRES_NEW)
	public EmployeeWebResponse getEmployee(String empId) {
		log.debug("get employee using JAX-WS for empId=" + empId);
		EmployeeWebResponse empWebResponse = new EmployeeWebResponse();
		empWebResponse.setEmployeeId(Integer.valueOf(empId));
		
		try {
			empWebResponse = employeeBO.getEmployee(Integer.valueOf(empId));
		} catch (Exception e) {
			log.error("exception received=" + e);
		}
		return empWebResponse;
	}


}

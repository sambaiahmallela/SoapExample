package com.samples.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.samples.BO.DaiWebServiceBO;
import com.samples.domain.DAIOptions;
import com.samples.service.DaiWebServiceService;
import com.samples.service.response.DAIResponse;

@Service("daiWebServiceService")
@WebService(endpointInterface = "com.samples.service.DaiWebServiceService")
public class DaiWebServiceServiceImpl implements DaiWebServiceService {
	private static Logger log = LoggerFactory.getLogger(DaiWebServiceServiceImpl.class);
	@Autowired
	private DaiWebServiceBO employeeBO;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public DAIResponse getEmployee(String empId) {
		DAIResponse empWebResponse = new DAIResponse();
		//empWebResponse.setEmployeeId(Integer.valueOf(empId));
		System.out.println();
		try {
			empWebResponse = employeeBO.getEmployee(Integer.valueOf(empId));
		} catch (Exception e) {
			log.error("exception received=" + e);
		}
		return empWebResponse;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public String getDaiOptions(DAIOptions daiOptions) throws Exception {

		return employeeBO.getDaiOptions(daiOptions);
	}

	public DAIResponse generateDocuments(DAIOptions daiOptions) {
		return employeeBO.generateDocuments(daiOptions);
	}

}

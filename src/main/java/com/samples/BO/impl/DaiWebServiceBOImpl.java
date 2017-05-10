package com.samples.BO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.BO.DaiWebServiceBO;
import com.samples.DAO.DaiWebServiceDAO;
import com.samples.adapter.DaiWebServiceAdapter;
import com.samples.domain.DAIOptions;
import com.samples.domain.Employee;
import com.samples.service.response.DAIResponse;
import com.samples.service.response.DAIResponses;

@Component("employeeBO")
public class DaiWebServiceBOImpl implements DaiWebServiceBO {

	@Autowired
	private DaiWebServiceDAO daiWebServiceDAO;

	@Autowired
	private DaiWebServiceAdapter daiWebServiceAdapter;

	public DAIResponse getEmployee(Integer empId) throws Exception {
		DAIResponses empWebResponse = new DAIResponses();
		DAIOptions daiOptions = daiWebServiceDAO.getEmployee(empId);
		return daiWebServiceAdapter.convertToDaiWebResponse(daiOptions, empWebResponse);
	}

	public DAIResponses getAllEmployees() throws Exception {
		List<DAIOptions> empList = daiWebServiceDAO.getAllEmployees();
		return daiWebServiceAdapter.convertToDaiWebResponse(empList);
	}

	public String getDaiOptions(DAIOptions daiOptions) throws Exception {
		return daiWebServiceDAO.getDaiOptions(daiOptions);
	}

	public DAIResponse generateDocuments(DAIOptions daiOptions) {
		return daiWebServiceDAO.generateDocuments(daiOptions);
	}

}

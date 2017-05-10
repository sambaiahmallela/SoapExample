package com.samples.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.samples.domain.DAIOptions;
import com.samples.service.response.DAIResponse;

@WebService(targetNamespace = "urn://Commbank/DAI")
public interface DaiWebServiceService {

	@WebMethod
	public DAIResponse getEmployee(@WebParam(name = "employeeId") String empId);

	@WebMethod(operationName = "GetDaiOptions")
	public String getDaiOptions(@WebParam(name = "DAIOptions") @XmlElement(required = true) DAIOptions daiOptions)
			throws Exception;

	@WebMethod(operationName = "GenerateDocuments")
	public DAIResponse generateDocuments(
			@WebParam(name = "DAIOptions") @XmlElement(required = true) DAIOptions options);

}
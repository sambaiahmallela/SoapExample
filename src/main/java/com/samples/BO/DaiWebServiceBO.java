package com.samples.BO;

import com.samples.domain.DAIOptions;
import com.samples.service.response.DAIResponse;
import com.samples.service.response.DAIResponses;

public interface DaiWebServiceBO {

	public DAIResponse getEmployee(Integer empId) throws Exception;

	public DAIResponses getAllEmployees() throws Exception;

	public String getDaiOptions(DAIOptions daiOptions) throws Exception;

	public DAIResponse generateDocuments(DAIOptions daiOptions);
}

package com.samples.DAO;

import java.util.List;

import com.samples.domain.DAIOptions;
import com.samples.domain.Employee;
import com.samples.service.response.DAIResponse;

public interface DaiWebServiceDAO {

	public List<DAIOptions> getAllEmployees();

	public DAIOptions getEmployee(Integer empId);

	public String getDaiOptions(DAIOptions daiOptions);

	public DAIResponse generateDocuments(DAIOptions daiOptions);

}
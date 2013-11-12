package com.samples.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.samples.domain.Employee;
import com.samples.service.request.CreateEmployeeWebRequest;
import com.samples.service.response.EmployeeWebResponse;
import com.samples.service.response.EmployeeWebResponses;


@Path("/employees")
@Produces({ "application/xml", "application/json" })
public interface EmployeeService {
	
	@GET
	@Path("/{employeeId}")
	public EmployeeWebResponse getEmployee(@PathParam("employeeId") String empId);
	
	@GET
	@Path("/")
	public EmployeeWebResponses getAllEmployees();
	
	@POST
	@Path("/")
	public EmployeeWebResponse createEmployee(CreateEmployeeWebRequest createEmployeeWebRequest);

	
	/* public boolean deleteEmployee(Integer empId); */
}
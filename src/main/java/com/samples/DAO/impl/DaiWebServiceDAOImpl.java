package com.samples.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samples.DAO.DaiWebServiceDAO;
import com.samples.domain.DAIOptions;
import com.samples.domain.Employee;
import com.samples.service.response.DAIResponse;

@Repository("daiWebServiceDAO")
public class DaiWebServiceDAOImpl implements DaiWebServiceDAO {

	private static Logger log = LoggerFactory.getLogger(DaiWebServiceDAOImpl.class);

	@Autowired
	SessionFactory sessionFactory;

	private final Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<DAIOptions> getAllEmployees() {
		List<DAIOptions> daiOptionsList = null;
		Session session = getSession();
		daiOptionsList = (List<DAIOptions>) session.createQuery("from DAIOptions").list();
		return daiOptionsList;
	}

	public DAIOptions getEmployee(Integer empId) {
		Session session = getSession();
		DAIOptions daiOptions = null;
		daiOptions = (DAIOptions) session.get(DAIOptions.class, empId);
		if (daiOptions != null) {
			
		} else {
			log.info("employee id=" + empId + " does not exist");
		}
		return daiOptions;
	}

	public String getDaiOptions(DAIOptions daiOptions) {

		System.out.println("Enter into getDaiOptions in EmployeeDAOImpl");
		return "Success";
	}

	public DAIResponse generateDocuments(DAIOptions daiOptions) {

		System.out.println("Enter into generateDocuments in EmployeeDAOImpl");
		return null;
	}
}

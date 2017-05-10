package com.samples.adapter.impl;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.samples.adapter.DaiWebServiceAdapter;
import com.samples.common.ErrorName;
import com.samples.domain.DAIOptions;
import com.samples.domain.EmployeeExpense;
import com.samples.service.response.DAIResponse;
import com.samples.service.response.DAIResponses;

@Component("daiWebServiceAdapter")
public class DaiWebServiceAdapterImpl implements DaiWebServiceAdapter {
	private static Logger log = LoggerFactory.getLogger(DaiWebServiceAdapterImpl.class);

	public DAIResponses convertToDaiWebResponse(List<DAIOptions> daiOptionsList) {

		DAIResponses daiResponses = new DAIResponses();
		List<DAIResponse> daiResponseList = new ArrayList<DAIResponse>();
		daiResponses.setDaiResponseList(daiResponseList);

		if (daiOptionsList == null) {
			com.samples.service.response.Error error = new com.samples.service.response.Error();
			daiResponses.setError(error);
			error.setErrorCode(ErrorName.NOTFOUND.getErrorCode());
			error.setErrorName(ErrorName.NOTFOUND.getErrorName());
			error.setErrorDesc(ErrorName.NOTFOUND.getErrorDesc());
			return daiResponses;
		}

		if (daiOptionsList != null) {
			for (DAIOptions daiOptions : daiOptionsList) {
				DAIResponses daiResponse = new DAIResponses();
				this.convertToDaiWebResponse(daiOptions, daiResponse);
				daiResponses.getDaiResponseList();
			}
		}
		return daiResponses;
	}

	public DAIResponse convertToDaiWebResponse(DAIOptions daiOptions, DAIResponses daiResponses) {

		DAIOptions.WorkflowNotification workflowNotification = new DAIOptions.WorkflowNotification();
		DAIOptions.CallerChannel callerChannel = new DAIOptions.CallerChannel();
		DAIOptions.Package pack = new DAIOptions.Package();
		DAIOptions.Documents documents = new DAIOptions.Documents();
		DAIOptions.Delivery delivery = new DAIOptions.Delivery();
		DAIOptions.UserDetails userDetails = new DAIOptions.UserDetails();

		if (daiOptions == null) {
			com.samples.service.response.Error error = new com.samples.service.response.Error();
			daiResponses.setError(error);
			error.setErrorCode(ErrorName.NOTFOUND.getErrorCode());
			error.setErrorName(ErrorName.NOTFOUND.getErrorName());
			error.setErrorDesc(ErrorName.NOTFOUND.getErrorDesc());
			return daiResponses.getDaiResponseList().get(0);
		}

		if (callerChannel.getChannelID() != null && callerChannel.getUniqueID() != null) {

		}
		if (pack.getPackageName() != null && pack.getPackageVersion() != null) {

		}
		if (documents.getDocument().get(0).getReturn() != null) {
			
		}
		
		return daiResponses.getDaiResponseList().get(0);
	}

}

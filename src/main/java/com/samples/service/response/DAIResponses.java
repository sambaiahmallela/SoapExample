package com.samples.service.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DAIResponses")
@XmlType(name = "", propOrder = { "DAIResponse", "error" })
public class DAIResponses {

	@XmlElement(name = "DAIResponse", required = true)
	private List<DAIResponse> daiResponseList;

	@XmlElement(name = "error", required = true)
	private Error error;

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public List<DAIResponse> getDaiResponseList() {
		return daiResponseList;
	}

	public void setDaiResponseList(List<DAIResponse> daiResponseList) {
		this.daiResponseList = daiResponseList;
	}

}

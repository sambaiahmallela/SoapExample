package com.samples.common;

public enum ErrorName {
	NOTFOUND("EMP_NOT_FOUND", 001, "Employee Not found in system"),
	INPUT_MISSING_FNAME("INPUT_MISSING_FNAME", 002, "First Name is missing in input"),
	INPUT_MISSING_LNAME("INPUT_MISSING_LNAME", 003, "Last Name is missing in input"), 
	INPUT_MISSING_SALARY("INPUT_MISSING_SALARY", 004, "Salary is missing in input"),
	INPUT_MISSING("INPUT_MISSING", 005, "Missing input in request");
	
	private String errorName;
	private Integer errorCode;
	private String errorDesc;
	
	private ErrorName(String errorName, Integer errorCode, String errorDesc) {
		this.errorName = errorName;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public String getErrorName() {
		return errorName;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

}

package com.te.lms.enums;

public enum MaritalStatus {

	MARRIED("Married"),

	UNMARRIED("Unmarried");

	private final String status;

	MaritalStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}

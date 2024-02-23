package com.te.lms.enums;

public enum AccountType {
	SAVINGS("Savings"), SALARY("Salary");

	private final String accountType;

	AccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountType() {
		return accountType;
	}
}

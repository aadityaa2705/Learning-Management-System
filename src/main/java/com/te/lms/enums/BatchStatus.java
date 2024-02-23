package com.te.lms.enums;

public enum BatchStatus {
	TO_BE_STARTED("TO_BE_STARTED"),

	IN_PROGRESS("IN_PROGRESS"),

	COMPLETED("Completed");

	private final String status;

	BatchStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}

package com.te.lms.enums;

public enum ContactType {
	PHONE("Phone"),

	LANDLINE("Landline");

	private final String type;

	ContactType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

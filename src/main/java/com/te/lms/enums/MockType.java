package com.te.lms.enums;

public enum MockType {
	MOCK("Mock"),

	REMOCK("Remock");

	private final String type;

	MockType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

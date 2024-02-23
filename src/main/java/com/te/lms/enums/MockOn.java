package com.te.lms.enums;

public enum MockOn {
	MOCK_1("1"),

	MOCK_2("2"),

	MOCK_3("3"),

	MOCK_4("4"),

	MOCK_5("5");

	private final String value;

	MockOn(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

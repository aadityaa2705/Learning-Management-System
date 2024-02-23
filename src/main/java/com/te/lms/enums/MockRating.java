package com.te.lms.enums;

public enum MockRating {
	BELOW_AVERAGE("Below Average"),

	AVERAGE("Average"),

	ABOVE_AVERAGE("Above Average"),

	GOOD("Good"),

	EXCELLENT("Excellent");

	private String description;

	MockRating(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}

package com.te.lms.enums;

public enum YearsOfExperience {
	ONE(1),

	TWO(2),

	THREE(3),

	FOUR(4);

	Integer value;

	YearsOfExperience(Integer value) {
		this.value = value;
	}

	public Integer yearsOfExperience() {
		return value;
	}
}

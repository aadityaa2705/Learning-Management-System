package com.te.lms.enums;

public enum BatchStrengthType {
	DROPPED_OUT("DROPPED_OUT"),

	TERMINATED("Terminated"),

	ABSCONDED("Absconded");

	private final String strengthType;

	BatchStrengthType(String strengthType) {
		this.strengthType = strengthType;
	}

	public String getStrengthType() {
		return strengthType;
	}
}

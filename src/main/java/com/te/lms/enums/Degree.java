package com.te.lms.enums;

public enum Degree {
	UNDERGRADUATE("Undergraduate"),

	POSTGRADUATE("Postgraduate"),

	PHD("Phd");

	private final String degree;

	Degree(String degree) {
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

}

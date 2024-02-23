package com.te.lms.enums;

public enum AddressType {
	TEMPORARY("Temporary"), PERMANENT("Permanent");

	private final String addressType;

	AddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressType() {
		return addressType;
	}
}

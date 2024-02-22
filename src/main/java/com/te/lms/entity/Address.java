package com.te.lms.entity;

import javax.persistence.Entity;

import com.te.lms.entity.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Address {
	private AddressType addressType;
	private Integer doorNumber;
	private String street;
	private String locality;
	private String city;
	private String state;
	private Integer pinCode;
	private String landMark;
}

package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table (name="address")
public class Address {
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer addressId;
	@Column(name = "address_type")
	private AddressType addressType;
	@Column(name = "door_number")
	private Integer doorNumber;
	@Column(name = "street")
	private String street;
	@Column(name = "locality")
	private String locality;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "pincode")
	private Integer pinCode;
	@Column(name = "land_mark")
	private String landMark;
}

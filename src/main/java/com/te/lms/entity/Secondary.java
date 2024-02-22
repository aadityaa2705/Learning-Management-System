package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.te.lms.entity.enums.MaritalStatus;

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
@Table(name = "employee_secondary")
public class Secondary {
	@Column(name = "secondary_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer secondaryId;
	
	@Column(name = "pan_number")
	private String panNumber;
	@Column(name = "aadhar_number")
	private String aadharNumber;
	@Column(name = "father_name")
	private String fatherName;
	@Column(name = "mother_name")
	private String motherName;
	@Column(name = "spouse_name")
	private String spouseName;
	@Column(name = "passport_number")
	private String passportNumber;
	@Column(name = "marital_status")
	private MaritalStatus maritalStatus;
}

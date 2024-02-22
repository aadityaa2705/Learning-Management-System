package com.te.lms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.te.lms.entity.enums.BloodGroup;
import com.te.lms.entity.enums.EmployeeStatus;
import com.te.lms.entity.enums.Gender;

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
@Table(name = "primary")
public class Primary {
	private Integer employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate birthDate;
	private String designation;
	private String employeeEmail;
	private Gender gender;
	private BloodGroup bloodGroupType;
	private String nationality;
	private EmployeeStatus status;

}

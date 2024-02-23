package com.te.lms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.te.lms.enums.YearsOfExperience;

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
public class Experience {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer experienceId;
	private String companyName;
	@Enumerated(EnumType.ORDINAL)
	private YearsOfExperience experience;
	private LocalDate dateOfJoining;
	private LocalDate dataOfRelieving;
	private String designation;
	private String location;
}

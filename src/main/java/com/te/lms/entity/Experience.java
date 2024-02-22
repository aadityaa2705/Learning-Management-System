package com.te.lms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.te.lms.entity.enums.YearsOfExperience;

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
	private String companyName;
	private YearsOfExperience experience;
	private LocalDate dateOfJoining;
	private LocalDate dataOfRelieving;
	private String designation;
	private String location;
}

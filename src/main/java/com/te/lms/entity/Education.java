package com.te.lms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.te.lms.entity.enums.EducationType;

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
public class Education {
	private EducationType educationType;
	private LocalDate yearOfPassing;
	private Double percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state;
}

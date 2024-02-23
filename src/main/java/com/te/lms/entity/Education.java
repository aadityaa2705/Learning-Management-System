package com.te.lms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.te.lms.enums.Degree;
import com.te.lms.enums.State;

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
@Table(name = "education")
public class Education {
	@Column(name = "education_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer educationId;
	@Column(name = "education_type")
	@Enumerated(EnumType.STRING)
	private Degree degree;
	@Column(name = "year_of_passing")
	private LocalDate yearOfPassing;
	@Column(name = "percentage")
	private Double percentage;
	@Column(name = "university_name")
	private String universityName;
	@Column(name = "institute_name")
	private String instituteName;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "state")
	private State state;
}

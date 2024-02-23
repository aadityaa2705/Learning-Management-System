package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "attendence")
public class EmployeeAttendence {
	@Column(name = "attendence_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer attendenceId;
	private Integer employeeId;
	private String employeeName;
	private boolean morningAttendence;
	private boolean eveningAttendence;
	
}

package com.te.lms.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "employee")
public class Employee {
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer Id;
	@Column(name = "employee_id")
	private String employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;
	@Column(name = "birth_date")
	private LocalDate birthDate;
	@Column(name = "designation")
	private String designation;
	@Column(name = "employee_email")
	private String employeeEmail;
	@Column(name = "gender")
	private Gender gender;
	@Column(name = "blood_group")
	private BloodGroup bloodGroupType;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "employement_status")
	private EmployeeStatus employementStatus;
	@Column(name = "secondary_info")
	@OneToOne(cascade = CascadeType.ALL)
	private Secondary secondary;
	@Column(name = "bank_account")
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bankAccount;
	@Column(name = "address")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;
	@Column(name = "technical_skill")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<TechnicalSkill> technicalSkills;
	@Column(name = "experience")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Experience> experiences;
	@Column(name = "contact")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contact> contacts;
	@Column(name = "eduacation")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Education> educations;
	@Column(name = "attendence")
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeAttendence> attendenceList;
	@Column(name = "batch")
	@OneToOne(cascade = CascadeType.ALL)
	private Batch batch;

	@OneToMany(cascade = CascadeType.ALL)
	private Mock mock;
}

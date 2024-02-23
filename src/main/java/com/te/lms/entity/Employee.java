package com.te.lms.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.te.lms.enums.BloodGroup;
import com.te.lms.enums.EmployeeStatus;
import com.te.lms.enums.Gender;
import com.te.lms.enums.Nationality;

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
	private Integer id;
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
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "blood_group")
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroupType;
	@Column(name = "nationality")
	private Nationality nationality;
	@Column(name = "employement_status")
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employementStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="secondary_id")
	private Secondary secondary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bank_id")
	private Bank bankAccount;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
	private List<Address> addresses;
	@JoinColumn(name = "employee_id")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<TechnicalSkill> technicalSkills;
	@JoinColumn(name = "employee_id")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Experience> experiences;
	@JoinColumn(name = "employee_id")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contact> contacts;
	@JoinColumn(name = "employee_id")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Education> educations;
	@JoinColumn(name = "employee_fk")
	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeAttendence> attendenceList;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="batch_id")
	private Batch batch;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Mock> mocks;
}

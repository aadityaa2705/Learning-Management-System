package com.te.lms.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

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
public class Employee {
	private Primary primary;
	private Secondary secondary;
	private Bank bankAccount;
	private List<Address> addresses;
	private Set<TechnicalSkill> technicalSkills;
	private Set<Experience> experiences;
	private Set<Contact> contacts;
	private Set<Education> educations;
}

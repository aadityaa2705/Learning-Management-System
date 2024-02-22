package com.te.lms.entity;

import javax.persistence.Entity;

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
public class Secondary {
	private String panNumber;
	private String aadharNumber;
	private String father;
	private String mother;
	private String spouse;
	private String passportNumber;
	private MaritalStatus maritalStatus;
}

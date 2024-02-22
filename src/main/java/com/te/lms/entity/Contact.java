package com.te.lms.entity;

import javax.persistence.Entity;

import com.te.lms.entity.enums.ContactType;

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
public class Contact {
	private ContactType contactType;
	private Long contactNumber;
}

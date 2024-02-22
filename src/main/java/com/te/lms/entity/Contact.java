package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Table(name = "contact")
public class Contact {
	@Column(name = "contact_id")
	private Integer contactId;
	@Column(name = "contact_type")
	private ContactType contactType;
	@Column(name = "contact_number")
	private String contactNumber;
}

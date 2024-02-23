package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.te.lms.enums.AccountType;

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
@Table(name = "bank")
public class Bank {

	@Column(name = "bank_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer bankId;
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "account_type")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	@Column(name = "bank_account")
	private String bankAccount;
	@Column(name = "ifsc_code")
	private String ifscCode;
	@Column(name = "branch")
	private String branch;
	@Column(name = "state")
	private String state;
}

package com.te.lms.entity;

import javax.persistence.Entity;

import com.te.lms.entity.enums.AccountType;

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
public class Bank {
	private AccountType accountType;
	private String accountNumber;
	private String bankAccount;
	private String ifscCode;
	private String branch;
	private String state;
}

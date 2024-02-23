package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.te.lms.enums.BatchStrengthType;

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
public class BranchStrength {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer batchStrengthId;
	@Column(name = "strength_type")
	@Enumerated(EnumType.STRING)
	private BatchStrengthType batchStrengthType;
	private Integer strength;
}

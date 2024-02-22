package com.te.lms.entity;

import javax.persistence.Entity;

import com.te.lms.entity.enums.BatchStrengthType;

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
	private Integer batchStrengthId;
	private BatchStrengthType batchStrengthType;
	private Integer strength;
}

package com.te.lms.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import com.te.lms.entity.enums.BatchStatus;

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
public class Batch {
	private Integer batchId;
	private String batchName;
	private Mentor mentor;
	private List<Technology> technologies;
	private LocalDate startDate;
	private LocalDate endDate;
	private BatchStatus batchStatus;
	private Set<BranchStrength> batchStrength;
}

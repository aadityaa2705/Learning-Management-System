package com.te.lms.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.te.lms.enums.BatchStatus;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	private String batchId;
	private String batchName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mentor_id")
	private Mentor mentor;
	@ManyToMany
	@JoinTable(name = "map_batch_technology", joinColumns = @JoinColumn(name = "batch_id"), inverseJoinColumns = @JoinColumn(name = "technolgy_id"))
	private List<Technology> technologies;
	private LocalDate startDate;
	private LocalDate endDate;
	@Enumerated(EnumType.STRING)
	private BatchStatus batchStatus;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="batch_strength_fk")
	private Set<BranchStrength> batchStrength;
	@ManyToMany(mappedBy = "batch")
	private List<Employee> employees;
}

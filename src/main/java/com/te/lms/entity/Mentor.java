package com.te.lms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
public class Mentor {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	private String mentorId;
	private String mentorName;
	private String mentorEmail;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Technology> technologies;
	@OneToMany(mappedBy = "mentor", cascade = CascadeType.ALL)
	private List<Batch> batches;
}

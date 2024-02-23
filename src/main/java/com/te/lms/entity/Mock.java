package com.te.lms.entity;

import java.time.LocalDateTime;
import java.util.List;

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

import org.hibernate.annotations.ManyToAny;

import com.te.lms.enums.MockOn;
import com.te.lms.enums.MockRating;
import com.te.lms.enums.MockType;

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
public class Mock {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer mockId;
	private String takenBy;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "mock_technolgy", joinColumns = @JoinColumn(name = "mock_id"), inverseJoinColumns = @JoinColumn(name = "technology_id"))
	private List<Technology> technology;
	@Enumerated(EnumType.STRING)
	private MockType mockType;
	@Enumerated(EnumType.STRING)
	private MockOn mockOn;
	private LocalDateTime mockSheduledOn;
	private Integer practical;
	private Integer theoretical;
	@Enumerated(EnumType.STRING)
	private MockRating overallfeedback;
	private String detailedFeedback;
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;

}

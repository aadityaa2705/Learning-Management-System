package com.te.lms.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;

import com.te.lms.entity.enums.MockOn;
import com.te.lms.entity.enums.MockRating;
import com.te.lms.entity.enums.MockType;

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

	private Integer mockId;
	private String takenBy;
	private List<Technology> technology;
	private MockType mockType;
	private MockOn mockOn;
	private LocalDateTime mockSheduledOn;
	private Integer practical;
	private Integer theoretical;
	private MockRating overallfeedback;
	private String detailedFeedback;
}

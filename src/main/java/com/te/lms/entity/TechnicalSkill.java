package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.te.lms.enums.SkillRating;
import com.te.lms.enums.YearsOfExperience;

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
@Table(name = "technical_skill")
public class TechnicalSkill {
	@Column(name = "skill_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer skillId;
	@Column(name = "skill_type")
	private String skillType;
	@Column(name = "skill_rating")
	private SkillRating skillRating;
	@Column(name = "years_of_experience")
	private YearsOfExperience yearsOfExperienceOnSkill;
}

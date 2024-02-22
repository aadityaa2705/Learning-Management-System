package com.te.lms.entity;

import javax.persistence.Entity;

import com.te.lms.entity.enums.SkillRating;
import com.te.lms.entity.enums.YearsOfExperience;

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
public class TechnicalSkill {
	private String skillType;
	private SkillRating skillRating;
	private YearsOfExperience yearsOnExperienceOnSkill;
}

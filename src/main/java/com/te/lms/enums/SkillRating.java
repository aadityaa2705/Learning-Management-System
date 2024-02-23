package com.te.lms.enums;

public enum SkillRating {
	 BEGINNER("Beginner"),
	    INTERMEDIATE("Intermediate"),
	    ADVANCED("Advanced"),
	    EXPERT("Expert");

	    private String level;

	    SkillRating(String level) {
	        this.level = level;
	    }

	    public String getLevel() {
	        return level;
	    }
}

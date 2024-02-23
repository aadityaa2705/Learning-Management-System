package com.te.lms.enums;

public enum Nationality {
	INDIAN("Indian"),
    AMERICAN("American"),
    BRITISH("British"),
    CANADIAN("Canadian"),
    AUSTRALIAN("Australian"),
    GERMAN("German"),
    FRENCH("French"),
    JAPANESE("Japanese"),
    CHINESE("Chinese"),
    RUSSIAN("Russian"),
    SOUTH_KOREAN("South Korean"),
    BRAZILIAN("Brazilian"),
    MEXICAN("Mexican"),
    SPANISH("Spanish"),
    ITALIAN("Italian"),
    SWISS("Swiss"),
    SWEDISH("Swedish"),
    DUTCH("Dutch"),
    NORWEGIAN("Norwegian"),
    DANISH("Danish"),
    FINNISH("Finnish"),
    BELGIAN("Belgian"),
    AUSTRIAN("Austrian"),
    PORTUGUESE("Portuguese"),
    GREEK("Greek"),
    IRISH("Irish"),
    POLISH("Polish"),
    TURKISH("Turkish"),
    SAUDI_ARABIAN("Saudi Arabian"),
    EGYPTIAN("Egyptian"),
    NIGERIAN("Nigerian"),
    SOUTH_AFRICAN("South African"),
    KENYAN("Kenyan"),
    ETHIOPIAN("Ethiopian"),
    MOROCCAN("Moroccan"),
    INDONESIAN("Indonesian"),
    THAI("Thai"),
    VIETNAMESE("Vietnamese"),
    FILIPINO("Filipino"),
    NEPALESE("Nepalese"),
    BANGLADESHI("Bangladeshi"),
    PAKISTANI("Pakistani"),
    SRI_LANKAN("Sri Lankan"),
    IRANIAN("Iranian"),
    IRAQI("Iraqi"),
    SYRIAN("Syrian"),
    ISRAELI("Israeli"),
    JORDANIAN("Jordanian"),
    LEBANESE("Lebanese"),
    UAE("Emirati"),
    QATARI("Qatari"),
    KUWAITI("Kuwaiti"),
    OMANI("Omani"),
    BAHRAINI("Bahraini");

    private String nationality;

    Nationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }
}

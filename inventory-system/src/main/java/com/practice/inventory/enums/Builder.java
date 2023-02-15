package com.practice.inventory.enums;

public enum Builder {
    FENDER("Fender"),
    MARTIN("Martin"),
    GIBSON("Gibson"),
    COLLINGS("Collings"),
    OLSON("Olson"),
    PRS("Prs"),
    ANY("Any");

    private final String value;

    Builder(String value) {
        this.value = value;
    }

    public static Builder fromValue(String text) {
        for(Builder a: Builder.values()) {
            if(String.valueOf(a.value).equals(text)) {
                return a;
            }
        }
        return null;
    }

    public String toString() {
        return String.valueOf(value);
    }
}

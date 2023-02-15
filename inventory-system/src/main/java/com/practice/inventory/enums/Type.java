package com.practice.inventory.enums;

public enum Type {

    ACOUSTIC("Acoustic"),
    ELECTRIC("Electric");

    private final String value;


    Type(String value) {
        this.value = value;
    }

    public static Type fromValues(String text) {
        for(Type a: Type.values()) {
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

package com.practice.inventory.enums;

public enum Wood {
    INDIAN_ROSEWOOD("Indian Rosewood"),
    BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
    MAHOGANY("Mahogany"),
    MAPLE("Maple"),
    COCOBOLO("Cocobolo"),
    CEDAR("Cedar"),
    ADIRONDACK("Adirondack"),
    ALDER("Alder"),
    SITKA("Sitka");

    private final String value;

    Wood(String value) {
        this.value = value;
    }

    public static Wood fromValues(String text) {
        for(Wood a: Wood.values()) {
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

package com.example.homework02criteriaapi.enums;

public enum Gender {
    male,
    female;

    public String value() {
        switch (this) {
            case male:
                return "ប្រុស";
            case female:
                return "ស្រី";
            default:
                return "គ្មានភេទ";
        }
    }
}

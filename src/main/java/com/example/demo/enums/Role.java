package com.example.demo.enums;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 11/25/2022, Fri
 **/

public enum Role {

    ADMIN("Admin"),
    USER("User");

    private final String value;

    Role(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

package com.example.demo.enums;

public enum RoleEnum {

    USER("User","User"),
    ADMIN("Admin","Admin"),
    MANAGER("Manager","Mobile-Manager");

    private String key;
    private String dscp;

    private RoleEnum(String key, String dscp) {
        this.key = key;
        this.dscp = dscp;
    }
}

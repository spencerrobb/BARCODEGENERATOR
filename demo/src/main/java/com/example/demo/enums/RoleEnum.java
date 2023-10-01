package com.example.demo.enums;

public enum RoleEnum {

    BACKEND(" Backend","Backend"),
    REACT(" React","React"),
    MOBILEANDROID(" Android","Mobile-Android"),
    MOBILEIOS(" Ios","Mobile-IOS");

    private String key;
    private String dscp;

    private RoleEnum(String key, String dscp) {
        this.key = key;
        this.dscp = dscp;
    }
}

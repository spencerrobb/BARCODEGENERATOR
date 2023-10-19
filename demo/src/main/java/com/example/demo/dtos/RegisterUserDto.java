package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

    private String firstName;

    private String middleName;

    private String lastName;

    // getters and setters here...
}

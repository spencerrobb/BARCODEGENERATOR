package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data // getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private HttpStatus status;  //status 200,300,400,500
    private String message;

}

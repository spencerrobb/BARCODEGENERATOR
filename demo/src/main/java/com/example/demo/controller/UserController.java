package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{userid}")
    public User getUser(@PathVariable String userid){
        return userService.findByUserId(userid);
    }
}

package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public boolean loginUser(@RequestParam String userid, @RequestParam String password){
       return userService.authenticateUser(userid, password);
    }

    @GetMapping("/getUser/{userid}")
    public User getUser(@PathVariable String userid){
        return userService.findByUserId(userid);
    }
}

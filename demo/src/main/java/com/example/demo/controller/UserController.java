package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{userid}")
    public User getUser(@PathVariable long userid){
        return userService.findByUserId(userid);
    }

    @GetMapping("/me")
    public ResponseEntity<UserDetails> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        System.out.println("BEFOREUSER");
//        User currentUser = (User) authentication.getPrincipal();

        UserDetails currentUser = null;
        Object principal = authentication.getPrincipal();
        if (principal instanceof UserDetails) {
             currentUser = (UserDetails) principal;
            // Now you can work with currentUser as a User object
            System.out.println("EMAILLL "+currentUser.getUsername());

        } else {
            // Handle the case where the principal is not a User object
            System.out.println("NOT USER");
        }

        return ResponseEntity.ok(currentUser);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> allUsers() {
        List<User> users = userService.allUsers();

        return ResponseEntity.ok(users);
    }
}

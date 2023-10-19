package com.example.demo.services.UserService;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUserId(long userId) {
        return userRepository.findByUserId(userId);
    }

//    public boolean authenticateUser(long userid, String password){
//        User checkUser = userRepository.authenticateUser(userid, password);
//        if(checkUser!=null){
//            return false;
//        } else {
//            return true;
//        }
//    };

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}

package com.example.demo.services.UserService;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    public boolean authenticateUser(String userid, String password){
        User checkUser = userRepository.authenticateUser(userid, password);
        if(checkUser!=null){
            return false;
        } else {
            return true;
        }
    };


}

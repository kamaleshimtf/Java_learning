package com.usernamagement.service;

import com.usernamagement.entity.UserEntity;
import com.usernamagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String addUser(UserEntity user) {
        userRepository.save(user);
        return "success";
    }
}

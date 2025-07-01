package com.usernamagement.controller;
import com.usernamagement.entity.UserEntity;
import com.usernamagement.entity.UserLaptop;
import com.usernamagement.repository.UserLaptopRepository;
import com.usernamagement.repository.UserRepository;
import com.usernamagement.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserLaptopRepository userLaptopRepository;

    @PostMapping
    public String addUser(@RequestBody UserEntity user) {
        userService.addUser(user);
        return "User added successfully";
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("/laptop")
   public List<UserLaptop> getUserLaptops() {
        return userLaptopRepository.findAll();
   }
}

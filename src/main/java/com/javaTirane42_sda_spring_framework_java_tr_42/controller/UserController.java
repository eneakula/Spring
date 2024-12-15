package com.javaTirane42_sda_spring_framework_java_tr_42.controller;

import com.javaTirane42_sda_spring_framework_java_tr_42.entity.User;
import com.javaTirane42_sda_spring_framework_java_tr_42.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();

    }

    @PostMapping("create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    }



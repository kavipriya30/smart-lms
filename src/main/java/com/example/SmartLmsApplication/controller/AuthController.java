package com.example.SmartLmsApplication.controller;

import com.example.SmartLmsApplication.entity.User;
import com.example.SmartLmsApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User u = service.login(user.getEmail(), user.getPassword());
        if (u != null)
            return "Welcome " + u.getName() + " (" + u.getRole() + ")";
        else
            return "Invalid credentials!";
    }
}

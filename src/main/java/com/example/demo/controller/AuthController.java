package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        if ("admin".equals(request.getUsername()) && "admin123".equals(request.getPassword())) {
            return "Login Successful ✅";
        } else {
            return "Invalid Username or Password ❌";
        }
    }
}

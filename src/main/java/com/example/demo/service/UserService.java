package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ✅ CREATE
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // ✅ READ ALL
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ READ BY ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // ✅ UPDATE
    public User updateUser(Long id, User newUser) {
        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(user);
        }

        return null;
    }

    // ✅ DELETE
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
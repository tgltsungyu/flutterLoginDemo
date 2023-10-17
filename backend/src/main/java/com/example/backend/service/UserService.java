package com.example.backend.service;

import com.example.backend.model.User;

public interface UserService {
    User register(User user);
    User findByUsername(String username);
}

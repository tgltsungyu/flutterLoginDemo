package com.example.backend.service;

import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        return userRepository.save(user); // 儲存用戶資訊
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username); // 根據用戶名查找用戶
    }
}

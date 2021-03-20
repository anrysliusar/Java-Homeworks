package com.example.homework7.services;

import com.example.homework7.models.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findById(int id);
}

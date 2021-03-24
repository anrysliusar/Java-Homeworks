package com.example.homework9.dao;

import com.example.homework9.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDAO extends JpaRepository<User, Integer> {
    User findUserByName(String name);
}

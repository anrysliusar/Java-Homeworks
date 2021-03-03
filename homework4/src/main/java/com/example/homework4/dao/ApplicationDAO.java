package com.example.homework4.dao;

import com.example.homework4.models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationDAO extends JpaRepository<Application, Integer> {
}

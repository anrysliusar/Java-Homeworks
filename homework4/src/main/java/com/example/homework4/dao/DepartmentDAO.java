package com.example.homework4.dao;

import com.example.homework4.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDAO extends JpaRepository<Department, Integer> {
}

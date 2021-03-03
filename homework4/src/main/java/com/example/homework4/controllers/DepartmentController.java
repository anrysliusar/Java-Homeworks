package com.example.homework4.controllers;

import com.example.homework4.dao.DepartmentDAO;
import com.example.homework4.models.Department;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
public class DepartmentController {
    DepartmentDAO departmentDAO;

    @GetMapping("/saveDepartment")
    public void saveDepartment(@RequestParam String departmentCity, int countOfWorkers){
        Department department = new Department(departmentCity, countOfWorkers);
        departmentDAO.save(department);

    }

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return departmentDAO.findAll();
    }
}

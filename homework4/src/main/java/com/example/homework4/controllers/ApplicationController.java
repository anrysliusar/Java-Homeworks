package com.example.homework4.controllers;

import com.example.homework4.dao.ApplicationDAO;
import com.example.homework4.models.Application;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ApplicationController {
    ApplicationDAO applicationDAO;

    @GetMapping("/saveApplication")
    public void saveApplication(@RequestParam int sum, String creditState, String currency) {
        Application application = new Application(sum, creditState, currency);
        applicationDAO.save(application);
    }

    @GetMapping("/applications")
    public List<Application> getApplications(){
        return applicationDAO.findAll();
    }
}

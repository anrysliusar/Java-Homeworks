package com.example.homework4.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iddepartment;
    private String departmentcity;
    private int countofworkers;

    public Department() {
    }

    public Department(String departmentCity, int countOfWorkers) {
        this.departmentcity = departmentCity;
        this.countofworkers = countOfWorkers;
    }
}

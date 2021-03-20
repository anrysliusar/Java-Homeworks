package com.example.homework7.services;

import com.example.homework7.models.Car;

import java.util.List;

public interface CarService {
    void save(Car car);
    List<Car> findAll();
}

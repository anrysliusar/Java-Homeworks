package com.example.homework7.controllers;

import com.example.homework7.models.Car;
import com.example.homework7.services.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private CarService carService;

    public CarController(@Qualifier("carService") CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public List<Car> getProducts(){
        return carService.findAll();
    }

    @GetMapping("/save")
    public void saveProduct(@RequestParam String model){
        Car car = new Car();
        car.setModel(model);
        carService.save(car);
    }
}

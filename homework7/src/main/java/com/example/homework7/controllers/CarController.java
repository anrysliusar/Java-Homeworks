package com.example.homework7.controllers;

import com.example.homework7.dao.CarDAO;
import com.example.homework7.dao.ProductDAO;
import com.example.homework7.models.Car;
import com.example.homework7.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {
    private CarDAO carDAO;

    @GetMapping()
    public List<Car> getProducts(){
        return carDAO.findAll();
    }

    @GetMapping("/save")
    public void saveProduct(@RequestParam String model){
        Car car = new Car();
        car.setModel(model);
        carDAO.save(car);
    }
}

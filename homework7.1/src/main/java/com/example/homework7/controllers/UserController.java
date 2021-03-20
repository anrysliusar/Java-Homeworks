package com.example.homework7.controllers;

import com.example.homework7.models.Car;
import com.example.homework7.models.Product;
import com.example.homework7.models.User;
import com.example.homework7.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(@Qualifier("userService") UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/saveWithProduct")
    public void saveWithProduct(@RequestParam String name, int age, String productName){
        User user = new User();
        Product product = new Product();
        List<Product> products = new ArrayList<>();
        product.setName(productName);
        products.add(product);
        user.setName(name);
        user.setAge(age);
        user.setProducts(products);
        userService.save(user);
    }

    @GetMapping("/saveWithCars")
    public void saveWithCars(@RequestParam String name, int age, String model){
        User user = new User();
        Car car = new Car();
        List<Car> cars = new ArrayList<>();
        car.setModel(model);
        cars.add(car);
        user.setName(name);
        user.setAge(age);
        user.setCars(cars);
        userService.save(user);
    }
}

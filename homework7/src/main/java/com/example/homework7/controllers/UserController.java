package com.example.homework7.controllers;

import com.example.homework7.dao.UserDAO;
import com.example.homework7.models.Product;
import com.example.homework7.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserDAO userDAO;

    @GetMapping()
    public List<User> getUsers(){
        return userDAO.findAll();
    }

    @GetMapping("/save")
    public void saveUser(@RequestParam String name, int age, String productName){
        User user = new User();
        Product product = new Product();
        List<Product> products = new ArrayList<>();
        product.setName(productName);
        products.add(product);
        user.setName(name);
        user.setAge(age);
        user.setProducts(products);
        userDAO.save(user);
    }


}

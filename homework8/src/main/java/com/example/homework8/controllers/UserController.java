package com.example.homework8.controllers;

import com.example.homework8.dao.UserDAO;
import com.example.homework8.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private UserDAO userDAO;

    @PostMapping("/save")
    public void saveUser(@RequestBody User user){
        userDAO.save(user);
    }

    @GetMapping()
    public List<User> getUsers(){
        return  userDAO.findAll();
    }

    @GetMapping("/{id}")
    private Optional<User> getCar(@PathVariable int id){
        return userDAO.findById(id);
    }

    @DeleteMapping("/{id}")
    private void deleteCar(@PathVariable int id){
        userDAO.deleteById(id);
    }

}

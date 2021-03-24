package com.example.homework9.controllers;

import com.example.homework9.dao.UserDAO;
import com.example.homework9.models.User;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {
    private UserDAO userDAO;
    private PasswordEncoder passwordEncoder;


    @GetMapping
    public String home(Principal principal){
//        System.out.println(principal);
//        System.out.println(SecurityContextHolder.getContext().getAuthentication());
//        SecurityContextHolder
//                .getContext()
//                .setAuthentication(
//                        new UsernamePasswordAuthenticationToken("vasya", "1111")
//                );

        return "home";
    }

    @GetMapping("/admin/test")
    public List<String> adminTest(){
        return Arrays.asList("banana", "orange");
    }

    @GetMapping("/user/test")
    public List<String> userTest(){
        return Arrays.asList("milk", "glass");
    }

    @GetMapping("/wide")
    public String wide(){
        return "wide";
    }
    @PostMapping("/register")
    public void register(@RequestBody User user){
        String encode = passwordEncoder.encode(user.getPassword());
        user.setPassword(encode);
        userDAO.save(user);

    }
}


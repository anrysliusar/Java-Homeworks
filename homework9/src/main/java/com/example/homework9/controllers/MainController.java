package com.example.homework9.controllers;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
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
}


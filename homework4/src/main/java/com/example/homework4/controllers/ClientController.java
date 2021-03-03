package com.example.homework4.controllers;

import com.example.homework4.dao.ClientDAO;
import com.example.homework4.models.Client;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController {
    private ClientDAO clientDAO;

    @GetMapping("/saveClient")
    public void saveClient(@RequestParam String firstName, String lastName, String education, String passport, String city, int age){
        Client client = new Client(firstName, lastName, education, passport, city, age);
        clientDAO.save(client);
    }

    @GetMapping("/clients")
    public List<Client> getClients(){
        return clientDAO.findAll();
    }

}

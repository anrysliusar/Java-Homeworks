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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idclient;
    private String firstname;
    private String lastname;
    private String education;
    private String passport;
    private String city;
    private int age;

    public Client() {
    }

    public Client(String firstName, String lastName, String education, String passport, String city, int age) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.education = education;
        this.passport = passport;
        this.city = city;
        this.age = age;
    }
}



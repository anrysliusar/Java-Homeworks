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
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idapplication;
    private int sum;
    private String creditstate;
    private String currency;

    public Application() {
    }

    public Application(int sum, String creditstate, String currency) {
        this.sum = sum;
        this.creditstate = creditstate;
        this.currency = currency;
    }
}

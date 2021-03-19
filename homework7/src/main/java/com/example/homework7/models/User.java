package com.example.homework7.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString(exclude = {"products"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id")
    private List<Product> products = new ArrayList<>();
}

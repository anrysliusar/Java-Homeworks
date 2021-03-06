package com.example.homework7.dao;

import com.example.homework7.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ProductDAO extends JpaRepository<Product, Integer> {
}

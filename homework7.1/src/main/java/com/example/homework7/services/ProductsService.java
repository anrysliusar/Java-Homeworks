package com.example.homework7.services;

import com.example.homework7.models.Product;
import java.util.List;

public interface ProductsService {
    void save(Product product);
    List<Product> findAll();
}

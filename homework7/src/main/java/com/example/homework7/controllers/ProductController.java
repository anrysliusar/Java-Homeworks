package com.example.homework7.controllers;

import com.example.homework7.dao.ProductDAO;
import com.example.homework7.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductDAO productDAO;

    @GetMapping()
    public List<Product> getProducts(){
        return productDAO.findAll();
    }

    @GetMapping("/save")
    public void saveProduct(@RequestParam String name){
        Product product = new Product();
        product.setName(name);

        productDAO.save(product);
    }
}

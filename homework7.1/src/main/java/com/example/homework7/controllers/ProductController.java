package com.example.homework7.controllers;

import com.example.homework7.dao.ProductDAO;
import com.example.homework7.models.Product;
import com.example.homework7.services.ProductsService;
import com.example.homework7.services.implementaion.ProductServiceImplementation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductsService productsService;

    public ProductController(@Qualifier("productService") ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping()
    public List<Product> getProducts(){
        return productsService.findAll();
    }

    @GetMapping("/save")
    public void saveProduct(@RequestParam String name){
        Product product = new Product();
        product.setName(name);
        productsService.save(product);
    }
}

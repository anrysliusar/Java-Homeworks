package com.example.homework7.services.implementaion;

import com.example.homework7.dao.ProductDAO;
import com.example.homework7.models.Product;
import com.example.homework7.services.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("productService")
public class ProductServiceImplementation implements ProductsService {
    private ProductDAO productDAO;


    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
}


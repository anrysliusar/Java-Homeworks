package com.example.homework7.dao;

import com.example.homework7.models.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class ProductDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Product product){
        entityManager.persist(product);
    }

    public List<Product> findAll(){
//        return entityManager.createNativeQuery("SELECT * FROM relationsjava.user", User.class).getResultList();
        return entityManager.createQuery("select p from Product p", Product.class).getResultList();
    }

    public Product findById(int id){
//        return entityManager.createNativeQuery("SELECT * FROM relationsjava.user", User.class).getResultList();
        return entityManager.createQuery("select p from Product p where p.id =: id", Product.class).setParameter("id", id).getSingleResult();
    }
}

package com.example.homework7.dao;

import com.example.homework7.models.Car;
import com.example.homework7.models.User;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
public class CarDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Car car){
        entityManager.persist(car);
    }

    public List<Car> findAll(){
        return entityManager.createQuery("select c from Car c", Car.class).getResultList();
    }
}

package com.example.homework7.dao;


import com.example.homework7.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User user){
        entityManager.persist(user);
    }

    public List<User> findAll(){
//        return entityManager.createNativeQuery("SELECT * FROM relationsjava.user", User.class).getResultList();
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User findById(int id){
//        return entityManager.createNativeQuery("SELECT * FROM relationsjava.user", User.class).getResultList();
        return entityManager.createQuery("select u from User u where u.id =: id", User.class).setParameter("id", id).getSingleResult();
    }
}

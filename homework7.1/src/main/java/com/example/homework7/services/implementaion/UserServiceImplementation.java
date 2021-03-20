package com.example.homework7.services.implementaion;

import com.example.homework7.dao.UserDAO;
import com.example.homework7.models.User;
import com.example.homework7.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("userService")
public class UserServiceImplementation implements UserService {
    private UserDAO userDAO;

    @Override
    public void save(User user) {
        if (user != null){
            userDAO.save(user);
        }
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }
}

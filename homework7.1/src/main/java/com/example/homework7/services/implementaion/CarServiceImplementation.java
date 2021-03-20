package com.example.homework7.services.implementaion;


import com.example.homework7.dao.CarDAO;
import com.example.homework7.models.Car;
import com.example.homework7.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("carService")
public class CarServiceImplementation implements CarService {
    private CarDAO carDAO;

    @Override
    public void save(Car car) {
        carDAO.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}

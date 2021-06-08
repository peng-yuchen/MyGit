package com.pyc.service;

import com.pyc.bean.Car;
import com.pyc.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarDao carDao;
//    @Transactional
    public void saves(List<Car> cars){
        for(Car car : cars){
            System.out.println(car.getCname());
            carDao.save(car);
            System.out.println(car.getCname());
        }
    }
}

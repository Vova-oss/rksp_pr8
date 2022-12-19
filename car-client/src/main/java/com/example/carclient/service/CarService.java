package com.example.carclient.service;

import com.example.carclient.entity.Car;
import com.example.carclient.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    CarRepository repository;

    @Autowired
    public CarService(CarRepository repository) {
        this.repository = repository;
    }


    public List<Car> getAll() {
        return repository.findAll();
    }
}

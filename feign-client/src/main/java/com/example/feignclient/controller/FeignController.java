package com.example.feignclient.controller;

import com.example.feignclient.entity.Car;
import com.example.feignclient.entity.MainEnt;
import com.example.feignclient.entity.People;
import com.example.feignclient.service.FeignServiceForCar;
import com.example.feignclient.service.FeignServiceForPeople;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class FeignController {

    FeignServiceForCar feignServiceForCar;
    FeignServiceForPeople feignServiceForPeople;

    public FeignController(FeignServiceForCar feignServiceForCar, FeignServiceForPeople feignServiceForPeople) {
        this.feignServiceForCar = feignServiceForCar;
        this.feignServiceForPeople = feignServiceForPeople;
    }

    @GetMapping("/getAll")
    public MainEnt getAll(){
        List<People> peopleList = feignServiceForPeople.getAll();
        List<Car> carList = feignServiceForCar.getAll();
        MainEnt mainEnt = new MainEnt();
        mainEnt.setCarList(carList);
        mainEnt.setPeopleList(peopleList);
        return mainEnt;
    }

}

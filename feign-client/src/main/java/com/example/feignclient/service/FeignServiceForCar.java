package com.example.feignclient.service;

import com.example.feignclient.entity.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "Feign-client", url = "http://car-client:8082/car")
public interface FeignServiceForCar {

    @GetMapping("/getAll")
    List<Car> getAll();

}

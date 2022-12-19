package com.example.feignclient.service;

import com.example.feignclient.entity.People;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "Feign-client", url = "http://people-client:8081/people")
public interface FeignServiceForPeople {

    @GetMapping("/getAll")
    List<People> getAll();

}

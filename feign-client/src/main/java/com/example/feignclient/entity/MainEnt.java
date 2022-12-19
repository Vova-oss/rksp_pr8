package com.example.feignclient.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MainEnt {
    List<Car> carList;
    List<People> peopleList;
}

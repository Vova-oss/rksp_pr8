package com.example.feignclient.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {

    private Long id;
    private String model;
    private String price;

}

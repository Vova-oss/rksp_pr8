package com.example.feignclient.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class People {

    private Long id;
    private String name;
    private Integer age;
}

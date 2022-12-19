package com.example.peopleclient.service;

import com.example.peopleclient.entity.People;
import com.example.peopleclient.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    PeopleRepository repository;

    @Autowired
    public PeopleService(PeopleRepository repository) {
        this.repository = repository;
    }


    public List<People> getAll() {
        return repository.findAll();
    }
}

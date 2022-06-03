package com.spring.mongoDb.service;

import com.spring.mongoDb.model.Automobile;
import com.spring.mongoDb.repository.AutomobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomobileService {

    @Autowired
    private AutomobileRepository repository;

    public Automobile saveOrUpdate(Automobile auto){
        return repository.save(auto);
    }

    public List<Automobile> fetchAll(){
        return repository.findAll();
    }

    public List<Automobile> deleteAutomobile(Automobile auto){
        repository.delete(auto);
        return repository.findAll();
    }
}

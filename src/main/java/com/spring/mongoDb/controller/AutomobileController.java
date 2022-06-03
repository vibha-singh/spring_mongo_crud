package com.spring.mongoDb.controller;

import com.spring.mongoDb.model.Automobile;
import com.spring.mongoDb.service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutomobileController {

    @Autowired
    private AutomobileService service;

    @PostMapping("/saveOrUpdate")
    public ResponseEntity<Automobile> saveOrUpdate(@RequestBody Automobile auto){
        return new ResponseEntity<>(service.saveOrUpdate(auto), HttpStatus.ACCEPTED);
    }

    @GetMapping("/fetchAutomobile")
    public ResponseEntity<List<Automobile>> getAllAutomobile(){
        return new ResponseEntity<>(service.fetchAll(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteAutomobile")
    public ResponseEntity<List<Automobile>> deleteAutomobile(@RequestBody Automobile auto){
        return new ResponseEntity<>(service.deleteAutomobile(auto), HttpStatus.ACCEPTED);
    }
}

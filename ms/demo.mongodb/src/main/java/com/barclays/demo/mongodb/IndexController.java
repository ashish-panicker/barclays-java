package com.barclays.demo.mongodb;

import java.util.List;

import com.barclays.demo.mongodb.repo.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class IndexController {

    @Autowired
    private CustomerRepo repo;

    @PostMapping("/")
    public Customer create(@RequestBody Customer c){
        repo.save(c);
        return c;
    }


    @GetMapping("/")
    public List<Customer> findAll(){
        return repo.findAll();
    }
    
}
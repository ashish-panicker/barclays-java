package com.barclays.demo.mongodb.repo;

import com.barclays.demo.mongodb.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, String>{

    public Customer findByFirstName(String firstName);
    
}
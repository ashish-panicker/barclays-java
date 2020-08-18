package com.barclays.ms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "<h1>Welcome to spring boot demo.</h1>" + 
                "<p><a href='/employees/'>List all employees</a></p>" + 
                "<p><a href='/employees/e001'>List Employee with id e001</a></p>";
    }

    
}
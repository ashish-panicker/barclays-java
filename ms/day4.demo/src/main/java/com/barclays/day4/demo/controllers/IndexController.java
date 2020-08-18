package com.barclays.day4.demo.controllers;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    // @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    // @ResponseBody

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private int port;

    @GetMapping({"/", "/index"})
    public String index() {
        return "<h1>Welcome to Springboot.</h1>";
    }

    // http://localhost:5000/hello/ashish
    @GetMapping(path = "/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "<h1>Hello from " + serviceName +" running on " + port + ". " 
                    + name + "</h1>";
    }

    // http://localhost:5000/welcome?name=Ashish
    @GetMapping(path = "/welcome")
    public String sayWelcome(@RequestParam(name = "name") String name){
        return "<h1>Welcome to " + serviceName + " running on " + port + "." 
                + name + "</h1>";
    }
    
}
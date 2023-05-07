package com.example.environment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    Environment environment;

    @GetMapping("/saluto")
    public String diCiao(){
        return environment.getProperty("welcomeMsg");
    }
}

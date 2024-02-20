package com.bharati.Spring.Security.Basics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/welcomeMessage")
    public String getWelcomeMessage(@RequestParam String name){
        return name +" Welcome to the Spring Security Course with Madan Reddy";
    }

}

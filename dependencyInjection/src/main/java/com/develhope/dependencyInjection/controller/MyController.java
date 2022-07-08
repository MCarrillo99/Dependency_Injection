package com.develhope.dependencyInjection.controller;

import com.develhope.dependencyInjection.service.MyService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/getname")
    public String getName(){
        System.out.println("myService.getName has been called");
        return myService.getName();
    }

    @GetMapping("/")
    public String welcomeMessage(){
        return "welcome to my application";
    }

}

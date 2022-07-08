package com.develhope.dependencyInjection.service;

import com.develhope.dependencyInjection.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
    }

    public String getName(){
        return myComponent.getMyComponentName();
    }

}

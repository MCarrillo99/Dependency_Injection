package com.develhope.dependencyInjection.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class MyComponent {

    private String myComponentName = "michele";

    public String getMyComponentName() {
        return myComponentName;
    }
}

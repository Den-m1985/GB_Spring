package org.example.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DieselEngine{
    public DieselEngine() {
        System.out.println("DieselEngine created");
    }

    //@Override
    public void startEngine() {
        System.out.println("Diesel started");
    }
}

package org.example.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements InterfaceEngine {
    public GasolineEngine() {
        System.out.println("GasolineEngine created");
    }

    @Override
    public void startEngine() {
        System.out.println("Gasoline started");
    }
}

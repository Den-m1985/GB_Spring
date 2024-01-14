package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model = "BMW";
    private String made = "X1";

    @Autowired
    private InterfaceEngine carEngine;

    public Car(InterfaceEngine carEngine) {
        this.carEngine = carEngine;
        System.out.println("Car crerated");
    }

    public InterfaceEngine getCarEngine() {
        return carEngine;
    }
    public void setCarEngine(InterfaceEngine carEngine) {
        this.carEngine = carEngine;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", made='" + made + '\'' +
                '}';
    }

    public void go(){
        carEngine.startEngine();
    }
}

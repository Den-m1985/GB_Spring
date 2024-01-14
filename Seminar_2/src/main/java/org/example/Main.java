package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.DieselEngine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // по старинке:
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Car simpleCar = context.getBean(Car.class);
//        System.out.println(simpleCar);
//        Car simpleCar2 = context.getBean("BMW", Car.class);
//        System.out.println(simpleCar2);

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car c = context.getBean(Car.class);
        c.go();
        System.out.println("-----------------------");
        DieselEngine dEng = context.getBean(DieselEngine.class);


    }
}
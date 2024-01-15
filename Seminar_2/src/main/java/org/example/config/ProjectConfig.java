package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.domain")
public class ProjectConfig {




//    @Bean
//    Engine engine() {
//        Engine eng = new Engine();
//        return eng;
//    }
//    @Bean
//    Car car() {
//        Car vw = new Car();
//        vw.setCarEngine(engine());
//        vw.setModel("Haval");
//        vw.setMade("gfgh");
//        return vw;
//    }

    // По старинке:
//    @Bean("Haval")
//    Car car() {
//        Car vw = new Car();
//        vw.setModel("Haval");
//        vw.setMade("gfgh");
//        return vw;
//    }
//    @Bean(name="BMW")
//    Car car2() {
//        Car vw = new Car();
//        vw.setModel("bmw");
//        vw.setMade("gfgh");
//        return vw;
//    }
//    @Bean
//    @Primary
//    Car car3() {
//        Car vw = new Car();
//        vw.setModel("Reno");
//        vw.setMade("gfgh");
//        return vw;
//    }
}

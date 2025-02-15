package org.example.Example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
//    @Bean
//    Parrot parrot() {
//        Parrot parrot = new Parrot();
//        parrot.setName("Kesha");
//        return parrot;
//    }
//
//    @Bean
//    @Primary
//    Parrot parrot2() {
//        Parrot parrot = new Parrot();
//        parrot.setName("Vasya");
//        return parrot;
//    }
}

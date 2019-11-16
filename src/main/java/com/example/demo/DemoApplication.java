package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Dzialanie dzialanie = new Dzialanie();
        System.out.println(dzialanie.dodaj(13, 15));
        System.out.println(dzialanie.dodaj(0, 0));
        System.out.println(dzialanie.dodaj(-50, -10));
//        SpringApplication.run(DemoApplication.class, args);
    }
}

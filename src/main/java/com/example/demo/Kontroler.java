package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroler {

    @Autowired
    private Dzialanie dzialanie;

    @GetMapping("/dodaj")
    public Integer dodaj(@RequestHeader Integer a, @RequestHeader Integer b) {
        return dzialanie.dodaj(a, b);
    }
}

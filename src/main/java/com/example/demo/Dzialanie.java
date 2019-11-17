package com.example.demo;

import lombok.Setter;

public class Dzialanie {

    Serwis1 serwis1 = new Serwis1();
    Serwis2 serwis2 = new Serwis2();

    public Integer dodaj(final Integer a, final Integer b) {
        return a + b;
    }

    public Integer dodajLiczbyPobraneSkads() {
        Integer pobranaLiczba1 = serwis1.pobierzLiczbe();
        Integer pobranaLiczba2 = serwis2.pobierzLiczbe();
        return pobranaLiczba1 + pobranaLiczba2;
    }
}

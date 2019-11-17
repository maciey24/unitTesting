package com.example.demo;

import lombok.Setter;

public class Dzialanie {

    public Integer dodaj(final Integer a, final Integer b) {
        return a + b;
    }

    public Integer dodajLiczbyPobraneSkads() {
        Integer pobranaLiczba1 = Serwis1.pobierzLiczbe();
        Integer pobranaLiczba2 = Serwis2.pobierzLiczbe();
        return pobranaLiczba1 + pobranaLiczba2;
    }
}

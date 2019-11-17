package com.example.demo;

import lombok.Setter;

public class Dzialanie {

    //jak NIE ROBIć!!!!
    WszystkieSerwisy wszystkieSerwisy;

    Dzialanie(WszystkieSerwisy wszystkieSerwisy) {
        this.wszystkieSerwisy = wszystkieSerwisy;
    }

    public Integer dodaj(final Integer a, final Integer b) {
        return a + b;
    }

    public Integer dodajLiczbyPobraneSkads() {
        Serwis1 serwis1 = wszystkieSerwisy.getSerwis1();
        Serwis2 serwis2 = wszystkieSerwisy.getSerwis2();
        Integer pobranaLiczba1 = serwis1.pobierzLiczbe();
        Integer pobranaLiczba2 = serwis2.pobierzLiczbe();
        return pobranaLiczba1 + pobranaLiczba2;
    }
}

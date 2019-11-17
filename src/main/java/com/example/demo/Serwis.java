package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serwis {

    @Autowired
    Serwis(Serwis1 serwis1, Serwis2 serwis2, Dzialanie dzialanie) {
        this.serwis1 = serwis1;
        this.serwis2 = serwis2;
        this.dzialanie = dzialanie;
    }

    private Serwis1 serwis1;
    private Serwis2 serwis2;
    private Dzialanie dzialanie;

    public Integer dodajLiczbyPobraneSkads() {
        Integer pobranaLiczba1 = serwis1.pobierzLiczbe();
        Integer pobranaLiczba2 = serwis2.pobierzLiczbe();
        return dzialanie.dodaj(pobranaLiczba1, pobranaLiczba2);
    }

    public Integer podzielLiczbyPobraneSkads() {
        Integer wynik = null;
        try {
            Integer pobranaLiczba1 = serwis1.pobierzLiczbe();
            Integer pobranaLiczba2 = serwis2.pobierzLiczbe();
            wynik = dzialanie.podziel(pobranaLiczba1, pobranaLiczba2);
        } catch (Exception e) {
            System.out.println(e);
        }
        return wynik;
    }
}

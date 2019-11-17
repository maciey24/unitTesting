package com.example.demo;

import lombok.Setter;

public class Dzialanie {

    @Setter
    Serwis1 serwis1 = new Serwis1();
    @Setter
    Serwis2 serwis2 = new Serwis2();
    @Setter
    Dodawanie dodawanie = new Dodawanie();

    public Integer dodajLiczbyPobraneSkads() {
        Integer pobranaLiczba1 = serwis1.pobierzLiczbe();
        Integer pobranaLiczba2 = serwis2.pobierzLiczbe();
        return dodawanie.dodaj(pobranaLiczba1, pobranaLiczba2);
    }

    public Integer podzielLiczbyPobraneSkads() {
        Integer wynik = null;
        try {
            Integer pobranaLiczba1 = serwis1.pobierzLiczbe();
            Integer pobranaLiczba2 = serwis2.pobierzLiczbe();
            wynik = dodawanie.podziel(pobranaLiczba1, pobranaLiczba2);
        } catch (Exception e) {
            System.out.println(e);
        }
        return wynik;
    }
}

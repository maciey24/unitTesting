package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DzialanieDodajLiczbyPobraneSkadsTest {

    @Test
    void dodajLiczbyPobraneSkadsTest1() {
        Dzialanie dzialanie = new Dzialanie();
        Integer expected = 30;

        Integer actual = dzialanie.dodajLiczbyPobraneSkads();

        assertEquals(expected, actual);
    }

}
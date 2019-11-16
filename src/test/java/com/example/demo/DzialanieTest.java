package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DzialanieTest {

    @Test
    void dodajTest() {
        Integer a = 3;
        Integer b = 6;
        Dzialanie dzialanie = new Dzialanie();
        Integer expected = 9;

        Integer actual = dzialanie.dodaj(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void dodajTest2() {
        Integer a = -10;
        Integer b = 5;
        Dzialanie dzialanie = new Dzialanie();
        Integer expected = -5;

        Integer actual = dzialanie.dodaj(a, b);

        assertEquals(expected, actual);
    }

}
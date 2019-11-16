package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void dodajTest4() {
        Integer a = null;
        Integer b = 2;
        Dzialanie dzialanie = new Dzialanie();

        Executable executable = () -> {
            dzialanie.dodaj(a, b);
        };

        assertThrows(NullPointerException.class, executable);
    }

}
package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DzialanieTest {

    Dzialanie dzialanie;

    @BeforeEach
    void beforeEach() {
        this.dzialanie = new Dzialanie();
    }

    @Test
    void dodajTest() {
        Integer a = 3;
        Integer b = 6;
        Integer expected = 9;

        Integer actual = dzialanie.dodaj(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void dodajTest2() {
        Integer a = -10;
        Integer b = 5;
        Integer expected = -5;

        Integer actual = dzialanie.dodaj(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void dodajTest4() {
        Integer a = null;
        Integer b = 2;

        Executable executable = () -> {
            dzialanie.dodaj(a, b);
        };

        assertThrows(NullPointerException.class, executable);
    }

}
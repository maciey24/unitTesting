package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DzialanieTest {

    @Test
    void dodajTest() {
        // arrange
        Integer a = 3;
        Integer b = 6;
        Dzialanie dzialanie = new Dzialanie();
        Integer expected = 9;

        // act
        Integer actual = dzialanie.dodaj(a, b);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void dodajTest2() {
        int actual = new Dzialanie().dodaj(-10, 3);
        assertEquals(-7, actual);
    }
}
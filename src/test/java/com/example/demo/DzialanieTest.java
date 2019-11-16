package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DzialanieTest {

    @Test
    void dodajTest() {
        int actual = new Dzialanie().dodaj(3, 6);
        assertEquals(9, actual);
    }

    @Test
    void dodajTest2() {
        int actual = new Dzialanie().dodaj(-10, 3);
        assertEquals(-7, actual);
    }
}
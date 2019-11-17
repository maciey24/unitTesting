package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class ListTest {

    List<Object> pojemnik;

    @Test
    void dodaj() {
        pojemnik = new ArrayList<>();

        pojemnik.add("abc");

        assertEquals(1, pojemnik.size());
    }

    @Test
    void usun() {
        assertEquals(1, pojemnik.size());

        pojemnik.remove("abc");

        assertEquals(0, pojemnik.size());
    }

}

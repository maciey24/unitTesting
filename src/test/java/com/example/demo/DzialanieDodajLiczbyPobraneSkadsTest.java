package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;

class DzialanieDodajLiczbyPobraneSkadsTest {

    @Mock
    Serwis1 serwis1;

    @Mock
    Serwis2 serwis2;

    @Test
    void dodajLiczbyPobraneSkadsTest1() {
        MockitoAnnotations.initMocks(this);
        doReturn(1000).when(serwis1).pobierzLiczbe();
        doReturn(2000).when(serwis2).pobierzLiczbe();
        Dzialanie dzialanie = new Dzialanie();
        dzialanie.setSerwis1(serwis1);
        dzialanie.setSerwis2(serwis2);
        Integer expected = 3000;

        Integer actual = dzialanie.dodajLiczbyPobraneSkads();

        assertEquals(expected, actual);
    }
}
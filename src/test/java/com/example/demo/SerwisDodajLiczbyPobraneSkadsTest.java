package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class SerwisDodajLiczbyPobraneSkadsTest {

    @Mock
    Serwis1 serwis1;

    @Mock
    Serwis2 serwis2;

    @Mock
    Dzialanie dzialanie;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void dodajLiczbyPobraneSkadsTest1() {
        doReturn(12).when(serwis1).pobierzLiczbe();
        doReturn(34).when(serwis2).pobierzLiczbe();
        doReturn(1).when(dzialanie).dodaj(anyInt(), anyInt());
        Serwis serwis = new Serwis();
        serwis.setSerwis1(serwis1);
        serwis.setSerwis2(serwis2);
        serwis.setDzialanie(dzialanie);
        Integer expected = 1;

        Integer actual = serwis.dodajLiczbyPobraneSkads();

        assertEquals(expected, actual);
    }

    @Test
    void podzielLiczbyPobraneSkadsTest1() {
        doReturn(12).when(serwis1).pobierzLiczbe();
        doReturn(4).when(serwis2).pobierzLiczbe();
        doCallRealMethod().when(dzialanie).podziel(anyInt(), anyInt());
        Serwis serwis = new Serwis();
        serwis.setSerwis1(serwis1);
        serwis.setSerwis2(serwis2);
        serwis.setDzialanie(dzialanie);
        Integer expected = 3;

        Integer actual = serwis.podzielLiczbyPobraneSkads();

        assertEquals(expected, actual);
    }


    @Test
    void podzielLiczbyPobraneSkadsTest2() {
        doReturn(12).when(serwis1).pobierzLiczbe();
        doReturn(0).when(serwis2).pobierzLiczbe();
        doThrow(new RuntimeException("dzielenie przez 0 ")).when(dzialanie).podziel(anyInt(), eq(0));
        Serwis serwis = new Serwis();
        serwis.setSerwis1(serwis1);
        serwis.setSerwis2(serwis2);
        serwis.setDzialanie(dzialanie);

        Executable executable = () -> serwis.podzielLiczbyPobraneSkads();

        assertDoesNotThrow(executable);
    }
}
package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

class DzialanieDodajLiczbyPobraneSkadsTest {

    @Mock
    Serwis1 serwis1;

    @Mock
    Serwis2 serwis2;

    @Mock
    Dodawanie dodawanie;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void dodajLiczbyPobraneSkadsTest1() {
        doReturn(12).when(serwis1).pobierzLiczbe();
        doReturn(34).when(serwis2).pobierzLiczbe();
        doReturn(1).when(dodawanie).dodaj(anyInt(), anyInt());
        Dzialanie dzialanie = new Dzialanie();
        dzialanie.setSerwis1(serwis1);
        dzialanie.setSerwis2(serwis2);
        dzialanie.setDodawanie(dodawanie);
        Integer expected = 1;

        Integer actual = dzialanie.dodajLiczbyPobraneSkads();

        assertEquals(expected, actual);
    }

    @Test
    void podzielLiczbyPobraneSkadsTest1() {
        doReturn(12).when(serwis1).pobierzLiczbe();
        doReturn(0).when(serwis2).pobierzLiczbe();
        doThrow(new RuntimeException("dzielenie przez 0 ")).when(dodawanie).podziel(anyInt(), eq(0));
        Dzialanie dzialanie = new Dzialanie();
        dzialanie.setSerwis1(serwis1);
        dzialanie.setSerwis2(serwis2);
        dzialanie.setDodawanie(dodawanie);

        Executable executable = () -> dzialanie.podzielLiczbyPobraneSkads();

        assertDoesNotThrow(executable);
    }
}
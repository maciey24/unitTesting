package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DzialanieDodajLiczbyPobraneSkadsTest {

    //tak się nie robi, ale to przykład:
    class Serwis3 extends Serwis1 {
        @Override
        public Integer pobierzLiczbe() {
            return 100;
        }
    }

    class Serwis4 extends Serwis2 {
        @Override
        public Integer pobierzLiczbe() {
            return 200;
        }
    }

    @Test
    void dodajLiczbyPobraneSkadsTest1() {
        Serwis1 serwis1 = new Serwis3();
        Serwis2 serwis2 = new Serwis4();
        Dzialanie dzialanie = new Dzialanie();
        dzialanie.setSerwis1(serwis1);
        dzialanie.setSerwis2(serwis2);
        Integer expected = 300;

        Integer actual = dzialanie.dodajLiczbyPobraneSkads();

        assertEquals(expected, actual);
    }

}
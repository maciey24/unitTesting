package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SpringIntegrationTest {
    @Autowired
    Serwis serwis;

    @Test
    void testIntegracyjny() {
        assertThrows(RuntimeException.class, () -> serwis.dodajLiczbyPobraneSkads());
    }
}

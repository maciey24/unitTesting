package com.example.demo;

//klasa nie może być final, czyli w kotlinie - powinna być open, jeśli chcemy ją mockować
public class Dzialanie {

    //metody nie powinny być prywatne, ani statyczne
    public Integer dodaj(final Integer a, final Integer b) {
        return a + b;
    }

    public Integer podziel(final Integer a, final Integer b) {
        return a / b;
    }

}

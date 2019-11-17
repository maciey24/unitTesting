package com.example.demo;

import org.springframework.stereotype.Service;

@Service
//klasa nie może być final, czyli w kotlinie - powinna być open, jeśli chcemy ją mockować
public class Dzialanie {

    //metody nie powinny być prywatne, ani statyczne,
    //dlatego singletony implementuje się za pomocą obiektów, i dlatego w ogóle używa się Spring'a
    public Integer dodaj(final Integer a, final Integer b) {
        return a + b;
    }

    public Integer podziel(final Integer a, final Integer b) {
        return a / b;
    }

}

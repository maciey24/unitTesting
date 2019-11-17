package com.example.demo;

import org.springframework.stereotype.Service;

@Service
//klasa nie może być final, czyli w kotlinie - powinna być open, jeśli chcemy ją mockować
public class Serwis1 {
    public Integer pobierzLiczbe() {
        //załóżmy że tutaj znajduje się bardzo złożona logika
        //dotycząca połączenia z zewnętrznym systemem
        throw new RuntimeException();
    }
}

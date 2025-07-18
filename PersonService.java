package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String greet(Person person) {
        return switch (person) {
            case Person(String name, int age) when age < 18 -> "Hey " + name + ", you're a minor!";
            case Person(String name, int age) when age < 60 -> "Hello " + name + ", you're an adult!";
            case Person(String name, int age) -> "Greetings " + name + ", you're a senior citizen!";
        };
    }
}

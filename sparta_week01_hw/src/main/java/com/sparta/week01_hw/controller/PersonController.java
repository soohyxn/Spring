package com.sparta.week01_hw.controller;

import com.sparta.week01_hw.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPersons() {
        Person person = new Person();
        person.setName("장수현");
        person.setAge(24);
        person.setAddress("서울");
        person.setJob("학생");
        return person;
    }
}

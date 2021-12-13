package com.bridgelabz.restapicalls.model;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;

public class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, 
                            @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " From bridgeLabz";
    }

}

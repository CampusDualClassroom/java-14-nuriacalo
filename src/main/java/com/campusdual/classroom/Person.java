package com.campusdual.classroom;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getDetails() {
        String details = "Name: " + name + ", surname: " + surname;
        System.out.println(details);
        return details;
    }
}

package com.campusdual.classroom;

public class Teacher extends Person {

    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    @Override
    public String getDetails() {
        String details = "Teacher. " + "Name: " + name + ", surname: " + surname + ", area: " + area;
        System.out.println(details);
        return details;
    }
}

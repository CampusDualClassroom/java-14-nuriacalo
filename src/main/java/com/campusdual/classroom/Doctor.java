package com.campusdual.classroom;

public class Doctor extends Person {

    protected String specialization;

    public Doctor(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    @Override
    public String getDetails() {
        String details = "Doctor. " + "Name: " + name + ", surname: " + surname + ", specialization: " + specialization;
        System.out.println(details);
        return details;
    }

}

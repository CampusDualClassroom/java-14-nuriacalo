package com.campusdual.classroom;

public class PoliceOfficer extends Person {

    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    @Override
    public String getDetails() {
        String details = "PoliceOfficer. " + "Name: " + name + ", surname: " + surname + ", squad: " + squad;
        System.out.println(details);
        return details;
    }
}

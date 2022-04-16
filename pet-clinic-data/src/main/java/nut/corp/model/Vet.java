package nut.corp.model;

import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

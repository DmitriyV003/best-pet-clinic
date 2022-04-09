package nut.corp.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private my.petclinic.model.Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public my.petclinic.model.Owner getOwner() {
        return owner;
    }

    public void setOwner(my.petclinic.model.Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

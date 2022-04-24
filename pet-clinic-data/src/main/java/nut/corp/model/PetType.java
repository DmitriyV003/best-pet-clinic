package nut.corp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pet_types")
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "petType")
    private Set<Pet> pets;

    public PetType(String name) {
        this.name = name;
    }

    public PetType() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

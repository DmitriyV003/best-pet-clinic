package nut.corp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
}

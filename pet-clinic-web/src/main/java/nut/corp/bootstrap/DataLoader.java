package nut.corp.bootstrap;

import nut.corp.model.*;
import nut.corp.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(
            OwnerService ownerService,
            VetService vetService,
            PetTypeService petTypeService,
            PetService petService,
            SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType petType1 = new PetType("type1");
        petTypeService.save(petType1);
        PetType petType2 = new PetType("type2");
        petTypeService.save(petType2);

        Owner owner1 = new Owner("Bob", "dsgf");
        Pet pet1 = new Pet(petType1);
        pet1.setOwner(owner1);
        owner1.getPets().add(pet1);
        ownerService.save(owner1);

        Owner owner2 = new Owner("John", "erw4r34");
        Pet pet2 = new Pet(petType2);
        pet2.setOwner(owner2);
        owner2.getPets().add(pet2);
        ownerService.save(owner2);

        Owner owner3 = new Owner("Maki", "4fgte4r");
        ownerService.save(owner3);

        Speciality speciality1 = new Speciality();
        speciality1.setDescription("sfdfvsdfs");
        specialityService.save(speciality1);

        Speciality speciality2 = new Speciality();
        speciality2.setDescription("fewfe");
        specialityService.save(speciality2);

        Speciality speciality3 = new Speciality();
        speciality3.setDescription("12e2w3r");
        specialityService.save(speciality3);

        Vet vet1 = new Vet("Bob", "dsgf");
        vet1.getSpecialities().add(speciality1);
        vetService.save(vet1);

        Vet vet2 = new Vet("John", "erw4r34");
        vet2.getSpecialities().add(speciality2);
        vetService.save(vet2);

        Vet vet3 = new Vet("Maki", "4fgte4r");
        vet3.getSpecialities().add(speciality3);
        vetService.save(vet3);

        System.out.println("Data loaded");
    }
}

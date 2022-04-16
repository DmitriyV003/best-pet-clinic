package nut.corp.bootstrap;

import nut.corp.model.Owner;
import nut.corp.model.PetType;
import nut.corp.model.Vet;
import nut.corp.services.OwnerService;
import nut.corp.services.PetTypeService;
import nut.corp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType petType1 = new PetType("type1");
        petTypeService.save(petType1);
        PetType petType2 = new PetType("type2");
        petTypeService.save(petType2);

        Owner owner1 = new Owner("Bob", "dsgf");
        ownerService.save(owner1);

        Owner owner2 = new Owner("John", "erw4r34");
        ownerService.save(owner2);

        Owner owner3 = new Owner("Maki", "4fgte4r");
        ownerService.save(owner3);

        Vet vet1 = new Vet("Bob", "dsgf");
        vetService.save(vet1);

        Vet vet2 = new Vet("John", "erw4r34");
        vetService.save(vet2);

        Vet vet3 = new Vet("Maki", "4fgte4r");
        vetService.save(vet3);

        System.out.println("Data loaded");
    }
}

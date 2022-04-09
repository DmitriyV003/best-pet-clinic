package nut.corp.bootstrap;

import nut.corp.model.Owner;
import nut.corp.model.Vet;
import nut.corp.services.OwnerService;
import nut.corp.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Bob", "dsgf");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner("John", "erw4r34");
        owner1.setId(2L);
        ownerService.save(owner2);

        Owner owner3 = new Owner("Maki", "4fgte4r");
        owner1.setId(3L);
        ownerService.save(owner3);

        Vet vet1 = new Vet("Bob", "dsgf");
        owner1.setId(1L);
        vetService.save(vet1);

        Vet vet2 = new Vet("John", "erw4r34");
        owner1.setId(2L);
        vetService.save(vet2);

        Vet vet3 = new Vet("Maki", "4fgte4r");
        owner1.setId(3L);
        vetService.save(vet3);

        System.out.println("Data loaded");
    }
}

package nut.corp.services.map.jpa;

import nut.corp.model.Owner;
import nut.corp.repositories.OwnerRepository;
import nut.corp.repositories.PetRepository;
import nut.corp.repositories.PetTypeRepository;
import nut.corp.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("dev")
public class OwnerServiceJpa implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerServiceJpa(
            OwnerRepository ownerRepository
    ) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}

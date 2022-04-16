package nut.corp.services.map;

import nut.corp.model.Pet;
import nut.corp.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
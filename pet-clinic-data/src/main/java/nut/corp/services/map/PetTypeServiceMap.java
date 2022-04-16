package nut.corp.services.map;

import nut.corp.model.PetType;
import nut.corp.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

}

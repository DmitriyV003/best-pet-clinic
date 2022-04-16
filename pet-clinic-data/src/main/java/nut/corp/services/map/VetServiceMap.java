package nut.corp.services.map;

import nut.corp.model.Vet;
import nut.corp.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

}

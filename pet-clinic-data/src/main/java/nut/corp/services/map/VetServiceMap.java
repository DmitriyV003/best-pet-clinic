package nut.corp.services.map;

import nut.corp.model.Speciality;
import nut.corp.model.Vet;
import nut.corp.services.SpecialityService;
import nut.corp.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(s -> {
                if (s.getId() == null) {
                    Speciality saved = specialityService.save(s);
                    saved.setId(saved.getId());
                }
            });
        }

        return super.save(object);
    }
}

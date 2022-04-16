package nut.corp.services.map;

import nut.corp.model.Speciality;
import nut.corp.services.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
}

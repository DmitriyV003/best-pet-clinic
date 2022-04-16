package nut.corp.services.map;

import nut.corp.model.Owner;
import nut.corp.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

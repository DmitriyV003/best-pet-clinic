package nut.corp.controllers;

import nut.corp.model.Vet;
import nut.corp.services.VetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/vets")
@RestController
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(value = "/vets", method = RequestMethod.GET)
    public Collection<Vet> index() {
        return vetService.findAll();
    }
}

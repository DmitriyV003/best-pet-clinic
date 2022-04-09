package nut.corp.controllers;

import nut.corp.model.Owner;
import nut.corp.services.OwnerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/owners")
@RestController
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(value = "/owners", method = RequestMethod.GET)
    public Collection<Owner> index(Model model) {
        return ownerService.findAll();
    }
}

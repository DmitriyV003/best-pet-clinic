package nut.corp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OwnerController {

    @RequestMapping(value = "/owners", method = RequestMethod.GET)
    public String index() {
        return "Owner Page";
    }
}

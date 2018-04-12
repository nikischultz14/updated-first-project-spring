package com.nikischultz.firstprojectspring.controllers;

import com.nikischultz.firstprojectspring.model.Contact;
import com.nikischultz.firstprojectspring.model.Person;
import com.nikischultz.firstprojectspring.repositories.ContactRepository;
import com.nikischultz.firstprojectspring.repositories.PersonRepository;
import com.nikischultz.firstprojectspring.services.ContactService;
import com.nikischultz.firstprojectspring.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PeopleController {

    private final PersonService personService;
    private final ContactService contactService;

    public PeopleController(PersonService personService, ContactService contactService) {
        this.personService = personService;
        this.contactService = contactService;
    }

    @RequestMapping(value = "/peopleHome")
    public String peopleHome() {
        return "peopleHome";
    }

    @GetMapping(value = "/peopleHome")
    public String getInfo( Model model) {
        model.addAttribute("contact", new Contact());

        return "peopleHome";
    }

    @PostMapping(value = "/peopleHome")
    public String insertPerson(Contact contact, Model model) {
        personService.savePerson(contact);
        model.addAttribute("contact", new Contact());
        return "peopleHome";
    }

}

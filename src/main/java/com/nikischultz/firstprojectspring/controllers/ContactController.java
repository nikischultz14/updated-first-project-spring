package com.nikischultz.firstprojectspring.controllers;

import com.nikischultz.firstprojectspring.model.Contact;
import com.nikischultz.firstprojectspring.repositories.ContactRepository;
import com.nikischultz.firstprojectspring.repositories.PersonRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    private final ContactRepository contactRepository;
    private final PersonRepository personRepository;

    public ContactController(ContactRepository contactRepository, PersonRepository personRepository) {
        this.contactRepository = contactRepository;
        this.personRepository = personRepository;
    }

    @RequestMapping(value = "/contactList")
    public String contact() {
        return "contactList";
    }

    @GetMapping(value = "/contactList")
    public String getContact(Contact contact, Model model) {
        model.addAttribute("contact", contactRepository.findAll());
        model.addAttribute("person", personRepository.findAll());

        return "contactList";
    }


}

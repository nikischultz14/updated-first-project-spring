package com.nikischultz.firstprojectspring.controllers;

import com.nikischultz.firstprojectspring.model.Contact;
import com.nikischultz.firstprojectspring.repositories.ContactRepository;
import com.nikischultz.firstprojectspring.repositories.PersonRepository;
import com.nikischultz.firstprojectspring.services.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {

    private final ContactService contactService;
    private final ContactRepository contactRepository;

    public ContactController(ContactService contactService, ContactRepository contactRepository) {
        this.contactService = contactService;
        this.contactRepository = contactRepository;
    }

    //Add a Person
    @GetMapping(value = "/peopleHome")
    public String getInfo( Model model) {
        model.addAttribute("contact", new Contact());

        return "peopleHome";
    }

    @PostMapping(value = "/peopleHome")
    public String insertPerson(Contact contact, Model model) {
        contactRepository.save(contact);
        model.addAttribute("contact", new Contact());

        String info = String.format("submission: " + contact.getId() + " " + contact.getAge() + " " + contact.getFirstName());
        System.out.println(info);

        return "peopleHome";
    }

    //List out Contacts
    @RequestMapping(value = "/contactList")
    public String contact() {
        return "contactList";
    }

    //get all contacts
    @GetMapping(value = "/contactList")
    public String getContact(Contact contact, Model model) {

        model.addAttribute("contact", contactService.listAllContacts());
        return "contactList";
    }

    //update contact
    @GetMapping(value = "/updatePerson/{id}")
    public String getContact(@PathVariable int id, Model model) {
        model.addAttribute("contact", contactService.getContactById(id));

        return "updatePerson";
    }

    @PostMapping(value = "/updatePerson")
    public String updatePerson( Contact contact, Model model) {
        contactRepository.save(contact);
        model.addAttribute("contact", new Contact());

        String info = String.format("update: " + contact.getId() + " " + contact.getAge() + " " + contact.getFirstName());
        System.out.println(info);

        return "redirect:/contactList";
    }

    //delete contact
    @GetMapping(value = "/delete/{id}")
    public String deleteContact(@PathVariable int id) {
        contactService.deleteContact(id);
        return "redirect:/contactList";
    }

}

package com.nikischultz.firstprojectspring.services.impl;

import com.nikischultz.firstprojectspring.model.Contact;
import com.nikischultz.firstprojectspring.repositories.ContactRepository;
import com.nikischultz.firstprojectspring.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;


    @Override
    public Iterable<Contact> listAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<Contact> getContactById(Integer id) {
        return contactRepository.findById(id);
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Iterable<Contact> saveContactList(Iterable<Contact> contactIterable) {
        return contactRepository.saveAll(contactIterable);
    }

    @Override
    public void deleteContact(Integer id) {
        contactRepository.deleteById(id);
    }
}

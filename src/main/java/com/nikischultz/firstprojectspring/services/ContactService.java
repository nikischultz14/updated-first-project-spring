package com.nikischultz.firstprojectspring.services;

import com.nikischultz.firstprojectspring.model.Contact;

import java.util.Optional;

public interface ContactService {

    Iterable<Contact> listAllContacts();

    Optional<Contact> getContactById(Integer id);

    Contact saveContact(Contact contact);

    Iterable<Contact> saveContactList(Iterable<Contact> contactIterable);

    void deleteContact(Integer id);
}

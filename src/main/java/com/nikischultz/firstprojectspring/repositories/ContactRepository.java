package com.nikischultz.firstprojectspring.repositories;

import com.nikischultz.firstprojectspring.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}

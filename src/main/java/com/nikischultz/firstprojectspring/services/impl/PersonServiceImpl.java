package com.nikischultz.firstprojectspring.services.impl;

import com.nikischultz.firstprojectspring.model.Person;
import com.nikischultz.firstprojectspring.repositories.PersonRepository;
import com.nikischultz.firstprojectspring.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public Iterable<Person> listAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getPersonById(Integer id) {
        return personRepository.findById(id);
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Iterable<Person> savePersonList(Iterable<Person> personIterable) {
        return personRepository.saveAll(personIterable);
    }

    @Override
    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }
}

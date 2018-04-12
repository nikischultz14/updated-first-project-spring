package com.nikischultz.firstprojectspring.services;

import com.nikischultz.firstprojectspring.model.Person;

import java.util.Optional;

public interface PersonService {

    Iterable<Person> listAllPersons();

    Optional<Person> getPersonById(Integer id);

    Person savePerson(Person person);

    Iterable<Person> savePersonList(Iterable<Person> personIterable);

    void deletePerson(Integer id);
}

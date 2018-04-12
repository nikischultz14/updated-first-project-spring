package com.nikischultz.firstprojectspring.bootstrap;

import com.nikischultz.firstprojectspring.model.Contact;
import com.nikischultz.firstprojectspring.model.Person;
import com.nikischultz.firstprojectspring.repositories.ContactRepository;
import com.nikischultz.firstprojectspring.repositories.PersonRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final ContactRepository contactRepository;
    private final PersonRepository personRepository;

    public PeopleBootstrap(ContactRepository contactRepository, PersonRepository personRepository) {
        this.contactRepository = contactRepository;
        this.personRepository = personRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        contactRepository.saveAll(personRepository.saveAll(getPeople()));
    }

    private List<Contact>  getPeople() {
        List<Contact> people = new ArrayList<>();

        Contact numeroOne = new Contact();
        numeroOne.setFirstName("Niki");
        numeroOne.setLastName("Schultz");
        numeroOne.setAge(27);
        numeroOne.setGender("F");
        numeroOne.setPhoneNumber("123-333-5445");
        numeroOne.setEmailAddress("niki@me.com");
        numeroOne.setCity("Saint Paul");
        numeroOne.setState("MN");

        Contact numeroTwo = new Contact();
        numeroTwo.setFirstName("Zach");
        numeroTwo.setLastName("Thayer");
        numeroTwo.setAge(27);
        numeroTwo.setGender("M");
        numeroTwo.setPhoneNumber("567-999-4545");
        numeroTwo.setEmailAddress("zach@me.com");
        numeroTwo.setCity("Minneapolis");
        numeroTwo.setState("MN");

        people.add(numeroOne);
        people.add(numeroTwo);


        return people;
    }




}

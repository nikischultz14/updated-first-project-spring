package com.nikischultz.firstprojectspring.repositories;

import com.nikischultz.firstprojectspring.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {




}

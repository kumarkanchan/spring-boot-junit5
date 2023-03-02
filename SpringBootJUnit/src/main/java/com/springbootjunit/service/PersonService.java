package com.springbootjunit.service;

import com.springbootjunit.entity.Person;
import com.springbootjunit.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired(required = true)
    private PersonRepo personRepo;

    public List<Person> getAllPerson() {
        return this.personRepo.findAll();
    }
}

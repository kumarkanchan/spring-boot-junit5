package com.springbootjunit.service;

import com.springbootjunit.repo.PersonRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class) //If don't want to use @ExtendWith then use AutoCloseable.
class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;
    private PersonService personService;

    //AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        //autoCloseable = MockitoAnnotations.openMocks(this);
        this.personService = new PersonService(this.personRepo);
    }

    @AfterEach
    void tearDown() throws Exception {
        //this.autoCloseable.close();
    }

    @Test
    void getAllPerson() {
        personService.getAllPerson();
        verify(personRepo).findAll();
    }
}

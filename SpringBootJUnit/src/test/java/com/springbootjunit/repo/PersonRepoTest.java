package com.springbootjunit.repo;

import com.springbootjunit.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(classes = PersonRepo.class)
class PersonRepoTest {
    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExitsByIdTest() {
        Person person = new Person(101, "Kumar",  "Bengaluru");
        personRepo.save(person);

        Boolean actualResult = personRepo.isPersonExitsById(101);
        assertThat(actualResult).isTrue();

    }
}
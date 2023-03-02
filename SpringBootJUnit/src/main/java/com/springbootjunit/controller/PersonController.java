package com.springbootjunit.controller;

import com.springbootjunit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllPerson() {
        return ResponseEntity.ok(this.personService.getAllPerson());
    }
}

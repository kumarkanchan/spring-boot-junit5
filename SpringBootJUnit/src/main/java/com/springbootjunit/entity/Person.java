package com.springbootjunit.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Person {
    @Id
    private Integer personId;
    private String personName;
    private String personCity;
}

package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor

//@NamedStoredProcedureQuery(
//        name = "Person.verPersonas",
//        procedureName = "verPersonas",
//        resultClasses = Person.class
//)

@NamedStoredProcedureQuery(
        name = "Person.buscarPersona",
        procedureName = "buscarPersona",
        resultClasses = Person.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "person_id", type = Long.class)
        }
)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
}

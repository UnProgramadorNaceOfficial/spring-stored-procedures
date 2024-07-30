package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    /* SIN PARAMETROS */

    // Forma #1
    /* @Procedure(procedureName = "Person.verPersonas")
    List<Person> verPersonas();
     */

    // Forma #2
    /* @Query(value = "CALL verPersonas()", nativeQuery = true)
    List<Person> verPersonas();
     */

    /* Forma #3
    @Procedure(procedureName = "verPersonas")
    List<Person> verPersonas();
     */

    // Forma #4
    @Procedure
    List<Person> verPersonas();


    /* CON PARAMETROS */

    // Forma #1
    @Procedure(procedureName = "Person.buscarPersona")
    Person buscarPersona(@Param("person_id") Long personId);


    // Forma #2
    /* @Procedure(name = "Customer.buscarPersona")
    Person buscarPersona(@Param("person_id") Long personId);
     */

    // Forma #3
    /* @Query(value = "CALL buscarPersona(:person_id)", nativeQuery = true)
    Person buscarPersona(@Param("person_id") Long personId);
     */

    // Forma #4
    /* @Procedure
    Person buscarPersona(Long personId);
     */
}

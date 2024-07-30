package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    private final PersonRepository personRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        List<Person> personList = this.personRepository.verPersonas();
//
//        log.info("\n");
//        personList.forEach(p -> log.info(p.toString()));

        Person person = this.personRepository.buscarPersona(1L);
        log.info("\n");
        log.info("Persona: " + person);
    }
}

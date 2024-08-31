package ru.otus.java.basic.safarov.homework11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDataBaseTest {
    private final PersonDataBase persons = new PersonDataBase();


    @BeforeEach
    void setUp() {
        for (int i = 1; i < 5; i++) {
            persons.add(new Person("user" + i, (long) i));
        }
    }




    @Test
    void findById() {
        assertEquals(2L, persons.findById(2L).getId());
    }

    @Test
    void findByIdNotFound() {
        assertNull(persons.findById(6L));
    }

    @Test
    void isManager() {
        Person person = persons.findById(1L);
        person.setPosition(Position.MANAGER);
        assertTrue(persons.isManager(person));
    }

    @Test
    void isManagerFalse() {
        Person person = persons.findById(1L);
        person.setPosition(Position.DRIVER);
        assertFalse(persons.isManager(person));
    }

    @Test
    void isEmployee() {
        Person person = persons.findById(1L);
        person.setPosition(Position.QA);
        assertTrue(persons.isEmployee(1L));
    }

    @Test
    void isEmployeeFalse() {
        Person person = persons.findById(1L);
        person.setPosition(Position.SENIOR_MANAGER);
        assertFalse(persons.isEmployee(1L));
    }
}
package ru.otus.java.basic.safarov.homework10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(0, phoneBook.getPhonebook().size());

        phoneBook.add(new Person("name", "surname", "patronymic"), 123456);
        assertEquals(1, phoneBook.getPhonebook().size());
    }

    @Test
    void find() {
        phoneBook.add(new Person("name", "surname", "patronymic"), 123456);
        phoneBook.add(new Person("name2", "surname", "patronymic"), 100000);
        phoneBook.add(new Person("name", "surname2", "patronymic"), 444444);
        assertEquals("123456 100000 ", phoneBook.find("surname"));
    }

    @Test
    void findError() {
        phoneBook.add(new Person("name", "surname", "patronymic"), 123456);
        assertEquals("В телефонной книге нет человека с фамилией user2",phoneBook.find("user2"));
    }

    @Test
    void containsPhoneNumber(){
        phoneBook.add(new Person("name", "surname", "patronymic"), 123456);
        phoneBook.add(new Person("name", "surname", "patronymic"), 100000);
        phoneBook.add(new Person("name", "surname2", "patronymic"), 444444);
        assertTrue(phoneBook.containsPhoneNumber(100000));
    }

    @Test
    void containsPhoneNumberFalse(){
        phoneBook.add(new Person("name", "surname", "patronymic"), 123456);
        phoneBook.add(new Person("name", "surname", "patronymic"), 100000);
        phoneBook.add(new Person("name", "surname2", "patronymic"), 444444);
        assertFalse(phoneBook.containsPhoneNumber(999999));
    }
}
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

    @Test
    void add() {
        assertEquals(0, phoneBook.getPhonebook().size());
        phoneBook.add("user", "123456");
        assertEquals(1, phoneBook.getPhonebook().size());
    }

    @Test
    void find() {
        phoneBook.add("user", "123456");
        phoneBook.add("user", "000001");
        phoneBook.add("user", "44444");
        System.out.println(phoneBook.find("user"));
        assertEquals("[44444, 000001, 123456]", phoneBook.find("user"));
    }

    @Test
    void findError() {
        phoneBook.add("user", "123456");
        assertNull(phoneBook.find("user2"));
    }


    @Test
    void containsPhoneNumber(){
        phoneBook.add("user", "123456");
        phoneBook.add("user", "000001");
        phoneBook.add("user1", "44444");
        assertTrue(phoneBook.containsPhoneNumber("000001"));
    }

    @Test
    void containsPhoneNumberFalse(){
        phoneBook.add("user", "123456");
        phoneBook.add("user", "000001");
        phoneBook.add("user1", "44444");
        assertFalse(phoneBook.containsPhoneNumber("000002"));
    }
}
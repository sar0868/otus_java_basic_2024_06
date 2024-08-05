package ru.otus.java.basic.safarov.homework06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat;

    @BeforeEach
    void setUp() {
        cat = new Cat("Cat", 10);
    }


    @Test
    void eat() {
        cat.eat(10);
        assertTrue(cat.isSatiety());
    }

    @Test
    void eatPlateLtAppetite() {
        cat.eat(9);
        assertFalse(cat.isSatiety());
    }

    @Test
    void eatPlateGtAppetite() {
        cat.eat(11);
        assertTrue(cat.isSatiety());
    }
}
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
        Plate plate = new Plate(10);
        cat.eat(plate);
        assertTrue(cat.isSatiety());
    }

    @Test
    void eatPlateLtAppetite() {
        Plate plate = new Plate(9);
        cat.eat(plate);
        assertFalse(cat.isSatiety());
    }

    @Test
    void eatPlateGtAppetite() {
        Plate plate = new Plate(11);
        cat.eat(plate);
        assertTrue(cat.isSatiety());
    }
}
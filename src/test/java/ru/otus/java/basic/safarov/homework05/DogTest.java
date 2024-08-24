package ru.otus.java.basic.safarov.homework05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog("Барбос", 3, 1, 4);
    }

    @Test
    void run(){
        assertEquals(1, dog.run(3));
    }

    @Test
    void runTyred(){
        dog.info();
        assertEquals(-1, dog.run(5));
        dog.info();
    }

    @Test
    void swim(){
        assertEquals(2, dog.swim(2));
    }

    @Test
    void swimTyred(){
        dog.info();
        assertEquals(-1, dog.swim(5));
        dog.info();
    }
}
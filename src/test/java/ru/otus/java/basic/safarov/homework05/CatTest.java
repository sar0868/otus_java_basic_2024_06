package ru.otus.java.basic.safarov.homework05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        cat = new Cat("Мурзик", 1, 4);
    }

    @Test
    void run(){
        assertEquals(3, cat.run(3));
    }

    @Test
    void runTyred(){
        cat.info();
        assertEquals(-1, cat.run(5));
        cat.info();
    }

    @Test
    void swim(){
        assertEquals(-1, cat.swim(3));
    }
}
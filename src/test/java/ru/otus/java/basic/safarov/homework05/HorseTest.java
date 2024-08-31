package ru.otus.java.basic.safarov.homework05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    Horse horse;

    @BeforeEach
    void setUp() {
        horse = new Horse("BoJack", 15, 4, 100);
    }


    @Test
    void run(){
        assertEquals(1, horse.run(15));
    }

    @Test
    void runTyred(){
        horse.info();
        assertEquals(-1, horse.run(200));
        horse.info();
    }

    @Test
    void swim(){
        assertEquals(2, horse.swim(8));
    }

    @Test
    void swimTyred(){
        horse.info();
        assertEquals(-1, horse.swim(26));
        horse.info();
    }
}
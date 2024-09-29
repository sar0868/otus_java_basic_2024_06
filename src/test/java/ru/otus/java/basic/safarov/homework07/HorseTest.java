package ru.otus.java.basic.safarov.homework07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HorseTest {
    Human human;
    Horse horse;
    int distanceSuccessful = 5;
    int distanceFail = 100;

    @BeforeEach
    void setUp() {
        human = new Human("user");
        horse = new Horse("bojack", 20, 2);
        human.onTransport(horse);
    }


    @Test
    void movePlain(){
        assertTrue(human.moving(distanceSuccessful, Terrain.PLAIN));
    }

    @Test
    void movePlainError(){
        assertFalse(human.moving(distanceFail, Terrain.SWAMP));
    }

    @Test
    void moveDenseForest(){
        assertTrue(human.moving(distanceSuccessful, Terrain.DENSE_FOREST));
    }

    @Test
    void moveDenseForestError(){
        assertFalse(human.moving(distanceFail, Terrain.DENSE_FOREST));
    }

    @Test
    void moveSwamp(){
        assertFalse(human.moving(distanceSuccessful, Terrain.SWAMP));
    }
}
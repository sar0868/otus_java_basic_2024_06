package ru.otus.java.basic.safarov.homework07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {
    Human human;
    Bicycle bicycle;
    int distanceSuccessful = 10;
    int distanceFail = 1000;

    @BeforeEach
    void setUp() {
        human = new Human("user");
        bicycle = new Bicycle("bicycle", 1, 1);
        human.onTransport(bicycle);
    }

    @Test
    void getPowerHuman() {
        human.moving(10, Terrain.PLAIN);
        assertEquals(90, human.getPower());
    }

    void movePlain(){
        assertTrue(human.moving(distanceSuccessful, Terrain.PLAIN));
    }

    @Test
    void movePlainError(){
        assertFalse(human.moving(distanceFail, Terrain.PLAIN));
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
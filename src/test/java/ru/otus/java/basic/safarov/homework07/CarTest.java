package ru.otus.java.basic.safarov.homework07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car("car", 10, 1);
    int distanceSuccessful = 10;
    int distanceFail = 100;


    @Test
    void moveDenseForest() {
        int distance = 1;
        assertFalse(car.moveDenseForest(distance));
    }

    @Test
    void movePlain() {
        assertTrue(car.movePlain(distanceSuccessful));
    }

    @Test
    void movePlainFail() {
        assertFalse(car.movePlain(distanceFail));
    }

    @Test
    void moveSwamp() {
        assertFalse(car.moveSwamp(distanceSuccessful));
    }
}
package ru.otus.java.basic.safarov.homework07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllTerrainVehicleTest {

    AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle("Путешественник-1", 100, 10);
    int distanceSuccessful = 10;
    int distanceFail = 100;

    @Test
    void moveDenseForest() {
        assertTrue(allTerrainVehicle.move(distanceSuccessful, Terrain.DENSE_FOREST));
    }

    @Test
    void moveDenseForestError() {
        assertFalse(allTerrainVehicle.move(distanceFail, Terrain.DENSE_FOREST));
    }

    @Test
    void movePlain() {
        assertTrue(allTerrainVehicle.move(distanceSuccessful, Terrain.PLAIN));
    }

    @Test
    void movePlainFail() {
        assertFalse(allTerrainVehicle.move(distanceFail, Terrain.PLAIN));
    }

    @Test
    void moveSwamp() {
        assertTrue(allTerrainVehicle.move(distanceSuccessful, Terrain.SWAMP));
    }

    @Test
    void moveSwampFail() {
        assertFalse(allTerrainVehicle.move(distanceFail, Terrain.SWAMP));
    }
}
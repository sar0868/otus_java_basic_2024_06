package ru.otus.java.basic.safarov.homework07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human = new Human("name");
    Car car = new Car("car", 10, 1);
    Horse horse = new Horse("horse", 10, 5);
    Bicycle bicycle = new Bicycle("bicycle", 20, 10);



    @org.junit.jupiter.api.Test
    void onTransport() {
        human.onTransport(car);
        assertTrue(human.isOnTransport());
    }

    @Test
    void onTransportError(){
        human.onTransport(car);
        human.onTransport(horse);
        assertEquals("car", human.getCurrentTransport().getName());
    }

    @Test
    void ofTransport() {
        human.onTransport(car);
        assertTrue(human.isOnTransport());
        human.ofTransport();
        assertFalse(human.isOnTransport());
    }

    @org.junit.jupiter.api.Test
    void movingWalk() {
        assertTrue(human.moving(1, Terrain.PLAIN));
    }

    @org.junit.jupiter.api.Test
    void movingCar() {
        human.onTransport(car);
        assertTrue(human.moving(1, Terrain.PLAIN));
    }

    @Test
    void movingWalkFailed(){
        assertFalse(human.moving(200, Terrain.PLAIN));
    }

    @Test
    void movingCarFail() {
        human.onTransport(car);
        assertFalse(human.moving(1, Terrain.SWAMP));
    }

    @Test
    void movingBicycle(){
        human.onTransport(bicycle);
        assertTrue(human.moving(10, Terrain.PLAIN));
    }

    @Test
    void movingBicycleFail(){
        human.onTransport(bicycle);
        assertFalse(human.moving(11, Terrain.PLAIN));
    }
}
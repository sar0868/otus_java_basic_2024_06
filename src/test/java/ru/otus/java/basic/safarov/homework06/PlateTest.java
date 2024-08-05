package ru.otus.java.basic.safarov.homework06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateTest {
    Plate plate;

    @BeforeEach
    void setUp() {
        plate = new Plate(500);
    }

    @org.junit.jupiter.api.Test
    void addPlateFull() {
        plate.add(1);
        assertEquals(500, plate.getCurrentFood());
    }

    @Test
    void add()
    {
        plate.decrease(250);
        plate.add(10);
        assertEquals(260, plate.getCurrentFood());
    }
    @org.junit.jupiter.api.Test
    void decrease() {
        assertTrue(plate.decrease(1));
        assertEquals(499, plate.getCurrentFood());
    }

    @Test
    void decreaseEmptyPlate() {
        assertFalse(plate.decrease(501));
        assertEquals(0, plate.getCurrentFood());
    }
}
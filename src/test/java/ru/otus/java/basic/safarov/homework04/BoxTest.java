package ru.otus.java.basic.safarov.homework04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    Box box;

    @BeforeEach
    void setUp() {
        box = new Box(10, 20, 5, "зелный");
    }

    @Test
    void open() {
        box.open();
        assertTrue(box.isOpen());
    }

    @Test
    void close() {
        box.open();
        box.close();
        assertFalse(box.isOpen());
    }

    @Test
    void paint() {
        box.paint("синий");
        assertEquals("синий", box.getColor());
    }

    @Test
    void put() {
        box.open();
        box.put("pen");
        assertEquals("pen", box.getInside());
    }

    @Test
    void putCloseBox() {
        box.put("pen");
        assertEquals("", box.getInside());
    }

    @Test
    void putDosNotEmptyBox() {
        box.open();
        box.put("pen");
        box.put("item");
        assertEquals("pen", box.getInside());
    }

    @Test
    void take() {
        box.open();
        box.put("item");
        String item = box.take();
        assertEquals("", box.getInside());
        assertEquals("item", item);
    }

    @Test
    void takeCloseBox() {
        box.open();
        box.put("item");
        box.close();
        String item = box.take();
        assertEquals("item", box.getInside());
        assertEquals("", item);

    }

    @Test
    void takeEmptyBox() {
        box.open();
        String item = box.take();
        assertEquals("", box.getInside());
        assertEquals("", item);
    }

}
package ru.otus.java.basic.safarov.homework04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class BoxTest {
    Box box;

    @BeforeEach
    void setUp() {
        box = new Box(10,20, 5, "зелный");
    }

    @Test
    void open(){
        box.open();
        box.open();
    }
  
}
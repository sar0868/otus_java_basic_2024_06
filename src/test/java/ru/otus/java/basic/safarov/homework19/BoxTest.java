package ru.otus.java.basic.safarov.homework19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void add() {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(1));
        assertEquals(1, appleBox.getBox().size());
    }

    @Test
    void weight() {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(1));
        appleBox.add(new Apple(10));
        assertEquals(11, appleBox.weight());
    }

    @Test
    void compare() {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3));
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(3));
        assertTrue(appleBox.compare(orangeBox));
    }

    @Test
    void compareFalse() {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3));
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(4));
        assertFalse(appleBox.compare(orangeBox));
    }

    @Test
    void copeAppleToApple() {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3));
        Box<Apple> appleBox1 = new Box<>();
        appleBox.add(new Apple(1));
        appleBox.cope(appleBox1);
        assertEquals(4, appleBox1.weight());
        assertEquals(0, appleBox.weight());
    }

    @Test
    void copeAppleOrangeToFruit() {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3));
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(1));
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.add(new Apple(2));
        appleBox.cope(fruitBox);
        orangeBox.cope(fruitBox);
        assertEquals(3, fruitBox.getBox().size());
        assertEquals(0, appleBox.getBox().size());
        assertEquals(0, orangeBox.getBox().size());
    }
}
package ru.otus.java.basic.safarov.homework22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    private ArrayOperations arrayOperations;

    @BeforeEach
    public void init() {
        arrayOperations = new ArrayOperations();
    }

    @Test
    @DisplayName("get array after 1")
    void testLastOneArray() {
        int[] inputArray = {1, 2, 1, 2, 2};
        int[] result = {2, 2};
        assertArrayEquals(result, arrayOperations.lastOneArray(inputArray));
    }

    @Test
    @DisplayName("get exception method lastOneArray(...)")
    void testLastOneArrayException() {
        int[] inputArray = {2, 2, 2};
        assertThrowsExactly(RuntimeException.class, () ->
                arrayOperations.lastOneArray(inputArray));
    }

    @Test
    @DisplayName("check for 1 and 2: {1, 2} => true")
    void testCheckOneTooTrue1() {
        int[] inputArray = {1, 2};
        assertTrue(arrayOperations.checkOneToo(inputArray));
    }


    @Test
    @DisplayName("check for 1 and 2: {1, 1} => false")
    void testCheckOneTooFalse2() {
        int[] inputArray = {1, 1};
        assertFalse(arrayOperations.checkOneToo(inputArray));
    }

    @Test
    @DisplayName("check for 1 and 2: {1, 3} => false")
    void testCheckOneTooFalse3() {
        int[] inputArray = {1, 3};
        assertFalse(arrayOperations.checkOneToo(inputArray));
    }

    @Test
    @DisplayName("check for 1 and 2: {1, 2, 2, 1} => true")
    void testCheckOneTooTrue4() {
        int[] inputArray = {1, 2, 2, 1};
        assertTrue(arrayOperations.checkOneToo(inputArray));
    }

}
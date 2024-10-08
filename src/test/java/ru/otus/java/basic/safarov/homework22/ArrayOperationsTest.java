package ru.otus.java.basic.safarov.homework22;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class ArrayOperationsTest {

    @Test
    void lastOneArray() {
        Integer[] inputArray = { 1, 2, 1, 2, 2};
        Integer[] result = {2, 2};
        assertArrayEquals(result, ArrayOperations.lastOneArray(inputArray));
    }

    @Test
    void lastOneArrayException(){
        Integer[] inputArray = {2,2,2};
        assertThrowsExactly(RuntimeException.class,() ->
                ArrayOperations.lastOneArray(inputArray));
    }

   @Test
    void checkOneTooTrue1() {
    Integer[] inputArray = {1, 2};
       assertTrue(ArrayOperations.checkOneToo(inputArray));
    }

    @Test
    void checkOneTooFalse2() {
        Integer[] inputArray = {1, 1};
        assertFalse(ArrayOperations.checkOneToo(inputArray));
    }

    @Test
    void checkOneTooFalse3() {
        Integer[] inputArray = {1, 3};
        assertFalse(ArrayOperations.checkOneToo(inputArray));
    }

    @Test
    void checkOneTooTrue4() {
        Integer[] inputArray = {1, 2, 2, 1};
        assertTrue(ArrayOperations.checkOneToo(inputArray));
    }
}
package ru.otus.java.basic.safarov.homework22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    private ArrayOperations arrayOperations;

    @BeforeEach
    public void init() {
        arrayOperations = new ArrayOperations();

    }



    @Test
    void testLastOneArray() {
        Integer[] inputArray = {1, 2, 1, 2, 2};
        Integer[] result = {2, 2};
        assertArrayEquals(result, arrayOperations.lastOneArray(inputArray));
    }

    @Test
    void testLastOneArrayException() {
        Integer[] inputArray = {2, 2, 2};
        assertThrowsExactly(RuntimeException.class, () ->
                arrayOperations.lastOneArray(inputArray));
    }

    @Test
    void testCheckOneTooTrue1() {
        Integer[] inputArray = {1, 2};
        assertTrue(arrayOperations.checkOneToo(inputArray));
    }

//    @CsvSource({
//            "{1, 2}",
//            "{1, 2, 2, 1}"
//    })

//    @ParameterizedTest
//    void testCheckOneTooTrue(Integer... inputArray) {
//
////        Integer[] inputArray = {1, 2};
//        assertTrue(arrayOperations.checkOneToo(inputArray));
//    }


    @Test
    void testCheckOneTooFalse2() {
        Integer[] inputArray = {1, 1};
        assertFalse(arrayOperations.checkOneToo(inputArray));
    }

    @Test
    void testCheckOneTooFalse3() {
        Integer[] inputArray = {1, 3};
        assertFalse(arrayOperations.checkOneToo(inputArray));
    }

    @Test
    void testCheckOneTooTrue4() {
        Integer[] inputArray = {1, 2, 2, 1};
        assertTrue(arrayOperations.checkOneToo(inputArray));
    }
}
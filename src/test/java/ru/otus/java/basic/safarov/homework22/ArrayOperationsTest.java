package ru.otus.java.basic.safarov.homework22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("arraysForCheckOneTooTrue")
    @DisplayName("check for 1 and 2: Arrays that should return true")
    void testCheckOneTooTrue(int... inputArray) {
        assertTrue(arrayOperations.containsOnlyOneAndTwo(inputArray));
    }

    @ParameterizedTest
    @MethodSource("arraysForCheckOneTooFalse")
    @DisplayName("check for 1 and 2: Arrays that should return false")
    void testCheckOneToo(int... inputArray) {
        assertFalse(arrayOperations.containsOnlyOneAndTwo(inputArray));
    }

    static Stream arraysForCheckOneTooTrue() {
        return Stream.of(
                new int[]{1, 2},
                new int[]{1, 2, 2, 1}
        );
    }

    static Stream arraysForCheckOneTooFalse() {
        return Stream.of(
                new int[]{1, 1},
                new int[]{1, 3}
        );
    }

}
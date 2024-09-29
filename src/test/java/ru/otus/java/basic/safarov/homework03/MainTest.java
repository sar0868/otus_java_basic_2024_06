package ru.otus.java.basic.safarov.homework03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @org.junit.jupiter.api.Test
    void sumOfPositiveElements() {
        int[][] arr = {{1, 2, 3}, {-1, -2, 0}};
        assertEquals(6, Main.sumOfPositiveElements(arr));
    }


    @org.junit.jupiter.api.Test
    void sumOfPositiveElementsZeroNegativeArgs() {
        int[][] arr = {{0, 0}, {-1, 0}};
        assertEquals(0, Main.sumOfPositiveElements(arr));
    }

    @Test
    void printSquareAsterisk() {
        int size = 5;
        Main.printSquareAsterisk(size);
    }

    @Test
    void zerosDiagonalsArray() {
        int[][] arr1 = {{2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 2, 2}
        };
        int[][] arr2 = {
                {0, 2, 2, 0},
                {2, 0, 0, 2},
                {2, 0, 0, 2},
                {0, 2, 2, 0},
        };
        Main.zerosDiagonalsArray(arr1);
        assertTrue(equlasArray(arr1, arr2));
    }

    boolean equlasArray(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    void findMax() {
        int[][] arr = {{1, 2, 3}, {-1, 8, 0}};
        int result = Main.findMax(arr);
        assertEquals(8, result);
    }

    @Test
    void findMaxNegativeItems() {
        int[][] arr = {{-2, -2, -3}, {-6, -8, -1}};
        int result = Main.findMax(arr);
        assertEquals(-1, result);
    }

    @Test
    void sumTwoRow() {
        int[][] arr = {{-2, -2, -3}, {-6, -8, -1}, {1, 1, 1}};
        int result = Main.sumTwoRow(arr);
        assertEquals(-15, result);
    }

    @Test
    void sumTwoRowDontTwoRow() {
        int[][] arr = {{-2, -2, -3}};
        int result = Main.sumTwoRow(arr);
        assertEquals(-1, result);
    }
}
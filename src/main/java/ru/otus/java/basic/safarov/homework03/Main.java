package ru.otus.java.basic.safarov.homework03;

public class Main {
    public static void main(String[] args) {

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquareAsterisk(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void zerosDiagonalsArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - 1 - i] = 0;
        }
    }

    public static int findMax(int[][] arr) {
        int maxItem = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxItem < arr[i][j]) {
                    maxItem = arr[i][j];
                }
            }
        }
        return maxItem;
    }

    public static int sumTwoRow(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }
}

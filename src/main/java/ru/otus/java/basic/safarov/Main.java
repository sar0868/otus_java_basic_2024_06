package ru.otus.java.basic.safarov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    }

    public static void printLineCount(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void sumItemsGTFive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArrayNumber(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
        }
    }

    public static void incrementItemsArray(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += n;
        }
    }

    public static void checkSumHalvesArray(int... array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length / 2; i++) {
            leftSum += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            rightSum += array[i];
        }
        System.out.println("Большая сумма " + (leftSum > rightSum ? "левая" : "правая"));
    }

    public static int[] sumArrays(int[]... arrays) {
        int maxLength = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxLength) {
                maxLength = arrays[i].length;
            }
        }
        int[] result = new int[maxLength];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[j].length <= i) {
                    continue;
                }
                result[i] += arrays[j][i];
            }
        }
        return result;
    }

    public static void findDotEqualHalvesArray(int... arr) {
        int i = 0;
        int j = arr.length - 1;
        int left = arr[i];
        int right = arr[j];
        while (j - i != 1) {
            if (left < right) {
                i++;
                left += arr[i];
            } else {
                j--;
                right += arr[j];
            }
        }
        if (left == right) {
            System.out.println("Точка находится между элементами " + i + " и " + j);
        } else {
            System.out.println("Точки равенства частей массива нет");
        }
    }

    public static void checkIncreaseArray(int... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Массив не возрастающий");
                return;
            }
        }
        System.out.println("Массив возрастающий");
    }

    public static int[] reverseArray(int... arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        return reverse;
    }
}

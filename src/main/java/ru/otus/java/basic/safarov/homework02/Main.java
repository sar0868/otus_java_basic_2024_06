package ru.otus.java.basic.safarov.homework02;

import java.util.Scanner;

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
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                result[j] += arrays[i][j];
            }
        }
        return result;
    }

    public static void findDotEqualHalvesArray(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int half = sum / 2;
        int leftCnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftCnt += arr[i];
            if (leftCnt == half) {
                System.out.println("Точка находится между элементами " + i + " и " + (i + 1));
            }
        }
    }

    public static void checkIncreaseArray(int... arr) {
        Scanner scanner = new Scanner(System.in);
        boolean flagChoice = false;
        while (true) {
            System.out.println("Выберите направление праверки массива на монотонность:\n" +
                    "1 - Возрастающий\n" +
                    "2 - Убывающий");
            int choice = scanner.nextInt();
            if (choice == 1) {
                flagChoice = true;
                break;
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Вы не сделали выбор между указанными значениями.\n" +
                        "Повторите выбор.");
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (flagChoice && arr[i] > arr[i + 1]) {
                System.out.println("Массив не возрастающий");
                return;
            } else if (!flagChoice && arr[i] < arr[i + 1]) {
                System.out.println("Массив не убывающий");
                return;
            }
        }
        System.out.println(flagChoice ? "Массив возрастающий" : "Массыв убывающий");
    }

    public static int[] reverseArray(int... arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        return reverse;
    }
}

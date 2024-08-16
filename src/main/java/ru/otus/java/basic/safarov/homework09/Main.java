package ru.otus.java.basic.safarov.homework09;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> listRange(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int sumItemGtFive(ArrayList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            if (item > 5) {
                sum += item;
            }
        }
        return sum;
    }
}

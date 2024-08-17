package ru.otus.java.basic.safarov.homework09;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static List<Integer> listRange(int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int sumItemGtFive(List<Integer> list) {
        int sum = 0;
        for (int item : list) {
            if (item > 5) {
                sum += item;
            }
        }
        return sum;
    }

    public static void fillListValue(List<Integer> list, int value){
        for (int items: list){
            items = value;
        }
    }
}

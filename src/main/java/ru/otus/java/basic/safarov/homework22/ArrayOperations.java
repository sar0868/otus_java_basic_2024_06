package ru.otus.java.basic.safarov.homework22;

public class ArrayOperations {

    public int[] lastOneArray(int... array){
        int index = -1;
        for (int i = array.length -1; i >= 0 ; i--) {
            if (array[i] == 1){
                index = i;
                break;
            }
        }
        if (index == -1){
            throw new RuntimeException("Don't not find one");
        }
        int size = array.length - index - 1;
        int[] result = new int[size];
        for (int i = 0, j = index+1; i < size ; i++, j++) {
            result[i] = array[j];
        }
        return result;
    }

    public boolean checkOneToo(int... array){
        boolean check1 = false;
        boolean check2 = false;
        for(int el: array){
            if (el == 1){
                check1 = true;
            }
            if (el == 2){
                check2 = true;
            }
            if (check1 && check2){
                return true;
            }
        }
        return false;
    }
}

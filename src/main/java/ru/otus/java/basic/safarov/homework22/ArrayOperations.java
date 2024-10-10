package ru.otus.java.basic.safarov.homework22;

import java.util.Arrays;
import java.util.List;

public class ArrayOperations {

    public int[] lastOneArray(int... array){
        List<Integer> arrayList = Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new));
        if (!arrayList.contains(1)){
            throw new RuntimeException("Don't not find one");
        }
        int index = arrayList.lastIndexOf(1)+1;
        return Arrays.copyOfRange(array, index, array.length);
    }

    public boolean containsOnlyOneAndTwo(int... array){
        List<Integer> arrayList = Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new));
        return arrayList.contains(1) && arrayList.contains(2);
    }
}

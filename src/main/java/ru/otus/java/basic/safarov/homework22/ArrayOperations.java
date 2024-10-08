package ru.otus.java.basic.safarov.homework22;

import java.util.Arrays;
import java.util.List;

public class ArrayOperations {

    public Integer[] lastOneArray(Integer... array){
        List<Integer> result = Arrays.asList(array);
        if (!result.contains(1)){
            throw new RuntimeException("Don't not find one");
        }
        result = result.subList( result.lastIndexOf(1)+1, result.size());
        return result.toArray(new Integer[0]);
    }

    public boolean checkOneToo(Integer... array){
        return Arrays.asList(array).contains(1) && Arrays.asList(array).contains(2);
    }
}

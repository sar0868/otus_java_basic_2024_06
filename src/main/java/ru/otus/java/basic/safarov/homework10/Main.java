package ru.otus.java.basic.safarov.homework10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 1, 2, 3));
        System.out.println(numbers);
        Map<String, Integer> phonebook = new HashMap<>();
        phonebook.put("user1", 11);
        phonebook.put("user2", 22);
        phonebook.put("user3", 33);
        phonebook.put("user4", 44);
        System.out.println(phonebook);
        System.out.println(phonebook.values());
        System.out.println(phonebook.keySet());
    }
}

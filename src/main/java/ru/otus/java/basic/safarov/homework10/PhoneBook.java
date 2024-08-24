package ru.otus.java.basic.safarov.homework10;

import java.util.*;

public class PhoneBook {
    private final Map<Person, Set<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public void add(Person name, String number){
        if (name == null || Long.parseLong(number) <= 0){
            throw new PhoneBookDateException("Не корректные данные для ввода в телефонную книгу.");
        }
        if (phonebook.containsKey(name)){
            phonebook.get(name).add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phonebook.put(name, numbers);
        }
    }

    public String find(String surname){
        Set<String> results = new HashSet<>();
        for (Person person: phonebook.keySet()){
            if (person.getSurname().equals(surname)){
                results.addAll(phonebook.get(person));
            }
        }
        if (results.isEmpty()){
            return "В телефонной книге нет человека с фамилией " + surname;
        }
        StringBuilder result = new StringBuilder();
        for (String el: results){
            result.append(el).append(" ");
        }
        return result.toString();
    }

    public boolean containsPhoneNumber(String number){
        Collection<Set<String>> values = phonebook.values();
        for (Set<String> items: values){
            if (items.contains(number)){
                return true;
            }
        }
        return false;
    }

    public Map<Person, Set<String>> getPhonebook() {
        return phonebook;
    }
}

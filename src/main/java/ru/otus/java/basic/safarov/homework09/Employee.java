package ru.otus.java.basic.safarov.homework09;

public class Employee {
    private final String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "имя: " + name + ", возраст: " + age;
    }
}

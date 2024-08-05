package ru.otus.java.basic.safarov.homework05;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int stamina) {
        super(name, speedRun, stamina);
        this.typeAnimal = "Cat";
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кот не умеет плавать.");
        return -1;
    }

}

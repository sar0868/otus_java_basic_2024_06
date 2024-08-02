package ru.otus.java.basic.safarov.homework05;

public class Cat extends Animal{
    public Cat(String name, int speedRun, int stamina) {
        super(name, speedRun, stamina);
        typeAnimal = "Cat";
        speedSwim = -1;
    }
}

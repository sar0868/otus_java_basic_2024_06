package ru.otus.java.basic.safarov.homework05;

public class Dog extends Animal{
    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        super(name, speedRun, stamina);
        this.speedSwim = speedSwim;
        this.typeAnimal = "Dog";
        this.staminaSwim = 2;
    }
}

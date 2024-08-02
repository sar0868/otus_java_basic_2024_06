package ru.otus.java.basic.safarov.homework05;

public class Horse extends Animal{
    public Horse(String name, int speedRun, int speedSwim, int stamina) {
        super(name, speedRun, stamina);
        this.speedSwim = speedSwim;
        typeAnimal = "Horse";
        staminaSwim = 4;
    }
}

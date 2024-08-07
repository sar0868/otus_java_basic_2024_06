package ru.otus.java.basic.safarov.homework06;

public class Plate {
    private final int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = this.maxFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void add(int food){
        if (food < 0){
            return;
        }
        currentFood += (maxFood > currentFood + food)? food: 0;
    }

    public boolean decrease(int food){
        if (food > currentFood){
            currentFood = 0;
            return false;
        }
        currentFood -= food;
        return true;
    }

}

package ru.otus.java.basic.safarov.homework07;

public enum Terrain {
    DENSE_FOREST("густой лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    private final String terrain;

    Terrain(String s) {
        this.terrain = s;
    }

    public boolean resultIntersection(int distance, int consumption, int currentResource){
        return distance * consumption <= currentResource;
    }

    public String info(boolean isMove){
        return isMove? this + ": удалось переместиться.": this + ": не удалось переместиться.";

    }

    @Override
    public String toString() {
        return "Условия - " + terrain;
    }
}

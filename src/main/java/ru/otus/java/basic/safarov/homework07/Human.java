package ru.otus.java.basic.safarov.homework07;

public class Human {
    private final String name;
    private Transport currentTransport;
    private boolean isOnTransport;
    private int power;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
        this.isOnTransport = false;
        this.power = 100;
    }

    public String getName() {
        return name;
    }

    public boolean isOnTransport() {
        return isOnTransport;
    }

    public int getPower() {
        return power;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void onTransport(Transport currentTransport) {
        if (isOnTransport) {
            return;
        }
        this.currentTransport = currentTransport;
        if (currentTransport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) currentTransport;
            bicycle.setResource(power);
        }
            isOnTransport = true;
    }

    public void ofTransport(){
        currentTransport = null;
        isOnTransport = false;
    }

    private boolean powerConsumption(int distance, int consumption) {
        if (distance * consumption <= power) {
            power -= distance * consumption;
            return true;
        }
        power = 0;
        return false;
    }


    public boolean moving(int distance, Terrain terrain) {
        if (!isOnTransport) {
            int consumption = 1;
            String condition = String.valueOf(terrain);
            if (terrain == Terrain.SWAMP) {
                consumption = 10;
            } else if (terrain == Terrain.DENSE_FOREST) {
                consumption = 5;
            }
            if (powerConsumption(distance, consumption)) {
                System.out.println(name + " прошел " + distance + " по " + condition);
                return true;
            }
            System.out.println(name + " не прошел " + distance + " по " + condition + ". Не хватило сил.");
            return false;
        }
        MoveTransport currentMoveTransport = (MoveTransport) currentTransport;
        if (terrain == Terrain.SWAMP) {
            return currentMoveTransport.moveSwamp(distance);
        } else if (terrain == Terrain.DENSE_FOREST) {
            return currentMoveTransport.moveDenseForest(distance);
        }
        return currentMoveTransport.movePlain(distance);
    }
}


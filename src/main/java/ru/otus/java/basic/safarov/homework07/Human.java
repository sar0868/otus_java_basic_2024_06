package ru.otus.java.basic.safarov.homework07;

public class Human {
    private final String name;
    private Transport currentTransport;
    private int power;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
        this.power = 100;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void onTransport(Transport currentTransport) {
        if (this.currentTransport != null) {
            return;
        }
        this.currentTransport = currentTransport;
        if (currentTransport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) currentTransport;
            bicycle.setResource(this);
        }
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void ofTransport() {
        currentTransport = null;
    }


    public boolean moving(int distance, Terrain terrain) {
        if (currentTransport == null) {
            String msg = name + " шел пешком. ";
            int consumption = 1;
            if (terrain == Terrain.SWAMP) {
                consumption = 10;
            } else if (terrain == Terrain.DENSE_FOREST) {
                consumption = 5;
            }
            if(terrain.resultIntersection(distance, consumption, power)){
                System.out.println(msg + terrain.info(true));
                power -= consumption * distance;
                return true;
            }
            System.out.println(msg + terrain.info(false));
            return false;
        }
        MoveTransport currentMoveTransport = (MoveTransport) currentTransport;
        return currentMoveTransport.move(distance, terrain);
    }
}


package ru.otus.java.basic.safarov.homework07;

public class Human {
    private final String name;
    private Transport currentTransport;
    private boolean isOnTransport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
        this.isOnTransport = false;
    }

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void getOnTransport(Transport currentTransport) {
        if (isOnTransport) {
            return;
        }
        this.currentTransport = currentTransport;
        isOnTransport = true;
    }


    public void moving(int length, Terrain terrain) {
        if (!isOnTransport) {
            int speed = 5;
            if (terrain == Terrain.SWAMP) {
                speed = 1;
            } else if (terrain == Terrain.DENSE_FOREST) {
                speed = 3;
            }
            System.out.println(name + " прошел " + length + " км за " + (length / speed));
            return;
        }
//        if (currentTransport.moving(length)){
//
//
//        }
    }
}

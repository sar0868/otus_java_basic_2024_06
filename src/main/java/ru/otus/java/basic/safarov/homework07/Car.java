package ru.otus.java.basic.safarov.homework07;

public class Car extends Transport implements MoveTransport {

    public Car(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
        this.typeTransort = "автомобиль";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP || terrain == Terrain.DENSE_FOREST) {
            System.out.println(terrain + getMsgImposoble());
            return false;
        }
        return attemptMove(this, distance, terrain);
    }
}

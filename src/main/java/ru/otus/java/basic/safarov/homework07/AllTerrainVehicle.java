package ru.otus.java.basic.safarov.homework07;

public class AllTerrainVehicle extends Transport implements MoveTransport {

    public AllTerrainVehicle(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
        this.typeTransort = "вездеход";
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        return attemptMove(this, distance, terrain);
    }
}

package ru.otus.java.basic.safarov.homework07;

public class Horse extends Transport implements MoveTransport {


    public Horse(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
        this.typeTransort = "лошадь";
    }


    @Override
    public boolean move(int distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP) {
            System.out.println(terrain + getMsgImposoble());
            return false;
        }
        return attemptMove(this, distance, terrain);
    }
}

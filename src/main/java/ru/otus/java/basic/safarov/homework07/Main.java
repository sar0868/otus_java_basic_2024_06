package ru.otus.java.basic.safarov.homework07;

public class Main {
    public static void main(String[] args) {
        Human alex = new Human("Aleksey");
        Transport allTerrainVehicle = new AllTerrainVehicle("Путешественник-1", 1000, 10);
        alex.onTransport(allTerrainVehicle);
        Terrain[] example = {Terrain.PLAIN, Terrain.SWAMP, Terrain.DENSE_FOREST};
        int distance = 50;
        for (Terrain condition: example){
            alex.moving(distance, condition);
        }
    }
}

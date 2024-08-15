package ru.otus.java.basic.safarov.homework07;

public interface MoveTransport {
    boolean move(int distance, Terrain terrain);
    default boolean attemptMove(Transport transport, int distance, Terrain terrain){
        System.out.print(transport.getTypeTransort());
        if (!terrain.resultIntersection(distance, transport.consumption, transport.currentResource)) {
            transport.currentResource = 0;
            System.out.println(terrain.info(false));
            return false;
        }
        transport.currentResource -= distance * transport.consumption;
        System.out.println(terrain.info(true));
        return true;
    }
}
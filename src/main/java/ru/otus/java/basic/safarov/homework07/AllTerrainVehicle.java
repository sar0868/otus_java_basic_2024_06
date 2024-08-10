package ru.otus.java.basic.safarov.homework07;

public class AllTerrainVehicle extends Transport implements MoveTransport {
    private final String successful =  "С помощью вездехода " + name + " удалось переместиться по";
    private final String failed =  "С помощью вездехода " + name + " не удалось переместиться по ";

    public AllTerrainVehicle(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
    }

    @Override
    public boolean moveDenseForest(int distance) {
        if (distance * consumption > currentResource) {
            currentResource = 0;
            System.out.println(failed + " густому лесу на "
                    + distance + ". Не хватило бензина.");
            return false;
        }
        currentResource -= distance * consumption;
        System.out.println(successful + " густому лесу на "
                + distance + ".");
        return true;
    }

    @Override
    public boolean movePlain(int distance) {
        if (distance * consumption > currentResource) {
            currentResource = 0;
            System.out.println(failed + " равнине на "
                    + distance + ". Не хватило бензина.");
            return false;
        }
        currentResource -= distance * consumption;
        System.out.println(successful + " равнине на "
                + distance + ".");
        return true;
    }

    @Override
    public boolean moveSwamp(int distance) {
        if (distance * consumption > currentResource) {
            currentResource = 0;
            System.out.println(failed + " болоту на "
                    + distance + ". Не хватило бензина.");
            return false;
        }
        currentResource -= distance * consumption;
        System.out.println(successful + " болоту на "
                + distance + ".");
        return true;
    }
}

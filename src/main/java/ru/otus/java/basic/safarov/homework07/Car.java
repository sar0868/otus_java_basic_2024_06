package ru.otus.java.basic.safarov.homework07;

public class Car extends Transport implements MoveTransport {
    private final String successful =  "С помощью машины " + name + " удалось переместиться по";
    private final String failed =  "С помощью машины " + name + " не удалось переместиться по ";
    private final String impossible =  "Машина не может перемещаться по ";


    public Car(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
    }

    @Override
    public boolean moveDenseForest(int distance) {
        System.out.println(impossible + " густому лесу");
        return false;
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
        System.out.println(impossible + " болоту");
        return false;
    }
}
